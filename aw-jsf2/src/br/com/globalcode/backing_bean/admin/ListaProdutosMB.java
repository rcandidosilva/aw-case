package br.com.globalcode.backing_bean.admin;

import br.com.globalcode.comparator.ComparatorCategoriaDescricao;
import br.com.globalcode.comparator.ComparatorProdutoNome;
import br.com.globalcode.dao.BaseDAOFactory;
import br.com.globalcode.dao.CategoriaDAO;
import br.com.globalcode.dao.DAOFactory;
import br.com.globalcode.dao.ProdutoDAO;
import br.com.globalcode.model.Categoria;
import br.com.globalcode.model.Produto;
import br.com.globalcode.model.ProdutoDigital;
import br.com.globalcode.model.ProdutoMaterial;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;
import javax.faces.model.ListDataModel;
import javax.faces.model.SelectItem;
import javax.servlet.http.HttpSession;

@ManagedBean(name="ProdutoMB")
@SessionScoped
public class ListaProdutosMB {

    private List categorias = new ArrayList();
    private Produto produto = new ProdutoMaterial();
    private ListDataModel produtos;
    private String tipo = "material";
    private List tipos;
    private boolean isProdutoMaterial = true;

    public ListaProdutosMB() {
    }

    public void setCategorias(List categorias) {
        this.categorias = categorias;
    }

    public List getCategorias() {
        categorias = new ArrayList();
        try {
            DAOFactory factory = BaseDAOFactory.getFactory();
            CategoriaDAO dao = factory.getCategoriaDAO();
            List categoriasList = dao.getAll();
            Collections.sort(categoriasList,new ComparatorCategoriaDescricao());
            for (int i = 0; i < categoriasList.size(); i++) {
                Categoria categoria = (Categoria)categoriasList.get(i);
                SelectItem item =
                    new SelectItem(categoria, categoria.getDescricao());
                categorias.add(item);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return categorias;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProdutos(ListDataModel produtos) {
        this.produtos = produtos;
    }

    public ListDataModel getProdutos() {
        try {
            DAOFactory factory = BaseDAOFactory.getFactory();
            ProdutoDAO dao = factory.getProdutoDAO();
            List produtosList = dao.getAll();
            Collections.sort(produtosList,new ComparatorProdutoNome());
            produtos = new ListDataModel(produtosList);
            return produtos;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipos(List tipos) {
        this.tipos = tipos;
    }

    public List getTipos() {
        tipos = new ArrayList();
        tipos.add(new SelectItem("material", "material"));
        tipos.add(new SelectItem("digital", "digital"));
        return tipos;
    }

    public void setIsProdutoMaterial(boolean isProdutoMaterial) {
        this.isProdutoMaterial = isProdutoMaterial;
    }

    public boolean isIsProdutoMaterial() {
        return isProdutoMaterial;
    }

    public String save() {
        HttpSession session =
            (HttpSession)FacesContext.getCurrentInstance().getExternalContext()
            .getSession(true);
        try {
            DAOFactory factory = BaseDAOFactory.getFactory();
            ProdutoDAO dao = factory.getProdutoDAO();
            dao.save(produto);
            //return "listaProdutos";
            session.setAttribute("nextPage", "listaProdutos.jsp");
        } catch (Exception e) {
            e.printStackTrace();
            //return "paginaErro";
            session.setAttribute("nextPage", "paginaErro.jsp");
        }
        return null;
    }

    public String createNew() {
        System.out.println("ListaProdutos createNew");
        produto = new ProdutoMaterial();
        HttpSession session =
            (HttpSession)FacesContext.getCurrentInstance().getExternalContext()
            .getSession(true);
        session.setAttribute("nextPage", "editaProduto.jsp");
        return null;
        //return "editaProduto";
    }

    public String viewDetail() {
        produto = (Produto)produtos.getRowData();
        if (produto instanceof ProdutoMaterial) {
            this.setIsProdutoMaterial(true);
        } else {
            this.setIsProdutoMaterial(false);
        }
        System.out.println("[ListProdutos] - viewDetail " + produto);
        HttpSession session =
            (HttpSession)FacesContext.getCurrentInstance().getExternalContext()
            .getSession(true);
        session.setAttribute("nextPage", "editaProduto.jsp");
        return null;
        //return "editaProduto";
    }

    public String viewAll() {
        System.out.println("[ListProdutos] - viewAll");
        HttpSession session =
            (HttpSession)FacesContext.getCurrentInstance().getExternalContext()
            .getSession(true);
        session.setAttribute("nextPage", "listaProdutos.jsp");
        return null;
    }

    public void valueChangeListener(ValueChangeEvent valueChangeEvent) {

        if (valueChangeEvent.getNewValue().equals("material")) {
            this.isProdutoMaterial = true;
            produto = new ProdutoMaterial(produto);
        } else {
            this.isProdutoMaterial = false;
            produto = new ProdutoDigital(produto);

        }
        System.out.println("ValueChangeListener action executando...");

        HttpSession session =
            (HttpSession)FacesContext.getCurrentInstance().getExternalContext()
            .getSession(true);
        session.setAttribute("nextPage", "editaProduto.jsp");

        FacesContext.getCurrentInstance().renderResponse();

    }


}
