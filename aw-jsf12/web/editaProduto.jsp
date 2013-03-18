<link href="../../css/GES_Tabelas.css" rel="stylesheet" type="text/css"></link>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<f:subview id="editaProduto">
  <h:form>
   <h:panelGrid columns="1" styleClass="tabelaJSF">
      <f:facet name="header">
        <h:graphicImage url="images/titulos/novaProduto.gif" height="30"
                        width="400"/>
      </f:facet>        
      <h:panelGrid columns="3">        
        <h:outputLabel value="Nome:" for="nome"/>
        <h:inputText id="nome" value="#{ProdutoMB.produto.nome}" size="40"
                     maxlength="255" required="true"/>
        <h:message for="nome"/>
        <h:outputLabel value="Marca:" for="marca"/>
        <h:inputText id="marca" value="#{ProdutoMB.produto.marca}" size="40"
                     maxlength="50" required="true"/>
        <h:message for="marca"/>
        <h:outputLabel value="Categoria:" for="categoria"/>
        <h:selectOneMenu id="categoria" value="#{ProdutoMB.produto.categoria}"
                         converter="br.com.globalcode.converter.Categoria">
            <f:selectItems value="#{ProdutoMB.categorias}"/>
        </h:selectOneMenu>
        <h:message for="categoria"/>
        <h:outputText value="Pre&ccedil;o:" escape="false"/>
        <h:inputText id="preco" value="#{ProdutoMB.produto.preco}" size="20"
                     maxlength="20"/>
        <h:message for="preco"/>
        <h:outputLabel value="Status:" for="status"/>
        <h:panelGroup>
          <h:selectBooleanCheckbox id="status"
                                   value="#{ProdutoMB.produto.ativo}"/>
          <h:outputText value="Ativo"/>
        </h:panelGroup>
        <h:message for="status"/>
        <h:outputLabel value="Tipo de Produto:" for="tipo"/>
        <h:selectOneRadio id="tipo" value="#{ProdutoMB.tipo}"
                          onchange="submit()" immediate="true"
                          valueChangeListener="#{ProdutoMB.valueChangeListener}">
          <f:selectItems value="#{ProdutoMB.tipos}"/>
        </h:selectOneRadio>
        <h:outputLabel value=""/>
        
        <h:outputLabel value="Taxa de Entrega:" for="taxa"
                       rendered="#{ProdutoMB.isProdutoMaterial}"/>
        <h:inputText id="taxa" value="#{ProdutoMB.produto.taxaEntrega}"
                     size="20" maxlength="20"
                     rendered="#{ProdutoMB.isProdutoMaterial}"/>
        <h:outputText value="" rendered="#{ProdutoMB.isProdutoMaterial}"/>
        
        <h:outputLabel value="Nome do Arquivo:" for="nomeArquivo"
                       rendered="#{not ProdutoMB.isProdutoMaterial}"/>
        <h:inputText id="nomeArquivo" value="#{ProdutoMB.produto.nomeArquivo}"
                     size="40" maxlength="255"
                     rendered="#{not ProdutoMB.isProdutoMaterial}"/>
        <h:outputText value="" rendered="#{not ProdutoMB.isProdutoMaterial}"/>
        
        <h:outputLabel value="Tamanho:" for="tamanho"
                       rendered="#{not ProdutoMB.isProdutoMaterial}"/>
        <h:inputText id="tamanho" value="#{ProdutoMB.produto.tamanho}" size="10"
                     maxlength="10"
                     rendered="#{not ProdutoMB.isProdutoMaterial}"/>
        <h:outputText value="" rendered="#{not ProdutoMB.isProdutoMaterial}"/>
        
        <h:inputHidden id="id" value="#{ProdutoMB.produto.id}"/>
         <h:commandButton action="#{ProdutoMB.save}" value="Salvar"/>
      </h:panelGrid>
    </h:panelGrid>
  </h:form>
</f:subview>
