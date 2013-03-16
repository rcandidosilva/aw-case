<%@attribute name="pagamento" required="false" rtexprvalue="true" type="br.com.globalcode.model.Pagamento" %>
<%@attribute name="tipo" required="true" rtexprvalue="true"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://globalcode.com.br/aw/helper" prefix="aw"%>

<c:set var="contexto" value="${pageContext.request.contextPath}" />
<c:set var="editar" value='${tipo eq "editar"}' />
<fmt:setLocale value="pt_BR" />   

<script src="${contexto}/js/showDivPagamento.js" language="javascript" type="text/javascript"></script>

<table class="tabelaGC" border="1" width="100%" cellpadding="0" cellspacing="0" bordercolor="#EEEEEE">

    <thead>
        <tr>
            <td>
                <table>
                    <tr>            
                        <td class="coluna1" width="30%">Dados do pagamento</td>
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
                    <table>
                        <tr>
                            <td align="right"><label for="pagamentoCartao">Forma de pagamento:</label></td>
                            <td colspan="3" align="left">
                              <c:choose>
                                <c:when test="${editar}">
                                <input type="radio" id="pagamentoCartao" name="tipoPagamento" value="cartao" checked
                                    onclick="showDiv('divPagamentoCartao');" class="GC_Normal2">Cart&atilde;o de cr&eacute;dito
                                <input type="radio" id="pagamentoBoleto" name="tipoPagamento" value="boleto"
                                    onclick="showDiv('divPagamentoBoleto');" class="GC_Normal2">Boleto
                                </c:when>
                                <c:otherwise>
                                <span class="GC_Normal2">
                                    <aw:tipoPagamento pagamento="${pagamento}"/> ${tipoPagamento}
                                </span>
                                </c:otherwise>
                              </c:choose>
                            </td>
                        </tr>
                    </table>
                </fieldset>
            </td>
        </tr>
        
        <tr>
            <td colspan="2">
              <c:if test='${editar or (tipoPagamento eq "boleto")}' >
                <c:if test='${editar}'><div id="divPagamentoBoleto" style="display:none; visibility:hidden"></c:if>
                <fieldset>
                    <legend>Dados do Boleto</legend>
                    <table>
                        <tr>
                            <td align="right"><label for="banco">Banco:</label></td>
                            <td align="left">
                              <c:choose>
                                <c:when test="${editar}">
                                <select id="banco" name="banco" size="1">
                                    <option value="1" selected>Banco do Brasil</option>
                                    <option value="2">Bradesco</option>
                                    <option value="3">Itaú</option>
                                </select>
                                </c:when>
                                <c:otherwise>
                                <span class="GC_Normal2">
                                    ${pagamentoBoleto.banco.nome}
                                </span>
                                </c:otherwise>
                              </c:choose>
                            </td>
                            <td align="right">&nbsp;</td>
                            <td align="left">&nbsp;</td>
                        </tr>
                        <c:if test='${not editar}'>            
                        <tr>
                            <td align="right"><label for="banco">Cedente:</label></td>
                            <td align="left"><span class="GC_Normal2">
                                ${pagamentoBoleto.cedente}
                            </span></td>
                        </tr>
                        <tr>
                            <td align="right"><label for="banco">Sacado:</label></td>
                            <td align="left"><span class="GC_Normal2">
                                ${pagamentoBoleto.sacado}
                            </span></td>
                        </tr>
                        <tr>
                            <td align="right"><label for="banco">C&oacute;digo de Barras:</label></td>
                            <td align="left"><span class="GC_Normal2">
                                ${pagamentoBoleto.numeroCodigoBarras}
                            </span></td>
                        </tr>
                        <tr>
                            <td align="right"><label for="dataVencimento">Vencimento:</label></td>
                            <td align="left"><span class="GC_Normal2">
                                <fmt:formatDate value="${pagamentoBoleto.dataVencimento}" />
                            </span></td>
                        </tr>
                        </c:if>
                     </table>
                </fieldset>
                <c:if test='${editar}'></div></c:if>
             </c:if>
             <c:if test='${editar or (tipoPagamento eq "cart&atilde;o")}' >            
                <c:if test='${editar}'><div id="divPagamentoCartao"></c:if>
                <fieldset>
                    <legend>Dados do Cart&atilde;o</legend>
                    <table>
                        <tr>
                            <td align="right"><label for="bandeira">Bandeira do cart&atilde;o:</label></td>
                            <td align="left">
                              <c:choose>
                                <c:when test="${editar}">
                                <select id="bandeira" name="bandeira" size="1">
                                    <option value="1" selected>Visa</option>
                                    <option value="2">Mastercard</option>
                                    <option value="3">American Express</option>
                                    <option value="4">Dinners</option>
                                </select>
                                </c:when>
                                <c:otherwise><span class="GC_Normal2">
                                    ${pagamentoCartao.bandeiraCartaoCredito.nome}</span>
                                </c:otherwise>    
                              </c:choose>
                            </td>
                            <td align="right">&nbsp;</td>
                            <td align="left">&nbsp;</td>
                        </tr>
                        <tr>
                            <td align="right"><label for="numeroCartao">N&uacute;mero do cart&atilde;o:</label></td>
                            <td align="left">
                              <c:choose>
                                <c:when test="${editar}">
                                    <input name="numeroCartao" id="numeroCartao" type="text" 
                                        size="21" maxlength="50" value="${pagamentoCartao.numeroCartao}">
                                </c:when>
                                <c:otherwise><span class="GC_Normal2">
                                    ${pagamentoCartao.numeroCartao}</span>
                                </c:otherwise>    
                              </c:choose>
                            </td>
                            <td align="right"><label for="numeroVerificacao">C&oacute;digo de verifica&ccedil;&atilde;o:</label></td>
                            <td align="left">
                              <c:choose>
                                <c:when test="${editar}">
                                    <input name="numeroVerificacao" id="numeroVerificacao" type="text" 
                                        size="5" maxlength="5" value="${pagamentoCartao.numeroConfirmacao}">
                                </c:when>
                                <c:otherwise><span class="GC_Normal2">
                                    ${pagamentoCartao.numeroConfirmacao}</span>
                                </c:otherwise>    
                              </c:choose>
                            </td>
                        </tr>
                        <tr>
                            <td align="right"><label for="nomeTitular">Nome do titular:</label></td>
                            <td align="left">
                              <c:choose>
                                <c:when test="${editar}">
                                    <input name="nomeTitular" id="nomeTitular" type="text" 
                                        size="21" maxlength="50" value="${pagamentoCartao.nomeTitular}">
                                </c:when>
                                <c:otherwise><span class="GC_Normal2">
                                    ${pagamentoCartao.nomeTitular}</span>
                                </c:otherwise>    
                              </c:choose>
                            </td>
                            <td align="right"><label for="dataValidadeCartao">Data de Validade: </span></td>
                            <td align="left">
                              <c:choose>
                                <c:when test="${editar}">
                                    <input name="dataValidadeCartao" id="dataValidadeCartao" type="text" 
                                        size="5" maxlength="10" value="${pagamentoCartao.dataValidadeCartao}">
                                    <span class="GC_Normal2">(formato MM/yy)</span>
                                </c:when>
                                <c:otherwise><span class="GC_Normal2">
                                    <fmt:formatDate value="${pagamentoCartao.dataValidadeCartao}" pattern="MM/yy" /></span>
                                </c:otherwise>    
                              </c:choose>
                            </td>
                        </tr>
                    </table>
                </fieldset>
                <c:if test='${editar}'></div></c:if>
              </c:if>
            </td>
        </tr>

    </tbody>
</table>
