<%@tag description="exibe os dados de um determinado produto" pageEncoding="UTF-8"%>
<%@attribute name="contexto" required="true"%>
<%@attribute name="produto" required="true" type="br.com.globalcode.model.Produto"%>
<%@attribute name="tipo" required="true"%>
<%@attribute name="quantidade" required="false"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<fmt:setLocale value="pt_BR" /> 

<table width="100%"  border="0" cellspacing="2" cellpadding="2">
    <tr>
        <td height="50" width="50">
             <img src="${contexto}/images/Logos/logo_GES.jpg" width="50" height="50" valign="center" hspace="10" vspace="10">
        </td>
        
        <td align="left">
            <span class="tabela_subtitulo">${produto.categoria.descricao} - ${produto.marca}</span><br>
            <span class="GC_Normal">${produto.nome}</span>
        </td>
        
        <c:if test='${tipo ne "catalogo"}'>
            <td width="100" align="center">
                <span class="GC_Normal">${quantidade}</span>
            </td>
        </c:if>   
 
        <td width="100" align="center" class="preco">
            <fmt:formatNumber value="${produto.preco}" type="currency"/>
        </td>
        
        <c:choose>
            <c:when test='${tipo eq "catalogo"}'>
                <td width="100" align="center">                    
                    <a href="${contexto}/controller?command=online.AdicionarItem&idProduto=${produto.id}" 
                        onMouseOut="MM_swapImgRestore()" 
                        onMouseOver="MM_swapImage('meuCarrinho','','${contexto}/images/button/bt_carrinho_on.gif',1)">
                        <img src="${contexto}/images/button/bt_carrinho.gif" alt="Meu Carrinho" name="meuCarrinho" width="25" height="25" border="0">
                    </a>
                </td>
            </c:when> 
            <c:when test='${tipo eq "carrinho"}'>
                <td width="100" align="center">                    
                    <a href="${contexto}/controller?command=online.RemoverItem&idProduto=${produto.id}" onMouseOut="MM_swapImgRestore()" 
                        onMouseOver="MM_swapImage('excluir','','${contexto}/images/button/bt_excluir_on.gif',1)">
                        <img src="${contexto}/images/button/bt_excluir.gif" alt="Retirar do Carrinho" name="excluir" width="25" height="25" border="0">
                    </a>
                </td>
            </c:when>
        </c:choose>
        
    </tr>
</table>

