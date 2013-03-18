
import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _index_2e_jsp extends com.orionserver.http.OrionHttpJspPage {


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
    _index_2e_jsp page = this;
    ServletConfig config = pageContext.getServletConfig();
    javax.servlet.jsp.el.VariableResolver __ojsp_varRes = (VariableResolver)new OracleVariableResolverImpl(pageContext);

    try {


      out.write(__oracle_jsp_text[0]);
      out.write(__oracle_jsp_text[1]);
      {
        com.sun.faces.taglib.jsf_core.ViewTag __jsp_taghandler_1=(com.sun.faces.taglib.jsf_core.ViewTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.jsf_core.ViewTag.class,"com.sun.faces.taglib.jsf_core.ViewTag");
        __jsp_taghandler_1.setParent(null);
        __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
        if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
        {
          out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_1,__jsp_tag_starteval,out);
          do {
            out.write(__oracle_jsp_text[2]);
            out.write(__oracle_jsp_text[3]);
            {
              org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_2=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var value");
              __jsp_taghandler_2.setParent(__jsp_taghandler_1);
              __jsp_taghandler_2.setVar("contexto");
              __jsp_taghandler_2.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${pageContext.request.contextPath}",java.lang.Object.class, __ojsp_varRes,null));
              __jsp_tag_starteval=__jsp_taghandler_2.doStartTag();
              if (__jsp_taghandler_2.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_2,2);
            }
            out.write(__oracle_jsp_text[4]);
            out.write( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${contexto}",java.lang.String.class, __ojsp_varRes, null));
            out.write(__oracle_jsp_text[5]);
            out.write( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${contexto}",java.lang.String.class, __ojsp_varRes, null));
            out.write(__oracle_jsp_text[6]);
            out.write( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${contexto}",java.lang.String.class, __ojsp_varRes, null));
            out.write(__oracle_jsp_text[7]);
            out.write( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${contexto}",java.lang.String.class, __ojsp_varRes, null));
            out.write(__oracle_jsp_text[8]);
            out.write( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${contexto}",java.lang.String.class, __ojsp_varRes, null));
            out.write(__oracle_jsp_text[9]);
            out.write( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${contexto}",java.lang.String.class, __ojsp_varRes, null));
            out.write(__oracle_jsp_text[10]);
            out.write( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${contexto}",java.lang.String.class, __ojsp_varRes, null));
            out.write(__oracle_jsp_text[11]);
            out.write( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${contexto}",java.lang.String.class, __ojsp_varRes, null));
            out.write(__oracle_jsp_text[12]);
            out.write( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${contexto}",java.lang.String.class, __ojsp_varRes, null));
            out.write(__oracle_jsp_text[13]);
            out.write( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${contexto}",java.lang.String.class, __ojsp_varRes, null));
            out.write(__oracle_jsp_text[14]);
            out.write( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${contexto}",java.lang.String.class, __ojsp_varRes, null));
            out.write(__oracle_jsp_text[15]);
            {
              String __url=OracleJspRuntime.toStr("top.jsp");
              // Include 
              pageContext.include( __url,true);
              if (pageContext.getAttribute(OracleJspRuntime.JSP_REQUEST_REDIRECTED, PageContext.REQUEST_SCOPE) != null) return;
            }

            out.write(__oracle_jsp_text[16]);
            {
              String __url=OracleJspRuntime.toStr("menu.jsp");
              // Include 
              pageContext.include( __url,true);
              if (pageContext.getAttribute(OracleJspRuntime.JSP_REQUEST_REDIRECTED, PageContext.REQUEST_SCOPE) != null) return;
            }

            out.write(__oracle_jsp_text[17]);
            {
              org.apache.taglibs.standard.tag.common.core.ChooseTag __jsp_taghandler_3=(org.apache.taglibs.standard.tag.common.core.ChooseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.ChooseTag.class,"org.apache.taglibs.standard.tag.common.core.ChooseTag");
              __jsp_taghandler_3.setParent(__jsp_taghandler_1);
              __jsp_tag_starteval=__jsp_taghandler_3.doStartTag();
              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
              {
                do {
                  out.write(__oracle_jsp_text[18]);
                  {
                    org.apache.taglibs.standard.tag.rt.core.WhenTag __jsp_taghandler_4=(org.apache.taglibs.standard.tag.rt.core.WhenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.WhenTag.class,"org.apache.taglibs.standard.tag.rt.core.WhenTag test");
                    __jsp_taghandler_4.setParent(__jsp_taghandler_3);
                    __jsp_taghandler_4.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${empty usuario && (empty nextPage || (nextPage != 'formDados.jsp' && nextPage != 'login.jsp'))}",java.lang.Boolean.class, __ojsp_varRes,null)));
                    __jsp_tag_starteval=__jsp_taghandler_4.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        out.write(__oracle_jsp_text[19]);
                        {
                          String __url=OracleJspRuntime.toStr("login.jsp");
                          // Include 
                          pageContext.include( __url,true);
                          if (pageContext.getAttribute(OracleJspRuntime.JSP_REQUEST_REDIRECTED, PageContext.REQUEST_SCOPE) != null) return;
                        }

                        out.write(__oracle_jsp_text[20]);
                      } while (__jsp_taghandler_4.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_4.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_4,3);
                  }
                  out.write(__oracle_jsp_text[21]);
                  {
                    org.apache.taglibs.standard.tag.rt.core.WhenTag __jsp_taghandler_5=(org.apache.taglibs.standard.tag.rt.core.WhenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.WhenTag.class,"org.apache.taglibs.standard.tag.rt.core.WhenTag test");
                    __jsp_taghandler_5.setParent(__jsp_taghandler_3);
                    __jsp_taghandler_5.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${not empty usuario && empty nextPage}",java.lang.Boolean.class, __ojsp_varRes,null)));
                    __jsp_tag_starteval=__jsp_taghandler_5.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        out.write(__oracle_jsp_text[22]);
                        {
                          org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_6=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                          __jsp_taghandler_6.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_6.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${! empty nextPage}",java.lang.Boolean.class, __ojsp_varRes,null)));
                          __jsp_tag_starteval=__jsp_taghandler_6.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                              out.write(__oracle_jsp_text[23]);
                              {
                                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_7=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                                __jsp_taghandler_7.setParent(__jsp_taghandler_6);
                                __jsp_taghandler_7.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${nextPage}",java.lang.Object.class, __ojsp_varRes,null));
                                __jsp_tag_starteval=__jsp_taghandler_7.doStartTag();
                                if (__jsp_taghandler_7.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                  return;
                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_7,5);
                              }
                              out.write(__oracle_jsp_text[24]);
                              {
                                String __url= (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${nextPage}",java.lang.String.class, __ojsp_varRes, null);
                                // Include 
                                pageContext.include( __url,true);
                                if (pageContext.getAttribute(OracleJspRuntime.JSP_REQUEST_REDIRECTED, PageContext.REQUEST_SCOPE) != null) return;
                              }

                              out.write(__oracle_jsp_text[25]);
                            } while (__jsp_taghandler_6.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_6.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_6,4);
                        }
                        out.write(__oracle_jsp_text[26]);
                      } while (__jsp_taghandler_5.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_5.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_5,3);
                  }
                  out.write(__oracle_jsp_text[27]);
                  {
                    org.apache.taglibs.standard.tag.common.core.OtherwiseTag __jsp_taghandler_8=(org.apache.taglibs.standard.tag.common.core.OtherwiseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class,"org.apache.taglibs.standard.tag.common.core.OtherwiseTag");
                    __jsp_taghandler_8.setParent(__jsp_taghandler_3);
                    __jsp_tag_starteval=__jsp_taghandler_8.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        out.write(__oracle_jsp_text[28]);
                        {
                          String __url= (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${nextPage}",java.lang.String.class, __ojsp_varRes, null);
                          // Include 
                          pageContext.include( __url,true);
                          if (pageContext.getAttribute(OracleJspRuntime.JSP_REQUEST_REDIRECTED, PageContext.REQUEST_SCOPE) != null) return;
                        }

                        out.write(__oracle_jsp_text[29]);
                      } while (__jsp_taghandler_8.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_8.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_8,3);
                  }
                  out.write(__oracle_jsp_text[30]);
                } while (__jsp_taghandler_3.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
              }
              if (__jsp_taghandler_3.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_3,2);
            }
            out.write(__oracle_jsp_text[31]);
            {
              String __url=OracleJspRuntime.toStr("bottom.jsp");
              // Include 
              pageContext.include( __url,true);
              if (pageContext.getAttribute(OracleJspRuntime.JSP_REQUEST_REDIRECTED, PageContext.REQUEST_SCOPE) != null) return;
            }

            out.write(__oracle_jsp_text[32]);
          } while (__jsp_taghandler_1.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
          out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
        }
        if (__jsp_taghandler_1.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_1,1);
      }
      out.write(__oracle_jsp_text[33]);


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
      OracleJspRuntime.extraHandlePCFinally(pageContext,true);
      JspFactory.getDefaultFactory().releasePageContext(pageContext);
    }

  }
  private static final char __oracle_jsp_text[][]=new char[34][];
  static {
    try {
    __oracle_jsp_text[0] = 
    "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n\"http://www.w3.org/TR/html4/loose.dtd\">\n\n".toCharArray();
    __oracle_jsp_text[1] = 
    "\n\n".toCharArray();
    __oracle_jsp_text[2] = 
    "\n".toCharArray();
    __oracle_jsp_text[3] = 
    "\n".toCharArray();
    __oracle_jsp_text[4] = 
    "\n<html>\n    <head>\n        <title>GES - GlobalEducation System</title>\n        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\"></meta>\n        <link href=\"".toCharArray();
    __oracle_jsp_text[5] = 
    "/css/ges.css\" rel=\"stylesheet\" type=\"text/css\"></link>\n        <link href=\"".toCharArray();
    __oracle_jsp_text[6] = 
    "/css/GES_Botoes.css\" rel=\"stylesheet\"\n              type=\"text/css\"></link>\n        <link href=\"".toCharArray();
    __oracle_jsp_text[7] = 
    "/css/GES_Tabelas.css\" rel=\"stylesheet\"\n              type=\"text/css\"></link>\n        <script src=\"".toCharArray();
    __oracle_jsp_text[8] = 
    "/js/swapImage.js\" language=\"javascript\"\n                type=\"text/javascript\"></script>\n        <link type=\"text/css\" rel=\"stylesheet\" media=\"all\" title=\"system\"  \n            href=\"".toCharArray();
    __oracle_jsp_text[9] = 
    "/jscalendar/calendar-system.css\"></link>\n        <script type=\"text/javascript\" src=\"".toCharArray();
    __oracle_jsp_text[10] = 
    "/jscalendar/calendar.js\"></script>\n        <script type=\"text/javascript\" src=\"".toCharArray();
    __oracle_jsp_text[11] = 
    "/jscalendar/calendar-br.js\"></script>\n        <script type=\"text/javascript\" src=\"".toCharArray();
    __oracle_jsp_text[12] = 
    "/jscalendar/calendar-setup.js\"></script>\n    </head>\n    <body onload=\"MM_preloadImages('".toCharArray();
    __oracle_jsp_text[13] = 
    "/images/bottom/Bt_continuarComprando_on.gif','".toCharArray();
    __oracle_jsp_text[14] = 
    "/images/bottom/bt_excluir_on.gif','".toCharArray();
    __oracle_jsp_text[15] = 
    "/images/bottom/Bt_finalizarPedido_on.gif')\">\n    <table width=\"100%\"cellpadding=\"0\">\n            <tr>\n                <td colspan=\"2\">\n                    <!-- ######################  top.jsp ########################-->\n                    ".toCharArray();
    __oracle_jsp_text[16] = 
    "\n                    <!-- ######################  final do top.jsp ########################-->\n                </td>\n            </tr>\n            <tr>\n                <td width=\"170\" align=\"left\" valign=\"top\">\n                    <!-- ######################  menu.jsp ########################-->\n                    ".toCharArray();
    __oracle_jsp_text[17] = 
    "\n                    <!-- ######################  final do menu.jsp ########################-->\n                </td>\n                <td height=\"386\" valign=\"top\">\n                \n                    ".toCharArray();
    __oracle_jsp_text[18] = 
    "\n                        ".toCharArray();
    __oracle_jsp_text[19] = 
    "\n                            <!-- ######################  login.jsp ########################-->\n                            ".toCharArray();
    __oracle_jsp_text[20] = 
    "\n                            <!-- ######################  final do login.jsp ########################-->\n                        ".toCharArray();
    __oracle_jsp_text[21] = 
    "\n                        ".toCharArray();
    __oracle_jsp_text[22] = 
    "\n                            ".toCharArray();
    __oracle_jsp_text[23] = 
    "\n                                ".toCharArray();
    __oracle_jsp_text[24] = 
    "\n                                ".toCharArray();
    __oracle_jsp_text[25] = 
    "\n                            ".toCharArray();
    __oracle_jsp_text[26] = 
    "\n                        ".toCharArray();
    __oracle_jsp_text[27] = 
    "\n                        ".toCharArray();
    __oracle_jsp_text[28] = 
    "\n                            <!-- ######################  {nextPage} ########################-->\n                            ".toCharArray();
    __oracle_jsp_text[29] = 
    "\n                            <!-- ######################  final do {nextPage} ######################## -->\n                        ".toCharArray();
    __oracle_jsp_text[30] = 
    "\n                    ".toCharArray();
    __oracle_jsp_text[31] = 
    "\n                </td>\n            </tr>\n            <tr>\n                <td colspan=\"2\">\n                    <!-- ######################  bottom.jsp ########################-->\n                    ".toCharArray();
    __oracle_jsp_text[32] = 
    " \n                    <!-- ######################  final do bottom.jsp ########################-->\n                </td>\n            </tr>\n        </table></body>\n</html>\n".toCharArray();
    __oracle_jsp_text[33] = 
    "\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
