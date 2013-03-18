<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@ page contentType="text/html;charset=windows-1252"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<f:subview id="editaProdutoMaterial">
  <html>
    <head>
      <meta http-equiv="Content-Type"
            content="text/html; charset=windows-1252"/>
      <title>Edita Produto Material</title>
    </head>
    <body><h:form>
        <h:panelGrid columns="2">
          <h:outputLabel value="Nome" for="nome"/>
          <h:inputText id="nome" value="#{ProdutoMB.produto.nome}" size="40"/>
          <h:outputLabel value="Marca" for="marca"/>
          <h:inputText id="marca" value="#{ProdutoMB.produto.marca}"/>
          <h:outputLabel value="ID" for="id"/>
          <h:inputText id="id" value="#{ProdutoMB.produto.id}" size="4" disabled="true"/>
          <h:outputLabel value="Categoria" for="categoria"/>
          <h:selectOneMenu id="categoria" value="#{ProdutoMB.produto.categoria}">
            <f:selectItems value="#{ProdutoMB.categorias}"/>
          </h:selectOneMenu>
          <h:outputLabel value="Preço" for="preco"/>
          <h:inputText id="preco" value="#{ProdutoMB.produto.preco}" size="8"/>
          <h:outputLabel value="Taxa de Entrega" for="taxa"/>
          <h:inputText id="taxa" value="#{ProdutoMB.produto.taxaEntrega}"/>
          <h:outputLabel value="Ativo?" for="ativo"/>
          <h:selectBooleanCheckbox id="ativo" value="#{ProdutoMB.produto.ativo}"/>
          <h:commandButton action="#{ProdutoMB.save}" value="Salvar"/>
        </h:panelGrid>
      </h:form></body>
  </html>
</f:subview>
