<link href="../../css/GES_Tabelas.css" rel="stylesheet" type="text/css"></link>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<f:subview id="editaCategoria">
  <h:form>
    <h:panelGrid columns="1" styleClass="tabelaJSF" >
      <f:facet name="header">
        <h:graphicImage url="images/titulos/editarCategoria.gif" height="30"
                        width="400"/>
      </f:facet>
      <h:panelGrid columns="3">
        <h:outputText value="Descri&ccedil;&atilde;o" escape="false"/>
        <h:inputText id="descricao" size="25" maxlength="50"
                     value="#{CategoriaMB.categoria.descricao}"/>
        <h:message for="descricao"/>
        <h:outputLabel value="Status:" for="status"/>
        <h:panelGroup>
          <h:selectBooleanCheckbox id="status"
                                   value="#{CategoriaMB.categoria.ativo}"/>
          <h:outputText value="Ativo"/>
        </h:panelGroup>
        <h:message for="status"/>
        <h:inputHidden id="id" value="#{CategoriaMB.categoria.id}"/>
        <h:commandButton action="#{CategoriaMB.save}" value="Salvar"/>
      </h:panelGrid>
    </h:panelGrid>
  </h:form>
</f:subview>
