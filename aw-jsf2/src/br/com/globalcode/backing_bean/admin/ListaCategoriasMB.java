package br.com.globalcode.backing_bean.admin;

import br.com.globalcode.comparator.ComparatorCategoriaId;
import br.com.globalcode.dao.BaseDAOFactory;
import br.com.globalcode.dao.CategoriaDAO;
import br.com.globalcode.dao.DAOFactory;

import br.com.globalcode.model.Categoria;

import java.util.Collections;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import javax.faces.context.FacesContext;
import javax.faces.model.ListDataModel;

import javax.servlet.http.HttpSession;

@ManagedBean(name="CategoriaMB")
@SessionScoped
public class ListaCategoriasMB {

    private ListDataModel categorias;
    private Categoria categoria = new Categoria();

    public ListaCategoriasMB() {
    }

    public void setCategorias(ListDataModel categorias) {
        this.categorias = categorias;
    }

    public ListDataModel getCategorias() {
        try {
            DAOFactory factory = BaseDAOFactory.getFactory();
            CategoriaDAO dao = factory.getCategoriaDAO();
            List categoriasList = dao.getAll();
            Collections.sort(categoriasList, new ComparatorCategoriaId());
            categorias = new ListDataModel(categoriasList);
            return categorias;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void setCategoria(Categoria categoriaSelecionada) {
        this.categoria = categoriaSelecionada;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public String save() {
        HttpSession session = (HttpSession)FacesContext.getCurrentInstance().getExternalContext().getSession(true);
        try {
            DAOFactory factory = BaseDAOFactory.getFactory();
            CategoriaDAO dao = factory.getCategoriaDAO();
            dao.save(categoria);
            session.setAttribute("nextPage","listaCategorias.jsp");
            //return "listaCategorias";
        } catch (Exception e) {
            e.printStackTrace();
            session.setAttribute("nextPage","paginaErro.jsp");
            //return "paginaErro";
        }
        return null;
    }

    public String createNew() {
        categoria = new Categoria();
        HttpSession session = (HttpSession)FacesContext.getCurrentInstance().getExternalContext().getSession(true);
        session.setAttribute("nextPage","editaCategoria.jsp");
        //return "editaCategoria";
        return null;
    }

    public String viewDetail() {
        System.out.println("[ListaCategorias - viewDetail]");
        categoria = (Categoria)categorias.getRowData();
        HttpSession session = (HttpSession)FacesContext.getCurrentInstance().getExternalContext().getSession(true);
        session.setAttribute("nextPage","editaCategoria.jsp");
        //return "editaCategoria";
        return null;
    }

    public String viewAll() {
        System.out.println("[ListaCategorias] - viewAll");
        HttpSession session =
            (HttpSession)FacesContext.getCurrentInstance().getExternalContext()
            .getSession(true);
        session.setAttribute("nextPage", "listaCategorias.jsp");
        return null;
    }

    public String delete() {
        HttpSession session = (HttpSession)FacesContext.getCurrentInstance().getExternalContext().getSession(true);
        categoria = (Categoria)categorias.getRowData();
        try {
            DAOFactory factory = BaseDAOFactory.getFactory();
            CategoriaDAO dao = factory.getCategoriaDAO();
            dao.delete(categoria);
            session.setAttribute("nextPage","listaCategorias.jsp");
            //return "listaCategorias";
        } catch (Exception e) {
            e.printStackTrace();
            session.setAttribute("nextPage","paginaErro.jsp");
            //return "paginaErro";
        }
        return null;
    }

}
