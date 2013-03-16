<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<c:set var="contexto" value="${pageContext.request.contextPath}" />

<script src="${contexto}/js/funcoes.js" language="javascript" type="text/javascript"></script>
<script src="${contexto}/js/funcoesValidaCliente.js" language="javascript" type="text/javascript"></script>
<script src="${contexto}/js/validaFormCliente.js" language="javascript" type="text/javascript"></script>

<form method="post" action="${contexto}/controller?command=admin.cliente.Salvar" 
    onsubmit="return validaForm(this);">
 
    <table class="tabelaGC">

        <thead>
            <tr><td colspan="2">
                <table>
                    <tr>
                        <td class="coluna1">Cadastro de Clientes</td>
                        <td>&nbsp;</td>
                    </tr>
                </table>
            </td></tr>
        </thead>

        <tbody>
            <tr>
                <td colspan="2">
                    <fieldset>
                        <legend>Dados do Cliente</legend>
                        <table>
                            <tbody>
                                <tr>
                                    <td align="right">
                                        <label for="nome">Nome:</label>
                                    </td>
                                    <td colspan="3" align="left">
                                        <input type="hidden" name="idCliente" value="${cliente.id}">
                                        <input name="nome" id="nome" type="text" size="75"
                                        maxlength="255" value="${cliente.nome}">
                                    </td>
                                </tr>
                                <tr>
                                    <td align="right">
                                        <label for="email">e-mail:</label>
                                    </td>
                                    <td align="left">
                                        <input name="email" id="email" type="text" size="50"
                                        maxlength="50" value="${cliente.email}">
                                    </td>
                                    <td align="right">
                                        <label for="telefone">Telefone:</label>
                                    </td>
                                    <td align="right">
                                        <input name="telefone" id="telefone" type="text" size="20"
                                        maxlength="50" value="${cliente.telefone}">
                                    </td>
                                </tr>
                            </tbody>
                        </table>
                    </fieldset>
                    <fieldset>
                        <legend>Endereço</legend>
                        <table>
                            <tbody>
                                <tr>
                                    <td align="right">
                                        <label for="enderecoRua">Rua/Av:</label>
                                    </td>
                                    <td align="left">
                                        <input name="enderecoRua" id="enderecoRua" type="text"
                                        size="40" maxlength="50" value="${cliente.enderecoRua}">
                                    </td>
                                    <td align="right">
                                        <label for="enderecoNumero">Número:</label>
                                    </td>
                                    <td align="left">
                                        <input name="enderecoNumero" id="enderecoNumero" type="text"
                                        size="10" maxlength="10" value="${cliente.enderecoNumero}">
                                    </td>
                                </tr>
                                <tr>
                                    <td align="right">
                                        <label for="enderecoBairro">Bairro:</label>
                                    </td>
                                    <td align="left">
                                        <input name="enderecoBairro" id="enderecoBairro" type="text"
                                        size="40" maxlength="50" value="${cliente.enderecoBairro}">
                                    </td>
                                    <td align="right">
                                        <label for="enderecoCep">CEP:</label>
                                    </td>
                                    <td align="left">
                                        <input name="enderecoCep" id="enderecoCep" type="text"
                                        size="10" maxlength="10" value="${cliente.enderecoCep}">
                                    </td>
                                </tr>
                                <tr>
                                    <td width="60" align="right">
                                        <label for="enderecoCidade">Cidade:</label>
                                    </td>
                                    <td align="left">
                                        <input name="enderecoCidade" id="enderecoCidade" type="text"
                                        size="40" maxlength="50" value="${cliente.enderecoCidade}">
                                    </td>
                                    <td align="right">
                                        <label for="enderecoEstado">Estado:</label>
                                    </td>
                                    <td align="left">
                                        <input name="enderecoEstado" id="enderecoEstado" type="text"
                                        size="2" maxlength="2" value="${cliente.enderecoEstado}">
                                    </td>
                                </tr>
                                <tr>
                                    <td align="right">
                                        <label for="status">Status:</label>
                                    </td>
                                    <td align="left">
                                        <input name="status" id="status" type="checkbox" <c:if test="${cliente.ativo}">checked</c:if>
                                        value="Ativo">
                                        Ativo
                                    </td>
                                    <td colspan="2">
                                        <a href="${contexto}/controller?command=online.ListarPedidos&idCliente=${cliente.id}">
                                            Clique aqui para ver os Pedidos
                                        </a>
                                    </td>
                                </tr>
                                <tr>
                                    <td colspan="4" align="center">
                                        <button name="salvar" type="submit" id="salvar">Salvar</button>
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