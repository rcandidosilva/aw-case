<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:set var="contexto" value="${pageContext.request.contextPath}" />

<form name="formLogin" method="post" action="${contexto}/controller?command=ValidarLogin">
    
    <table class="tabelaGC">

        <thead>
            <tr><td colspan="2">
                <table>
                    <tr>
                        <td class="coluna1">Login</td>
                        <td>&nbsp;</td>
                    </tr>
                </table>
            </td></tr>
        </thead>

        <tbody>
            <tr>
                <td colspan="2">
      
                    <fieldset>
                        <table>
                            <c:if test="${not empty mensagemLogin}">
                                <tr>
                                    <td colspan="2">${mensagemLogin}</td>
                                </tr>        
                            </c:if>

                            <tr>
                                <td align="right"><label for="username">e-mail</label></td>
                                <td align="left">
                                    <input name="username" id="username" type="text" 
                                        size="15" maxlength="40" value="${cookie.username.value}">
                                </td>
                            </tr>
                            <tr>
                                <td align="right"><label for="password">senha</label></td>
                                <td align="left">
                                    <input name="password" id="password" type="password" 
                                        size="15" maxlength="40" value="${cookie.password.value}">
                                </td>
                            </tr>
                            <tr>
                                <td align="right"></td>
                                <td align="left">
                                    <input name="lembrarSenha" id="lembrarSenha" type='checkbox' value='true'>
                                    <label for="lembrarSenha">lembrar senha</label>
                                </td>
                            </tr>
                            <tr> 
                                <td align="center" colspan="2">
                                    <button type="submit" id="login">Login</button>
                                </td>
                            </tr>
                        </table>
                    </fieldset>
        
                    <a href="${contexto}/index.jsp?page=formDados.jsp">Cadastrar Novo Usuário</a>
    
                </td>
            </tr>
        </tbody>
        
    </table>
    
</form>
