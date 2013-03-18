package br.com.globalcode.aw.web.listener;

import br.com.globalcode.aw.util.Debug;
import br.com.globalcode.dao.BaseDAOFactory;
import br.com.globalcode.dao.DAOFactory;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletContextEvent;

public class Inicializador implements ServletContextListener {
    
    public void contextInitialized(ServletContextEvent evt) {
        ServletContext ctx = evt.getServletContext();
        String daoFactory = ctx.getInitParameter("daoFactory");
        if(daoFactory != null) {
            try {
                DAOFactory factory = (DAOFactory) Class.forName(daoFactory).newInstance();
                BaseDAOFactory.setFactory(factory);
            } catch(Exception e) {
                Debug.log("Nao foi possivel inicializar o DAOFactory " + daoFactory,9);
            }
        }
        else {
            Debug.log("Nao foi fornecida a classe para o DAOFactory",9);
        }
    }
    
    
    public void contextDestroyed(ServletContextEvent evt) {
    }
}
