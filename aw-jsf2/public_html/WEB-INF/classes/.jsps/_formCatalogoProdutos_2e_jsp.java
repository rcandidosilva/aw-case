
import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _formCatalogoProdutos_2e_jsp extends com.orionserver.http.OrionHttpJspPage {


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
    _formCatalogoProdutos_2e_jsp page = this;
    ServletConfig config = pageContext.getServletConfig();
    javax.servlet.jsp.el.VariableResolver __ojsp_varRes = (VariableResolver)new OracleVariableResolverImpl(pageContext);

    try {


      out.write(__oracle_jsp_text[0]);
      out.write(__oracle_jsp_text[1]);
      {
        com.sun.faces.taglib.jsf_core.SubviewTag __jsp_taghandler_1=(com.sun.faces.taglib.jsf_core.SubviewTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.jsf_core.SubviewTag.class,"com.sun.faces.taglib.jsf_core.SubviewTag id");
        __jsp_taghandler_1.setParent(null);
        __jsp_taghandler_1.setId("catalogoProdutos");
        __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
        {
          out.write(__oracle_jsp_text[2]);
          {
            com.sun.faces.taglib.html_basic.FormTag __jsp_taghandler_2=(com.sun.faces.taglib.html_basic.FormTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.FormTag.class,"com.sun.faces.taglib.html_basic.FormTag");
            __jsp_taghandler_2.setParent(__jsp_taghandler_1);
            __jsp_tag_starteval=__jsp_taghandler_2.doStartTag();
            if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
            {
              out.write(__oracle_jsp_text[3]);
              {
                com.sun.faces.taglib.html_basic.PanelGridTag __jsp_taghandler_3=(com.sun.faces.taglib.html_basic.PanelGridTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.PanelGridTag.class,"com.sun.faces.taglib.html_basic.PanelGridTag columns styleClass");
                __jsp_taghandler_3.setParent(__jsp_taghandler_2);
                __jsp_taghandler_3.setColumns("1");
                __jsp_taghandler_3.setStyleClass("tabelaJSF");
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
                          com.sun.faces.taglib.html_basic.GraphicImageTag __jsp_taghandler_5=(com.sun.faces.taglib.html_basic.GraphicImageTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.GraphicImageTag.class,"com.sun.faces.taglib.html_basic.GraphicImageTag url height width");
                          __jsp_taghandler_5.setParent(__jsp_taghandler_4);
                          __jsp_taghandler_5.setUrl("images/titulos/catalogoProdutos.gif");
                          __jsp_taghandler_5.setHeight("30");
                          __jsp_taghandler_5.setWidth("350");
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
                    com.sun.faces.taglib.html_basic.DataTableTag __jsp_taghandler_6=(com.sun.faces.taglib.html_basic.DataTableTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.DataTableTag.class,"com.sun.faces.taglib.html_basic.DataTableTag value var cellpadding cellspacing headerClass rowClasses width");
                    __jsp_taghandler_6.setParent(__jsp_taghandler_3);
                    __jsp_taghandler_6.setValue("#{CatalogoMB.catalogoProdutos}");
                    __jsp_taghandler_6.setVar("produto");
                    __jsp_taghandler_6.setCellpadding("2");
                    __jsp_taghandler_6.setCellspacing("2");
                    __jsp_taghandler_6.setHeaderClass("tabela_subtitulo");
                    __jsp_taghandler_6.setRowClasses("linhaCatalogo");
                    __jsp_taghandler_6.setWidth("100%");
                    __jsp_tag_starteval=__jsp_taghandler_6.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      out.write(__oracle_jsp_text[8]);
                      {
                        com.sun.faces.taglib.html_basic.ColumnTag __jsp_taghandler_7=(com.sun.faces.taglib.html_basic.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.ColumnTag.class,"com.sun.faces.taglib.html_basic.ColumnTag");
                        __jsp_taghandler_7.setParent(__jsp_taghandler_6);
                        __jsp_tag_starteval=__jsp_taghandler_7.doStartTag();
                        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                        {
                          out.write(__oracle_jsp_text[9]);
                          {
                            javax.faces.webapp.FacetTag __jsp_taghandler_8=(javax.faces.webapp.FacetTag)OracleJspRuntime.getTagHandler(pageContext,javax.faces.webapp.FacetTag.class,"javax.faces.webapp.FacetTag name");
                            __jsp_taghandler_8.setParent(__jsp_taghandler_7);
                            __jsp_taghandler_8.setName("header");
                            __jsp_tag_starteval=__jsp_taghandler_8.doStartTag();
                            if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                            {
                              do {
                                out.write(__oracle_jsp_text[10]);
                                {
                                  com.sun.faces.taglib.html_basic.OutputTextTag __jsp_taghandler_9=(com.sun.faces.taglib.html_basic.OutputTextTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.OutputTextTag.class,"com.sun.faces.taglib.html_basic.OutputTextTag value");
                                  __jsp_taghandler_9.setParent(__jsp_taghandler_8);
                                  __jsp_taghandler_9.setValue("Id");
                                  __jsp_tag_starteval=__jsp_taghandler_9.doStartTag();
                                  if (__jsp_taghandler_9.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                    return;
                                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_9,7);
                                }
                                out.write(__oracle_jsp_text[11]);
                              } while (__jsp_taghandler_8.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            }
                            if (__jsp_taghandler_8.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                              return;
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_8,6);
                          }
                          out.write(__oracle_jsp_text[12]);
                          {
                            com.sun.faces.taglib.html_basic.OutputTextTag __jsp_taghandler_10=(com.sun.faces.taglib.html_basic.OutputTextTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.OutputTextTag.class,"com.sun.faces.taglib.html_basic.OutputTextTag value");
                            __jsp_taghandler_10.setParent(__jsp_taghandler_7);
                            __jsp_taghandler_10.setValue("#{produto.id}");
                            __jsp_tag_starteval=__jsp_taghandler_10.doStartTag();
                            if (__jsp_taghandler_10.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                              return;
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_10,6);
                          }
                          out.write(__oracle_jsp_text[13]);
                        }
                        if (__jsp_taghandler_7.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_7,5);
                      }
                      out.write(__oracle_jsp_text[14]);
                      {
                        com.sun.faces.taglib.html_basic.ColumnTag __jsp_taghandler_11=(com.sun.faces.taglib.html_basic.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.ColumnTag.class,"com.sun.faces.taglib.html_basic.ColumnTag");
                        __jsp_taghandler_11.setParent(__jsp_taghandler_6);
                        __jsp_tag_starteval=__jsp_taghandler_11.doStartTag();
                        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                        {
                          out.write(__oracle_jsp_text[15]);
                          {
                            javax.faces.webapp.FacetTag __jsp_taghandler_12=(javax.faces.webapp.FacetTag)OracleJspRuntime.getTagHandler(pageContext,javax.faces.webapp.FacetTag.class,"javax.faces.webapp.FacetTag name");
                            __jsp_taghandler_12.setParent(__jsp_taghandler_11);
                            __jsp_taghandler_12.setName("header");
                            __jsp_tag_starteval=__jsp_taghandler_12.doStartTag();
                            if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                            {
                              do {
                                out.write(__oracle_jsp_text[16]);
                                {
                                  com.sun.faces.taglib.html_basic.OutputTextTag __jsp_taghandler_13=(com.sun.faces.taglib.html_basic.OutputTextTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.OutputTextTag.class,"com.sun.faces.taglib.html_basic.OutputTextTag value");
                                  __jsp_taghandler_13.setParent(__jsp_taghandler_12);
                                  __jsp_taghandler_13.setValue("Nome");
                                  __jsp_tag_starteval=__jsp_taghandler_13.doStartTag();
                                  if (__jsp_taghandler_13.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                    return;
                                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_13,7);
                                }
                                out.write(__oracle_jsp_text[17]);
                              } while (__jsp_taghandler_12.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            }
                            if (__jsp_taghandler_12.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                              return;
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_12,6);
                          }
                          out.write(__oracle_jsp_text[18]);
                          {
                            com.sun.faces.taglib.html_basic.OutputTextTag __jsp_taghandler_14=(com.sun.faces.taglib.html_basic.OutputTextTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.OutputTextTag.class,"com.sun.faces.taglib.html_basic.OutputTextTag value");
                            __jsp_taghandler_14.setParent(__jsp_taghandler_11);
                            __jsp_taghandler_14.setValue("#{produto.nome}");
                            __jsp_tag_starteval=__jsp_taghandler_14.doStartTag();
                            if (__jsp_taghandler_14.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                              return;
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_14,6);
                          }
                          out.write(__oracle_jsp_text[19]);
                        }
                        if (__jsp_taghandler_11.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_11,5);
                      }
                      out.write(__oracle_jsp_text[20]);
                      {
                        com.sun.faces.taglib.html_basic.ColumnTag __jsp_taghandler_15=(com.sun.faces.taglib.html_basic.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.ColumnTag.class,"com.sun.faces.taglib.html_basic.ColumnTag");
                        __jsp_taghandler_15.setParent(__jsp_taghandler_6);
                        __jsp_tag_starteval=__jsp_taghandler_15.doStartTag();
                        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                        {
                          out.write(__oracle_jsp_text[21]);
                          {
                            javax.faces.webapp.FacetTag __jsp_taghandler_16=(javax.faces.webapp.FacetTag)OracleJspRuntime.getTagHandler(pageContext,javax.faces.webapp.FacetTag.class,"javax.faces.webapp.FacetTag name");
                            __jsp_taghandler_16.setParent(__jsp_taghandler_15);
                            __jsp_taghandler_16.setName("header");
                            __jsp_tag_starteval=__jsp_taghandler_16.doStartTag();
                            if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                            {
                              do {
                                out.write(__oracle_jsp_text[22]);
                                {
                                  com.sun.faces.taglib.html_basic.OutputTextTag __jsp_taghandler_17=(com.sun.faces.taglib.html_basic.OutputTextTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.OutputTextTag.class,"com.sun.faces.taglib.html_basic.OutputTextTag value");
                                  __jsp_taghandler_17.setParent(__jsp_taghandler_16);
                                  __jsp_taghandler_17.setValue("Categoria");
                                  __jsp_tag_starteval=__jsp_taghandler_17.doStartTag();
                                  if (__jsp_taghandler_17.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                    return;
                                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_17,7);
                                }
                                out.write(__oracle_jsp_text[23]);
                              } while (__jsp_taghandler_16.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            }
                            if (__jsp_taghandler_16.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                              return;
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_16,6);
                          }
                          out.write(__oracle_jsp_text[24]);
                          {
                            com.sun.faces.taglib.html_basic.OutputTextTag __jsp_taghandler_18=(com.sun.faces.taglib.html_basic.OutputTextTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.OutputTextTag.class,"com.sun.faces.taglib.html_basic.OutputTextTag value");
                            __jsp_taghandler_18.setParent(__jsp_taghandler_15);
                            __jsp_taghandler_18.setValue("#{produto.categoria}");
                            __jsp_tag_starteval=__jsp_taghandler_18.doStartTag();
                            if (__jsp_taghandler_18.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                              return;
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_18,6);
                          }
                          out.write(__oracle_jsp_text[25]);
                        }
                        if (__jsp_taghandler_15.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_15,5);
                      }
                      out.write(__oracle_jsp_text[26]);
                      {
                        com.sun.faces.taglib.html_basic.ColumnTag __jsp_taghandler_19=(com.sun.faces.taglib.html_basic.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.ColumnTag.class,"com.sun.faces.taglib.html_basic.ColumnTag");
                        __jsp_taghandler_19.setParent(__jsp_taghandler_6);
                        __jsp_tag_starteval=__jsp_taghandler_19.doStartTag();
                        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                        {
                          out.write(__oracle_jsp_text[27]);
                          {
                            javax.faces.webapp.FacetTag __jsp_taghandler_20=(javax.faces.webapp.FacetTag)OracleJspRuntime.getTagHandler(pageContext,javax.faces.webapp.FacetTag.class,"javax.faces.webapp.FacetTag name");
                            __jsp_taghandler_20.setParent(__jsp_taghandler_19);
                            __jsp_taghandler_20.setName("header");
                            __jsp_tag_starteval=__jsp_taghandler_20.doStartTag();
                            if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                            {
                              do {
                                out.write(__oracle_jsp_text[28]);
                                {
                                  com.sun.faces.taglib.html_basic.OutputTextTag __jsp_taghandler_21=(com.sun.faces.taglib.html_basic.OutputTextTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.OutputTextTag.class,"com.sun.faces.taglib.html_basic.OutputTextTag value escape");
                                  __jsp_taghandler_21.setParent(__jsp_taghandler_20);
                                  __jsp_taghandler_21.setValue("Pre&ccedil;o");
                                  __jsp_taghandler_21.setEscape("false");
                                  __jsp_tag_starteval=__jsp_taghandler_21.doStartTag();
                                  if (__jsp_taghandler_21.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                    return;
                                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_21,7);
                                }
                                out.write(__oracle_jsp_text[29]);
                              } while (__jsp_taghandler_20.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            }
                            if (__jsp_taghandler_20.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                              return;
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_20,6);
                          }
                          out.write(__oracle_jsp_text[30]);
                          {
                            com.sun.faces.taglib.html_basic.OutputTextTag __jsp_taghandler_22=(com.sun.faces.taglib.html_basic.OutputTextTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.OutputTextTag.class,"com.sun.faces.taglib.html_basic.OutputTextTag value");
                            __jsp_taghandler_22.setParent(__jsp_taghandler_19);
                            __jsp_taghandler_22.setValue("#{produto.preco}");
                            __jsp_tag_starteval=__jsp_taghandler_22.doStartTag();
                            if (__jsp_taghandler_22.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                              return;
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_22,6);
                          }
                          out.write(__oracle_jsp_text[31]);
                        }
                        if (__jsp_taghandler_19.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_19,5);
                      }
                      out.write(__oracle_jsp_text[32]);
                      {
                        com.sun.faces.taglib.html_basic.ColumnTag __jsp_taghandler_23=(com.sun.faces.taglib.html_basic.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.ColumnTag.class,"com.sun.faces.taglib.html_basic.ColumnTag");
                        __jsp_taghandler_23.setParent(__jsp_taghandler_6);
                        __jsp_tag_starteval=__jsp_taghandler_23.doStartTag();
                        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                        {
                          out.write(__oracle_jsp_text[33]);
                          {
                            javax.faces.webapp.FacetTag __jsp_taghandler_24=(javax.faces.webapp.FacetTag)OracleJspRuntime.getTagHandler(pageContext,javax.faces.webapp.FacetTag.class,"javax.faces.webapp.FacetTag name");
                            __jsp_taghandler_24.setParent(__jsp_taghandler_23);
                            __jsp_taghandler_24.setName("header");
                            __jsp_tag_starteval=__jsp_taghandler_24.doStartTag();
                            if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                            {
                              do {
                                out.write(__oracle_jsp_text[34]);
                                {
                                  com.sun.faces.taglib.html_basic.OutputTextTag __jsp_taghandler_25=(com.sun.faces.taglib.html_basic.OutputTextTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.OutputTextTag.class,"com.sun.faces.taglib.html_basic.OutputTextTag value");
                                  __jsp_taghandler_25.setParent(__jsp_taghandler_24);
                                  __jsp_taghandler_25.setValue("Marca");
                                  __jsp_tag_starteval=__jsp_taghandler_25.doStartTag();
                                  if (__jsp_taghandler_25.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                    return;
                                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_25,7);
                                }
                                out.write(__oracle_jsp_text[35]);
                              } while (__jsp_taghandler_24.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            }
                            if (__jsp_taghandler_24.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                              return;
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_24,6);
                          }
                          out.write(__oracle_jsp_text[36]);
                          {
                            com.sun.faces.taglib.html_basic.OutputTextTag __jsp_taghandler_26=(com.sun.faces.taglib.html_basic.OutputTextTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.OutputTextTag.class,"com.sun.faces.taglib.html_basic.OutputTextTag value");
                            __jsp_taghandler_26.setParent(__jsp_taghandler_23);
                            __jsp_taghandler_26.setValue("#{produto.marca}");
                            __jsp_tag_starteval=__jsp_taghandler_26.doStartTag();
                            if (__jsp_taghandler_26.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                              return;
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_26,6);
                          }
                          out.write(__oracle_jsp_text[37]);
                        }
                        if (__jsp_taghandler_23.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_23,5);
                      }
                      out.write(__oracle_jsp_text[38]);
                      {
                        com.sun.faces.taglib.html_basic.ColumnTag __jsp_taghandler_27=(com.sun.faces.taglib.html_basic.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.ColumnTag.class,"com.sun.faces.taglib.html_basic.ColumnTag");
                        __jsp_taghandler_27.setParent(__jsp_taghandler_6);
                        __jsp_tag_starteval=__jsp_taghandler_27.doStartTag();
                        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                        {
                          out.write(__oracle_jsp_text[39]);
                          {
                            javax.faces.webapp.FacetTag __jsp_taghandler_28=(javax.faces.webapp.FacetTag)OracleJspRuntime.getTagHandler(pageContext,javax.faces.webapp.FacetTag.class,"javax.faces.webapp.FacetTag name");
                            __jsp_taghandler_28.setParent(__jsp_taghandler_27);
                            __jsp_taghandler_28.setName("header");
                            __jsp_tag_starteval=__jsp_taghandler_28.doStartTag();
                            if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                            {
                              do {
                                out.write(__oracle_jsp_text[40]);
                              } while (__jsp_taghandler_28.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            }
                            if (__jsp_taghandler_28.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                              return;
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_28,6);
                          }
                          out.write(__oracle_jsp_text[41]);
                          {
                            com.sun.faces.taglib.html_basic.CommandLinkTag __jsp_taghandler_29=(com.sun.faces.taglib.html_basic.CommandLinkTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.CommandLinkTag.class,"com.sun.faces.taglib.html_basic.CommandLinkTag action value onmouseout onmouseover");
                            __jsp_taghandler_29.setParent(__jsp_taghandler_27);
                            __jsp_taghandler_29.setAction("#{CatalogoMB.adicionarCarrinho}");
                            __jsp_taghandler_29.setValue("");
                            __jsp_taghandler_29.setOnmouseout("MM_swapImgRestore()");
                            __jsp_taghandler_29.setOnmouseover("MM_swapImage('meuCarrinho','','$images/button/bt_carrinho_on.gif',1)");
                            __jsp_tag_starteval=__jsp_taghandler_29.doStartTag();
                            if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                            {
                              out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_29,__jsp_tag_starteval,out);
                              do {
                                out.write(__oracle_jsp_text[42]);
                                {
                                  com.sun.faces.taglib.html_basic.GraphicImageTag __jsp_taghandler_30=(com.sun.faces.taglib.html_basic.GraphicImageTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.GraphicImageTag.class,"com.sun.faces.taglib.html_basic.GraphicImageTag value height width");
                                  __jsp_taghandler_30.setParent(__jsp_taghandler_29);
                                  __jsp_taghandler_30.setValue("images/button/bt_carrinho.gif");
                                  __jsp_taghandler_30.setHeight("25");
                                  __jsp_taghandler_30.setWidth("25");
                                  __jsp_tag_starteval=__jsp_taghandler_30.doStartTag();
                                  if (__jsp_taghandler_30.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                    return;
                                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_30,7);
                                }
                                out.write(__oracle_jsp_text[43]);
                              } while (__jsp_taghandler_29.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                              out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                            }
                            if (__jsp_taghandler_29.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                              return;
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_29,6);
                          }
                          out.write(__oracle_jsp_text[44]);
                        }
                        if (__jsp_taghandler_27.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_27,5);
                      }
                      out.write(__oracle_jsp_text[45]);
                    }
                    if (__jsp_taghandler_6.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_6,4);
                  }
                  out.write(__oracle_jsp_text[46]);
                }
                if (__jsp_taghandler_3.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_3,3);
              }
              out.write(__oracle_jsp_text[47]);
            }
            if (__jsp_taghandler_2.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
              return;
            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_2,2);
          }
          out.write(__oracle_jsp_text[48]);
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
  private static final char __oracle_jsp_text[][]=new char[49][];
  static {
    try {
    __oracle_jsp_text[0] = 
    "\n".toCharArray();
    __oracle_jsp_text[1] = 
    "\n".toCharArray();
    __oracle_jsp_text[2] = 
    "\n    ".toCharArray();
    __oracle_jsp_text[3] = 
    "\n        ".toCharArray();
    __oracle_jsp_text[4] = 
    "\n        ".toCharArray();
    __oracle_jsp_text[5] = 
    "\n                ".toCharArray();
    __oracle_jsp_text[6] = 
    "\n            ".toCharArray();
    __oracle_jsp_text[7] = 
    "\n        ".toCharArray();
    __oracle_jsp_text[8] = 
    "\n            \n            ".toCharArray();
    __oracle_jsp_text[9] = 
    "\n                ".toCharArray();
    __oracle_jsp_text[10] = 
    "\n                    ".toCharArray();
    __oracle_jsp_text[11] = 
    "\n                ".toCharArray();
    __oracle_jsp_text[12] = 
    "\n                ".toCharArray();
    __oracle_jsp_text[13] = 
    "\n            ".toCharArray();
    __oracle_jsp_text[14] = 
    "\n            ".toCharArray();
    __oracle_jsp_text[15] = 
    "\n                ".toCharArray();
    __oracle_jsp_text[16] = 
    "\n                    ".toCharArray();
    __oracle_jsp_text[17] = 
    "\n                ".toCharArray();
    __oracle_jsp_text[18] = 
    "\n                ".toCharArray();
    __oracle_jsp_text[19] = 
    "\n            ".toCharArray();
    __oracle_jsp_text[20] = 
    "\n            ".toCharArray();
    __oracle_jsp_text[21] = 
    "\n                ".toCharArray();
    __oracle_jsp_text[22] = 
    "\n                    ".toCharArray();
    __oracle_jsp_text[23] = 
    "\n                ".toCharArray();
    __oracle_jsp_text[24] = 
    "\n                ".toCharArray();
    __oracle_jsp_text[25] = 
    "\n            ".toCharArray();
    __oracle_jsp_text[26] = 
    "\n            ".toCharArray();
    __oracle_jsp_text[27] = 
    "\n                ".toCharArray();
    __oracle_jsp_text[28] = 
    "\n                    ".toCharArray();
    __oracle_jsp_text[29] = 
    "\n                ".toCharArray();
    __oracle_jsp_text[30] = 
    "\n                ".toCharArray();
    __oracle_jsp_text[31] = 
    "\n            ".toCharArray();
    __oracle_jsp_text[32] = 
    "\n            ".toCharArray();
    __oracle_jsp_text[33] = 
    "\n                ".toCharArray();
    __oracle_jsp_text[34] = 
    "\n                    ".toCharArray();
    __oracle_jsp_text[35] = 
    "\n                ".toCharArray();
    __oracle_jsp_text[36] = 
    "\n                ".toCharArray();
    __oracle_jsp_text[37] = 
    "\n            ".toCharArray();
    __oracle_jsp_text[38] = 
    "\n            ".toCharArray();
    __oracle_jsp_text[39] = 
    "\n                ".toCharArray();
    __oracle_jsp_text[40] = 
    "\n                    \n                ".toCharArray();
    __oracle_jsp_text[41] = 
    "\n                ".toCharArray();
    __oracle_jsp_text[42] = 
    "\n                               ".toCharArray();
    __oracle_jsp_text[43] = 
    "\n                ".toCharArray();
    __oracle_jsp_text[44] = 
    "\n            ".toCharArray();
    __oracle_jsp_text[45] = 
    "\n        ".toCharArray();
    __oracle_jsp_text[46] = 
    "\n        ".toCharArray();
    __oracle_jsp_text[47] = 
    "\n    ".toCharArray();
    __oracle_jsp_text[48] = 
    "\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
