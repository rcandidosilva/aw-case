<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="contexto" value="${pageContext.request.contextPath}" />

<form method="post" action="${contexto}/controller?command=admin.cliente.Listar">

    <table class="tabelaGC">

        <thead>
            <tr><td colspan="2">
                <table>
                    <tr>
                        <td class="coluna1">Pesquisar Clientes</td>
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
                            <tr>
                                <td align="right"><label for="nome">Nome:</label></td>
                                <td align="left">
                                    <input name="nome" id="nome" type="text" size="40" maxlength="255">
                                </td>
                                <td>
                                    <button name="buscarNome" type="submit" id="buscar1">Buscar</button>
                                </td>
                            </tr>
                            <tr>
                                <td align="right"><label for="nome">e-mail:</label></td>
                                <td align="left">
                                    <input name="email" id="email" type="text" size="40" maxlength="255">
                                </td>
                                <td>
                                    <button name="buscarEmail" type="submit" id="buscar2">Buscar</button>
                                </td>
                            </tr>
                        </table>
                    </fieldset>
                </td>
            </tr>
        </tbody>

    </table>

</form>

