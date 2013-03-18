package br.com.globalcode.backing_bean;

import br.com.globalcode.model.Cliente;

public class NavegacaoMB {

    private String nextPage = "";
    private boolean temPagina = false;
    private Cliente cliente;
    
    public NavegacaoMB() {
    }

    public void setNextPage(String nextPage) {
        if((cliente == null || cliente.equals("")) && 
            ((nextPage == null || nextPage.equals("")) || (nextPage != "formDados" && nextPage != "login"))){
            this.nextPage = "login.jsp";
            this.temPagina = true;
        }else if(cliente != null && !cliente.equals("") && 
                 (nextPage == null || nextPage.equals(""))){
            this.nextPage = "";
            this.temPagina = false;
        }else{
            this.nextPage = nextPage+".jsp";
            this.temPagina = true;
        }
    }

    public String getNextPage() {
        return nextPage;
    }

    public void setTemPagina(boolean temPagina) {
        this.temPagina = temPagina;
    }

    public boolean isTemPagina() {
        return temPagina;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }
}
