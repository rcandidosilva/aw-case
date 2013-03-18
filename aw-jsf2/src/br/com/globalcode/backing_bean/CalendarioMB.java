package br.com.globalcode.backing_bean;

import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="CalendarioMB")
@RequestScoped
public class CalendarioMB {

    private Date data;

    public CalendarioMB() {
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Date getData() {
        return data;
    }
    
}
