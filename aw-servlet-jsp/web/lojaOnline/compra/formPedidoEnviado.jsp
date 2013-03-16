<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib tagdir="/WEB-INF/tags/" prefix="helper"%>

<c:set var="contexto" value="${pageContext.request.contextPath}" />

<form method="post" action="${contexto}/controller?command=online.CatalogoProdutos">

    <table width="100%">
        <tr><td class="GC_Normal2">
            Seu pedido foi enviado com sucesso.
        </td></tr>
    </table>
    <br>
    
    <table class="tabelaGC">
        <thead>
        <tr>
            <td>
                <table width="100%" border="0" cellpadding="0" cellspacing="0">
                    <tr>
                        <td width="130" class="texto_rodape_tabelas">Produtos</td>
                        <td width="20" height="20" class="texto_rodape_tabelas">&nbsp;</td>
                        <td class="texto_rodape_tabelas">&nbsp;</td>
                        <td width="100" align="center" class="texto_rodape_tabelas">Quantidade</td>                                        
                        <td width="100" align="center" class="texto_rodape_tabelas">Pre&ccedil;o</td>
                    </tr>
                </table>
            </td>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>
                <!-- tabela de produtos com preço e imagem para remover -->
                <table width="100%"  border="0" cellspacing="2" cellpadding="2">
                    <!-- inicio do laço de itens do carrinho-->
                    <c:forEach var="item" items="${pedido.itensPedido}" >
                        <tr>
                            <td>
                                <helper:ExibeProduto contexto="${contexto}" produto="${item.produto}" tipo="pedido" quantidade="${item.quantidade}" />
                            </td>
                        </tr>
                        <!-- fim do laço de itens do carrinho-->
                    </c:forEach>
                </table>
                <!-- fim  da tabela de produtos -->
            </td>
        </tr>

        <tr>
            <td>
                <table width="100%"  border="0" cellspacing="0" cellpadding="0">
                    <tr>
                        <td align="right" class="texto_rodape_tabelas">Total</td>
                        <td width="20" class="texto_rodape_tabelas"></td>
                        <td width="100" class="texto_rodape_tabelas">
                            &nbsp;&nbsp;&nbsp;<fmt:formatNumber value="${pedido.pagamento.valor}" type="currency" />
                        </td>
                    </tr>
                </table>
            </td>
        </tr>
    </tbody>
    </table>
    <!-- Fim do calculo-->

    <!-- Incio da insercao dos dados do cliente -->
    <br>
    <helper:dadosCliente cliente="${pedido.cliente}" tipo=""/>
    <br>
    <!-- fim da insercao dos dados do cliente -->

    <!-- Incio da insercao dos dados de pagamento-->
    <helper:dadosPagamento pagamento="${pedido.pagamento}" tipo=""/>
    <br>
    <!-- fim da insercao dos dados de pagamento-->

    <!-- Inicio do rodape da pagina -->
    <table width="100%">
        <tr>
            <td align="center">
                <button type="submit" id="voltar">Voltar</button> 
            </td>
        </tr>
    </table>

    <!-- fim do rodape da pagina-->

</form>

