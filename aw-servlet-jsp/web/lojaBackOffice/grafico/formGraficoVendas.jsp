<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://globalcode.com.br/aw/helper" prefix="aw"%>

<c:set var="contexto" value="${pageContext.request.contextPath}" />

<form name="formLogin" method="post" action="${contexto}/lojaBackOffice/grafico/GraficoVendasPorMarca.pdf">
    
    <table class="tabelaGC">

        <thead>
            <tr><td colspan="2">
                <table>
                    <tr>
                        <td class="coluna1">Gr&aacute;fico de vendas</td>
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
                                <td align="right"><label for="marca">Marca:</label></td>
                                <td align="left">
                                    <input name="marca" type="text" id="marca" size="20" maxlength="255">
                                </td>
                            </tr>
                            <tr>
                                <td align="right"><label for="categoria">Categoria:</label></td>
                                <td align="left">
                                    <aw:comboCategorias codigo=""/>
                                </td>
                            </tr>
                            <tr>
                                <td align="right"><label for="mes">M&ecirc;s:</label></td>
                                <td align="left">
                                    <input name="mes" type="text" id="mes" size="2" maxlength="2">
                                </td>
                            </tr>
                            <tr>
                                <td align="right"><label for="ano">Ano:</label></td>
                                <td align="left">
                                    <input name="ano" type="text" id="ano" size="4" maxlength="4">
                                </td>
                            </tr>
                            <tr> 
                                <td align="center" colspan="2">
                                    <button type="submit" id="gerar">Gerar</button>
                                </td>
                            </tr>
                        </table>
                    </fieldset>
        
                </td>
            </tr>
        </tbody>
        
    </table>
    
</form>
