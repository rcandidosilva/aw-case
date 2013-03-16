package br.com.globalcode.aw.business.command.online;

import br.com.globalcode.aw.web.command.WebCommand;
import br.com.globalcode.aw.web.command.WebCommandException;
import br.com.globalcode.dao.BancoDAO;
import br.com.globalcode.dao.BandeiraCartaoCreditoDAO;
import br.com.globalcode.dao.BaseDAOFactory;
import br.com.globalcode.dao.ClienteDAO;
import br.com.globalcode.dao.DAOFactory;
import br.com.globalcode.dao.PagamentoDAO;
import br.com.globalcode.dao.PedidoDAO;
import br.com.globalcode.model.Banco;
import br.com.globalcode.model.BandeiraCartaoCredito;
import br.com.globalcode.model.CarrinhoCompras;
import br.com.globalcode.model.Cliente;
import br.com.globalcode.model.Pagamento;
import br.com.globalcode.model.PagamentoBoleto;
import br.com.globalcode.model.PagamentoCartaoCredito;
import br.com.globalcode.model.Pedido;
import br.com.globalcode.util.FormatHelper;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EnviarPedidoCommand implements WebCommand{
    
    public void doAction(HttpServletRequest request, HttpServletResponse response) throws WebCommandException {
        
        //Leitura dos dados do cliente
        //Leitura de parametros String
        String idCliente = request.getParameter("idCliente");
        String nome = request.getParameter("nome");
        String email = request.getParameter("email");
        String telefone = request.getParameter("telefone");
        String enderecoRua = request.getParameter("enderecoRua");
        String enderecoNumero = request.getParameter("enderecoNumero");
        String enderecoBairro = request.getParameter("enderecoBairro");
        String enderecoCep = request.getParameter("enderecoCep");
        String enderecoCidade = request.getParameter("enderecoCidade");
        String enderecoEstado = request.getParameter("enderecoEstado");
        String senha = email; // provisoriamente
        
        DAOFactory factory = null;
        
        //Criacao da instância
        Cliente cliente = null;
        if(idCliente == null) {
            cliente = new Cliente(nome,email,senha,telefone,true,
                    enderecoRua,enderecoNumero,enderecoBairro,enderecoCep,
                    enderecoCidade,enderecoEstado);
        } else {
            cliente = new Cliente(new Integer(idCliente),nome,email,senha,telefone,true,
                    enderecoRua,enderecoNumero,enderecoBairro,enderecoCep,
                    enderecoCidade,enderecoEstado);
        }

        try{
            factory = BaseDAOFactory.getFactory();
            ClienteDAO clienteDao = factory.getClienteDAO();

            //Salva-se o cliente e recupera-se o objeto de maneira a obter o
            //id gerado pelo banco. Este id é necessario para salvar os dados
            //de pedido fazendo corretamento o relacionamento entre as tabelas de
            //pedido e cliente no BD. Caso seja um cliente ja existente permite que
            //seja feita a atualizacao de cadastro.
            cliente = clienteDao.save(cliente);
            
            // atualiza usuário na session
            request.getSession().setAttribute("usuario",cliente);
            
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new WebCommandException("[online.EnviarPedidoCommand]" + ex.getMessage(),ex);
        }
        
        //Obtençao do carrinho
        CarrinhoCompras carrinho = (CarrinhoCompras) request.getSession().getAttribute("carrinhoCompras");
        
        //Leitura dos dados de pagamento
        try {
            
            String tipoPagamento = request.getParameter("tipoPagamento");
            Pagamento pagamento = null;
            double valor = carrinho.getPrecoTotal();
            
            if("cartao".equals(tipoPagamento)){
                
                Integer idBandeira = new Integer(request.getParameter("bandeira"));
                BandeiraCartaoCreditoDAO dao = factory.getBandeiraCartaoCreditoDAO();
                BandeiraCartaoCredito bandeiraCartaoCredito = dao.getByPrimaryKey(idBandeira);
                
                String nomeTitular = request.getParameter("nomeTitular");
                String numeroCartao = request.getParameter("numeroCartao");
                long numeroConfirmacao = Long.parseLong(request.getParameter("numeroVerificacao"));
                Date dataValidadeCartao = FormatHelper.parseDataCartao(request.getParameter("dataValidadeCartao"));
                
                pagamento = new PagamentoCartaoCredito(
                        new Date(),valor,bandeiraCartaoCredito,nomeTitular,
                        numeroCartao,numeroConfirmacao,dataValidadeCartao);
                
            } else if("boleto".equals(tipoPagamento)){
                
                Integer idBanco = new Integer(request.getParameter("banco"));
                BancoDAO dao = factory.getBancoDAO();
                Banco banco = dao.getByPrimaryKey(idBanco);
                
                Date dataPagamento = new Date();
                Calendar dataVencimento = new GregorianCalendar();
                dataVencimento.setTime(dataPagamento);
                dataVencimento.add(Calendar.DAY_OF_MONTH,7);
                
                String sacado = cliente.getNome();
                String cedente = "Globalcode";
                String codigoBarras = "15468798431358643873543878";  // código provisório
                
                pagamento = new PagamentoBoleto(
                        dataPagamento,valor,cedente,sacado,codigoBarras,
                        dataVencimento.getTime(),banco);
                
            }
            
            //Salva-se o pagamento e recupera-se o objeto de maneira a obter o
            //id gerado pelo banco. Este id é necessario para salvar os dados
            //de pedido fazendo corretamento o relacionamento entre as tabelas de
            //pedido e pagamento no BD.
            PagamentoDAO pagamentoDao = factory.getPagamentoDAO();
            pagamento = pagamentoDao.save(pagamento);
            
            //Criacao do pedido
            String clienteBrowser = "";
            String clienteIP = "";
            String status = "";

            Pedido pedido = new Pedido(cliente,clienteBrowser,clienteIP,new Date(),
                   carrinho.getItens(),pagamento,status);
            
            //Utiliza-se o DAO para inserir pedido no BD
            PedidoDAO dao = factory.getPedidoDAO();
            dao.save(pedido);
            
            request.setAttribute("pedido",pedido);
            
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new WebCommandException("[online.EnviarPedidoCommand]" + ex.getMessage(),ex);
        }
        
        request.getSession().removeAttribute("carrinhoCompras");
        
        request.setAttribute("destino","/lojaOnline/compra/formPedidoEnviado.jsp");
        request.setAttribute("tipoNavegacao","forward");
        
    }
    
}
