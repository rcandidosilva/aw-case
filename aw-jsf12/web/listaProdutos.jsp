<link href="../../css/GES_Tabelas.css" rel="stylesheet" type="text/css"></link>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<f:subview id="listaProdutos">
   <h:form>
    <h:panelGrid columns="1" styleClass="tabelaJSF">
      <f:facet name="header">
        <h:graphicImage url="images/titulos/listarProdutos.gif" height="30"
                        width="400"/>
      </f:facet>
      <h:dataTable id="tabela" value="#{ProdutoMB.produtos}" var="produto" styleClass="tabelaJSF" headerClass="tabela_subtitulo">    
        <h:column>
          <f:facet name="header">
            <h:outputText value="Nome"/>
          </f:facet>
          <h:commandLink action="#{ProdutoMB.viewDetail}">
          <h:outputText value="#{produto.nome}"/>
          </h:commandLink>
        </h:column>
        <h:column>
          <f:facet name="header">
            <h:outputText value="Ativo"/>
          </f:facet>
          <h:selectBooleanCheckbox value="#{produto.ativo}" disabled="true"/>
        </h:column>
        <h:column>
          <f:facet name="header">
            <h:outputText value="Categoria"/>
          </f:facet>
          <h:outputText value="#{produto.categoria}"/>
        </h:column>
        <h:column>
          <f:facet name="header">
            <h:outputText value="Pre&ccedil;o" escape="false"/>
          </f:facet>
          <h:outputText value="#{produto.preco}"/>
        </h:column>
        <h:column>
          <f:facet name="header">
            <h:outputText value="Marca"/>
          </f:facet>
          <h:outputText value="#{produto.marca}"/>
        </h:column>
        <h:column>
          <f:facet name="header">
            <h:outputText value="Id"/>
          </f:facet>
          <h:outputText value="#{produto.id}"/>
        </h:column>
      </h:dataTable>
    </h:panelGrid>
  </h:form></f:subview>
