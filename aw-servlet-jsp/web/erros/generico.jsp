<!-- Copyright (c) 2002 by ObjectLearn. All Rights Reserved. -->
<%@ page isErrorPage="true" %>
<html>
    <head>
        <title>Error Page</title>
    </head>
    <body>
        <font face="Comic Sans MS" size=4>
            <blockquote>
                <center>
                    <h3><font color=red>Ocorreu o erro abaixo. Verificar console.</font></h3>
                </center>
                <p>		
                <center>
                    <%=exception%>
                </center></p>
                <%--exception.printStackTrace();--%>
            </blockquote>
        </font>
    </body>
</html>
