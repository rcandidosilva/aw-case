<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib tagdir="/WEB-INF/tags/" prefix="helper"%>

<c:set var="contexto" value="${pageContext.request.contextPath}" />

<script src="${contexto}/js/funcoes.js" language="javascript" type="text/javascript"></script>
<script src="${contexto}/js/funcoesValidaCliente.js" language="javascript" type="text/javascript"></script>
<script src="${contexto}/js/funcoesValidaPagamento.js" language="javascript" type="text/javascript"></script>
<script src="${contexto}/js/validaFormPedido.js" language="javascript" type="text/javascript"></script>

<form method="post" action="${contexto}/controller?command=online.EnviarPedido" 
    onsubmit="return validaForm(this);">

    <!-- Inicio do cabecalho da pagina -->
    <table width="100%"  border="0" cellspacing="0" cellpadding="0">
        <tr>
            <td align="left">
                <img src="${contexto}/images/titulos/finalizarPedido.gif" width="350" height="30">
            </td>
            <td align="right">
                <a href="${contexto}/controller?command=online.CatalogoProdutos" 
                    onMouseOut="MM_swapImgRestore()" 
                    onMouseOver="MM_swapImage('continuarComprando','','${contexto}/images/button/Bt_continuarComprando_on.gif',1)">
                    <img src="${contexto}/images/button/Bt_continuarComprando.gif" alt="Continuar Comprando" name="continuarComprando" width="50" height="37" border="0">
                </a>
            </td>
        </tr>
    </table>
    <!-- Fim do cabecalho da pagina -->
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
    <!-- Fim do calculo-->

    <!-- Incio da insercao dos dados do cliente -->
    <br>
    <helper:dadosCliente cliente="${usuario}" tipo="editar" />
    <br>
    <!-- fim da insercao dos dados do cliente -->

    <!-- Incio da insercao dos dados de pagamento-->
    <helper:dadosPagamento tipo="editar" />
    <br>
    <!-- fim da insercao dos dados de pagamento-->

    <!-- Inicio do rodape da pagina -->
    <table width="100%">
        <tr>
            <td align="center">
                <button type="submit" id="enviarPedido">Enviar</button> 
            </td>
        </tr>
    </table>

    <!-- fim do rodape da pagina-->

</form>
