package br.com.globalcode.aw.business.command;

import br.com.globalcode.aw.web.command.WebCommand;
import br.com.globalcode.aw.web.command.WebCommandException;
import br.com.globalcode.dao.BaseDAOFactory;
import br.com.globalcode.dao.ClienteDAO;
import br.com.globalcode.dao.DAOFactory;
import br.com.globalcode.model.Cliente;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ValidarLoginCommand implements WebCommand{
    
    public void doAction(HttpServletRequest request, HttpServletResponse response)
        throws WebCommandException {
        
        // se um dos parametros nao for encontrado, uma exception sera lancada.
        String usuario = request.getParameter("username");
        String senha   = request.getParameter("password");
        String lembrarSenha = request.getParameter("lembrarSenha");
        
        String msg = "";
        String urlDestino = "login.jsp";
        
        if ( (usuario == null) || (usuario.equals("")) ){
            msg = "Por favor, digite o usuário.";
            
        }else if ( (senha == null) || (senha.equals("")) ){
            msg = "Por favor, digite a senha.";
            
        }else{
            if (lembrarSenha!=null && lembrarSenha.equals("true")){
                lembrarSenha(response,usuario,senha);
            }
            Cliente cliente = null;
            try {
                DAOFactory factory = BaseDAOFactory.getFactory();
                ClienteDAO dao = factory.getClienteDAO();
                cliente = (Cliente) dao.getByEmail(usuario);
            } catch (Exception ex) {
                throw new WebCommandException("[ValidarLoginCommand]" + ex.getMessage(),ex);
            }
            System.out.println("[ValidarLoginCommand] usuario :"+cliente);
            if (cliente != null){
                request.getSession().setAttribute("usuario",cliente);
                msg = "Usuário autenticado.";
                urlDestino = "";
            }else{
                msg = "Usuário e senha inválidos!";
            }
        }
        
        request.setAttribute("mensagemLogin",msg);
        
        request.setAttribute("destino",urlDestino);
        request.setAttribute("tipoNavegacao","forward");
        
    }
    
    private void lembrarSenha(HttpServletResponse response, String usuario, String senha){
        Cookie cookieUsername = new Cookie("username",usuario);
        cookieUsername.setMaxAge(24*60*60);
        response.addCookie(cookieUsername);
        Cookie cookiePassword = new Cookie("password",senha);
        cookiePassword.setMaxAge(24*60*60);
        response.addCookie(cookiePassword);
    }
}
