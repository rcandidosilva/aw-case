<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib tagdir="/WEB-INF/tags/" prefix="helper"%>

<c:set var="contexto" value="${pageContext.request.contextPath}" />
<fmt:setLocale value="pt_BR" />
 

<table class="tabelaGC">
    <thead>
        <tr>
            <td >
                <table>
                    <tr>
                        <td class="coluna1">Dados do pedido </td>
                        <td>&nbsp;</td>          
                    </tr>
                </table>	  
            </td>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td align="left">
	
                <table width="100%"  border="0" cellpadding="2" cellspacing="2">
                    <tr >
                        <td><span class="conteudo_titulo">pedido : ${pedido.numero}</span></td>
                        <td><span class="conteudo_titulo">data : <fmt:formatDate value="${pedido.data}" /></span></td>
                    </tr>

 
                    <tr >
                        <td colspan="2">
                            <table width="100%" border="0" cellpadding="0" cellspacing="0">
                                <tr>
                                    <td width="130" class="texto_rodape_tabelas">Produtos</td>
                                    <td width="20" class="texto_rodape_tabelas">&nbsp;</td>
                                    <td class="texto_rodape_tabelas">&nbsp;</td>
                                    <td width="100" align="center" class="texto_rodape_tabelas">Quantidade</td>                                        
                                    <td width="100" align="center" class="texto_rodape_tabelas">Pre&ccedil;o</td>
                                </tr>
                            </table>
                        </td>
                    </tr>
  
                    <tr >
                        <td colspan="2">
                            <!-- tabela de produtos com preço -->                                       
                
                            <table width="100%"  border="0" cellspacing="2" cellpadding="2">
                                <!-- inicio do laço de itens do carrinho-->
                                <c:forEach var="item" items="${pedido.itensPedido}" >
                                    <tr>
                                        <td >
                                            <helper:ExibeProduto contexto="${contexto}" produto="${item.produto}" tipo="pedido" quantidade="${item.quantidade}" />
                                        </td>
                                    </tr>
                                    <!-- fim do laço de itens do carrinho-->
                                </c:forEach>
                            </table>
                            <!-- fim  da tabela de produtos -->
                        </td>
                    </tr>

                    <tr>
                        <td colspan="2">
                            <table width="100%"  border="0" cellspacing="0" cellpadding="0">
                                <tr>
                                    <td align="right" class="texto_rodape_tabelas">Total</td>
                                    <td width="20" class="texto_rodape_tabelas"></td>
                                    <td width="100" class="texto_rodape_tabelas">
                                        &nbsp;&nbsp;&nbsp;<fmt:formatNumber value="${pedido.pagamento.valor}" type="currency" />
                                    </td>
                                </tr>
                            </table>
                        </td>
                    </tr>
           
                </table>
            </td>
        </tr>
    </tbody>
</table>
      <br>  
      <helper:dadosCliente tipo="ver" cliente="${pedido.cliente}" />
      <br>
      <helper:dadosPagamento tipo="ver" pagamento="${pedido.pagamento}" />    


	
