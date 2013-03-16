package br.com.globalcode.aw.web.controller;

import br.com.globalcode.aw.util.Debug;
import br.com.globalcode.aw.web.command.CommandFactory;
import br.com.globalcode.aw.web.command.WebCommand;
import java.io.*;
import java.net.*;

import javax.servlet.*;
import javax.servlet.http.*;

public class FrontController extends HttpServlet {
    
    /** Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        Debug.log("Controller acionado, vai criar command...", 9);
        WebCommand aCommand = null;
        try {
            aCommand = CommandFactory.createWebCommand(request);
            Debug.log("Command criado, chamando seu action", 9);
            aCommand.doAction(request, response);
        } catch(Exception e) {
            Debug.log("Erro encontrado, encaminhando para /erros/generico.jsp", 9);
            throw new ServletException(e);
        }
        
        // DipatcherToView (design pattern)
        String destino = (String) request.getAttribute("destino");
        String navegacao = (String) request.getAttribute("tipoNavegacao");
        if (destino != null && !destino.equals("")) {
            if(navegacao.equalsIgnoreCase("forward")) {
                Debug.log("Action executado, encaminhando para " + destino, 9);
                RequestDispatcher rd = request.getRequestDispatcher("/index.jsp?page="+destino);
                rd.forward(request,response);
            } else {
                Debug.log("Action executado, redirecionando para " + destino, 9);
                response.sendRedirect(request.getContextPath()+"/index.jsp?page="+destino);
            }
        }else{
                Debug.log("Action executado, redirecionando para index.jsp", 9);
                response.sendRedirect(request.getContextPath()+"/index.jsp");
        }
    }
    
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }
    
    /** Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }
    
    /** Returns a short description of the servlet.
     */
    public String getServletInfo() {
        return "Short description";
    }
    // </editor-fold>
}
