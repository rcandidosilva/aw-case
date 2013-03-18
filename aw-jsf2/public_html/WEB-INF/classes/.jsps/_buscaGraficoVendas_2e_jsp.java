
import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _buscaGraficoVendas_2e_jsp extends com.orionserver.http.OrionHttpJspPage {


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
    _buscaGraficoVendas_2e_jsp page = this;
    ServletConfig config = pageContext.getServletConfig();
    javax.servlet.jsp.el.VariableResolver __ojsp_varRes = (VariableResolver)new OracleVariableResolverImpl(pageContext);

    try {


      out.write(__oracle_jsp_text[0]);
      out.write(__oracle_jsp_text[1]);
      {
        com.sun.faces.taglib.jsf_core.SubviewTag __jsp_taghandler_1=(com.sun.faces.taglib.jsf_core.SubviewTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.jsf_core.SubviewTag.class,"com.sun.faces.taglib.jsf_core.SubviewTag id");
        __jsp_taghandler_1.setParent(null);
        __jsp_taghandler_1.setId("buscaGraficoVendas");
        __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
        {
          out.write(__oracle_jsp_text[2]);
          {
            com.sun.faces.taglib.html_basic.FormTag __jsp_taghandler_2=(com.sun.faces.taglib.html_basic.FormTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.FormTag.class,"com.sun.faces.taglib.html_basic.FormTag id");
            __jsp_taghandler_2.setParent(__jsp_taghandler_1);
            __jsp_taghandler_2.setId("formBusca");
            __jsp_tag_starteval=__jsp_taghandler_2.doStartTag();
            if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
            {
              out.write(__oracle_jsp_text[3]);
              {
                com.sun.faces.taglib.html_basic.PanelGridTag __jsp_taghandler_3=(com.sun.faces.taglib.html_basic.PanelGridTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.PanelGridTag.class,"com.sun.faces.taglib.html_basic.PanelGridTag headerClass styleClass");
                __jsp_taghandler_3.setParent(__jsp_taghandler_2);
                __jsp_taghandler_3.setHeaderClass("cabecalho");
                __jsp_taghandler_3.setStyleClass("tabelaGC");
                __jsp_tag_starteval=__jsp_taghandler_3.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  out.write(__oracle_jsp_text[4]);
                  {
                    javax.faces.webapp.FacetTag __jsp_taghandler_4=(javax.faces.webapp.FacetTag)OracleJspRuntime.getTagHandler(pageContext,javax.faces.webapp.FacetTag.class,"javax.faces.webapp.FacetTag name");
                    __jsp_taghandler_4.setParent(__jsp_taghandler_3);
                    __jsp_taghandler_4.setName("header");
                    __jsp_tag_starteval=__jsp_taghandler_4.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        out.write(__oracle_jsp_text[5]);
                        {
                          com.sun.faces.taglib.html_basic.OutputTextTag __jsp_taghandler_5=(com.sun.faces.taglib.html_basic.OutputTextTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.OutputTextTag.class,"com.sun.faces.taglib.html_basic.OutputTextTag value escape");
                          __jsp_taghandler_5.setParent(__jsp_taghandler_4);
                          __jsp_taghandler_5.setValue("Ver gr&aacute;fico de vendas por marca");
                          __jsp_taghandler_5.setEscape("false");
                          __jsp_tag_starteval=__jsp_taghandler_5.doStartTag();
                          if (__jsp_taghandler_5.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_5,5);
                        }
                        out.write(__oracle_jsp_text[6]);
                      } while (__jsp_taghandler_4.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_4.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_4,4);
                  }
                  out.write(__oracle_jsp_text[7]);
                  {
                    com.sun.faces.taglib.html_basic.PanelGridTag __jsp_taghandler_6=(com.sun.faces.taglib.html_basic.PanelGridTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.PanelGridTag.class,"com.sun.faces.taglib.html_basic.PanelGridTag columns");
                    __jsp_taghandler_6.setParent(__jsp_taghandler_3);
                    __jsp_taghandler_6.setColumns("1");
                    __jsp_tag_starteval=__jsp_taghandler_6.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      out.write(__oracle_jsp_text[8]);
                      {
                        com.sun.faces.taglib.html_basic.OutputLabelTag __jsp_taghandler_7=(com.sun.faces.taglib.html_basic.OutputLabelTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.OutputLabelTag.class,"com.sun.faces.taglib.html_basic.OutputLabelTag value for");
                        __jsp_taghandler_7.setParent(__jsp_taghandler_6);
                        __jsp_taghandler_7.setValue("Data Inicial:");
                        __jsp_taghandler_7.setFor("dataInicio");
                        __jsp_tag_starteval=__jsp_taghandler_7.doStartTag();
                        if (__jsp_taghandler_7.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_7,5);
                      }
                      out.write(__oracle_jsp_text[9]);
                      {
                        com.sun.faces.taglib.html_basic.PanelGroupTag __jsp_taghandler_8=(com.sun.faces.taglib.html_basic.PanelGroupTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.PanelGroupTag.class,"com.sun.faces.taglib.html_basic.PanelGroupTag");
                        __jsp_taghandler_8.setParent(__jsp_taghandler_6);
                        __jsp_tag_starteval=__jsp_taghandler_8.doStartTag();
                        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                        {
                          out.write(__oracle_jsp_text[10]);
                          {
                            com.sun.faces.taglib.html_basic.InputTextTag __jsp_taghandler_9=(com.sun.faces.taglib.html_basic.InputTextTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.InputTextTag.class,"com.sun.faces.taglib.html_basic.InputTextTag id value maxlength size styleClass");
                            __jsp_taghandler_9.setParent(__jsp_taghandler_8);
                            __jsp_taghandler_9.setId("dataInicio");
                            __jsp_taghandler_9.setValue("#{GraficoVendasPorMarcaMB.dataInicio}");
                            __jsp_taghandler_9.setMaxlength("12");
                            __jsp_taghandler_9.setSize("12");
                            __jsp_taghandler_9.setStyleClass("GC_Normal");
                            __jsp_tag_starteval=__jsp_taghandler_9.doStartTag();
                            if (__jsp_taghandler_9.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                              return;
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_9,6);
                          }
                          out.write(__oracle_jsp_text[11]);
                          {
                            com.sun.faces.taglib.html_basic.OutputTextTag __jsp_taghandler_10=(com.sun.faces.taglib.html_basic.OutputTextTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.OutputTextTag.class,"com.sun.faces.taglib.html_basic.OutputTextTag value");
                            __jsp_taghandler_10.setParent(__jsp_taghandler_8);
                            __jsp_taghandler_10.setValue("  dd/mm/yyyy");
                            __jsp_tag_starteval=__jsp_taghandler_10.doStartTag();
                            if (__jsp_taghandler_10.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                              return;
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_10,6);
                          }
                          out.write(__oracle_jsp_text[12]);
                        }
                        if (__jsp_taghandler_8.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_8,5);
                      }
                      out.write(__oracle_jsp_text[13]);
                      {
                        com.sun.faces.taglib.html_basic.OutputLabelTag __jsp_taghandler_11=(com.sun.faces.taglib.html_basic.OutputLabelTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.OutputLabelTag.class,"com.sun.faces.taglib.html_basic.OutputLabelTag value for");
                        __jsp_taghandler_11.setParent(__jsp_taghandler_6);
                        __jsp_taghandler_11.setValue("Data Final:");
                        __jsp_taghandler_11.setFor("dataFinal");
                        __jsp_tag_starteval=__jsp_taghandler_11.doStartTag();
                        if (__jsp_taghandler_11.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_11,5);
                      }
                      out.write(__oracle_jsp_text[14]);
                      {
                        com.sun.faces.taglib.html_basic.PanelGroupTag __jsp_taghandler_12=(com.sun.faces.taglib.html_basic.PanelGroupTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.PanelGroupTag.class,"com.sun.faces.taglib.html_basic.PanelGroupTag");
                        __jsp_taghandler_12.setParent(__jsp_taghandler_6);
                        __jsp_tag_starteval=__jsp_taghandler_12.doStartTag();
                        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                        {
                          out.write(__oracle_jsp_text[15]);
                          {
                            com.sun.faces.taglib.html_basic.InputTextTag __jsp_taghandler_13=(com.sun.faces.taglib.html_basic.InputTextTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.InputTextTag.class,"com.sun.faces.taglib.html_basic.InputTextTag id value maxlength size styleClass");
                            __jsp_taghandler_13.setParent(__jsp_taghandler_12);
                            __jsp_taghandler_13.setId("dataFinal");
                            __jsp_taghandler_13.setValue("#{GraficoVendasPorMarcaMB.dataFinal}");
                            __jsp_taghandler_13.setMaxlength("12");
                            __jsp_taghandler_13.setSize("12");
                            __jsp_taghandler_13.setStyleClass("GC_Normal");
                            __jsp_tag_starteval=__jsp_taghandler_13.doStartTag();
                            if (__jsp_taghandler_13.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                              return;
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_13,6);
                          }
                          out.write(__oracle_jsp_text[16]);
                          {
                            com.sun.faces.taglib.html_basic.OutputTextTag __jsp_taghandler_14=(com.sun.faces.taglib.html_basic.OutputTextTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.OutputTextTag.class,"com.sun.faces.taglib.html_basic.OutputTextTag value");
                            __jsp_taghandler_14.setParent(__jsp_taghandler_12);
                            __jsp_taghandler_14.setValue("  dd/mm/yyyy");
                            __jsp_tag_starteval=__jsp_taghandler_14.doStartTag();
                            if (__jsp_taghandler_14.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                              return;
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_14,6);
                          }
                          out.write(__oracle_jsp_text[17]);
                        }
                        if (__jsp_taghandler_12.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_12,5);
                      }
                      out.write(__oracle_jsp_text[18]);
                      {
                        com.sun.faces.taglib.html_basic.CommandButtonTag __jsp_taghandler_15=(com.sun.faces.taglib.html_basic.CommandButtonTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.CommandButtonTag.class,"com.sun.faces.taglib.html_basic.CommandButtonTag action value onclick");
                        __jsp_taghandler_15.setParent(__jsp_taghandler_6);
                        __jsp_taghandler_15.setAction("#{RelatorioVendasPorMarcaMB.gerar}");
                        __jsp_taghandler_15.setValue("Buscar");
                        __jsp_taghandler_15.setOnclick("document.forms['formBusca'].target='_blank';");
                        __jsp_tag_starteval=__jsp_taghandler_15.doStartTag();
                        if (__jsp_taghandler_15.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_15,5);
                      }
                      out.write(__oracle_jsp_text[19]);
                    }
                    if (__jsp_taghandler_6.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_6,4);
                  }
                  out.write(__oracle_jsp_text[20]);
                }
                if (__jsp_taghandler_3.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_3,3);
              }
              out.write(__oracle_jsp_text[21]);
            }
            if (__jsp_taghandler_2.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
              return;
            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_2,2);
          }
          out.write(__oracle_jsp_text[22]);
        }
        if (__jsp_taghandler_1.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_1,1);
      }
      out.write(__oracle_jsp_text[23]);


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
  private static final char __oracle_jsp_text[][]=new char[24][];
  static {
    try {
    __oracle_jsp_text[0] = 
    "\n".toCharArray();
    __oracle_jsp_text[1] = 
    "\n\n".toCharArray();
    __oracle_jsp_text[2] = 
    "\n    ".toCharArray();
    __oracle_jsp_text[3] = 
    "\n        ".toCharArray();
    __oracle_jsp_text[4] = 
    "\n            ".toCharArray();
    __oracle_jsp_text[5] = 
    "\n                ".toCharArray();
    __oracle_jsp_text[6] = 
    "\n            ".toCharArray();
    __oracle_jsp_text[7] = 
    "\n            ".toCharArray();
    __oracle_jsp_text[8] = 
    "\n                ".toCharArray();
    __oracle_jsp_text[9] = 
    "\n                ".toCharArray();
    __oracle_jsp_text[10] = 
    "\n                    ".toCharArray();
    __oracle_jsp_text[11] = 
    "\n                    ".toCharArray();
    __oracle_jsp_text[12] = 
    "\n                ".toCharArray();
    __oracle_jsp_text[13] = 
    "\n                ".toCharArray();
    __oracle_jsp_text[14] = 
    "\n                ".toCharArray();
    __oracle_jsp_text[15] = 
    "\n                    ".toCharArray();
    __oracle_jsp_text[16] = 
    "\n                    ".toCharArray();
    __oracle_jsp_text[17] = 
    "\n                ".toCharArray();
    __oracle_jsp_text[18] = 
    "\n                ".toCharArray();
    __oracle_jsp_text[19] = 
    " \n            ".toCharArray();
    __oracle_jsp_text[20] = 
    "\n        ".toCharArray();
    __oracle_jsp_text[21] = 
    "\n    ".toCharArray();
    __oracle_jsp_text[22] = 
    "\n".toCharArray();
    __oracle_jsp_text[23] = 
    "\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
