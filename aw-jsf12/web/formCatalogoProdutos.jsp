<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<f:subview id="catalogoProdutos">
    <h:form>
        <h:panelGrid columns="1" styleClass="tabelaJSF" >
            <f:facet name="header">
                <h:graphicImage url="images/titulos/catalogoProdutos.gif"
                                height="30" width="350"/>
            </f:facet>
            <h:dataTable value="#{CatalogoMB.produtos}" var="produto"
                         headerClass="tabela_subtitulo" width="100%" rowClasses="linhaCatalogo"
                         cellspacing="2" cellpadding="2">
                
                <h:column>
                    <f:facet name="header">
                        <h:outputText value="Id"/>
                    </f:facet>
                    <h:outputText value="#{produto.id}"/>
                </h:column>
                <h:column>
                    <f:facet name="header">
                        <h:outputText value="Nome"/>
                    </f:facet>
                    <h:outputText value="#{produto.nome}"/>
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
                    <h:outputText value="#{produto.preco}">
                        <f:convertNumber locale="pt_br" minFractionDigits="2" maxFractionDigits="2" groupingUsed="true"/>
                    </h:outputText>
                </h:column>
                <h:column>
                    <f:facet name="header">
                        <h:outputText value="Marca"/>
                    </f:facet>
                    <h:outputText value="#{produto.marca}"/>
                </h:column>
                <h:column>
                    <f:facet name="header">
                        
                    </f:facet>
                    <h:commandLink value="" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('meuCarrinho','','$images/button/bt_carrinho_on.gif',1)"
                                   action="#{CatalogoMB.adicionarCarrinho}">
                        <h:graphicImage value="images/button/bt_carrinho.gif" width="25" height="25"/>
                    </h:commandLink>
                </h:column>
            </h:dataTable>
        </h:panelGrid>
    </h:form>
</f:subview>