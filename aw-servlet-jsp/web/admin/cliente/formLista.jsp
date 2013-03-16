<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<c:set var="contexto" value="${pageContext.request.contextPath}" />

<table class="tabelaGC">

    <thead>
        <tr><td colspan="2">
            <table>
                <tr>
                    <td class="coluna1">Lista de Clientes</td>
                    <td>&nbsp;</td>
                </tr>
            </table>
        </td></tr>
    </thead>

    <tbody>
        <tr>
            <td colspan="2">
                <fieldset>
                    <table>
                        <tbody>
                            <tr>
                                <td><label>Nome</label></td>
                                <td><label>e-mail</label></td>
                            </tr>
                            <c:forEach var="cliente" items="${clientes}">
                                <tr>
                                    <td><a href="${contexto}/controller?command=admin.cliente.Editar&idCliente=${cliente.id}">${cliente.nome}</a>
                                    </td>
                                    <td><div>
                                        ${cliente.email}
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

