package _admin._categoria;

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _editaCategoria_2e_jsp extends com.orionserver.http.OrionHttpJspPage {


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
    _editaCategoria_2e_jsp page = this;
    ServletConfig config = pageContext.getServletConfig();
    javax.servlet.jsp.el.VariableResolver __ojsp_varRes = (VariableResolver)new OracleVariableResolverImpl(pageContext);

    try {


      out.write(__oracle_jsp_text[0]);
      out.write(__oracle_jsp_text[1]);
      out.write(__oracle_jsp_text[2]);
      {
        com.sun.faces.taglib.jsf_core.ViewTag __jsp_taghandler_1=(com.sun.faces.taglib.jsf_core.ViewTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.jsf_core.ViewTag.class,"com.sun.faces.taglib.jsf_core.ViewTag");
        __jsp_taghandler_1.setParent(null);
        __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
        if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
        {
          out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_1,__jsp_tag_starteval,out);
          do {
            out.write(__oracle_jsp_text[3]);
            {
              com.sun.faces.taglib.html_basic.FormTag __jsp_taghandler_2=(com.sun.faces.taglib.html_basic.FormTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.FormTag.class,"com.sun.faces.taglib.html_basic.FormTag");
              __jsp_taghandler_2.setParent(__jsp_taghandler_1);
              __jsp_tag_starteval=__jsp_taghandler_2.doStartTag();
              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
              {
                out.write(__oracle_jsp_text[4]);
                {
                  com.sun.faces.taglib.html_basic.PanelGridTag __jsp_taghandler_3=(com.sun.faces.taglib.html_basic.PanelGridTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.PanelGridTag.class,"com.sun.faces.taglib.html_basic.PanelGridTag columns styleClass");
                  __jsp_taghandler_3.setParent(__jsp_taghandler_2);
                  __jsp_taghandler_3.setColumns("1");
                  __jsp_taghandler_3.setStyleClass("tabelaJSF");
                  __jsp_tag_starteval=__jsp_taghandler_3.doStartTag();
                  if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                  {
                    out.write(__oracle_jsp_text[5]);
                    {
                      com.sun.faces.taglib.html_basic.PanelGroupTag __jsp_taghandler_4=(com.sun.faces.taglib.html_basic.PanelGroupTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.PanelGroupTag.class,"com.sun.faces.taglib.html_basic.PanelGroupTag styleClass");
                      __jsp_taghandler_4.setParent(__jsp_taghandler_3);
                      __jsp_taghandler_4.setStyleClass("cabecalho");
                      __jsp_tag_starteval=__jsp_taghandler_4.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        out.write(__oracle_jsp_text[6]);
                        {
                          com.sun.faces.taglib.html_basic.OutputLabelTag __jsp_taghandler_5=(com.sun.faces.taglib.html_basic.OutputLabelTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.OutputLabelTag.class,"com.sun.faces.taglib.html_basic.OutputLabelTag value");
                          __jsp_taghandler_5.setParent(__jsp_taghandler_4);
                          __jsp_taghandler_5.setValue("Cadastro de Categoria");
                          __jsp_tag_starteval=__jsp_taghandler_5.doStartTag();
                          if (__jsp_taghandler_5.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_5,5);
                        }
                        out.write(__oracle_jsp_text[7]);
                      }
                      if (__jsp_taghandler_4.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_4,4);
                    }
                    out.write(__oracle_jsp_text[8]);
                    {
                      com.sun.faces.taglib.html_basic.PanelGridTag __jsp_taghandler_6=(com.sun.faces.taglib.html_basic.PanelGridTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.PanelGridTag.class,"com.sun.faces.taglib.html_basic.PanelGridTag columns");
                      __jsp_taghandler_6.setParent(__jsp_taghandler_3);
                      __jsp_taghandler_6.setColumns("3");
                      __jsp_tag_starteval=__jsp_taghandler_6.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        out.write(__oracle_jsp_text[9]);
                        {
                          com.sun.faces.taglib.html_basic.PanelGroupTag __jsp_taghandler_7=(com.sun.faces.taglib.html_basic.PanelGroupTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.PanelGroupTag.class,"com.sun.faces.taglib.html_basic.PanelGroupTag");
                          __jsp_taghandler_7.setParent(__jsp_taghandler_6);
                          __jsp_tag_starteval=__jsp_taghandler_7.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            out.write(__oracle_jsp_text[10]);
                            {
                              com.sun.faces.taglib.html_basic.OutputLabelTag __jsp_taghandler_8=(com.sun.faces.taglib.html_basic.OutputLabelTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.OutputLabelTag.class,"com.sun.faces.taglib.html_basic.OutputLabelTag value for styleClass");
                              __jsp_taghandler_8.setParent(__jsp_taghandler_7);
                              __jsp_taghandler_8.setValue("Dados da Categoria");
                              __jsp_taghandler_8.setFor("nada");
                              __jsp_taghandler_8.setStyleClass("titulo");
                              __jsp_tag_starteval=__jsp_taghandler_8.doStartTag();
                              if (__jsp_taghandler_8.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                return;
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_8,6);
                            }
                            out.write(__oracle_jsp_text[11]);
                          }
                          if (__jsp_taghandler_7.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_7,5);
                        }
                        out.write(__oracle_jsp_text[12]);
                        {
                          com.sun.faces.taglib.html_basic.OutputTextTag __jsp_taghandler_9=(com.sun.faces.taglib.html_basic.OutputTextTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.OutputTextTag.class,"com.sun.faces.taglib.html_basic.OutputTextTag id value");
                          __jsp_taghandler_9.setParent(__jsp_taghandler_6);
                          __jsp_taghandler_9.setId("nada");
                          __jsp_taghandler_9.setValue("");
                          __jsp_tag_starteval=__jsp_taghandler_9.doStartTag();
                          if (__jsp_taghandler_9.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_9,5);
                        }
                        out.write(__oracle_jsp_text[13]);
                        {
                          com.sun.faces.taglib.html_basic.OutputTextTag __jsp_taghandler_10=(com.sun.faces.taglib.html_basic.OutputTextTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.OutputTextTag.class,"com.sun.faces.taglib.html_basic.OutputTextTag value");
                          __jsp_taghandler_10.setParent(__jsp_taghandler_6);
                          __jsp_taghandler_10.setValue("");
                          __jsp_tag_starteval=__jsp_taghandler_10.doStartTag();
                          if (__jsp_taghandler_10.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_10,5);
                        }
                        out.write(__oracle_jsp_text[14]);
                        {
                          com.sun.faces.taglib.html_basic.OutputLabelTag __jsp_taghandler_11=(com.sun.faces.taglib.html_basic.OutputLabelTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.OutputLabelTag.class,"com.sun.faces.taglib.html_basic.OutputLabelTag value for");
                          __jsp_taghandler_11.setParent(__jsp_taghandler_6);
                          __jsp_taghandler_11.setValue("Descricao:");
                          __jsp_taghandler_11.setFor("descricao");
                          __jsp_tag_starteval=__jsp_taghandler_11.doStartTag();
                          if (__jsp_taghandler_11.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_11,5);
                        }
                        out.write(__oracle_jsp_text[15]);
                        {
                          com.sun.faces.taglib.html_basic.InputTextTag __jsp_taghandler_12=(com.sun.faces.taglib.html_basic.InputTextTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.InputTextTag.class,"com.sun.faces.taglib.html_basic.InputTextTag id value maxlength size");
                          __jsp_taghandler_12.setParent(__jsp_taghandler_6);
                          __jsp_taghandler_12.setId("descricao");
                          __jsp_taghandler_12.setValue("#{CategoriaMB.categoria.descricao}");
                          __jsp_taghandler_12.setMaxlength("50");
                          __jsp_taghandler_12.setSize("25");
                          __jsp_tag_starteval=__jsp_taghandler_12.doStartTag();
                          if (__jsp_taghandler_12.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_12,5);
                        }
                        out.write(__oracle_jsp_text[16]);
                        {
                          com.sun.faces.taglib.html_basic.MessageTag __jsp_taghandler_13=(com.sun.faces.taglib.html_basic.MessageTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.MessageTag.class,"com.sun.faces.taglib.html_basic.MessageTag for");
                          __jsp_taghandler_13.setParent(__jsp_taghandler_6);
                          __jsp_taghandler_13.setFor("descricao");
                          __jsp_tag_starteval=__jsp_taghandler_13.doStartTag();
                          if (__jsp_taghandler_13.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_13,5);
                        }
                        out.write(__oracle_jsp_text[17]);
                        {
                          com.sun.faces.taglib.html_basic.OutputLabelTag __jsp_taghandler_14=(com.sun.faces.taglib.html_basic.OutputLabelTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.OutputLabelTag.class,"com.sun.faces.taglib.html_basic.OutputLabelTag value for");
                          __jsp_taghandler_14.setParent(__jsp_taghandler_6);
                          __jsp_taghandler_14.setValue("Status:");
                          __jsp_taghandler_14.setFor("status");
                          __jsp_tag_starteval=__jsp_taghandler_14.doStartTag();
                          if (__jsp_taghandler_14.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_14,5);
                        }
                        out.write(__oracle_jsp_text[18]);
                        {
                          com.sun.faces.taglib.html_basic.SelectBooleanCheckboxTag __jsp_taghandler_15=(com.sun.faces.taglib.html_basic.SelectBooleanCheckboxTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.SelectBooleanCheckboxTag.class,"com.sun.faces.taglib.html_basic.SelectBooleanCheckboxTag id value");
                          __jsp_taghandler_15.setParent(__jsp_taghandler_6);
                          __jsp_taghandler_15.setId("status");
                          __jsp_taghandler_15.setValue("#{CategoriaMB.categoria.ativo}");
                          __jsp_tag_starteval=__jsp_taghandler_15.doStartTag();
                          if (__jsp_taghandler_15.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_15,5);
                        }
                        out.write(__oracle_jsp_text[19]);
                        {
                          com.sun.faces.taglib.html_basic.MessageTag __jsp_taghandler_16=(com.sun.faces.taglib.html_basic.MessageTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.MessageTag.class,"com.sun.faces.taglib.html_basic.MessageTag for");
                          __jsp_taghandler_16.setParent(__jsp_taghandler_6);
                          __jsp_taghandler_16.setFor("status");
                          __jsp_tag_starteval=__jsp_taghandler_16.doStartTag();
                          if (__jsp_taghandler_16.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_16,5);
                        }
                        out.write(__oracle_jsp_text[20]);
                        {
                          com.sun.faces.taglib.html_basic.InputHiddenTag __jsp_taghandler_17=(com.sun.faces.taglib.html_basic.InputHiddenTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.InputHiddenTag.class,"com.sun.faces.taglib.html_basic.InputHiddenTag id value");
                          __jsp_taghandler_17.setParent(__jsp_taghandler_6);
                          __jsp_taghandler_17.setId("id");
                          __jsp_taghandler_17.setValue("#{CategoriaMB.categoria.id}");
                          __jsp_tag_starteval=__jsp_taghandler_17.doStartTag();
                          if (__jsp_taghandler_17.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_17,5);
                        }
                        out.write(__oracle_jsp_text[21]);
                        {
                          com.sun.faces.taglib.html_basic.CommandButtonTag __jsp_taghandler_18=(com.sun.faces.taglib.html_basic.CommandButtonTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.CommandButtonTag.class,"com.sun.faces.taglib.html_basic.CommandButtonTag action value");
                          __jsp_taghandler_18.setParent(__jsp_taghandler_6);
                          __jsp_taghandler_18.setAction("#{CategoriaMB.save}");
                          __jsp_taghandler_18.setValue("Salvar");
                          __jsp_tag_starteval=__jsp_taghandler_18.doStartTag();
                          if (__jsp_taghandler_18.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_18,5);
                        }
                        out.write(__oracle_jsp_text[22]);
                      }
                      if (__jsp_taghandler_6.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_6,4);
                    }
                    out.write(__oracle_jsp_text[23]);
                  }
                  if (__jsp_taghandler_3.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_3,3);
                }
                out.write(__oracle_jsp_text[24]);
              }
              if (__jsp_taghandler_2.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_2,2);
            }
            out.write(__oracle_jsp_text[25]);
          } while (__jsp_taghandler_1.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
          out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
        }
        if (__jsp_taghandler_1.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_1,1);
      }


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
  private static final char __oracle_jsp_text[][]=new char[26][];
  static {
    try {
    __oracle_jsp_text[0] = 
    "<link href=\"../../css/GES_Tabelas.css\" rel=\"stylesheet\" type=\"text/css\"></link>\n".toCharArray();
    __oracle_jsp_text[1] = 
    "\n".toCharArray();
    __oracle_jsp_text[2] = 
    "\n".toCharArray();
    __oracle_jsp_text[3] = 
    "\n  ".toCharArray();
    __oracle_jsp_text[4] = 
    "\n    ".toCharArray();
    __oracle_jsp_text[5] = 
    "\n      ".toCharArray();
    __oracle_jsp_text[6] = 
    "\n        ".toCharArray();
    __oracle_jsp_text[7] = 
    "\n      ".toCharArray();
    __oracle_jsp_text[8] = 
    "\n      ".toCharArray();
    __oracle_jsp_text[9] = 
    "\n        ".toCharArray();
    __oracle_jsp_text[10] = 
    "\n          ".toCharArray();
    __oracle_jsp_text[11] = 
    "\n        ".toCharArray();
    __oracle_jsp_text[12] = 
    "\n        ".toCharArray();
    __oracle_jsp_text[13] = 
    "\n        ".toCharArray();
    __oracle_jsp_text[14] = 
    "\n        ".toCharArray();
    __oracle_jsp_text[15] = 
    "\n        ".toCharArray();
    __oracle_jsp_text[16] = 
    "\n        ".toCharArray();
    __oracle_jsp_text[17] = 
    "\n        ".toCharArray();
    __oracle_jsp_text[18] = 
    "\n        ".toCharArray();
    __oracle_jsp_text[19] = 
    "\n        ".toCharArray();
    __oracle_jsp_text[20] = 
    "\n        ".toCharArray();
    __oracle_jsp_text[21] = 
    "\n        ".toCharArray();
    __oracle_jsp_text[22] = 
    "\n      ".toCharArray();
    __oracle_jsp_text[23] = 
    "\n    ".toCharArray();
    __oracle_jsp_text[24] = 
    "\n  ".toCharArray();
    __oracle_jsp_text[25] = 
    "\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
