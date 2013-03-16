<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@page errorPage="/erros/generico.jsp"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:set var="contexto" value="${pageContext.request.contextPath}" />

<html>
    
    <head>
        <title>GES - GlobalEducation System</title>
        <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
        <link href="${contexto}/css/ges.css" rel="stylesheet" type="text/css">
        <link href="${contexto}/css/GES_Botoes.css" rel="stylesheet" type="text/css">
        <link href="${contexto}/css/GES_Tabelas.css" rel="stylesheet" type="text/css">
        <script src="${contexto}/js/swapImage.js" language="javascript" type="text/javascript"></script>
    </head>
    
    <body onLoad="MM_preloadImages('${contexto}/images/bottom/Bt_continuarComprando_on.gif','${contexto}/images/bottom/bt_excluir_on.gif','${contexto}/images/bottom/Bt_finalizarPedido_on.gif')">
        <table width="100%"  border="0" cellspacing="0" cellpadding="0">
            <tr>
                <td><jsp:include page="top.jsp" flush="true" /></td>
            </tr>
            <tr>
                <td valign="top">
                <table width="100%"  border="0" cellspacing="0" cellpadding="0">
                    <tr>
                        <td valign="top"><table width="100%"  border="0" cellspacing="5" cellpadding="5">
                            <tr>                                
                                <c:if test="${not empty usuario}">
                                <td width="170" align="left" valign="top">
                                    <jsp:include page="menu.jsp" flush="true"/>        
                                </td>
                                </c:if>                                
                                <td height="386" valign="top">                                    
                                    <c:choose>                                        
                                    <c:when test="${empty usuario && (empty param.page ||  (param.page != 'formDados.jsp' && param.page != 'login.jsp'))}">
                                        <jsp:include page="login.jsp" flush="true"/>        
                                    </c:when>   
                                    <c:when test="${not empty usuario && empty param.page}">
                                    </c:when>
                                    <c:otherwise>
                                        <jsp:include page="${param.page}" flush="true"/>
                                    </c:otherwise>                                    
                                    </c:choose>
                                </td> 
                            </tr>
                        </table>
                        </td>
                    </tr>
                </table></td>
            </tr>
            <tr>
                <td><jsp:include page="bottom.jsp" flush="true"/></td>
            </tr>
        </table>
    </body>
    
</html>
