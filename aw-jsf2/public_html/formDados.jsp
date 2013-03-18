<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@ page contentType="text/html;charset=windows-1252"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>

<f:subview id="formDados">
    <h:form>
        <h:panelGrid columns="1" styleClass="tabelaJSF">
            <f:facet name="header">
                <h:graphicImage url="images/titulos/cadastrarNovoCliente.gif"
                                height="30" width="400"/>
            </f:facet>
            <h:panelGrid columns="2">
            
                <h:outputLabel value="Nome" for="nome"/>
                <h:panelGrid columns="2">
                    <h:inputText id="nome" value="#{ClienteMB.cliente.nome}"
                                 required="true" size="70">
                        <f:validateLength minimum="4" maximum="100"/>
                    </h:inputText>
                    <h:message for="nome"/>
                </h:panelGrid>
                
                <h:outputLabel value="Telefone" for="telefone"/>
                <h:panelGrid columns="5">
                    <h:inputText id="telefone"
                                 value="#{ClienteMB.cliente.telefone}"
                                 required="true" size="15">
                        <f:validateLength minimum="8" maximum="20"/>
                    </h:inputText>
                    <h:message for="telefone"/>
                    <h:outputLabel value="e-mail" for="email"/>
                    <h:inputText id="email" value="#{ClienteMB.cliente.email}"
                                 required="true" size="40">
                        <f:validateLength minimum="10" maximum="50"/>
                    </h:inputText>
                    <h:message for="email"/>
                </h:panelGrid>
                
                <h:outputLabel value="Senha" for="senha"/>
                <h:panelGrid columns="3">
                    <h:inputSecret id="senha" value="#{ClienteMB.cliente.senha}"
                                   required="true" 
                                   rendered="#{ClienteMB.alteraSenha}"/>
                    <h:outputText value="**********" rendered="#{not ClienteMB.alteraSenha}"/>
                    <h:outputLabel value="Ativo" for="ativo"/>
                    <h:selectBooleanCheckbox value="#{ClienteMB.cliente.ativo}"
                                             id="ativo"/>
                </h:panelGrid>
                
                <h:outputLabel value=" Rua" for="rua"/>
                <h:panelGrid columns="5">
                    <h:inputText id="rua"
                                 value="#{ClienteMB.cliente.enderecoRua}"
                                 required="true" size="50">
                        <f:validateLength minimum="4" maximum="100"/>
                    </h:inputText>
                    <h:message for="rua"/>
                    <h:outputLabel value=" Numero" for="numero"/>
                    <h:inputText id="numero"
                                 value="#{ClienteMB.cliente.enderecoNumero}"
                                 required="true" size="4">
                        <f:validateLongRange minimum="1" maximum="99999"/>
                    </h:inputText>
                    <h:message for="numero"/>
                </h:panelGrid>
                
                <h:outputLabel value="Bairro" for="bairro"/>
                <h:panelGrid columns="5">
                    <h:inputText id="bairro"
                                 value="#{ClienteMB.cliente.enderecoBairro}"
                                 required="true" size="20">
                        <f:validateLength minimum="2" maximum="50"/>
                    </h:inputText>
                    <h:message for="bairro"/>
                    <h:outputLabel value="Cep" for="cep"/>
                    <h:inputText id="cep"
                                 value="#{ClienteMB.cliente.enderecoCep}"
                                 required="true" size="9">
                        <f:validateLength minimum="8" maximum="9"/>
                    </h:inputText>
                    <h:message for="cep"/>
                </h:panelGrid>
                
                <h:outputLabel value="Cidade" for="cidade"/>
                <h:panelGrid columns="5">
                    <h:inputText id="cidade"
                                 value="#{ClienteMB.cliente.enderecoCidade}"
                                 required="true" size="20">
                        <f:validateLength minimum="2" maximum="50"/>
                    </h:inputText>
                    <h:message for="cidade"/>
                    <h:outputLabel value="Estado" for="estado"/>
                    <h:inputText id="estado"
                                 value="#{ClienteMB.cliente.enderecoEstado}"
                                 required="true" size="2"/>
                    <h:message for="estado"/>
                </h:panelGrid>
                
                <h:commandButton action="#{ClienteMB.save}" value="Salvar"/>
                
            </h:panelGrid>
        </h:panelGrid>
    </h:form>
</f:subview>