package br.com.globalcode.tags;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.webapp.UIComponentTag;
import javax.faces.application.Application;
import javax.faces.el.ValueBinding;

public class UICalendarioTag extends UIComponentTag {

    private String name = "";
    private String label = "";
    private String size = "12";
    private String value = "01/01/2006";

    public String getComponentType() {
        return "br.com.globalcode.components.UICalendario";
    }

    // retornar null indica que o componente renderiza a si mesmo
    public String getRendererType() {
        return null;
    }

    public void setProperties(UIComponent component) {
        super.setProperties(component);        
        setString(component, "label", label);
        setString(component, "name", name);
        setString(component, "size", size);
        setString(component, "value", value);
    }

    public void setString(UIComponent component, String attributeName,
                          String attributeValue) {
        if (attributeValue != null) {
            // Verifica se o valor já está associado ao componente
            if (isValueReference(attributeValue)) {
                // Atribui o novo valor ao componente
                setValueBinding(component, attributeName, attributeValue);
            } else {
                // Adiciona este atributo e seu valor no componente
                component.getAttributes().put(attributeName, attributeValue);
            }
        }
    }

    public void setValueBinding(UIComponent component, String attributeName,
                                String attributeValue) {
        FacesContext context = FacesContext.getCurrentInstance();
        Application application = context.getApplication();
        ValueBinding vb = application.createValueBinding(attributeValue);
        // Atribui o valor ao atributo value herdado do UIOutput
        component.setValueBinding(attributeName, vb);        

    }

    public void release() {
        super.release();
        label = "";
        name = "";
        size = "";
        value = "";
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
