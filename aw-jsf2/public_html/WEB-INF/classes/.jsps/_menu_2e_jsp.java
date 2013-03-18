
import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _menu_2e_jsp extends com.orionserver.http.OrionHttpJspPage {


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
    _menu_2e_jsp page = this;
    ServletConfig config = pageContext.getServletConfig();
    javax.servlet.jsp.el.VariableResolver __ojsp_varRes = (VariableResolver)new OracleVariableResolverImpl(pageContext);

    try {


      out.write(__oracle_jsp_text[0]);
      out.write(__oracle_jsp_text[1]);
      out.write(__oracle_jsp_text[2]);
      {
        com.sun.faces.taglib.jsf_core.SubviewTag __jsp_taghandler_1=(com.sun.faces.taglib.jsf_core.SubviewTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.jsf_core.SubviewTag.class,"com.sun.faces.taglib.jsf_core.SubviewTag id");
        __jsp_taghandler_1.setParent(null);
        __jsp_taghandler_1.setId("menu");
        __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
        {
          out.write(__oracle_jsp_text[3]);
          {
            com.sun.faces.taglib.html_basic.FormTag __jsp_taghandler_2=(com.sun.faces.taglib.html_basic.FormTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.FormTag.class,"com.sun.faces.taglib.html_basic.FormTag");
            __jsp_taghandler_2.setParent(__jsp_taghandler_1);
            __jsp_tag_starteval=__jsp_taghandler_2.doStartTag();
            if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
            {
              out.write(__oracle_jsp_text[4]);
              {
                org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_3=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var value");
                __jsp_taghandler_3.setParent(__jsp_taghandler_2);
                __jsp_taghandler_3.setVar("contexto");
                __jsp_taghandler_3.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${pageContext.request.contextPath}",java.lang.Object.class, __ojsp_varRes,null));
                __jsp_tag_starteval=__jsp_taghandler_3.doStartTag();
                if (__jsp_taghandler_3.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_3,3);
              }
              out.write(__oracle_jsp_text[5]);
              {
                com.sun.faces.taglib.html_basic.PanelGridTag __jsp_taghandler_4=(com.sun.faces.taglib.html_basic.PanelGridTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.PanelGridTag.class,"com.sun.faces.taglib.html_basic.PanelGridTag border cellpadding cellspacing columns width");
                __jsp_taghandler_4.setParent(__jsp_taghandler_2);
                __jsp_taghandler_4.setBorder("0");
                __jsp_taghandler_4.setCellpadding("0");
                __jsp_taghandler_4.setCellspacing("0");
                __jsp_taghandler_4.setColumns("2");
                __jsp_taghandler_4.setWidth("170");
                __jsp_tag_starteval=__jsp_taghandler_4.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  out.write(__oracle_jsp_text[6]);
                  {
                    com.sun.faces.taglib.html_basic.OutputTextTag __jsp_taghandler_5=(com.sun.faces.taglib.html_basic.OutputTextTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.OutputTextTag.class,"com.sun.faces.taglib.html_basic.OutputTextTag value styleClass");
                    __jsp_taghandler_5.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_5.setValue("Categoria");
                    __jsp_taghandler_5.setStyleClass("menu_titulo");
                    __jsp_tag_starteval=__jsp_taghandler_5.doStartTag();
                    if (__jsp_taghandler_5.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_5,4);
                  }
                  out.write(__oracle_jsp_text[7]);
                  {
                    com.sun.faces.taglib.html_basic.GraphicImageTag __jsp_taghandler_6=(com.sun.faces.taglib.html_basic.GraphicImageTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.GraphicImageTag.class,"com.sun.faces.taglib.html_basic.GraphicImageTag url height styleClass width");
                    __jsp_taghandler_6.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_6.setUrl("/images/menus/fundo_bt_titulo2.gif");
                    __jsp_taghandler_6.setHeight("20");
                    __jsp_taghandler_6.setStyleClass("menu_titulo");
                    __jsp_taghandler_6.setWidth("60");
                    __jsp_tag_starteval=__jsp_taghandler_6.doStartTag();
                    if (__jsp_taghandler_6.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_6,4);
                  }
                  out.write(__oracle_jsp_text[8]);
                  {
                    com.sun.faces.taglib.html_basic.CommandLinkTag __jsp_taghandler_7=(com.sun.faces.taglib.html_basic.CommandLinkTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.CommandLinkTag.class,"com.sun.faces.taglib.html_basic.CommandLinkTag action");
                    __jsp_taghandler_7.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_7.setAction("#{CategoriaMB.viewAll}");
                    __jsp_tag_starteval=__jsp_taghandler_7.doStartTag();
                    if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                    {
                      out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_7,__jsp_tag_starteval,out);
                      do {
                        out.write(__oracle_jsp_text[9]);
                        {
                          com.sun.faces.taglib.html_basic.OutputTextTag __jsp_taghandler_8=(com.sun.faces.taglib.html_basic.OutputTextTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.OutputTextTag.class,"com.sun.faces.taglib.html_basic.OutputTextTag value styleClass");
                          __jsp_taghandler_8.setParent(__jsp_taghandler_7);
                          __jsp_taghandler_8.setValue("Visualizar Todas");
                          __jsp_taghandler_8.setStyleClass("menu_subtitulo");
                          __jsp_tag_starteval=__jsp_taghandler_8.doStartTag();
                          if (__jsp_taghandler_8.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_8,5);
                        }
                        out.write(__oracle_jsp_text[10]);
                      } while (__jsp_taghandler_7.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                    }
                    if (__jsp_taghandler_7.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_7,4);
                  }
                  out.write(__oracle_jsp_text[11]);
                  {
                    com.sun.faces.taglib.html_basic.GraphicImageTag __jsp_taghandler_9=(com.sun.faces.taglib.html_basic.GraphicImageTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.GraphicImageTag.class,"com.sun.faces.taglib.html_basic.GraphicImageTag url height styleClass width");
                    __jsp_taghandler_9.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_9.setUrl("/images/menus/fundo_bt_titulo2.gif");
                    __jsp_taghandler_9.setHeight("20");
                    __jsp_taghandler_9.setStyleClass("menu_subtitulo");
                    __jsp_taghandler_9.setWidth("60");
                    __jsp_tag_starteval=__jsp_taghandler_9.doStartTag();
                    if (__jsp_taghandler_9.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_9,4);
                  }
                  out.write(__oracle_jsp_text[12]);
                  {
                    com.sun.faces.taglib.html_basic.CommandLinkTag __jsp_taghandler_10=(com.sun.faces.taglib.html_basic.CommandLinkTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.CommandLinkTag.class,"com.sun.faces.taglib.html_basic.CommandLinkTag action");
                    __jsp_taghandler_10.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_10.setAction("#{CategoriaMB.createNew}");
                    __jsp_tag_starteval=__jsp_taghandler_10.doStartTag();
                    if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                    {
                      out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_10,__jsp_tag_starteval,out);
                      do {
                        out.write(__oracle_jsp_text[13]);
                        {
                          com.sun.faces.taglib.html_basic.OutputTextTag __jsp_taghandler_11=(com.sun.faces.taglib.html_basic.OutputTextTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.OutputTextTag.class,"com.sun.faces.taglib.html_basic.OutputTextTag value styleClass");
                          __jsp_taghandler_11.setParent(__jsp_taghandler_10);
                          __jsp_taghandler_11.setValue("Cadastrar Nova");
                          __jsp_taghandler_11.setStyleClass("menu_subtitulo");
                          __jsp_tag_starteval=__jsp_taghandler_11.doStartTag();
                          if (__jsp_taghandler_11.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_11,5);
                        }
                        out.write(__oracle_jsp_text[14]);
                      } while (__jsp_taghandler_10.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                    }
                    if (__jsp_taghandler_10.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_10,4);
                  }
                  out.write(__oracle_jsp_text[15]);
                  {
                    com.sun.faces.taglib.html_basic.GraphicImageTag __jsp_taghandler_12=(com.sun.faces.taglib.html_basic.GraphicImageTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.GraphicImageTag.class,"com.sun.faces.taglib.html_basic.GraphicImageTag url height styleClass width");
                    __jsp_taghandler_12.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_12.setUrl("/images/menus/fundo_bt_titulo2.gif");
                    __jsp_taghandler_12.setHeight("20");
                    __jsp_taghandler_12.setStyleClass("menu_subtitulo");
                    __jsp_taghandler_12.setWidth("60");
                    __jsp_tag_starteval=__jsp_taghandler_12.doStartTag();
                    if (__jsp_taghandler_12.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_12,4);
                  }
                  out.write(__oracle_jsp_text[16]);
                  {
                    com.sun.faces.taglib.html_basic.OutputTextTag __jsp_taghandler_13=(com.sun.faces.taglib.html_basic.OutputTextTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.OutputTextTag.class,"com.sun.faces.taglib.html_basic.OutputTextTag value styleClass");
                    __jsp_taghandler_13.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_13.setValue("Produtos");
                    __jsp_taghandler_13.setStyleClass("menu_titulo");
                    __jsp_tag_starteval=__jsp_taghandler_13.doStartTag();
                    if (__jsp_taghandler_13.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_13,4);
                  }
                  out.write(__oracle_jsp_text[17]);
                  {
                    com.sun.faces.taglib.html_basic.GraphicImageTag __jsp_taghandler_14=(com.sun.faces.taglib.html_basic.GraphicImageTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.GraphicImageTag.class,"com.sun.faces.taglib.html_basic.GraphicImageTag url height styleClass width");
                    __jsp_taghandler_14.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_14.setUrl("/images/menus/fundo_bt_titulo2.gif");
                    __jsp_taghandler_14.setHeight("20");
                    __jsp_taghandler_14.setStyleClass("menu_titulo");
                    __jsp_taghandler_14.setWidth("60");
                    __jsp_tag_starteval=__jsp_taghandler_14.doStartTag();
                    if (__jsp_taghandler_14.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_14,4);
                  }
                  out.write(__oracle_jsp_text[18]);
                  {
                    com.sun.faces.taglib.html_basic.CommandLinkTag __jsp_taghandler_15=(com.sun.faces.taglib.html_basic.CommandLinkTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.CommandLinkTag.class,"com.sun.faces.taglib.html_basic.CommandLinkTag action");
                    __jsp_taghandler_15.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_15.setAction("#{ProdutoMB.viewAll}");
                    __jsp_tag_starteval=__jsp_taghandler_15.doStartTag();
                    if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                    {
                      out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_15,__jsp_tag_starteval,out);
                      do {
                        out.write(__oracle_jsp_text[19]);
                        {
                          com.sun.faces.taglib.html_basic.OutputTextTag __jsp_taghandler_16=(com.sun.faces.taglib.html_basic.OutputTextTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.OutputTextTag.class,"com.sun.faces.taglib.html_basic.OutputTextTag value styleClass");
                          __jsp_taghandler_16.setParent(__jsp_taghandler_15);
                          __jsp_taghandler_16.setValue("Visualizar Todos");
                          __jsp_taghandler_16.setStyleClass("menu_subtitulo");
                          __jsp_tag_starteval=__jsp_taghandler_16.doStartTag();
                          if (__jsp_taghandler_16.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_16,5);
                        }
                        out.write(__oracle_jsp_text[20]);
                      } while (__jsp_taghandler_15.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                    }
                    if (__jsp_taghandler_15.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_15,4);
                  }
                  out.write(__oracle_jsp_text[21]);
                  {
                    com.sun.faces.taglib.html_basic.GraphicImageTag __jsp_taghandler_17=(com.sun.faces.taglib.html_basic.GraphicImageTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.GraphicImageTag.class,"com.sun.faces.taglib.html_basic.GraphicImageTag url height styleClass width");
                    __jsp_taghandler_17.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_17.setUrl("/images/menus/fundo_bt_titulo2.gif");
                    __jsp_taghandler_17.setHeight("20");
                    __jsp_taghandler_17.setStyleClass("menu_subtitulo");
                    __jsp_taghandler_17.setWidth("60");
                    __jsp_tag_starteval=__jsp_taghandler_17.doStartTag();
                    if (__jsp_taghandler_17.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_17,4);
                  }
                  out.write(__oracle_jsp_text[22]);
                  {
                    com.sun.faces.taglib.html_basic.CommandLinkTag __jsp_taghandler_18=(com.sun.faces.taglib.html_basic.CommandLinkTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.CommandLinkTag.class,"com.sun.faces.taglib.html_basic.CommandLinkTag action");
                    __jsp_taghandler_18.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_18.setAction("#{ProdutoMB.createNew}");
                    __jsp_tag_starteval=__jsp_taghandler_18.doStartTag();
                    if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                    {
                      out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_18,__jsp_tag_starteval,out);
                      do {
                        out.write(__oracle_jsp_text[23]);
                        {
                          com.sun.faces.taglib.html_basic.OutputTextTag __jsp_taghandler_19=(com.sun.faces.taglib.html_basic.OutputTextTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.OutputTextTag.class,"com.sun.faces.taglib.html_basic.OutputTextTag value styleClass");
                          __jsp_taghandler_19.setParent(__jsp_taghandler_18);
                          __jsp_taghandler_19.setValue("Cadastrar Novo");
                          __jsp_taghandler_19.setStyleClass("menu_subtitulo");
                          __jsp_tag_starteval=__jsp_taghandler_19.doStartTag();
                          if (__jsp_taghandler_19.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_19,5);
                        }
                        out.write(__oracle_jsp_text[24]);
                      } while (__jsp_taghandler_18.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                    }
                    if (__jsp_taghandler_18.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_18,4);
                  }
                  out.write(__oracle_jsp_text[25]);
                  {
                    com.sun.faces.taglib.html_basic.GraphicImageTag __jsp_taghandler_20=(com.sun.faces.taglib.html_basic.GraphicImageTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.GraphicImageTag.class,"com.sun.faces.taglib.html_basic.GraphicImageTag url height styleClass width");
                    __jsp_taghandler_20.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_20.setUrl("/images/menus/fundo_bt_titulo2.gif");
                    __jsp_taghandler_20.setHeight("20");
                    __jsp_taghandler_20.setStyleClass("menu_subtitulo");
                    __jsp_taghandler_20.setWidth("60");
                    __jsp_tag_starteval=__jsp_taghandler_20.doStartTag();
                    if (__jsp_taghandler_20.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_20,4);
                  }
                  out.write(__oracle_jsp_text[26]);
                  {
                    com.sun.faces.taglib.html_basic.OutputTextTag __jsp_taghandler_21=(com.sun.faces.taglib.html_basic.OutputTextTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.OutputTextTag.class,"com.sun.faces.taglib.html_basic.OutputTextTag value styleClass");
                    __jsp_taghandler_21.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_21.setValue("Clientes");
                    __jsp_taghandler_21.setStyleClass("menu_titulo");
                    __jsp_tag_starteval=__jsp_taghandler_21.doStartTag();
                    if (__jsp_taghandler_21.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_21,4);
                  }
                  out.write(__oracle_jsp_text[27]);
                  {
                    com.sun.faces.taglib.html_basic.GraphicImageTag __jsp_taghandler_22=(com.sun.faces.taglib.html_basic.GraphicImageTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.GraphicImageTag.class,"com.sun.faces.taglib.html_basic.GraphicImageTag url height styleClass width");
                    __jsp_taghandler_22.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_22.setUrl("/images/menus/fundo_bt_titulo2.gif");
                    __jsp_taghandler_22.setHeight("20");
                    __jsp_taghandler_22.setStyleClass("menu_titulo");
                    __jsp_taghandler_22.setWidth("60");
                    __jsp_tag_starteval=__jsp_taghandler_22.doStartTag();
                    if (__jsp_taghandler_22.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_22,4);
                  }
                  out.write(__oracle_jsp_text[28]);
                  {
                    com.sun.faces.taglib.html_basic.CommandLinkTag __jsp_taghandler_23=(com.sun.faces.taglib.html_basic.CommandLinkTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.CommandLinkTag.class,"com.sun.faces.taglib.html_basic.CommandLinkTag action");
                    __jsp_taghandler_23.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_23.setAction("#{ClienteMB.viewAll}");
                    __jsp_tag_starteval=__jsp_taghandler_23.doStartTag();
                    if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                    {
                      out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_23,__jsp_tag_starteval,out);
                      do {
                        out.write(__oracle_jsp_text[29]);
                        {
                          com.sun.faces.taglib.html_basic.OutputTextTag __jsp_taghandler_24=(com.sun.faces.taglib.html_basic.OutputTextTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.OutputTextTag.class,"com.sun.faces.taglib.html_basic.OutputTextTag value styleClass");
                          __jsp_taghandler_24.setParent(__jsp_taghandler_23);
                          __jsp_taghandler_24.setValue("Visualizar Todos");
                          __jsp_taghandler_24.setStyleClass("menu_subtitulo");
                          __jsp_tag_starteval=__jsp_taghandler_24.doStartTag();
                          if (__jsp_taghandler_24.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_24,5);
                        }
                        out.write(__oracle_jsp_text[30]);
                      } while (__jsp_taghandler_23.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                    }
                    if (__jsp_taghandler_23.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_23,4);
                  }
                  out.write(__oracle_jsp_text[31]);
                  {
                    com.sun.faces.taglib.html_basic.GraphicImageTag __jsp_taghandler_25=(com.sun.faces.taglib.html_basic.GraphicImageTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.GraphicImageTag.class,"com.sun.faces.taglib.html_basic.GraphicImageTag url height styleClass width");
                    __jsp_taghandler_25.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_25.setUrl("/images/menus/fundo_bt_titulo2.gif");
                    __jsp_taghandler_25.setHeight("20");
                    __jsp_taghandler_25.setStyleClass("menu_subtitulo");
                    __jsp_taghandler_25.setWidth("60");
                    __jsp_tag_starteval=__jsp_taghandler_25.doStartTag();
                    if (__jsp_taghandler_25.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_25,4);
                  }
                  out.write(__oracle_jsp_text[32]);
                  {
                    com.sun.faces.taglib.html_basic.CommandLinkTag __jsp_taghandler_26=(com.sun.faces.taglib.html_basic.CommandLinkTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.CommandLinkTag.class,"com.sun.faces.taglib.html_basic.CommandLinkTag action");
                    __jsp_taghandler_26.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_26.setAction("#{ClienteMB.createNew}");
                    __jsp_tag_starteval=__jsp_taghandler_26.doStartTag();
                    if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                    {
                      out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_26,__jsp_tag_starteval,out);
                      do {
                        out.write(__oracle_jsp_text[33]);
                        {
                          com.sun.faces.taglib.html_basic.OutputTextTag __jsp_taghandler_27=(com.sun.faces.taglib.html_basic.OutputTextTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.OutputTextTag.class,"com.sun.faces.taglib.html_basic.OutputTextTag value styleClass");
                          __jsp_taghandler_27.setParent(__jsp_taghandler_26);
                          __jsp_taghandler_27.setValue("Cadastrar Novo");
                          __jsp_taghandler_27.setStyleClass("menu_subtitulo");
                          __jsp_tag_starteval=__jsp_taghandler_27.doStartTag();
                          if (__jsp_taghandler_27.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_27,5);
                        }
                        out.write(__oracle_jsp_text[34]);
                      } while (__jsp_taghandler_26.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                    }
                    if (__jsp_taghandler_26.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_26,4);
                  }
                  out.write(__oracle_jsp_text[35]);
                  {
                    com.sun.faces.taglib.html_basic.GraphicImageTag __jsp_taghandler_28=(com.sun.faces.taglib.html_basic.GraphicImageTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.GraphicImageTag.class,"com.sun.faces.taglib.html_basic.GraphicImageTag url height styleClass width");
                    __jsp_taghandler_28.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_28.setUrl("/images/menus/fundo_bt_titulo2.gif");
                    __jsp_taghandler_28.setHeight("20");
                    __jsp_taghandler_28.setStyleClass("menu_subtitulo");
                    __jsp_taghandler_28.setWidth("60");
                    __jsp_tag_starteval=__jsp_taghandler_28.doStartTag();
                    if (__jsp_taghandler_28.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_28,4);
                  }
                  out.write(__oracle_jsp_text[36]);
                  {
                    com.sun.faces.taglib.html_basic.OutputTextTag __jsp_taghandler_29=(com.sun.faces.taglib.html_basic.OutputTextTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.OutputTextTag.class,"com.sun.faces.taglib.html_basic.OutputTextTag value styleClass");
                    __jsp_taghandler_29.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_29.setValue("Pedidos");
                    __jsp_taghandler_29.setStyleClass("menu_titulo");
                    __jsp_tag_starteval=__jsp_taghandler_29.doStartTag();
                    if (__jsp_taghandler_29.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_29,4);
                  }
                  out.write(__oracle_jsp_text[37]);
                  {
                    com.sun.faces.taglib.html_basic.GraphicImageTag __jsp_taghandler_30=(com.sun.faces.taglib.html_basic.GraphicImageTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.GraphicImageTag.class,"com.sun.faces.taglib.html_basic.GraphicImageTag url height styleClass width");
                    __jsp_taghandler_30.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_30.setUrl("/images/menus/fundo_bt_titulo2.gif");
                    __jsp_taghandler_30.setHeight("20");
                    __jsp_taghandler_30.setStyleClass("menu_titulo");
                    __jsp_taghandler_30.setWidth("60");
                    __jsp_tag_starteval=__jsp_taghandler_30.doStartTag();
                    if (__jsp_taghandler_30.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_30,4);
                  }
                  out.write(__oracle_jsp_text[38]);
                  {
                    com.sun.faces.taglib.html_basic.CommandLinkTag __jsp_taghandler_31=(com.sun.faces.taglib.html_basic.CommandLinkTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.CommandLinkTag.class,"com.sun.faces.taglib.html_basic.CommandLinkTag action");
                    __jsp_taghandler_31.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_31.setAction("#{CatalogoMB.viewAll}");
                    __jsp_tag_starteval=__jsp_taghandler_31.doStartTag();
                    if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                    {
                      out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_31,__jsp_tag_starteval,out);
                      do {
                        out.write(__oracle_jsp_text[39]);
                        {
                          com.sun.faces.taglib.html_basic.OutputTextTag __jsp_taghandler_32=(com.sun.faces.taglib.html_basic.OutputTextTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.OutputTextTag.class,"com.sun.faces.taglib.html_basic.OutputTextTag value escape styleClass");
                          __jsp_taghandler_32.setParent(__jsp_taghandler_31);
                          __jsp_taghandler_32.setValue("Cat&aacute;logo de Produtos");
                          __jsp_taghandler_32.setEscape("false");
                          __jsp_taghandler_32.setStyleClass("menu_subtitulo");
                          __jsp_tag_starteval=__jsp_taghandler_32.doStartTag();
                          if (__jsp_taghandler_32.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_32,5);
                        }
                        out.write(__oracle_jsp_text[40]);
                      } while (__jsp_taghandler_31.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                    }
                    if (__jsp_taghandler_31.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_31,4);
                  }
                  out.write(__oracle_jsp_text[41]);
                  {
                    com.sun.faces.taglib.html_basic.GraphicImageTag __jsp_taghandler_33=(com.sun.faces.taglib.html_basic.GraphicImageTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.GraphicImageTag.class,"com.sun.faces.taglib.html_basic.GraphicImageTag url height styleClass width");
                    __jsp_taghandler_33.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_33.setUrl("/images/menus/fundo_bt_titulo2.gif");
                    __jsp_taghandler_33.setHeight("20");
                    __jsp_taghandler_33.setStyleClass("menu_subtitulo");
                    __jsp_taghandler_33.setWidth("60");
                    __jsp_tag_starteval=__jsp_taghandler_33.doStartTag();
                    if (__jsp_taghandler_33.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_33,4);
                  }
                  out.write(__oracle_jsp_text[42]);
                  {
                    com.sun.faces.taglib.html_basic.CommandLinkTag __jsp_taghandler_34=(com.sun.faces.taglib.html_basic.CommandLinkTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.CommandLinkTag.class,"com.sun.faces.taglib.html_basic.CommandLinkTag action");
                    __jsp_taghandler_34.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_34.setAction("#{CatalogoMB.buscar}");
                    __jsp_tag_starteval=__jsp_taghandler_34.doStartTag();
                    if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                    {
                      out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_34,__jsp_tag_starteval,out);
                      do {
                        out.write(__oracle_jsp_text[43]);
                        {
                          com.sun.faces.taglib.html_basic.OutputTextTag __jsp_taghandler_35=(com.sun.faces.taglib.html_basic.OutputTextTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.OutputTextTag.class,"com.sun.faces.taglib.html_basic.OutputTextTag value escape styleClass");
                          __jsp_taghandler_35.setParent(__jsp_taghandler_34);
                          __jsp_taghandler_35.setValue("Listar Pedidos");
                          __jsp_taghandler_35.setEscape("false");
                          __jsp_taghandler_35.setStyleClass("menu_subtitulo");
                          __jsp_tag_starteval=__jsp_taghandler_35.doStartTag();
                          if (__jsp_taghandler_35.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_35,5);
                        }
                        out.write(__oracle_jsp_text[44]);
                      } while (__jsp_taghandler_34.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                    }
                    if (__jsp_taghandler_34.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_34,4);
                  }
                  out.write(__oracle_jsp_text[45]);
                  {
                    com.sun.faces.taglib.html_basic.GraphicImageTag __jsp_taghandler_36=(com.sun.faces.taglib.html_basic.GraphicImageTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.GraphicImageTag.class,"com.sun.faces.taglib.html_basic.GraphicImageTag url height styleClass width");
                    __jsp_taghandler_36.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_36.setUrl("/images/menus/fundo_bt_titulo2.gif");
                    __jsp_taghandler_36.setHeight("20");
                    __jsp_taghandler_36.setStyleClass("menu_subtitulo");
                    __jsp_taghandler_36.setWidth("60");
                    __jsp_tag_starteval=__jsp_taghandler_36.doStartTag();
                    if (__jsp_taghandler_36.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_36,4);
                  }
                  out.write(__oracle_jsp_text[46]);
                  {
                    com.sun.faces.taglib.html_basic.OutputTextTag __jsp_taghandler_37=(com.sun.faces.taglib.html_basic.OutputTextTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.OutputTextTag.class,"com.sun.faces.taglib.html_basic.OutputTextTag value escape styleClass");
                    __jsp_taghandler_37.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_37.setValue("Relat&oacute;rios");
                    __jsp_taghandler_37.setEscape("false");
                    __jsp_taghandler_37.setStyleClass("menu_titulo");
                    __jsp_tag_starteval=__jsp_taghandler_37.doStartTag();
                    if (__jsp_taghandler_37.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_37,4);
                  }
                  out.write(__oracle_jsp_text[47]);
                  {
                    com.sun.faces.taglib.html_basic.GraphicImageTag __jsp_taghandler_38=(com.sun.faces.taglib.html_basic.GraphicImageTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.GraphicImageTag.class,"com.sun.faces.taglib.html_basic.GraphicImageTag url height styleClass width");
                    __jsp_taghandler_38.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_38.setUrl("/images/menus/fundo_bt_titulo2.gif");
                    __jsp_taghandler_38.setHeight("20");
                    __jsp_taghandler_38.setStyleClass("menu_titulo");
                    __jsp_taghandler_38.setWidth("60");
                    __jsp_tag_starteval=__jsp_taghandler_38.doStartTag();
                    if (__jsp_taghandler_38.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_38,4);
                  }
                  out.write(__oracle_jsp_text[48]);
                  {
                    com.sun.faces.taglib.html_basic.CommandLinkTag __jsp_taghandler_39=(com.sun.faces.taglib.html_basic.CommandLinkTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.CommandLinkTag.class,"com.sun.faces.taglib.html_basic.CommandLinkTag action");
                    __jsp_taghandler_39.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_39.setAction("#{RelatorioProdutosMB.gerar}");
                    __jsp_tag_starteval=__jsp_taghandler_39.doStartTag();
                    if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                    {
                      out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_39,__jsp_tag_starteval,out);
                      do {
                        out.write(__oracle_jsp_text[49]);
                        {
                          com.sun.faces.taglib.html_basic.OutputTextTag __jsp_taghandler_40=(com.sun.faces.taglib.html_basic.OutputTextTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.OutputTextTag.class,"com.sun.faces.taglib.html_basic.OutputTextTag value escape styleClass");
                          __jsp_taghandler_40.setParent(__jsp_taghandler_39);
                          __jsp_taghandler_40.setValue("Relat&oacute;rio de Produtos");
                          __jsp_taghandler_40.setEscape("false");
                          __jsp_taghandler_40.setStyleClass("menu_subtitulo");
                          __jsp_tag_starteval=__jsp_taghandler_40.doStartTag();
                          if (__jsp_taghandler_40.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_40,5);
                        }
                        out.write(__oracle_jsp_text[50]);
                      } while (__jsp_taghandler_39.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                    }
                    if (__jsp_taghandler_39.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_39,4);
                  }
                  out.write(__oracle_jsp_text[51]);
                  {
                    com.sun.faces.taglib.html_basic.GraphicImageTag __jsp_taghandler_41=(com.sun.faces.taglib.html_basic.GraphicImageTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.GraphicImageTag.class,"com.sun.faces.taglib.html_basic.GraphicImageTag url height styleClass width");
                    __jsp_taghandler_41.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_41.setUrl("/images/menus/fundo_bt_titulo2.gif");
                    __jsp_taghandler_41.setHeight("20");
                    __jsp_taghandler_41.setStyleClass("menu_subtitulo");
                    __jsp_taghandler_41.setWidth("60");
                    __jsp_tag_starteval=__jsp_taghandler_41.doStartTag();
                    if (__jsp_taghandler_41.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_41,4);
                  }
                  out.write(__oracle_jsp_text[52]);
                  {
                    com.sun.faces.taglib.html_basic.CommandLinkTag __jsp_taghandler_42=(com.sun.faces.taglib.html_basic.CommandLinkTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.CommandLinkTag.class,"com.sun.faces.taglib.html_basic.CommandLinkTag action");
                    __jsp_taghandler_42.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_42.setAction("#{RelatorioVendasPorMarcaMB.buscar}");
                    __jsp_tag_starteval=__jsp_taghandler_42.doStartTag();
                    if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                    {
                      out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_42,__jsp_tag_starteval,out);
                      do {
                        out.write(__oracle_jsp_text[53]);
                        {
                          com.sun.faces.taglib.html_basic.OutputTextTag __jsp_taghandler_43=(com.sun.faces.taglib.html_basic.OutputTextTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.OutputTextTag.class,"com.sun.faces.taglib.html_basic.OutputTextTag value escape styleClass");
                          __jsp_taghandler_43.setParent(__jsp_taghandler_42);
                          __jsp_taghandler_43.setValue("Relat&oacute;rio de Vendas");
                          __jsp_taghandler_43.setEscape("false");
                          __jsp_taghandler_43.setStyleClass("menu_subtitulo");
                          __jsp_tag_starteval=__jsp_taghandler_43.doStartTag();
                          if (__jsp_taghandler_43.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_43,5);
                        }
                        out.write(__oracle_jsp_text[54]);
                      } while (__jsp_taghandler_42.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                    }
                    if (__jsp_taghandler_42.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_42,4);
                  }
                  out.write(__oracle_jsp_text[55]);
                  {
                    com.sun.faces.taglib.html_basic.GraphicImageTag __jsp_taghandler_44=(com.sun.faces.taglib.html_basic.GraphicImageTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.GraphicImageTag.class,"com.sun.faces.taglib.html_basic.GraphicImageTag url height styleClass width");
                    __jsp_taghandler_44.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_44.setUrl("/images/menus/fundo_bt_titulo2.gif");
                    __jsp_taghandler_44.setHeight("20");
                    __jsp_taghandler_44.setStyleClass("menu_subtitulo");
                    __jsp_taghandler_44.setWidth("60");
                    __jsp_tag_starteval=__jsp_taghandler_44.doStartTag();
                    if (__jsp_taghandler_44.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_44,4);
                  }
                  out.write(__oracle_jsp_text[56]);
                  {
                    com.sun.faces.taglib.html_basic.OutputTextTag __jsp_taghandler_45=(com.sun.faces.taglib.html_basic.OutputTextTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.OutputTextTag.class,"com.sun.faces.taglib.html_basic.OutputTextTag value escape styleClass");
                    __jsp_taghandler_45.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_45.setValue("Gr&aacute;ficos");
                    __jsp_taghandler_45.setEscape("false");
                    __jsp_taghandler_45.setStyleClass("menu_titulo");
                    __jsp_tag_starteval=__jsp_taghandler_45.doStartTag();
                    if (__jsp_taghandler_45.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_45,4);
                  }
                  out.write(__oracle_jsp_text[57]);
                  {
                    com.sun.faces.taglib.html_basic.GraphicImageTag __jsp_taghandler_46=(com.sun.faces.taglib.html_basic.GraphicImageTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.GraphicImageTag.class,"com.sun.faces.taglib.html_basic.GraphicImageTag url height styleClass width");
                    __jsp_taghandler_46.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_46.setUrl("/images/menus/fundo_bt_titulo2.gif");
                    __jsp_taghandler_46.setHeight("20");
                    __jsp_taghandler_46.setStyleClass("menu_titulo");
                    __jsp_taghandler_46.setWidth("60");
                    __jsp_tag_starteval=__jsp_taghandler_46.doStartTag();
                    if (__jsp_taghandler_46.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_46,4);
                  }
                  out.write(__oracle_jsp_text[58]);
                  {
                    com.sun.faces.taglib.html_basic.CommandLinkTag __jsp_taghandler_47=(com.sun.faces.taglib.html_basic.CommandLinkTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.CommandLinkTag.class,"com.sun.faces.taglib.html_basic.CommandLinkTag action");
                    __jsp_taghandler_47.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_47.setAction("#{GraficoVendasPorMarcaMB.buscar}");
                    __jsp_tag_starteval=__jsp_taghandler_47.doStartTag();
                    if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                    {
                      out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_47,__jsp_tag_starteval,out);
                      do {
                        out.write(__oracle_jsp_text[59]);
                        {
                          com.sun.faces.taglib.html_basic.OutputTextTag __jsp_taghandler_48=(com.sun.faces.taglib.html_basic.OutputTextTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.OutputTextTag.class,"com.sun.faces.taglib.html_basic.OutputTextTag value escape styleClass");
                          __jsp_taghandler_48.setParent(__jsp_taghandler_47);
                          __jsp_taghandler_48.setValue("Gr&aacute;fico de Vendas por Marca");
                          __jsp_taghandler_48.setEscape("false");
                          __jsp_taghandler_48.setStyleClass("menu_subtitulo");
                          __jsp_tag_starteval=__jsp_taghandler_48.doStartTag();
                          if (__jsp_taghandler_48.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_48,5);
                        }
                        out.write(__oracle_jsp_text[60]);
                      } while (__jsp_taghandler_47.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                    }
                    if (__jsp_taghandler_47.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_47,4);
                  }
                  out.write(__oracle_jsp_text[61]);
                  {
                    com.sun.faces.taglib.html_basic.GraphicImageTag __jsp_taghandler_49=(com.sun.faces.taglib.html_basic.GraphicImageTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.GraphicImageTag.class,"com.sun.faces.taglib.html_basic.GraphicImageTag url height styleClass width");
                    __jsp_taghandler_49.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_49.setUrl("/images/menus/fundo_bt_titulo2.gif");
                    __jsp_taghandler_49.setHeight("20");
                    __jsp_taghandler_49.setStyleClass("menu_subtitulo");
                    __jsp_taghandler_49.setWidth("60");
                    __jsp_tag_starteval=__jsp_taghandler_49.doStartTag();
                    if (__jsp_taghandler_49.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_49,4);
                  }
                  out.write(__oracle_jsp_text[62]);
                }
                if (__jsp_taghandler_4.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_4,3);
              }
              out.write(__oracle_jsp_text[63]);
            }
            if (__jsp_taghandler_2.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
              return;
            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_2,2);
          }
          out.write(__oracle_jsp_text[64]);
        }
        if (__jsp_taghandler_1.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_1,1);
      }
      out.write(__oracle_jsp_text[65]);


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
  private static final char __oracle_jsp_text[][]=new char[66][];
  static {
    try {
    __oracle_jsp_text[0] = 
    "\n".toCharArray();
    __oracle_jsp_text[1] = 
    "\n".toCharArray();
    __oracle_jsp_text[2] = 
    "\n".toCharArray();
    __oracle_jsp_text[3] = 
    "\n ".toCharArray();
    __oracle_jsp_text[4] = 
    "\n    ".toCharArray();
    __oracle_jsp_text[5] = 
    "\n    ".toCharArray();
    __oracle_jsp_text[6] = 
    "\n        <!-- Categoria -->\n        ".toCharArray();
    __oracle_jsp_text[7] = 
    "\n        ".toCharArray();
    __oracle_jsp_text[8] = 
    "\n        ".toCharArray();
    __oracle_jsp_text[9] = 
    "\n            ".toCharArray();
    __oracle_jsp_text[10] = 
    "\n        ".toCharArray();
    __oracle_jsp_text[11] = 
    "\n        ".toCharArray();
    __oracle_jsp_text[12] = 
    "\n        ".toCharArray();
    __oracle_jsp_text[13] = 
    "\n            ".toCharArray();
    __oracle_jsp_text[14] = 
    "\n        ".toCharArray();
    __oracle_jsp_text[15] = 
    "\n        ".toCharArray();
    __oracle_jsp_text[16] = 
    "\n        <!-- Produtos -->\n        ".toCharArray();
    __oracle_jsp_text[17] = 
    "\n        ".toCharArray();
    __oracle_jsp_text[18] = 
    "\n        ".toCharArray();
    __oracle_jsp_text[19] = 
    "\n            ".toCharArray();
    __oracle_jsp_text[20] = 
    "\n        ".toCharArray();
    __oracle_jsp_text[21] = 
    "\n        ".toCharArray();
    __oracle_jsp_text[22] = 
    "\n        ".toCharArray();
    __oracle_jsp_text[23] = 
    "\n            ".toCharArray();
    __oracle_jsp_text[24] = 
    "\n        ".toCharArray();
    __oracle_jsp_text[25] = 
    "\n        ".toCharArray();
    __oracle_jsp_text[26] = 
    "\n        <!-- Clientes -->\n        ".toCharArray();
    __oracle_jsp_text[27] = 
    "\n        ".toCharArray();
    __oracle_jsp_text[28] = 
    "\n        ".toCharArray();
    __oracle_jsp_text[29] = 
    "\n            ".toCharArray();
    __oracle_jsp_text[30] = 
    "\n        ".toCharArray();
    __oracle_jsp_text[31] = 
    "\n        ".toCharArray();
    __oracle_jsp_text[32] = 
    "\n        ".toCharArray();
    __oracle_jsp_text[33] = 
    "\n            ".toCharArray();
    __oracle_jsp_text[34] = 
    "\n        ".toCharArray();
    __oracle_jsp_text[35] = 
    "\n        ".toCharArray();
    __oracle_jsp_text[36] = 
    "\n        <!-- Pedidos -->   \n        ".toCharArray();
    __oracle_jsp_text[37] = 
    "\n        ".toCharArray();
    __oracle_jsp_text[38] = 
    "\n        ".toCharArray();
    __oracle_jsp_text[39] = 
    "\n            ".toCharArray();
    __oracle_jsp_text[40] = 
    "\n        ".toCharArray();
    __oracle_jsp_text[41] = 
    "\n        ".toCharArray();
    __oracle_jsp_text[42] = 
    "\n        ".toCharArray();
    __oracle_jsp_text[43] = 
    "\n            ".toCharArray();
    __oracle_jsp_text[44] = 
    "\n        ".toCharArray();
    __oracle_jsp_text[45] = 
    "\n        ".toCharArray();
    __oracle_jsp_text[46] = 
    "\n      \n        <!-- Relatórios -->   \n        ".toCharArray();
    __oracle_jsp_text[47] = 
    "\n        ".toCharArray();
    __oracle_jsp_text[48] = 
    "\n        ".toCharArray();
    __oracle_jsp_text[49] = 
    "\n            ".toCharArray();
    __oracle_jsp_text[50] = 
    "\n        ".toCharArray();
    __oracle_jsp_text[51] = 
    "\n        ".toCharArray();
    __oracle_jsp_text[52] = 
    "\n        ".toCharArray();
    __oracle_jsp_text[53] = 
    "\n            ".toCharArray();
    __oracle_jsp_text[54] = 
    "\n        ".toCharArray();
    __oracle_jsp_text[55] = 
    "\n        \n        ".toCharArray();
    __oracle_jsp_text[56] = 
    "\n      \n        <!-- Gráficos -->   \n        ".toCharArray();
    __oracle_jsp_text[57] = 
    "\n        ".toCharArray();
    __oracle_jsp_text[58] = 
    "\n        ".toCharArray();
    __oracle_jsp_text[59] = 
    "\n            ".toCharArray();
    __oracle_jsp_text[60] = 
    "\n        ".toCharArray();
    __oracle_jsp_text[61] = 
    "\n        ".toCharArray();
    __oracle_jsp_text[62] = 
    "\n\n    ".toCharArray();
    __oracle_jsp_text[63] = 
    "\n    ".toCharArray();
    __oracle_jsp_text[64] = 
    "\n".toCharArray();
    __oracle_jsp_text[65] = 
    "\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
