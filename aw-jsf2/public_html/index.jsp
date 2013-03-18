<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<%@ page contentType="text/html; charset=windows-1252"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>

<c:set var="contexto" value="${pageContext.request.contextPath}"/>

<f:view>
<html>
    <head>
        <title>GES - GlobalEducation System</title>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252"></meta>
        <link href="${contexto}/css/ges.css" rel="stylesheet" type="text/css"></link>
        <link href="${contexto}/css/GES_Botoes.css" rel="stylesheet"
              type="text/css"></link>
        <link href="${contexto}/css/GES_Tabelas.css" rel="stylesheet"
              type="text/css"></link>
        <script src="${contexto}/js/swapImage.js" language="javascript"
                type="text/javascript"></script>
        <link type="text/css" rel="stylesheet" media="all" title="system"  
            href="${contexto}/jscalendar/calendar-system.css"></link>
        <script type="text/javascript" src="${contexto}/jscalendar/calendar.js"></script>
        <script type="text/javascript" src="${contexto}/jscalendar/calendar-br.js"></script>
        <script type="text/javascript" src="${contexto}/jscalendar/calendar-setup.js"></script>
    </head>
    <body onload="MM_preloadImages('${contexto}/images/bottom/Bt_continuarComprando_on.gif','${contexto}/images/bottom/bt_excluir_on.gif','${contexto}/images/bottom/Bt_finalizarPedido_on.gif')">
    <table width="100%"cellpadding="0">
            <tr>
                <td colspan="2">
                    <!-- ######################  top.jsp ########################-->
                    <jsp:include page="top.jsp" flush="true"/>
                    <!-- ######################  final do top.jsp ########################-->
                </td>
            </tr>
            <tr>
                <td width="170" align="left" valign="top">
                    <!-- ######################  menu.jsp ########################-->
                    <jsp:include page="menu.jsp" flush="true"/>
                    <!-- ######################  final do menu.jsp ########################-->
                </td>
                <td height="386" valign="top">
                
                    <c:choose>
                        <c:when test="${empty usuario && (empty nextPage || (nextPage != 'formDados.jsp' && nextPage != 'login.jsp'))}">
                            <!-- ######################  login.jsp ########################-->
                            <jsp:include page="login.jsp" flush="true"/>
                            <!-- ######################  final do login.jsp ########################-->
                        </c:when>
                        <c:when test="${not empty usuario && empty nextPage}">
                            <c:if test="${! empty nextPage}">
                                <c:out value="${nextPage}"/>
                                <jsp:include page="${nextPage}" flush="true" />
                            </c:if>
                        </c:when>
                        <c:otherwise>
                            <!-- ######################  {nextPage} ########################-->
                            <jsp:include page="${nextPage}" flush="true" />
                            <!-- ######################  final do {nextPage} ######################## -->
                        </c:otherwise>
                    </c:choose>
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    <!-- ######################  bottom.jsp ########################-->
                    <jsp:include page="bottom.jsp" flush="true"/> 
                    <!-- ######################  final do bottom.jsp ########################-->
                </td>
            </tr>
        </table></body>
</html>
</f:view>
