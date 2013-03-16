<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:set var="contexto" value="${pageContext.request.contextPath}" />
    
<form method="post" action="${contexto}/controller?command=online.ListarPedidos">

    <table class="tabelaGC">
        <thead>
            <tr>
                <td>
                    <table>
                        <tr>
                            <td class="coluna1">Ver meus pedidos </td>
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
                            <tr>
                                <td align="right"><label for="nome">Data Inicial:</label></td>
                                <td align="left">
                                    <input name="dataInicio" type="text" size="12" maxlength="12" class="GC_Normal"> (formato dd/mm/yyyy)
                                </td>
                            </tr>
                            <tr>
                                <td align="right"><label for="nome">Data Final:</label></td>
                                <td align="left">
                                    <input name="dataFinal" type="text" size="12" maxlength="12" class="GC_Normal"> (formato dd/mm/yyyy)
                                </td>
                            </tr>
                            <tr>
                                <td colspan="2" align="center">
                                    <button name="buscar" type="submit" id="buscar">Buscar</button>
                                </td>
                            </tr>
                        </table>
                    </fieldset>
                </td>
            </tr>
        </tbody>
    </table>

</form>


