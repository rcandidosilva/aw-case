<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<c:set var="contexto" value="${pageContext.request.contextPath}" />

<table class="tabelaGC">

    <thead>
        <tr><td colspan="2">
            <table>
                <tr>
                    <td class="coluna1">Lista de Categorias</td>
                    <td >&nbsp;</td>
                </tr>
            </table>
        </td></tr>
    </thead>

    <tbody>
        <tr>
            <td colspan="2">
      
                <fieldset>
                    <table>                    
                            <tr>
                                <td width="200"><label >Descrição</label></td>
                                <td width="200"><label>Status</label></td>
                            </tr>
                            
                              <c:forEach var="categoria" items="${categorias}" >
                                <tr>
                                    <td>
                                        <a href="${contexto}/controller?command=admin.categoria.Editar&idCategoria=${categoria.id}" >
                                            ${categoria.descricao}
                                        </a>
                                    </td>
                                    <td> <div>
                                        <c:choose>
                                            <c:when test="${categoria.ativo}">
                                            Ativo
                                            </c:when>
                                            <c:otherwise>
                                            Inativo
                                            </c:otherwise>
                                        </c:choose>                                    
                                    </div>
                                    </td>
                                </tr>
                            </c:forEach>
                           
                        </tbody>
                    </table>
                </fieldset>
        
            </td>
        </tr>
    </tbody>
  
</table>
