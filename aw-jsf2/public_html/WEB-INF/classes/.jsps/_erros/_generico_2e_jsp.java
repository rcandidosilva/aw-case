package _erros;

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _generico_2e_jsp extends com.orionserver.http.OrionHttpJspPage {


  // ** Begin Declarations


  // ** End Declarations

  public void _jspService(HttpServletRequest request, HttpServletResponse response) throws java.io.IOException, ServletException {

    response.setContentType( "text/html");
    /* set up the intrinsic variables using the pageContext goober:
    ** session = HttpSession
    ** application = ServletContext
    ** out = JspWriter
    ** page = this
    ** config = ServletConfig
    ** all session/app beans declared in globals.jsa
    */
    PageContext pageContext = JspFactory.getDefaultFactory().getPageContext( this, request, response, null, true, JspWriter.DEFAULT_BUFFER, true);
    // Note: this is not emitted if the session directive == false
    HttpSession session = pageContext.getSession();
    int __jsp_tag_starteval;
    ServletContext application = pageContext.getServletContext();
    JspWriter out = pageContext.getOut();
    _generico_2e_jsp page = this;
    ServletConfig config = pageContext.getServletConfig();
    javax.servlet.jsp.el.VariableResolver __ojsp_varRes = (VariableResolver)new OracleVariableResolverImpl(pageContext);
    Throwable exception = (Throwable) request.getAttribute(PageContext.EXCEPTION);

    try {


      out.write(__oracle_jsp_text[0]);
      out.write(__oracle_jsp_text[1]);
      out.print(exception);
      out.write(__oracle_jsp_text[2]);
       exception.printStackTrace();
      out.write(__oracle_jsp_text[3]);


    }
    catch( Throwable e) {
      if (!(e instanceof javax.servlet.jsp.SkipPageException)){
        try {
          if (out != null) out.clear();
        }
        catch( Exception clearException) {
        }
        pageContext.handlePageException( e);
      }
    }
    finally {
      OracleJspRuntime.extraHandlePCFinally(pageContext,false);
      JspFactory.getDefaultFactory().releasePageContext(pageContext);
    }

  }
  private static final char __oracle_jsp_text[][]=new char[4][];
  static {
    try {
    __oracle_jsp_text[0] = 
    "<!-- Copyright (c) 2002 by ObjectLearn. All Rights Reserved. -->\n".toCharArray();
    __oracle_jsp_text[1] = 
    "\n<html>\n    <head>\n        <title>Error Page</title>\n    </head>\n    <body>\n        <font face=\"Comic Sans MS\" size=4>\n            <blockquote>\n                <center>\n                    <h3><font color=red>Ocorreu o erro abaixo. Verificar console.</font></h3>\n                </center>\n                <p>\t\t\n                <center>\n                    ".toCharArray();
    __oracle_jsp_text[2] = 
    "\n                </center></p>\n                ".toCharArray();
    __oracle_jsp_text[3] = 
    "\n            </blockquote>\n        </font>\n    </body>\n</html>\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
