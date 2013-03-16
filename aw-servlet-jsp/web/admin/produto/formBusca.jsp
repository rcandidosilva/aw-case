<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://globalcode.com.br/aw/helper" prefix="aw"%>

<c:set var="contexto" value="${pageContext.request.contextPath}"/>
    
    
<form method="post" action="${contexto}/controller?command=admin.produto.Listar">

    <table class="tabelaGC">

        <thead>
            <tr><td colspan="2">
                <table>
                    <tr>
                        <td class="coluna1">Pesquisar produtos</td>
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
                                <td><label for="nome">Nome:</label></td>
                                <td><input name="nome" id="nome" type="text" size="20" maxlength="255"></td>
                            </tr>
                            <tr>
                                <td><label for="marca">Marca:</label></td>
                                <td><input name="marca" id="marca" type="text" size="20" maxlength="255"></td>
                            </tr>
                            <tr>
                                <td><label for="categoria">Categoria:</label></td>
                                <td>
                                    <aw:comboCategorias/>
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