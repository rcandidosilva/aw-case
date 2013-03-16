<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://globalcode.com.br/aw/helper" prefix="aw"%>

<c:set var="contexto" value="${pageContext.request.contextPath}" />
    
<script src="${contexto}/js/showDivProduto.js" language="javascript" type="text/javascript"></script>

<form method="post" action="${contexto}/controller?command=admin.produto.Salvar">

    <table class="tabelaGC" border="2">

        <thead>
            <tr>
                <td>
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
                                    <input type="hidden" name="idProduto" value="">
                                    <input name="nome" id="nome" type="text" size="75" maxlength="255" value="">
                                </td>
                            </tr>
                            <tr>
                                <td align="right"><label for="marca">Marca:</label></td>
                                <td colspan="3" align="left">
                                    <input name="marca" id="marca" type="text" size="50" maxlength="50" value="">
                                </td>
                            </tr>
                            <tr>
                                <td align="right"><label for="categoria">Categoria:</label></td>
                                <td align="left">
                                    <aw:comboCategorias codigo=""/>
                                </td>
                                <td align="right"><label for="status">Status:</label></td>
                                <td align="left">
                                    <input name="status" id="status" type="checkbox" 
                                    <c:if test="">checked</c:if> value="Ativo">
                                    Ativo
                                </td>
                            </tr>
                            <tr>
                                <td align="right"><label for="preco">Preço:</label></td>
                                <td align="left">
                                    <input name="preco" id="preco" type="text" size="20" maxlength="20" value="">
                                </td>
                                <td align="right">&nbsp;</td>
                                <td align="left">&nbsp;</td>
                            </tr>
                            <tr>
                                <td align="right"><label for="tipoMaterial">Tipo de Produto:</label></td>
                                <td colspan="3">
                                    <input name="tipo" id="tipoMaterial" type="radio" value="M" checked
                                        onclick="showDiv('divProdutoMaterial');"> Material
                                    <input name="tipo" id="tipoDigital" type="radio" value="D" 
                                        onclick="showDiv('divProdutoDigital');"> Digital
                                </td>
                            </tr>
                            <tr>
                                <td colspan="4">
                                <div id="divProdutoMaterial">
                                    <table><tr>
                                        <td align="right"><label for="taxaEntrega">Taxa de Entrega:</label></td>
                                        <td align="left">
                                            <input name="taxaEntrega" id="taxaEntrega" type="text" size="20" maxlength="20" 
                                            value=''>
                                        </td>
                                        <td align="right">&nbsp;</td>
                                        <td align="left">&nbsp;</td>
                                    </tr></table>
                                </div>
                                <div id="divProdutoDigital" style="display:none; visibility:hidden">
                                    <table><tr>
                                        <td align="right"><label for="nomeArquivo">Nome do Arquivo:</label></td>
                                        <td align="left">
                                            <input name="nomeArquivo" id="nomeArquivo" type="text" size="40" maxlength="255" 
                                            value=''>
                                        </td>
                                        <td align="right"><label for="tamanho">Tamanho:</label></td>
                                        <td align="left">
                                            <input name="tamanho" id="tamanho" type="text" size="10" maxlength="10" 
                                            value=''>
                                        </td>
                                    </tr></table>
                                </div>
                                </td>
                            </tr>
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


