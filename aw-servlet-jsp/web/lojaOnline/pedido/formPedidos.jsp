<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<c:set var="contexto" value="${pageContext.request.contextPath}" />
<fmt:setLocale value="pt_BR" />    

<table class="tabelaGC">
    <thead>
        <tr>
            <td>
                <table>
                    <tr>
                        <td class="coluna1">Lista de pedidos </td>
                        <td>&nbsp;</td>          
                    </tr>
                </table>
	  
            </td>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td align="left">
	
                <table width="100%"  border="0" cellpadding="2" cellspacing="2">
                    <tr>
                        <td><span class="conteudo_titulo">Pedido</span></td>
                        <td><span class="conteudo_titulo">Data</span></td>
                        <td><span class="conteudo_titulo">Cliente</span></td>        
                    </tr>
      
                    <!-- início do laço de pedidos -->
                    <c:forEach var="pedido" items="${pedidos}">
                        <tr>
                            <td class="GC_Normal">
                                <a href="${contexto}/controller?command=online.VerPedido&idPedido=${pedido.numero}">${pedido.numero}</a>
                            </td>
                            <td class="GC_Normal2">
                                <fmt:formatDate value="${pedido.data}" />
                            </td>
                            <td class="GC_Normal2">
                                ${pedido.cliente.nome}
                            </td>
        
                        </tr>
                    </c:forEach>
                </table>
	
            </td>
        </tr>
    </tbody>
</table>