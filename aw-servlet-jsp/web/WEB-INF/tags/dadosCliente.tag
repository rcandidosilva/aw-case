<%@attribute name="cliente" required="false" rtexprvalue="true" type="br.com.globalcode.model.Cliente"%>
<%@attribute name="tipo" required="true" rtexprvalue="true"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:set var="contexto" value="${pageContext.request.contextPath}" />
<c:set var="editar" value='${tipo eq "editar"}' />   

<table class="tabelaGC" width="100%"  border="1"  cellpadding="0" cellspacing="0" bordercolor="#EEEEEE">

    <thead>
        <tr>
            <td>
                <table>
                    <tr>            
                        <td class="coluna1" width="30%">Cadastro do Cliente</td>
                        <td width="70%">&nbsp;</td>
                    </tr>
                </table>
            </td>
        </tr>
    </thead>

    <tbody>
        <tr>
            <td colspan="2">      
                <fieldset>
                    <legend>Dados do Cliente</legend>
                    <table>
                        <tr>
                            <td align="right"><label for="nome">Nome:</label></td>
                            <td colspan="3" align="left">
                                <input type="hidden" name="idCliente" value="${cliente.id}">
                                <c:choose>
                                    <c:when test="${editar}">
                                        <input name="nome" id="nome" type="text" size="75"
                                            maxlength="255" value="${cliente.nome}">
                                    </c:when>
                                    <c:otherwise>
                                        <span class="GC_Normal2">${cliente.nome}</span>
                                    </c:otherwise>
                                </c:choose>
                            </td>
                        </tr>
                        <tr>
                            <td align="right"><label for="email">e-mail:</label></td>
                            <td align="left">
                                <c:choose>
                                    <c:when test="${editar}">
                                        <input name="email" id="email" type="text" size="50"
                                            maxlength="50" value="${cliente.email}">
                                    </c:when>
                                    <c:otherwise>
                                        <span class="GC_Normal2">${cliente.email}</span>
                                    </c:otherwise>
                                </c:choose>
                            </td>
                            <td align="right"><label for="telefone">Telefone:</td>
                            <td align="left">
                                <c:choose>
                                    <c:when test="${editar}">
                                        <input name="telefone" id="telefone" type="text" size="20"
                                            maxlength="50" value="${cliente.telefone}">
                                    </c:when>
                                    <c:otherwise>
                                        <span class="GC_Normal2">${cliente.telefone}</span>
                                    </c:otherwise>
                                </c:choose>
                            </td>
                        </tr>
                    </table>
                </fieldset>
                <fieldset>
                    <legend>Endere&ccedil;o</legend>
                    <table>
                        <tr>
                            <td align="right"><label for="enderecoRua">Rua/Av:</label></td>
                            <td align="left">
                                <c:choose>
                                    <c:when test="${editar}">
                                        <input name="enderecoRua" id="enderecoRua" type="text"
                                            size="40" maxlength="50" value="${cliente.enderecoRua}">
                                    </c:when>
                                    <c:otherwise>
                                        <span class="GC_Normal2">${cliente.enderecoRua}</span>
                                    </c:otherwise>
                                </c:choose>
                            </td>
                            <td align="right"><label for="enderecoNumero">N&uacute;mero:</label></td>
                            <td align="left">
                                <c:choose>
                                    <c:when test="${editar}">
                                        <input name="enderecoNumero" id="enderecoNumero" type="text"
                                            size="10" maxlength="10" value="${cliente.enderecoNumero}">
                                    </c:when>
                                    <c:otherwise>
                                        <span class="GC_Normal2">${cliente.enderecoNumero}</span>
                                    </c:otherwise>
                                </c:choose>
                            </td>
                        </tr>
                        <tr>
                            <td align="right"><label for="enderecoBairro">Bairro:</td>
                            <td align="left">
                                <c:choose>
                                    <c:when test="${editar}">
                                        <input name="enderecoBairro" id="enderecoBairro" type="text"
                                            size="40" maxlength="50" value="${cliente.enderecoBairro}">
                                    </c:when>
                                    <c:otherwise>
                                        <span class="GC_Normal2">${cliente.enderecoBairro}</span>
                                    </c:otherwise>
                                </c:choose>
                            </td>
                            <td align="right"><label for="enderecoCep">CEP:</td>
                            <td align="left">
                                <c:choose>
                                    <c:when test="${editar}">
                                        <input name="enderecoCep" id="enderecoCep" type="text"
                                            size="10" maxlength="10" value="${cliente.enderecoCep}">
                                    </c:when>
                                    <c:otherwise>
                                        <span class="GC_Normal2">${cliente.enderecoCep}</span>
                                    </c:otherwise>
                                </c:choose>
                            </td>
                        </tr>
                        <tr>
                            <td align="right"><label for="enderecoCidade">Cidade:</td>
                            <td align="left">
                                <c:choose>
                                    <c:when test="${editar}">
                                        <input name="enderecoCidade" id="enderecoCidade" type="text"
                                            size="40" maxlength="50" value="${cliente.enderecoCidade}">
                                    </c:when>
                                    <c:otherwise>
                                        <span class="GC_Normal2">${cliente.enderecoCidade}</span>
                                    </c:otherwise>
                                </c:choose>
                            </td>
                            <td align="right"><label for="enderecoEstado">Estado:</td>
                            <td align="left">
                                <c:choose>
                                    <c:when test="${editar}">
                                        <input name="enderecoEstado" id="enderecoEstado" type="text"
                                            size="2" maxlength="2" value="${cliente.enderecoEstado}">
                                    </c:when>
                                    <c:otherwise>
                                        <span class="GC_Normal2">${cliente.enderecoEstado}</span>
                                    </c:otherwise>
                                </c:choose>
                            </td>
                        </tr>
                    </table>
                </fieldset>
            </td>
        </tr>
    </tbody>
</table>