<link href="../../css/GES_Tabelas.css" rel="stylesheet" type="text/css"></link>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>

<f:subview id="listaCategorias">
  <h:form>
    <h:panelGrid columns="1" styleClass="tabelaJSF">
      <f:facet name="header">
        <h:graphicImage url="images/titulos/listaCategorias.gif" height="30"
                        width="400"/>
      </f:facet>
      <h:dataTable value="#{CategoriaMB.categorias}" var="cat" id="tabela"
                   styleClass="tabelaJSF" headerClass="tabela_subtitulo">
        <h:column>
          <f:facet name="header">
            <h:outputText value="Descri&ccedil;&atilde;o" escape="false"/>
          </f:facet>
          <h:commandLink action="#{CategoriaMB.viewDetail}">
            <h:outputText value="#{cat.descricao}"/>
          </h:commandLink>
        </h:column>
        <h:column>
          <f:facet name="header">
            <h:outputText value="Ativo"/>
          </f:facet>
          <h:selectBooleanCheckbox disabled="true" value="#{cat.ativo}"/>
        </h:column>
        <h:column>
          <f:facet name="header">
            <h:outputText value="Id"/>
          </f:facet>
          <h:outputText value="#{cat.id}"/>
        </h:column>
        <h:column>
          <h:commandLink action="#{CategoriaMB.delete}" value="Apagar"/>
        </h:column>
      </h:dataTable>
    </h:panelGrid>
  </h:form>
</f:subview>
