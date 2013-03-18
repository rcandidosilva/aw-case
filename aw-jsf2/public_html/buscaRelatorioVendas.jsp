<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>

<f:subview id="buscaRelatorioVendas">
    <h:form id="formBusca">
        <h:panelGrid styleClass="tabelaGC" headerClass="cabecalho">
            <f:facet name="header">
                <h:outputText value="Ver relat&oacute;rio de vendas por marca" escape="false"/>
            </f:facet>
            <h:panelGrid columns="3">
                <h:outputLabel value="Data Inicial:" for="dataInicio"/>
                <h:panelGroup>
                    <h:inputText id="dataInicio" size="10"
                                 styleClass="GC_Normal"
                                 value="#{RelatorioVendasPorMarcaMB.dataInicio}">
                        <f:convertDateTime pattern="dd/MM/yyyy"/>
                    </h:inputText>
                    <h:outputText value="  dd/mm/yyyy   "/>
                </h:panelGroup>
                <h:message for="dataInicio"/>
                <h:outputLabel value="Data Final:" for="dataFinal"/>
                <h:panelGroup>
                    <h:inputText id="dataFinal" size="12" maxlength="12"
                                 styleClass="GC_Normal"
                                 value="#{RelatorioVendasPorMarcaMB.dataFinal}">
                        <f:convertDateTime pattern="dd/MM/yyyy"/>
                    </h:inputText>
                    <h:outputText value="  dd/mm/yyyy   "/>
                </h:panelGroup>
                <h:message for="dataFinal"/>
                <h:commandButton value="Buscar"
                                 action="#{RelatorioVendasPorMarcaMB.gerar}"
                                 onclick="document.forms['formBusca'].target='_blank';"/> 
            </h:panelGrid>
        </h:panelGrid>
    </h:form>
</f:subview>