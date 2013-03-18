<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://www.globalcode.com.br/aw/jsf" prefix="aw"%>

<f:subview id="buscaGraficoVendas">
    <h:form>
        <h:panelGrid styleClass="tabelaGC" headerClass="cabecalho">
            <f:facet name="header">
                <h:outputText value="Ver gr&aacute;fico de vendas por marca" escape="false"/>
            </f:facet>
            <h:panelGrid columns="1">
                <h:panelGroup>
                    <aw:calendario label="Data Inicial:" name="dataInicio" 
                                   value="#{GraficoVendasPorMarcaMB.dataInicio}"/>
                </h:panelGroup>
                <h:panelGroup>
                    <aw:calendario label="Data  Final:" name="dataFinal" 
                                   value="#{GraficoVendasPorMarcaMB.dataFinal}"/>
                </h:panelGroup>
                <h:commandButton value="Gerar" 
                                 action="#{GraficoVendasPorMarcaMB.gerar}"/> 

            </h:panelGrid>
        </h:panelGrid>
    </h:form>
</f:subview>