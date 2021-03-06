<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>

<f:subview id="dadosPedido">
    <h:form>
        <h:panelGrid columns="1">
            
            <h:panelGrid columns="1" styleClass="tabelaJSF">
                <f:facet name="header">
                    <h:outputLabel value="Informa&ccedil;&otilde;es do pedido"/>
                </f:facet>
                <h:panelGrid columns="4">
                    <h:outputLabel value="N&uacute;mero:" for="numeroPedido"/>
                    <h:outputText id="numeroPedido"
                                  value="#{PedidoMB.pedidoSelecionado.numero}"/>
                    <h:outputLabel value="Data:" for="dataPedido"/>
                    <h:outputText id="dataPedido"
                                  value="#{PedidoMB.pedidoSelecionado.data}">
                        <f:convertDateTime pattern="dd/MM/yyyy"/>
                    </h:outputText>
                </h:panelGrid>
            </h:panelGrid>
            
            <h:outputText value=""/>
            <h:outputText value=""/>
            <h:outputText value=""/>
            
            <h:panelGrid columns="1" styleClass="tabelaJSF">
                <f:facet name="header">
                    <h:outputLabel value="Itens do pedido"/>
                </f:facet>
                <h:dataTable id="tabela" value="#{PedidoMB.pedidoSelecionado.itensPedido}"
                             var="item" styleClass="tabelaJSF" headerClass="tabela_subtitulo">    
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="Produto"/>
                        </f:facet>
                        <h:outputText value="#{item.produto.nome}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="Categoria"/>
                        </f:facet>
                        <h:outputText value="#{item.produto.categoria}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="Marca"/>
                        </f:facet>
                        <h:outputText value="#{item.produto.marca}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText style="align:center" value="Quantidade"/>
                        </f:facet>
                        <h:outputText value="#{item.quantidade}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="Pre&ccedil;o" escape="false"/>
                        </f:facet>
                        <h:outputText value="#{item.produto.preco}">
                            <f:convertNumber locale="pt_br" minFractionDigits="2" maxFractionDigits="2" groupingUsed="true"/>
                        </h:outputText>
                    </h:column>
                </h:dataTable>
            </h:panelGrid>
            
            <h:panelGrid styleClass="tabelaJSF" columns="1">
                <f:facet name="header">
                    <h:outputText  value="Cadastro do Cliente"/>
                </f:facet>
                <h:panelGrid columns="2">
                    
                    <h:outputLabel value="Nome" for="nome"/>
                    <h:outputText id="nome" value="#{PedidoMB.pedidoSelecionado.cliente.nome}"/>
                    
                    <h:outputLabel value="Telefone" for="telefone"/>
                    <h:panelGrid columns="3">
                        <h:outputText id="telefone"
                                      value="#{PedidoMB.pedidoSelecionado.cliente.telefone}"/>
                        <h:outputLabel value="e-mail" for="email"/>
                        <h:outputText id="email" value="#{PedidoMB.pedidoSelecionado.cliente.email}"/>
                    </h:panelGrid>
                    
                    <h:outputLabel value="Senha" for="senha"/>
                    <h:panelGrid columns="3">
                        <h:outputText id="senha" value="**********"/>
                        <h:outputLabel value="Ativo" for="ativo"/>
                        <h:selectBooleanCheckbox value="#{PedidoMB.pedidoSelecionado.cliente.ativo}"
                                                 id="ativo"/>
                    </h:panelGrid>
                    
                    <h:outputLabel value=" Rua" for="rua"/>
                    <h:panelGrid columns="3">
                        <h:outputText id="rua"
                                      value="#{PedidoMB.pedidoSelecionado.cliente.enderecoRua}"/>
                        <h:outputLabel value=" Numero" for="numero"/>
                        <h:outputText id="numero"
                                      value="#{PedidoMB.pedidoSelecionado.cliente.enderecoNumero}"/>
                    </h:panelGrid>
                    
                    <h:outputLabel value="Bairro" for="bairro"/>
                    <h:panelGrid columns="3">
                        <h:outputText id="bairro"
                                      value="#{PedidoMB.pedidoSelecionado.cliente.enderecoBairro}"/>
                        <h:outputLabel value="Cep" for="cep"/>
                        <h:outputText id="cep"
                                      value="#{PedidoMB.pedidoSelecionado.cliente.enderecoCep}"/>
                    </h:panelGrid>
                    
                    <h:outputLabel value="Cidade" for="cidade"/>
                    <h:panelGrid columns="3">
                        <h:outputText id="cidade"
                                      value="#{PedidoMB.pedidoSelecionado.cliente.enderecoCidade}"/>
                        <h:outputLabel value="Estado" for="estado"/>
                        <h:outputText id="estado"
                                      value="#{PedidoMB.pedidoSelecionado.cliente.enderecoEstado}"/>
                    </h:panelGrid>
                    
                </h:panelGrid>
            </h:panelGrid>
            
            <h:panelGrid styleClass="tabelaJSF" columns="1">
                <f:facet name="header">
                    <h:outputText value="Dados do pagamento"/>
                </f:facet>
                <h:panelGrid columns="2">
                    <h:outputLabel value="Forma de pagamento:"/>
                    <h:outputText value="boleto" 
                                  rendered="#{PedidoMB.boleto}"/>
                    <h:outputText value="cart�o de cr�dito" escape="false" 
                                  rendered="#{not PedidoMB.boleto}"/>
                </h:panelGrid>
            </h:panelGrid>
            
            <h:panelGrid styleClass="tabelaJSF" columns="1"
                         rendered="#{PedidoMB.boleto}">
                <f:facet name="header">
                    <h:outputText styleClass="coluna1" value="Dados do Boleto"/>
                </f:facet>
                <h:panelGrid columns="2">
                    <h:outputLabel value="Banco:" for="banco"/>
                    <h:outputText id="banco" 
                                  value="#{PedidoMB.pedidoSelecionado.pagamento.banco.nome}"/>
                    <h:outputLabel for="cedente" value="Cedente"/>
                    <h:outputText id="cedente"
                                  value="#{PedidoMB.pedidoSelecionado.pagamento.cedente}"/>
                    <h:outputLabel for="sacado" value="Sacado"/>
                    <h:outputText id="sacado" 
                                  value="#{PedidoMB.pedidoSelecionado.pagamento.sacado}"/>
                    <h:outputLabel for="codigoBarras" value="C&oacute;digo de Barras"/>
                    <h:panelGrid columns="3">
                        <h:outputText id="codigoBarras" 
                                      value="#{PedidoMB.pedidoSelecionado.pagamento.numeroCodigoBarras}"/>
                        <h:outputLabel for="vencimento" value="Vencimento"/>
                        <h:outputText id="vencimento" 
                                      value="#{PedidoMB.pedidoSelecionado.pagamento.dataVencimento}">
                            <f:convertDateTime pattern="dd/MM/yy"/>
                        </h:outputText>
                    </h:panelGrid>
                </h:panelGrid>
            </h:panelGrid>
            
            <h:panelGrid styleClass="tabelaJSF" columns="1"
                         rendered="#{not PedidoMB.boleto}">
                <f:facet name="header">
                    <h:outputText value="Dados do Cart&atilde;o de Cr&eacute;dito" escape="false"/>
                </f:facet>
                <h:panelGrid columns="2">
                    <h:outputLabel value="Bandeira:" for="bandeira"/>
                    <h:outputText id="bandeira" 
                                  value="#{PedidoMB.pedidoSelecionado.pagamento.bandeiraCartaoCredito.nome}"/>
                    <h:outputText value="N&uacute;mero do Cart&atilde;o de Cr&eacute;dito" escape="false"/>
                    <h:outputText id="numeroCC" 
                                  value="#{PedidoMB.pedidoSelecionado.pagamento.numeroCartao}"/>
                    <h:outputText value="C&oacute;digo de Verifica&ccedil;&atilde;o" escape="false"/>
                    <h:outputText id="codigoVerificacao" 
                                  value="#{PedidoMB.pedidoSelecionado.pagamento.numeroConfirmacao}"/>
                    <h:outputLabel for="titular" value="Titular"/>
                    <h:outputText id="titular" 
                                  value="#{PedidoMB.pedidoSelecionado.pagamento.nomeTitular}"/>
                    <h:outputLabel for="validade" value="Validade"/>
                    <h:panelGroup>
                        <h:outputText id="validade" 
                                      value="#{PedidoMB.pedidoSelecionado.pagamento.dataValidadeCartao}">
                            <f:convertDateTime pattern="MM/yy"/>
                        </h:outputText>
                    </h:panelGroup>
                </h:panelGrid>
            </h:panelGrid>
            
        </h:panelGrid>
    </h:form>
</f:subview>
