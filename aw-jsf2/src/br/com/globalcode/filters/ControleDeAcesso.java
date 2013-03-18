package br.com.globalcode.filters;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import br.com.globalcode.model.Cliente;

public class ControleDeAcesso implements Filter {
    
  private FilterConfig fc;
    
  public void init(FilterConfig config) throws ServletException {
      System.out.println("[FILTER] Inicializando o filtro LogAccess");
      this.fc = config;
  }

  public void doFilter(ServletRequest req, ServletResponse res,
      FilterChain chain) throws ServletException, IOException {

      System.out.println("[FILTER] Executando o filtro de log de acesso");
      HttpServletRequest request = (HttpServletRequest) req;
      System.out.println("[FILTER] URL requisitada :" + request.getRequestURI());
      String page = request.getParameter("page");
      System.out.println("[FILTER] parametro page :"+page);
      Cliente usuario = (Cliente) request.getSession().getAttribute("usuario");
      System.out.println("[FILTER] usuario :"+usuario);
      
      if( usuario != null ||
          request.getRequestURI().equals("/index.jsp?page=formDados.jsp") ){
          
          chain.doFilter(req, res);

      }else{
          
          HttpServletResponse response = (HttpServletResponse) res;          
          response.sendRedirect(request.getContextPath()+"/index.jsp?page=login.jsp");
          
      }
      
  }

  public void destroy() {
      System.out.println("[FILTER] Destruindo o filtro LogAccess");
  }
    
}
