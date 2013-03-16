<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://globalcode.com.br/aw/helper" prefix="aw"%>

<c:set var="contexto" value="${pageContext.request.contextPath}" />
    
<script src="${contexto}/js/showDiv.js" language="javascript" type="text/javascript"></script>

<form method="post" action="${contexto}/controller?command=admin.produto.Salvar">

    <table class="tabelaGC" border="2">

        <thead>
            <tr>
                <td colspan="4">
                    <table>
                        <tr>            
                            <td class="coluna1">Cadastro de Produto</td>
                            <td>&nbsp;</td>
                        </tr>
                    </table>
                </td>
            </tr>
        </thead>

        <tbody>
            <tr>
                <td colspan="2">      
                    <fieldset>
                        <legend>Dados do Produto</legend>
                        <table>
                            <tr>
                                <td align="right"><label for="nome">Nome:</label></td>
                                <td colspan="3" align="left">
                                    <input type="hidden" name="idProduto" value="${produto.id}">
                                    <input name="nome" id="nome" type="text" size="75" maxlength="255" value="${produto.nome}">
                                </td>
                            </tr>
                            <tr>
                                <td align="right"><label for="marca">Marca:</label></td>
                                <td colspan="3" align="left">
                                    <input name="marca" id="marca" type="text" size="50" maxlength="50" value="${produto.marca}">
                                </td>
                            </tr>
                            <tr>
                                <td align="right"><label for="categoria">Categoria:</label></td>
                                <td align="left">
                                    <aw:comboCategorias codigo="${produto.categoria.id}"/>
                                </td>
                                <td align="right"><label for="status">Status:</label></td>
                                <td align="left">
                                    <input name="status" id="status" type="checkbox" 
                                    <c:if test="${produto.ativo}">checked</c:if> value="Ativo">
                                    Ativo
                                </td>
                            </tr>
                            <tr>
                                <td align="right"><label for="preco">Preço:</label></td>
                                <td align="left">
                                    <input name="preco" id="preco" type="text" size="20" maxlength="20" value="${produto.preco}">
                                </td>
                                <td align="right">&nbsp;</td>
                                <td align="left">&nbsp;</td>
                            </tr>
                            <tr>
                                <td align="right"><label for="tipo2">Tipo de Produto:</label></td>
                                <td align="left">
                                    <input name="tipo" id="tipo" type="hidden" value="${tipoProduto}">
                                    <input name="tipo2" id="tipo2" type="text" readonly
                                        value="<c:if test="${tipoProduto=='M'}">Material</c:if><c:if test="${tipoProduto=='D'}">Digital</c:if>">
                                </td>
                                <td align="right">&nbsp;</td>
                                <td align="left">&nbsp;</td>
                            </tr>
                            <c:if test="${tipoProduto=='M'}"> 
                                <jsp:include page="produtoMaterial.jsp" flush="true"/>
                            </c:if>
                            <c:if test="${tipoProduto=='D'}"> 
                                <jsp:include page="produtoDigital.jsp" flush="true"/>
                            </c:if>
                            <tr>
                                <td colspan="4" align="center"><input name="salvar" type="submit" id="salvar" value="Salvar"></td>
                            </tr>          
                        </table>
                    </fieldset>        
                </td>
            </tr>
        </tbody>  
    </table>
</form>
