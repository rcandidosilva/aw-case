<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>

<f:subview id="login">
        <h:form id="formLogin">
                <h:panelGrid width="200" styleClass="tabelaJSF" >
                        <f:facet name="header">
                                <h:graphicImage url="images/titulos/login.gif"
                                                height="30" width="400"/>
                        </f:facet>
                        <h:outputLabel value="e-mail" for="username"/>
                        <h:inputText id="username" size="40" maxlength="40"
                                     value="#{AutenticacaoMB.usuario}"/>
                        <h:outputLabel style="align:right" value="senha"
                                       for="password"/>
                        <h:inputSecret id="password" size="40" maxlength="40"
                                     value="#{AutenticacaoMB.senha}"/>
                        <h:commandButton value="Login"
                                         action="#{AutenticacaoMB.validarUsuario}"/>
                        <h:outputText value=""/>
                        <h:commandLink action="#{AutenticacaoMB.cadastrarNovoUsuario}">
                                <h:outputText value="Cadastrar novo usuário"/>
                        </h:commandLink>
                </h:panelGrid>
                <h:messages/>
        </h:form>
</f:subview>
