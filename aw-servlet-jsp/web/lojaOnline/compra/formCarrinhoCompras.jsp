<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib tagdir="/WEB-INF/tags/" prefix="helper"%>

<c:set var="contexto" value="${pageContext.request.contextPath}" />
<fmt:setLocale value="pt_BR" />

<table width="100%"  border="0" cellspacing="0" cellpadding="0">
    <tr>
        <td align="left">
            <img src="${contexto}/images/titulos/carrinhoCompras.gif" width="350" height="30">
        </td>
    </tr>
</table>

<br>
<table width="100%"  border="0"  cellpadding="0" cellspacing="0" bordercolor="#EEEEEE">
    <tr>
        <td>
            <table width="100%" border="0" cellpadding="0" cellspacing="0">
                <tr>
                    <td width="130" class="texto_rodape_tabelas">Produtos</td>
                    <td width="20" height="20" class="texto_rodape_tabelas">&nbsp;</td>
                    <td class="texto_rodape_tabelas">&nbsp;</td>
                    <td width="100" align="center" class="texto_rodape_tabelas">Quantidade</td>                                        
                    <td width="100" align="center" class="texto_rodape_tabelas">Pre&ccedil;o</td>
                    <td width="100" align="center" class="texto_rodape_tabelas">Remover</td>
                </tr>
            </table>
        </td>
    </tr>
  
    <tr>
        <td>
            <!-- tabela de produtos com preço e imagem para remover -->
            <table width="100%"  border="0" cellspacing="2" cellpadding="2">
                <!-- inicio do laço de itens do carrinho-->
                <c:forEach var="item" items="${carrinhoCompras.itens}" >
                    <tr>
                        <td>
                            <helper:ExibeProduto contexto="${contexto}" produto="${item.produto}" tipo="carrinho" quantidade="${item.quantidade}" />
                        </td>
                    </tr>
                    <!-- fim do laço de itens do carrinho-->
                </c:forEach>
            </table>
            <!-- fim  da tabela de produtos -->
        </td>
    </tr>

    <tr>
        <td>
            <table width="100%"  border="0" cellspacing="0" cellpadding="0">
                <tr>
                    <td align="right" class="texto_rodape_tabelas">Total</td>
                    <td width="20" class="texto_rodape_tabelas"></td>
                    <td width="100" class="texto_rodape_tabelas">
                        &nbsp;&nbsp;&nbsp;<fmt:formatNumber value="${carrinhoCompras.precoTotal}" type="currency" />
                    </td>
                </tr>
            </table>
        </td>
    </tr>
  
</table>

<br>
<table width="100%">
    <tr>
        <td align="center">
            <a href="${contexto}/controller?command=online.CatalogoProdutos" onMouseOut="MM_swapImgRestore()" 
                onMouseOver="MM_swapImage('continuarComprando','','${contexto}/images/button/Bt_continuarComprando_on.gif',1)">
                <img src="${contexto}/images/button/Bt_continuarComprando.gif" alt="Continuar Comprando" name="continuarComprando" width="50" height="37" border="0">
            </a>
        </td>
        <td align="center">
            <a href="${contexto}/controller?command=online.FinalizarPedido" onMouseOut="MM_swapImgRestore()" 
                onMouseOver="MM_swapImage('finalizarPedido','','${contexto}/images/button/Bt_finalizarPedido_on.gif',1)">
                <img src="${contexto}/images/button/Bt_finalizarPedido.gif" alt="Finalizar Pedido" name="finalizarPedido" width="50" height="37" border="0">
            </a>
        </td>
    </tr>
</table>
