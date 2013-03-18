<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>

<f:subview id="finalizarPedido">
    
    <f:verbatim>
        <script src="/js/showDivPagamento.js" language="javascript"
                type="text/javascript"></script>
    </f:verbatim>
    
    <h:form>
        
        <!-- Inicio do cabecalho da pagina -->
        <h:panelGrid width="100%" border="0" cellspacing="0" cellpadding="0"
                     columns="2">
            <h:graphicImage value="/images/titulos/finalizarPedido.gif"
                            width="350" height="30"></h:graphicImage>
            <h:commandLink action="#{CatalogoMB.viewAll}">
                <h:graphicImage value="/images/button/Bt_continuarComprando.gif"
                                alt="Continuar Comprando" width="50" height="37"
                                onmouseout="MM_swapImgRestore()"
                                onmouseover="MM_swapImage('continuarComprando','','images/button/Bt_continuarComprando_on.gif',1)"/>
            </h:commandLink>
        </h:panelGrid>
        
        <h:dataTable value="#{CatalogoMB.carrinho.itens}" var="item"
                     width="100%" border="0" cellspacing="2" cellpadding="2"
                     headerClass="tabela_subtitulo"
                     columnClasses="GC_Normal">
            <h:column>
                <f:facet name="header">
                    <h:outputText value="Produtos"/>
                </f:facet>
                <h:outputText
                    value="#{item.produto.nome} - #{item.produto.marca}"/>
            </h:column>
            <h:column>
                <f:facet name="header">
                    <h:outputText value="Quantidade"/>
                </f:facet>
                <h:outputText value="#{item.quantidade}"/>
            </h:column>
            <h:column>
                <f:facet name="header">
                    <h:outputText value="Pre&ccedil;o" escape="false"/>
                </f:facet>
                <h:outputText value="#{item.produto.preco}">
                    <f:convertNumber locale="pt_br" minFractionDigits="2" maxFractionDigits="2" groupingUsed="true"/>
                </h:outputText>
            </h:column>
        </h:dataTable>
        
        <h:panelGrid columns="3" rowClasses="texto_rodape_tabelas">
            <h:panelGroup>
                <h:outputText value="Total "/>
                <h:outputText value="#{CatalogoMB.carrinho.precoTotal}">
                    <f:convertNumber locale="pt_br" minFractionDigits="2" maxFractionDigits="2" groupingUsed="true"/>
                </h:outputText>
            </h:panelGroup>
        </h:panelGrid>
        
        <h:panelGrid styleClass="tabelaJSF" columns="1" headerClass="cabecalho">
            <f:facet name="header">
                <h:outputText  value="Cadastro do Cliente"/>
            </f:facet>
            <h:panelGrid columns="2">
                
                <h:outputLabel value="Nome" for="nome"/>
                <h:panelGrid columns="2">
                    <h:inputText id="nome" value="#{CatalogoMB.cliente.nome}"
                                 required="true" size="70">
                        <f:validateLength minimum="4" maximum="100"/>
                    </h:inputText>
                    <h:message for="nome"/>
                </h:panelGrid>
                
                <h:outputLabel value="Telefone" for="telefone"/>
                <h:panelGrid columns="5">
                    <h:inputText id="telefone"
                                 value="#{CatalogoMB.cliente.telefone}"
                                 required="true" size="15">
                        <f:validateLength minimum="8" maximum="20"/>
                    </h:inputText>
                    <h:message for="telefone"/>
                    <h:outputLabel value="e-mail" for="email"/>
                    <h:inputText id="email" value="#{CatalogoMB.cliente.email}"
                                 required="true" size="40">
                        <f:validateLength minimum="10" maximum="50"/>
                    </h:inputText>
                    <h:message for="email"/>
                </h:panelGrid>
                
                <h:outputLabel value="Senha" for="senha"/>
                <h:panelGrid columns="3">
                    <h:outputText id="senha" value="**********"/>
                    <h:outputLabel value="Ativo" for="ativo"/>
                    <h:selectBooleanCheckbox value="#{CatalogoMB.cliente.ativo}"
                                             id="ativo"/>
                </h:panelGrid>
                
                <h:outputLabel value=" Rua" for="rua"/>
                <h:panelGrid columns="5">
                    <h:inputText id="rua"
                                 value="#{CatalogoMB.cliente.enderecoRua}"
                                 required="true" size="50">
                        <f:validateLength minimum="4" maximum="100"/>
                    </h:inputText>
                    <h:message for="rua"/>
                    <h:outputLabel value=" Numero" for="numero"/>
                    <h:inputText id="numero"
                                 value="#{CatalogoMB.cliente.enderecoNumero}"
                                 required="true" size="4">
                        <f:validateLongRange minimum="1" maximum="99999"/>
                    </h:inputText>
                    <h:message for="numero"/>
                </h:panelGrid>
                
                <h:outputLabel value="Bairro" for="bairro"/>
                <h:panelGrid columns="5">
                    <h:inputText id="bairro"
                                 value="#{CatalogoMB.cliente.enderecoBairro}"
                                 required="true" size="20">
                        <f:validateLength minimum="2" maximum="50"/>
                    </h:inputText>
                    <h:message for="bairro"/>
                    <h:outputLabel value="Cep" for="cep"/>
                    <h:inputText id="cep"
                                 value="#{CatalogoMB.cliente.enderecoCep}"
                                 required="true" size="9">
                        <f:validateLength minimum="8" maximum="9"/>
                    </h:inputText>
                    <h:message for="cep"/>
                </h:panelGrid>
                
                <h:outputLabel value="Cidade" for="cidade"/>
                <h:panelGrid columns="5">
                    <h:inputText id="cidade"
                                 value="#{CatalogoMB.cliente.enderecoCidade}"
                                 required="true" size="20">
                        <f:validateLength minimum="2" maximum="50"/>
                    </h:inputText>
                    <h:message for="cidade"/>
                    <h:outputLabel value="Estado" for="estado"/>
                    <h:inputText id="estado"
                                 value="#{CatalogoMB.cliente.enderecoEstado}"
                                 required="true" size="2"/>
                    <h:message for="estado"/>
                </h:panelGrid>
                
            </h:panelGrid>
        </h:panelGrid>
        
        <h:panelGrid styleClass="tabelaJSF" columns="1" headerClass="cabecalho">
            <f:facet name="header">
                <h:outputText value="Dados do pagamento"/>
            </f:facet>
            <h:panelGrid columns="2">
                <h:outputLabel for="formaPagamento"
                               value="Forma de pagamento:"/>
                <h:selectOneRadio id="formaPagamento" onchange="submit()"
                                  immediate="true"
                                  value="#{CatalogoMB.formaPagamentoSelecionada}"
                                  valueChangeListener="#{CatalogoMB.valueChangeListener}">
                    <f:selectItems value="#{CatalogoMB.formasPagamento}"/>
                </h:selectOneRadio>
            </h:panelGrid>
        </h:panelGrid>
        
        <h:panelGrid styleClass="tabelaJSF" columns="1" headerClass="cabecalho"
                     rendered="#{CatalogoMB.boleto}">
            <f:facet name="header">
                <h:outputText styleClass="coluna1" value="Dados do Boleto"/>
            </f:facet>
            <h:panelGrid columns="3">
                <h:outputLabel value="Banco:" for="banco"/>
                <h:selectOneMenu id="banco" value="#{CatalogoMB.pagamento.banco}"
                                 converter="br.com.globalcode.converter.Banco">
                    <f:selectItems value="#{CatalogoMB.bancos}"/>
                </h:selectOneMenu>
                <h:message for="banco"/>
                <h:outputLabel for="cedente" value="Cedente"/>
                <h:inputText id="cedente" size="40" required="true"
                             value="#{CatalogoMB.pagamento.cedente}">
                    <f:validateLength minimum="5" maximum="50"/>
                </h:inputText>
                <h:message for="cedente"/>
                <h:outputLabel for="sacado" value="Sacado"/>
                <h:inputText id="sacado" size="40" required="true"
                             value="#{CatalogoMB.pagamento.sacado}">
                    <f:validateLength minimum="5" maximum="50"/>
                </h:inputText>
                <h:message for="sacado"/>
                <h:outputLabel for="codigoBarras" value="C&oacute;digo de Barras"/>
                <h:panelGrid columns="5">
                    <h:inputText id="codigoBarras" size="40" required="true"
                                 value="#{CatalogoMB.pagamento.numeroCodigoBarras}">
                        <f:validateLength minimum="5" maximum="50"/>
                    </h:inputText>
                    <h:message for="codigoBarras"/>
                    <h:outputLabel for="vencimento" value="Vencimento"/>
                    <h:inputText id="vencimento" size="10" required="true"
                                 value="#{CatalogoMB.pagamento.dataVencimento}">
                        <f:convertDateTime pattern="dd/MM/yy"/>
                    </h:inputText>
                    <h:message for="vencimento"/>
                </h:panelGrid>
            </h:panelGrid>
        </h:panelGrid>
        
        <h:panelGrid styleClass="tabelaJSF" columns="1" headerClass="cabecalho"
                     rendered="#{not CatalogoMB.boleto}">
            <f:facet name="header">
                <h:outputText value="Dados do Cart&atilde;o de Cr&eacute;dito" escape="false"/>
            </f:facet>
            <h:panelGrid columns="3">
                <h:outputLabel value="Bandeira:" for="bandeira"/>
                <h:selectOneMenu id="bandeira" value="#{CatalogoMB.pagamento.bandeiraCartaoCredito}"
                                 converter="br.com.globalcode.converter.Bandeira">
                    <f:selectItems value="#{CatalogoMB.bandeiras}"/>
                </h:selectOneMenu>
                <h:message for="bandeira"/>
                <h:outputText value="N&uacute;mero do Cart&atilde;o de Cr&eacute;dito" escape="false"/>
                <h:inputText id="numeroCC" size="16" required="true"
                             value="#{CatalogoMB.pagamento.numeroCartao}">
                    <f:validateLength minimum="12" maximum="50"/>
                </h:inputText>
                <h:message for="numeroCC"/>
                <h:outputText value="C&oacute;digo de Verifica&ccedil;&atilde;o" escape="false"/>
                <h:inputText id="codigoVerificacao" size="3" required="true" 
                             value="#{CatalogoMB.pagamento.numeroConfirmacao}">
                    <f:validateLongRange minimum="100" maximum="999"/>
                </h:inputText>
                <h:message for="codigoVerificacao"/>
                <h:outputLabel for="titular" value="Titular"/>
                <h:inputText id="titular" size="40" required="true"
                             value="#{CatalogoMB.pagamento.nomeTitular}">
                    <f:validateLength minimum="5" maximum="50"/>
                </h:inputText>
                <h:message for="titular"/>
                <h:outputLabel for="validade" value="Validade"/>
                <h:panelGroup>
                    <h:inputText id="validade" size="5" required="true"
                                 value="#{CatalogoMB.pagamento.dataValidadeCartao}">
                        <f:convertDateTime pattern="MM/yy"/>
                    </h:inputText>
                    <h:outputText value=" (Formato mm/yy)"/>
                    <h:message for="validade"/>
                </h:panelGroup>
            </h:panelGrid>
        </h:panelGrid>
        
        <h:commandButton value="Enviar Pedido"
                         action="#{CatalogoMB.enviarPedido}"/>
        
    </h:form>
    
</f:subview>
