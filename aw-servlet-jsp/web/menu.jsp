<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:set value="${pageContext.request.contextPath}" var="contexto"/>

<table width="170" border="0" cellpadding="0" cellspacing="0">

    <tr>
        <td class="menu_titulo"><div align="right">
            Categoria
        </div></td>
        <td class="menu_titulo">
            <img src="${contexto}/images/menus/fundo_bt_titulo2.gif" width="60" height="20">
        </td>
    </tr>
    <tr>
        <td class="menu_subtitulo"><div align="right">
            <a href="${contexto}/controller?command=admin.categoria.Listar">Visualizar todas</a>
        </div></td>
        <td class="menu_subtitulo">
            <img src="${contexto}/images/menus/fundo_bt_titulo2.gif" width="60" height="20">
        </td>
    </tr>
    <tr>
        <td class="menu_subtitulo"><div align="right">
            <a href="${contexto}/controller?command=admin.categoria.Editar">Cadastrar nova</a>
        </div></td>
        <td class="menu_subtitulo">
            <img src="${contexto}/images/menus/fundo_bt_titulo2.gif" width="60" height="20">
        </td>
    </tr>
   
    <tr>
        <td class="menu_titulo"><div align="right">
            Produtos
        </div></td>
        <td class="menu_titulo">
            <img src="${contexto}/images/menus/fundo_bt_titulo2.gif" width="60" height="20">
        </td>
    </tr>
    <tr>
        <td class="menu_subtitulo"><div align="right">
            <a href="${contexto}/controller?command=admin.produto.Buscar">Pesquisar & Editar</a>
        </div></td>
        <td class="menu_subtitulo">
            <img src="${contexto}/images/menus/fundo_bt_titulo2.gif" width="60" height="20">
        </td>
    </tr>
    <tr>
        <td class="menu_subtitulo"> <div align="right">
            <a href="${contexto}/controller?command=admin.produto.Incluir">Cadastrar novo</a>
        </div></td>
        <td class="menu_subtitulo">
            <img src="${contexto}/images/menus/fundo_bt_titulo2.gif" width="60" height="20">
        </td>
    </tr>

    <tr>
        <td class="menu_titulo"><div align="right">
            Clientes
        </div></td>
        <td class="menu_titulo">
            <img src="${contexto}/images/menus/fundo_bt_titulo2.gif" width="60" height="20">
        </td>
    </tr>
    <tr>
        <td class="menu_subtitulo"><div align="right">
            <a href="${contexto}/controller?command=admin.cliente.Buscar">Pesquisar & Editar</a>
        </div></td>
        <td class="menu_subtitulo">
            <img src="${contexto}/images/menus/fundo_bt_titulo2.gif" width="60" height="20">
        </td>
    </tr>

    <tr>
        <td class="menu_subtitulo"> <div align="right">
            <a href="${contexto}/controller?command=admin.cliente.Editar">Cadastrar novo</a>
        </div></td>
        <td class="menu_subtitulo">
            <img src="${contexto}/images/menus/fundo_bt_titulo2.gif" width="60" height="20">
        </td>
    </tr>  
    <tr>
        <td class="menu_titulo"><div align="right">
            Pedidos
        </div></td>
        <td class="menu_titulo">
            <img src="${contexto}/images/menus/fundo_bt_titulo2.gif" width="60" height="20">
        </td>
    </tr>
    <tr>
        <td class="menu_subtitulo"><div align="right">
            <a href="${contexto}/controller?command=online.CatalogoProdutos">Cat&aacute;logo de Produtos</a>
        </div></td>
        <td class="menu_subtitulo">
            <img src="${contexto}/images/menus/fundo_bt_titulo2.gif" width="60" height="20">
        </td>
    </tr>
    <tr>
        <td class="menu_subtitulo"><div align="right">
            <a href="${contexto}/controller?command=online.ListarPedidos">Listar Pedidos</a>
        </div></td>
        <td class="menu_subtitulo">
            <img src="${contexto}/images/menus/fundo_bt_titulo2.gif" width="60" height="20">
        </td>
    </tr>
    <tr>
        <td class="menu_subtitulo"><div align="right">
            <a href="${contexto}/controller?command=online.ListarPedidos&idCliente=${usuario.id}">Ver meus Pedidos</a>
        </div></td>
        <td class="menu_subtitulo">
            <img src="${contexto}/images/menus/fundo_bt_titulo2.gif" width="60" height="20">
        </td>
    </tr>
    <tr>
        <td class="menu_subtitulo"><div align="right">
            <a href="${contexto}/controller?command=online.BuscarPedidos">Pesquisar</a>
        </div></td>
        <td class="menu_subtitulo">
            <img src="${contexto}/images/menus/fundo_bt_titulo2.gif" width="60" height="20">
        </td>
    </tr>
   
    <tr>
        <td class="menu_titulo"><div align="right">
            Relatórios
        </div></td>
        <td class="menu_titulo">
            <img src="${contexto}/images/menus/fundo_bt_titulo2.gif" width="60" height="20">
        </td>
    </tr>
    <tr>
        <td class="menu_subtitulo"><div align="right">
            <a href="${contexto}/controller?command=backoffice.relatorio.Produtos">Produtos</a>
        </div></td>
        <td class="menu_subtitulo">
            <img src="${contexto}/images/menus/fundo_bt_titulo2.gif" width="60" height="20">
        </td>
    </tr>
    <tr>
        <td class="menu_subtitulo"><div align="right">
            <a href="${contexto}/controller?command=backoffice.relatorio.Vendas">Vendas Por Marca</a>
        </div></td>
        <td class="menu_subtitulo">
            <img src="${contexto}/images/menus/fundo_bt_titulo2.gif" width="60" height="20">
        </td>
    </tr>
   
    <tr>
        <td class="menu_titulo"><div align="right">
            Gráficos
        </div></td>
        <td class="menu_titulo">
            <img src="${contexto}/images/menus/fundo_bt_titulo2.gif" width="60" height="20">
        </td>
    </tr>
    <tr>
        <td class="menu_subtitulo"><div align="right">
            <a href="${contexto}/controller?command=backoffice.grafico.Vendas">Vendas Por Marca</a>
        </div></td>
        <td class="menu_subtitulo">
            <img src="${contexto}/images/menus/fundo_bt_titulo2.gif" width="60" height="20">
        </td>
    </tr>
  
</table>

