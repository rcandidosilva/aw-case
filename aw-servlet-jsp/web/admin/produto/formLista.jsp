<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<c:set var="contexto" value="${pageContext.request.contextPath}" />
<fmt:setLocale value="pt_BR" />    

<table class="tabelaGC">

    <thead>
        <tr><td colspan="2">
            <table>
                <tr>
                    <td class="coluna1">Lista de produtos</td>
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
                    <table>
                        <tbody>
                            <tr>
                                <td width="50"><label>Foto</label></td>
                                <td><label>Nome</label></td>
                                <td width="100"><label>Marca</label></td>
                                <td width="100"><label>Categoria</label></td>
                                <td width="100"><label>Pre&ccedil;o</label></td>
                            </tr>
      
                            <c:forEach var="produto" items="${produtos}">
                                <tr>
                                    <td><div>
                                    </div></td>
                                    <td><div>
                                        <a href="${contexto}/controller?command=admin.produto.Editar&idProduto=${produto.id}">
                                            ${produto.nome}
                                        </a>
                                    </div></td>
                                    <td><div>
                                        ${produto.marca}
                                    </div></td>
                                    <td><div>
                                        ${produto.categoria.descricao}
                                    </div></td>
                                    <td><div>
                                        <fmt:formatNumber value="${produto.preco}" type="currency"/> 
                                    </div></td>
                                </tr>
                            </c:forEach>
                            
                        </tbody>
                    </table>
                </fieldset>
        
            </td>
        </tr>
    </tbody>
  
</table>
