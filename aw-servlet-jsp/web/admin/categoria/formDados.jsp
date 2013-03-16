<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:set var="contexto" value="${pageContext.request.contextPath}" />

<form method="post" action="${contexto}/controller?command=admin.categoria.Salvar">

    <table class="tabelaGC">

        <thead>
            <tr><td colspan="2">
                <table>
                    <tr>
                        <td class="coluna1">Cadastro de Categorias</td>
                        <td>&nbsp;</td>
                    </tr>
                </table>
            </td></tr>
        </thead>

        <tbody>
            <tr>
                <td colspan="2">
      
                    <fieldset>
                        <legend>Dados da categoria</legend>
                        <table>
                            <tbody>

                                <tr>
                                    <td align="right"><label for="descricao">Descrição:</label></td>
                                    <td colspan="3" align="left">
                                        <input type="hidden" name="idCategoria" value="${categoria.id}">
                                        <input name="descricao" id="descricao" type="text" size="25" maxlength="50" value="${categoria.descricao}">
                                    </td>
                                </tr>
                                <tr>
                                    <td align="right"><label for="status">Status:</label></td>
                                    <td colspan="3" align="left">
                                        <input name="status" id="status" type="checkbox" <c:if test="${categoria.ativo}">checked</c:if> value="Ativo">Ativo
                                    </td>
                                </tr>
                                <tr>
                                    <td colspan="4">
                                        <input name="salvar" type="submit" id="salvar" value="Salvar">
                                    </td>
                                </tr>
      
                            </tbody>
                        </table>
                    </fieldset>
        
                </td>
            </tr>
        </tbody>
  
    </table>

</form>

