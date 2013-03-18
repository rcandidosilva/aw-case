<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>

<f:subview id="formPedidos">
    <h:form>
        <h:panelGrid columns="1" styleClass="tabelaJSF">
            <f:facet name="header">
                <h:outputLabel value="Pedidos encontrados:"/>
            </f:facet>
            <h:dataTable id="tabela" value="#{PedidoMB.pedidos}" var="pedido" 
                         styleClass="tabelaJSF" headerClass="tabela_subtitulo">    
                <h:column>
                    <f:facet name="header">
                        <h:outputText value="N&uacute;mero" escape="false"/>
                    </f:facet>
                    <h:commandLink action="#{PedidoMB.verDetalhes}">
                        <h:outputText value="#{pedido.numero}"/>
                    </h:commandLink>
                </h:column>
                <h:column>
                    <f:facet name="header">
                        <h:outputText value="Cliente"/>
                    </f:facet>
                    <h:outputText value="#{pedido.cliente.nome}"/>
                </h:column>
                <h:column>
                    <f:facet name="header">
                        <h:outputText value="Valor"/>
                    </f:facet>
                    <h:outputText value="#{pedido.pagamento.valor}">
                        <f:convertNumber locale="pt_br" minFractionDigits="2" maxFractionDigits="2" groupingUsed="true"/>
                    </h:outputText>
                </h:column>
                <h:column>
                    <f:facet name="header">
                        <h:outputText value="Data"/>
                    </f:facet>
                    <h:outputText value="#{pedido.data}">
                        <f:convertDateTime pattern="dd/MM/yyyy"/>
                    </h:outputText>
                </h:column>
            </h:dataTable>
        </h:panelGrid>
    </h:form>
</f:subview>