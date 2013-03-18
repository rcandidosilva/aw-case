package br.com.globalcode.components;

import br.com.globalcode.util.Tracer;

import java.io.IOException;

import java.util.Locale;
import java.util.Map;

import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;
import javax.faces.convert.DateTimeConverter;


public class UICalendario extends UIInput {

    public UICalendario() {
        setRendererType(null);
        DateTimeConverter conversor = new DateTimeConverter();
        conversor.setPattern("dd/MM/yyyy");
        conversor.setLocale(new Locale("pt","br"));
        setConverter(conversor);
    }

    public void decode(FacesContext context) {

        Tracer.log(this, " decode begin");

        if (context != null) {

            String clientId = getClientId(context);
            String name = (String)getAttributes().get("name");
            Map requestMap = context.getExternalContext().getRequestParameterMap();
            String novoValor = (String)requestMap.get(clientId + name);

            try {
                setSubmittedValue(novoValor);
                setValid(true);
            } catch (Exception e) {
                setSubmittedValue(novoValor);
            }

        } else {
            throw new NullPointerException("[UICalendario - decode] FacesContext está null!");
        }

        Tracer.log(this, " decode end");
    }


    public void encodeBegin(FacesContext context) throws IOException {
        Tracer.log(this, " encode begin");
        ResponseWriter writer = context.getResponseWriter();
        String clientId = getClientId(context);
        String contextPath = context.getExternalContext().getRequestContextPath();
        encodeLabel(writer, clientId, contextPath);
        encodeInput(writer, clientId, contextPath);
        encodeButton(writer, clientId, contextPath);
        encodeScript(writer, clientId, contextPath);
        Tracer.log(this, " encode end");
    }

    private void encodeLabel(ResponseWriter writer, String clientId, 
                                String contextPath) throws IOException {
        
        String label = (String)getAttributes().get("label");
                                 
        writer.writeText(label, null);
    }
                                
    private void encodeInput(ResponseWriter writer, String clientId, 
                                String contextPath) throws IOException {

        String name = (String)getAttributes().get("name");
        String size = (String)getAttributes().get("size");
        //String value = (String)getAttributes().get("value");

        writer.startElement("input", this);
        writer.writeAttribute("type", "text", null);
        writer.writeAttribute("name", clientId + name, null);
        writer.writeAttribute("id", clientId + "data", null);
        Object valor = getValue();
        if (valor != null) {
            writer.writeAttribute("value", valor.toString(), null);
        }
        writer.writeAttribute("size", size, null);
        writer.writeAttribute("maxlength", size, null);
        //writer.writeAttribute("converter","javax.faces.convert.DateTimeConverter",null);
        writer.endElement("input");
        
    }
                                    
    private void encodeButton(ResponseWriter writer, String clientId,
                            String contextPath) throws IOException {
        
        writer.startElement("button", this);
        writer.writeAttribute("id", clientId + "trigger", null);
        writer.writeAttribute("name", clientId + "Calendario", null);
        writer.startElement("img", this);
        writer.writeAttribute("src", contextPath+"/images/calendario.gif", null);
        writer.endElement("img");
        writer.endElement("button");
        
    }
                                    
    private void encodeScript(ResponseWriter writer, String clientId, 
                                String contextPath) throws IOException {

        writer.startElement("script", this);
        writer.writeAttribute("type", "text/javascript", null);
        writer.writeText("Calendar.setup({inputField:\""+ clientId + "data" +
                        "\",button:\""+ clientId + "trigger" +"\"});",null);
        writer.endElement("script");

    }


}
