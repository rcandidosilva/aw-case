<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>

<f:subview id="formBuscaPedidos">
    <h:form>
        <h:panelGrid styleClass="tabelaGC" headerClass="cabecalho">
            <f:facet name="header">                
                <h:outputText value="Ver pedidos"/>
            </f:facet>
            <h:panelGrid columns="3">
                <h:outputLabel value="Data Inicial:" for="dataInicio"/>
                <h:panelGroup>
                    <h:inputText id="dataInicio" size="10" 
                                 styleClass="GC_Normal"
                                 value="#{PedidoMB.dataInicio}">
                        <f:convertDateTime pattern="dd/MM/yyyy"/>
                    </h:inputText>
                    <h:outputText value="  dd/mm/yyyy   "/>
                </h:panelGroup>
                <h:message for="dataInicio"/>
                <h:outputLabel value="Data Final:" for="dataFinal"/>
                <h:panelGroup>
                    <h:inputText id="dataFinal" size="10"
                                 styleClass="GC_Normal"
                                 value="#{PedidoMB.dataFinal}">
                        <f:convertDateTime pattern="dd/MM/yyyy"/>
                    </h:inputText>
                    <h:outputText value="  dd/mm/yyyy   "/>
                </h:panelGroup>
                <h:message for="dataFinal"/>
                <h:commandButton value="Buscar"
                                 action="#{PedidoMB.buscarPedidos}"/>
            </h:panelGrid>
        </h:panelGrid>
    </h:form>
</f:subview>