<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<f:subview id="menu">
 <h:form>
    <c:set value="${pageContext.request.contextPath}" var="contexto"/>
    <h:panelGrid columns="2" width="170" border="0" cellpadding="0" cellspacing="0">
        <!-- Categoria -->
        <h:outputText value="Categoria" styleClass="menu_titulo"/>
        <h:graphicImage url="/images/menus/fundo_bt_titulo2.gif" width="60"
                        styleClass="menu_titulo" height="20"/>
        <h:commandLink action="#{CategoriaMB.viewAll}">
            <h:outputText styleClass="menu_subtitulo" value="Visualizar Todas"/>
        </h:commandLink>
        <h:graphicImage styleClass="menu_subtitulo"
                        url="/images/menus/fundo_bt_titulo2.gif" width="60"
                        height="20"/>
        <h:commandLink action="#{CategoriaMB.createNew}">
            <h:outputText styleClass="menu_subtitulo"
                          value="Cadastrar Nova"/>
        </h:commandLink>
        <h:graphicImage styleClass="menu_subtitulo"
                        url="/images/menus/fundo_bt_titulo2.gif" width="60"
                        height="20"/>
        <!-- Produtos -->
        <h:outputText value="Produtos" styleClass="menu_titulo"/>
        <h:graphicImage url="/images/menus/fundo_bt_titulo2.gif" width="60"
                        styleClass="menu_titulo" height="20"/>
        <h:commandLink action="#{ProdutoMB.viewAll}">
            <h:outputText styleClass="menu_subtitulo" value="Visualizar Todos"/>
        </h:commandLink>
        <h:graphicImage styleClass="menu_subtitulo"
                        url="/images/menus/fundo_bt_titulo2.gif" width="60"
                        height="20"/>
        <h:commandLink action="#{ProdutoMB.createNew}">
            <h:outputText styleClass="menu_subtitulo"
                          value="Cadastrar Novo"/>
        </h:commandLink>
        <h:graphicImage styleClass="menu_subtitulo"
                        url="/images/menus/fundo_bt_titulo2.gif" width="60"
                        height="20"/>
        <!-- Clientes -->
        <h:outputText value="Clientes" styleClass="menu_titulo"/>
        <h:graphicImage url="/images/menus/fundo_bt_titulo2.gif" width="60"
                        styleClass="menu_titulo" height="20"/>
        <h:commandLink action="#{ClienteMB.viewAll}">
            <h:outputText styleClass="menu_subtitulo" value="Visualizar Todos"/>
        </h:commandLink>
        <h:graphicImage styleClass="menu_subtitulo"
                        url="/images/menus/fundo_bt_titulo2.gif" width="60"
                        height="20"/>
        <h:commandLink action="#{ClienteMB.createNew}">
            <h:outputText styleClass="menu_subtitulo"
                          value="Cadastrar Novo"/>
        </h:commandLink>
        <h:graphicImage styleClass="menu_subtitulo"
                        url="/images/menus/fundo_bt_titulo2.gif" width="60"
                        height="20"/>
        <!-- Pedidos -->   
        <h:outputText value="Pedidos" styleClass="menu_titulo"/>
        <h:graphicImage url="/images/menus/fundo_bt_titulo2.gif" width="60"
                        styleClass="menu_titulo" height="20"/>
        <h:commandLink action="#{CatalogoMB.viewAll}">
            <h:outputText styleClass="menu_subtitulo" escape="false"
                          value="Cat&aacute;logo de Produtos"/>
        </h:commandLink>
        <h:graphicImage styleClass="menu_subtitulo"
                        url="/images/menus/fundo_bt_titulo2.gif" width="60"
                        height="20"/>
        <h:commandLink action="#{CatalogoMB.buscarPedidos}">
            <h:outputText styleClass="menu_subtitulo" escape="false"
                          value="Buscar Pedidos"/>
        </h:commandLink>
        <h:graphicImage styleClass="menu_subtitulo"
                        url="/images/menus/fundo_bt_titulo2.gif" width="60"
                        height="20"/>
        <h:commandLink action="#{PedidoMB.buscarMeusPedidos}">
            <h:outputText styleClass="menu_subtitulo" escape="false"
                          value="Listar Meus Pedidos"/>
        </h:commandLink>
        <h:graphicImage styleClass="menu_subtitulo"
                        url="/images/menus/fundo_bt_titulo2.gif" width="60"
                        height="20"/>
        <h:commandLink action="#{PedidoMB.buscarTodosPedidos}">
            <h:outputText styleClass="menu_subtitulo" escape="false"
                          value="Listar Todos Pedidos"/>
        </h:commandLink>
        <h:graphicImage styleClass="menu_subtitulo"
                        url="/images/menus/fundo_bt_titulo2.gif" width="60"
                        height="20"/>
      
        <!-- Relatórios -->   
        <h:outputText value="Relat&oacute;rios" styleClass="menu_titulo" escape="false"/>
        <h:graphicImage url="/images/menus/fundo_bt_titulo2.gif" width="60"
                        styleClass="menu_titulo" height="20"/>
        <h:commandLink action="#{RelatorioProdutosMB.gerar}">
            <h:outputText styleClass="menu_subtitulo" escape="false"
                          value="Relat&oacute;rio de Produtos"/>
        </h:commandLink>
        <h:graphicImage styleClass="menu_subtitulo"
                        url="/images/menus/fundo_bt_titulo2.gif" width="60"
                        height="20"/>
        <h:commandLink action="#{RelatorioVendasPorMarcaMB.buscar}">
            <h:outputText styleClass="menu_subtitulo" escape="false"
                          value="Relat&oacute;rio de Vendas"/>
        </h:commandLink>
        
        <h:graphicImage styleClass="menu_subtitulo"
                        url="/images/menus/fundo_bt_titulo2.gif" width="60"
                        height="20"/>
      
        <!-- Gráficos -->   
        <h:outputText value="Gr&aacute;ficos" styleClass="menu_titulo" escape="false"/>
        <h:graphicImage url="/images/menus/fundo_bt_titulo2.gif" width="60"
                        styleClass="menu_titulo" height="20"/>
        <h:commandLink action="#{GraficoVendasPorMarcaMB.buscar}">
            <h:outputText styleClass="menu_subtitulo" escape="false"
                          value="Gr&aacute;fico de Vendas por Marca"/>
        </h:commandLink>
        <h:graphicImage styleClass="menu_subtitulo"
                        url="/images/menus/fundo_bt_titulo2.gif" width="60"
                        height="20"/>

    </h:panelGrid>
    </h:form>
</f:subview>
