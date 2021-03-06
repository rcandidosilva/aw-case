<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<f:subview id="carrinhoCompras">
    <h:form>
        <h:panelGrid styleClass="tabelaJSF" columns="1">
            <f:facet name="header">
                <h:graphicImage url="images/titulos/carrinhoCompras.gif"
                                height="30" width="350"/>
            </f:facet>
            <h:dataTable value="#{CatalogoMB.carrinho.itens}" var="item"
                         width="100%" border="0" cellspacing="2" headerClass="cabecalho"
                         cellpadding="2">
                <h:column>
                    <f:facet name="header">
                        <h:outputText value="Produto"/>
                    </f:facet>
                    <h:outputText value="#{item.produto.nome}"/>
                </h:column>
                <h:column>
                    <f:facet name="header">
                        <h:outputText value="Categoria"/>
                    </f:facet>
                    <h:outputText value="#{item.produto.categoria}"/>
                </h:column>                
                <h:column>
                    <f:facet name="header">
                        <h:outputText value="Marca"/>
                    </f:facet>
                    <h:outputText value="#{item.produto.marca}"/>
                </h:column>
                <h:column>
                    <f:facet name="header">
                        <h:outputText value="Pre&ccedil;o Unit." escape="false"/>
                    </f:facet>
                    <h:outputText value="#{item.produto.preco}">
                        <f:convertNumber locale="pt_br" minFractionDigits="2" maxFractionDigits="2" groupingUsed="true"/>
                    </h:outputText>
                </h:column>
                <h:column>
                    <f:facet name="header">
                        <h:outputText value="Quantidade"/>
                    </f:facet>
                    <h:outputText value="#{item.quantidade}"/>
                </h:column>
                <h:column>
                    <f:facet name="header">
                        <h:outputText value="Pre&ccedil;o Total" escape="false"/>
                    </f:facet>
                    <h:outputText value="#{item.produto.preco*item.quantidade}">
                        <f:convertNumber locale="pt_br" minFractionDigits="2" maxFractionDigits="2" groupingUsed="true"/>
                    </h:outputText>
                </h:column>
            </h:dataTable>
        </h:panelGrid>
        <h:panelGrid columns="2" width="100%">
            <h:commandLink action="#{CatalogoMB.viewAll}">
                <h:graphicImage value="images/button/Bt_continuarComprando.gif"
                                onmouseout="MM_swapImgRestore()"
                                onmouseover="MM_swapImage('continuarComprando','','images/button/Bt_continuarComprando_on.gif',1)"
                                alt="Continuar Comprando" width="50"
                                height="37"/>
            </h:commandLink>
            <h:commandLink action="#{CatalogoMB.finalizarPedido}">
                <h:graphicImage value="images/button/Bt_finalizarPedido_on.gif"
                                onmouseout="MM_swapImgRestore()"
                                onmouseover="MM_swapImage('finalizarPedido','','images/button/Bt_finalizarPedido.gif',1)"
                                alt="Finalizar Pedido" width="50" height="37"/>
            </h:commandLink>
        </h:panelGrid>
    </h:form>
</f:subview>