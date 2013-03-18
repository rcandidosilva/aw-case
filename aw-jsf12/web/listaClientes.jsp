<link href="../../css/GES_Tabelas.css" rel="stylesheet" type="text/css"></link>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>

<f:subview id="listaClientes">
    <h:form>
        <h:panelGrid columns="1" styleClass="tabelaJSF">
            <f:facet name="header">
                <h:graphicImage url="images/titulos/listarClientes.gif"
                                height="30" width="400"/>
            </f:facet>
            <h:dataTable value="#{ClienteMB.clientes}" var="cliente" 
                        headerClass="tabela_subtitulo">
                <h:column>
                    <f:facet name="header">
                        <h:outputText value="Nome"/>
                    </f:facet>
                    <h:commandLink action="#{ClienteMB.viewDetail}">
                        <h:outputText value="#{cliente.nome}"/>
                    </h:commandLink>
                </h:column>
                <h:column>
                    <f:facet name="header">
                        <h:outputText value="Telefone"/>
                    </f:facet>
                    <h:outputText value="#{cliente.telefone}"/>
                </h:column>
                <h:column>
                    <f:facet name="header">
                        <h:outputText value="Email"/>
                    </f:facet>
                    <h:outputText value="#{cliente.email}"/>
                </h:column>
                <h:column>
                    <f:facet name="header">
                        <h:outputText value="Ativo"/>
                    </f:facet>
                    <h:selectBooleanCheckbox value="#{cliente.ativo}" disabled="true"/>
                </h:column>
            </h:dataTable>
            
        </h:panelGrid>
        
    </h:form>
</f:subview>