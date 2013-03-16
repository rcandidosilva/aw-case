<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib tagdir="/WEB-INF/tags/" prefix="helper"%>
<%@taglib uri="http://globalcode.com.br/aw/helper" prefix="aw"%>

<c:set var="contexto" value="${pageContext.request.contextPath}" />
   

<table width="100%"  border="0" cellspacing="0" cellpadding="0">
    <tr>
        <td align="left">
            <img src="${contexto}/images/titulos/catalogoProdutos.gif" width="350" height="30">
        </td>
        <td width="70" height="20" align="right">
            <a href="${contexto}/controller?command=online.VisualizarCarrinho" 
                onMouseOut="MM_swapImgRestore()" 
                onMouseOver="MM_swapImage('meuCarrinho','','${contexto}/images/button/Bt_meuCarrinho_on.gif',1)">
                <img src="${contexto}/images/button/Bt_meuCarrinho.gif" alt="Meu Carrinho" name="meuCarrinho" width="70" height="42" border="0">
            </a>
        </td>
    </tr>
</table>

<br>
<aw:paginacao lista="${produtos}" inicio="${param.inicioPagina}" tamanho="3">    
    <table width="100%">
        <tr>
            <td >
	
                <!-- inicio do cabeçalho -->
                <table width="100%" border="0" cellpadding="0" cellspacing="0">
                    <tr>
                        <td width="130" class="texto_rodape_tabelas" >Produtos</td>
                        <td width="20" height="20" class="texto_rodape_tabelas">&nbsp;</td>
                        <td class="texto_rodape_tabelas">&nbsp;</td>
                        <td width="100" align="center" class="texto_rodape_tabelas">Pre&ccedil;o</td>
                        <td width="100" align="center" class="texto_rodape_tabelas">Adicionar</td>
                    </tr>
                </table>
                <!-- fim do cabeçalho -->
	  
            </td>
        </tr>
 
        <!-- inicio do laco de produtos -->
        <c:forEach var="produto" items="${listaPaginada}">
            <tr>
                <td>
                    <helper:ExibeProduto contexto="${contexto}" produto="${produto}" tipo="catalogo"/>    
                </td>
            </tr>  
            <!-- termino do laco de produtos -->
        </c:forEach>
    </table>
    <br>
</aw:paginacao>
