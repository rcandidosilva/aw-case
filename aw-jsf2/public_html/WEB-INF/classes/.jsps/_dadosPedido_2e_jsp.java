
import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _dadosPedido_2e_jsp extends com.orionserver.http.OrionHttpJspPage {


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
    _dadosPedido_2e_jsp page = this;
    ServletConfig config = pageContext.getServletConfig();
    javax.servlet.jsp.el.VariableResolver __ojsp_varRes = (VariableResolver)new OracleVariableResolverImpl(pageContext);

    try {


      out.write(__oracle_jsp_text[0]);
      out.write(__oracle_jsp_text[1]);
      {
        com.sun.faces.taglib.jsf_core.SubviewTag __jsp_taghandler_1=(com.sun.faces.taglib.jsf_core.SubviewTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.jsf_core.SubviewTag.class,"com.sun.faces.taglib.jsf_core.SubviewTag id");
        __jsp_taghandler_1.setParent(null);
        __jsp_taghandler_1.setId("dadosPedido");
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
                com.sun.faces.taglib.html_basic.PanelGridTag __jsp_taghandler_3=(com.sun.faces.taglib.html_basic.PanelGridTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.PanelGridTag.class,"com.sun.faces.taglib.html_basic.PanelGridTag columns");
                __jsp_taghandler_3.setParent(__jsp_taghandler_2);
                __jsp_taghandler_3.setColumns("1");
                __jsp_tag_starteval=__jsp_taghandler_3.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  out.write(__oracle_jsp_text[4]);
                  {
                    com.sun.faces.taglib.html_basic.PanelGridTag __jsp_taghandler_4=(com.sun.faces.taglib.html_basic.PanelGridTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.PanelGridTag.class,"com.sun.faces.taglib.html_basic.PanelGridTag columns styleClass");
                    __jsp_taghandler_4.setParent(__jsp_taghandler_3);
                    __jsp_taghandler_4.setColumns("1");
                    __jsp_taghandler_4.setStyleClass("tabelaJSF");
                    __jsp_tag_starteval=__jsp_taghandler_4.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      out.write(__oracle_jsp_text[5]);
                      {
                        javax.faces.webapp.FacetTag __jsp_taghandler_5=(javax.faces.webapp.FacetTag)OracleJspRuntime.getTagHandler(pageContext,javax.faces.webapp.FacetTag.class,"javax.faces.webapp.FacetTag name");
                        __jsp_taghandler_5.setParent(__jsp_taghandler_4);
                        __jsp_taghandler_5.setName("header");
                        __jsp_tag_starteval=__jsp_taghandler_5.doStartTag();
                        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                        {
                          do {
                            out.write(__oracle_jsp_text[6]);
                            {
                              com.sun.faces.taglib.html_basic.OutputLabelTag __jsp_taghandler_6=(com.sun.faces.taglib.html_basic.OutputLabelTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.OutputLabelTag.class,"com.sun.faces.taglib.html_basic.OutputLabelTag value");
                              __jsp_taghandler_6.setParent(__jsp_taghandler_5);
                              __jsp_taghandler_6.setValue("Informa&ccedil;&otilde;es do pedido");
                              __jsp_tag_starteval=__jsp_taghandler_6.doStartTag();
                              if (__jsp_taghandler_6.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                return;
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_6,6);
                            }
                            out.write(__oracle_jsp_text[7]);
                          } while (__jsp_taghandler_5.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                        }
                        if (__jsp_taghandler_5.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_5,5);
                      }
                      out.write(__oracle_jsp_text[8]);
                      {
                        com.sun.faces.taglib.html_basic.PanelGridTag __jsp_taghandler_7=(com.sun.faces.taglib.html_basic.PanelGridTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.PanelGridTag.class,"com.sun.faces.taglib.html_basic.PanelGridTag columns");
                        __jsp_taghandler_7.setParent(__jsp_taghandler_4);
                        __jsp_taghandler_7.setColumns("4");
                        __jsp_tag_starteval=__jsp_taghandler_7.doStartTag();
                        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                        {
                          out.write(__oracle_jsp_text[9]);
                          {
                            com.sun.faces.taglib.html_basic.OutputLabelTag __jsp_taghandler_8=(com.sun.faces.taglib.html_basic.OutputLabelTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.OutputLabelTag.class,"com.sun.faces.taglib.html_basic.OutputLabelTag value for");
                            __jsp_taghandler_8.setParent(__jsp_taghandler_7);
                            __jsp_taghandler_8.setValue("N&uacute;mero:");
                            __jsp_taghandler_8.setFor("numero");
                            __jsp_tag_starteval=__jsp_taghandler_8.doStartTag();
                            if (__jsp_taghandler_8.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                              return;
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_8,6);
                          }
                          out.write(__oracle_jsp_text[10]);
                          {
                            com.sun.faces.taglib.html_basic.OutputTextTag __jsp_taghandler_9=(com.sun.faces.taglib.html_basic.OutputTextTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.OutputTextTag.class,"com.sun.faces.taglib.html_basic.OutputTextTag id value");
                            __jsp_taghandler_9.setParent(__jsp_taghandler_7);
                            __jsp_taghandler_9.setId("numero");
                            __jsp_taghandler_9.setValue("#{PedidoMB.pedidoSelecionado.numero}");
                            __jsp_tag_starteval=__jsp_taghandler_9.doStartTag();
                            if (__jsp_taghandler_9.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                              return;
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_9,6);
                          }
                          out.write(__oracle_jsp_text[11]);
                          {
                            com.sun.faces.taglib.html_basic.OutputLabelTag __jsp_taghandler_10=(com.sun.faces.taglib.html_basic.OutputLabelTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.OutputLabelTag.class,"com.sun.faces.taglib.html_basic.OutputLabelTag value for");
                            __jsp_taghandler_10.setParent(__jsp_taghandler_7);
                            __jsp_taghandler_10.setValue("Data:");
                            __jsp_taghandler_10.setFor("data");
                            __jsp_tag_starteval=__jsp_taghandler_10.doStartTag();
                            if (__jsp_taghandler_10.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                              return;
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_10,6);
                          }
                          out.write(__oracle_jsp_text[12]);
                          {
                            com.sun.faces.taglib.html_basic.OutputTextTag __jsp_taghandler_11=(com.sun.faces.taglib.html_basic.OutputTextTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.OutputTextTag.class,"com.sun.faces.taglib.html_basic.OutputTextTag id value");
                            __jsp_taghandler_11.setParent(__jsp_taghandler_7);
                            __jsp_taghandler_11.setId("data");
                            __jsp_taghandler_11.setValue("#{PedidoMB.pedidoSelecionado.data}");
                            __jsp_tag_starteval=__jsp_taghandler_11.doStartTag();
                            if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                            {
                              out.write(__oracle_jsp_text[13]);
                              {
                                com.sun.faces.taglib.jsf_core.ConvertDateTimeTag __jsp_taghandler_12=(com.sun.faces.taglib.jsf_core.ConvertDateTimeTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.jsf_core.ConvertDateTimeTag.class,"com.sun.faces.taglib.jsf_core.ConvertDateTimeTag pattern");
                                __jsp_taghandler_12.setParent(__jsp_taghandler_11);
                                __jsp_taghandler_12.setPattern("dd/MM/yyyy");
                                __jsp_tag_starteval=__jsp_taghandler_12.doStartTag();
                                if (__jsp_taghandler_12.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                  return;
                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_12,7);
                              }
                              out.write(__oracle_jsp_text[14]);
                            }
                            if (__jsp_taghandler_11.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                              return;
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_11,6);
                          }
                          out.write(__oracle_jsp_text[15]);
                        }
                        if (__jsp_taghandler_7.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_7,5);
                      }
                      out.write(__oracle_jsp_text[16]);
                    }
                    if (__jsp_taghandler_4.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_4,4);
                  }
                  out.write(__oracle_jsp_text[17]);
                  {
                    com.sun.faces.taglib.html_basic.OutputTextTag __jsp_taghandler_13=(com.sun.faces.taglib.html_basic.OutputTextTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.OutputTextTag.class,"com.sun.faces.taglib.html_basic.OutputTextTag value");
                    __jsp_taghandler_13.setParent(__jsp_taghandler_3);
                    __jsp_taghandler_13.setValue("");
                    __jsp_tag_starteval=__jsp_taghandler_13.doStartTag();
                    if (__jsp_taghandler_13.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_13,4);
                  }
                  out.write(__oracle_jsp_text[18]);
                  {
                    com.sun.faces.taglib.html_basic.OutputTextTag __jsp_taghandler_14=(com.sun.faces.taglib.html_basic.OutputTextTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.OutputTextTag.class,"com.sun.faces.taglib.html_basic.OutputTextTag value");
                    __jsp_taghandler_14.setParent(__jsp_taghandler_3);
                    __jsp_taghandler_14.setValue("");
                    __jsp_tag_starteval=__jsp_taghandler_14.doStartTag();
                    if (__jsp_taghandler_14.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_14,4);
                  }
                  out.write(__oracle_jsp_text[19]);
                  {
                    com.sun.faces.taglib.html_basic.OutputTextTag __jsp_taghandler_15=(com.sun.faces.taglib.html_basic.OutputTextTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.OutputTextTag.class,"com.sun.faces.taglib.html_basic.OutputTextTag value");
                    __jsp_taghandler_15.setParent(__jsp_taghandler_3);
                    __jsp_taghandler_15.setValue("");
                    __jsp_tag_starteval=__jsp_taghandler_15.doStartTag();
                    if (__jsp_taghandler_15.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_15,4);
                  }
                  out.write(__oracle_jsp_text[20]);
                  {
                    com.sun.faces.taglib.html_basic.PanelGridTag __jsp_taghandler_16=(com.sun.faces.taglib.html_basic.PanelGridTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.PanelGridTag.class,"com.sun.faces.taglib.html_basic.PanelGridTag columns styleClass");
                    __jsp_taghandler_16.setParent(__jsp_taghandler_3);
                    __jsp_taghandler_16.setColumns("1");
                    __jsp_taghandler_16.setStyleClass("tabelaJSF");
                    __jsp_tag_starteval=__jsp_taghandler_16.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      out.write(__oracle_jsp_text[21]);
                      {
                        javax.faces.webapp.FacetTag __jsp_taghandler_17=(javax.faces.webapp.FacetTag)OracleJspRuntime.getTagHandler(pageContext,javax.faces.webapp.FacetTag.class,"javax.faces.webapp.FacetTag name");
                        __jsp_taghandler_17.setParent(__jsp_taghandler_16);
                        __jsp_taghandler_17.setName("header");
                        __jsp_tag_starteval=__jsp_taghandler_17.doStartTag();
                        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                        {
                          do {
                            out.write(__oracle_jsp_text[22]);
                            {
                              com.sun.faces.taglib.html_basic.OutputLabelTag __jsp_taghandler_18=(com.sun.faces.taglib.html_basic.OutputLabelTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.OutputLabelTag.class,"com.sun.faces.taglib.html_basic.OutputLabelTag value");
                              __jsp_taghandler_18.setParent(__jsp_taghandler_17);
                              __jsp_taghandler_18.setValue("Itens do pedido");
                              __jsp_tag_starteval=__jsp_taghandler_18.doStartTag();
                              if (__jsp_taghandler_18.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                return;
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_18,6);
                            }
                            out.write(__oracle_jsp_text[23]);
                          } while (__jsp_taghandler_17.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                        }
                        if (__jsp_taghandler_17.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_17,5);
                      }
                      out.write(__oracle_jsp_text[24]);
                      {
                        com.sun.faces.taglib.html_basic.DataTableTag __jsp_taghandler_19=(com.sun.faces.taglib.html_basic.DataTableTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.DataTableTag.class,"com.sun.faces.taglib.html_basic.DataTableTag id value var headerClass styleClass");
                        __jsp_taghandler_19.setParent(__jsp_taghandler_16);
                        __jsp_taghandler_19.setId("tabela");
                        __jsp_taghandler_19.setValue("#{PedidoMB.pedidoSelecionado.itensPedido}");
                        __jsp_taghandler_19.setVar("item");
                        __jsp_taghandler_19.setHeaderClass("tabela_subtitulo");
                        __jsp_taghandler_19.setStyleClass("tabelaJSF");
                        __jsp_tag_starteval=__jsp_taghandler_19.doStartTag();
                        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                        {
                          out.write(__oracle_jsp_text[25]);
                          {
                            com.sun.faces.taglib.html_basic.ColumnTag __jsp_taghandler_20=(com.sun.faces.taglib.html_basic.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.ColumnTag.class,"com.sun.faces.taglib.html_basic.ColumnTag");
                            __jsp_taghandler_20.setParent(__jsp_taghandler_19);
                            __jsp_tag_starteval=__jsp_taghandler_20.doStartTag();
                            if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                            {
                              out.write(__oracle_jsp_text[26]);
                              {
                                javax.faces.webapp.FacetTag __jsp_taghandler_21=(javax.faces.webapp.FacetTag)OracleJspRuntime.getTagHandler(pageContext,javax.faces.webapp.FacetTag.class,"javax.faces.webapp.FacetTag name");
                                __jsp_taghandler_21.setParent(__jsp_taghandler_20);
                                __jsp_taghandler_21.setName("header");
                                __jsp_tag_starteval=__jsp_taghandler_21.doStartTag();
                                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                                {
                                  do {
                                    out.write(__oracle_jsp_text[27]);
                                    {
                                      com.sun.faces.taglib.html_basic.OutputTextTag __jsp_taghandler_22=(com.sun.faces.taglib.html_basic.OutputTextTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.OutputTextTag.class,"com.sun.faces.taglib.html_basic.OutputTextTag value");
                                      __jsp_taghandler_22.setParent(__jsp_taghandler_21);
                                      __jsp_taghandler_22.setValue("Produto");
                                      __jsp_tag_starteval=__jsp_taghandler_22.doStartTag();
                                      if (__jsp_taghandler_22.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                        return;
                                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_22,8);
                                    }
                                    out.write(__oracle_jsp_text[28]);
                                  } while (__jsp_taghandler_21.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                }
                                if (__jsp_taghandler_21.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                  return;
                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_21,7);
                              }
                              out.write(__oracle_jsp_text[29]);
                              {
                                com.sun.faces.taglib.html_basic.OutputTextTag __jsp_taghandler_23=(com.sun.faces.taglib.html_basic.OutputTextTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.OutputTextTag.class,"com.sun.faces.taglib.html_basic.OutputTextTag value");
                                __jsp_taghandler_23.setParent(__jsp_taghandler_20);
                                __jsp_taghandler_23.setValue("#{item.produto.nome}");
                                __jsp_tag_starteval=__jsp_taghandler_23.doStartTag();
                                if (__jsp_taghandler_23.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                  return;
                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_23,7);
                              }
                              out.write(__oracle_jsp_text[30]);
                            }
                            if (__jsp_taghandler_20.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                              return;
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_20,6);
                          }
                          out.write(__oracle_jsp_text[31]);
                          {
                            com.sun.faces.taglib.html_basic.ColumnTag __jsp_taghandler_24=(com.sun.faces.taglib.html_basic.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.ColumnTag.class,"com.sun.faces.taglib.html_basic.ColumnTag");
                            __jsp_taghandler_24.setParent(__jsp_taghandler_19);
                            __jsp_tag_starteval=__jsp_taghandler_24.doStartTag();
                            if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                            {
                              out.write(__oracle_jsp_text[32]);
                              {
                                javax.faces.webapp.FacetTag __jsp_taghandler_25=(javax.faces.webapp.FacetTag)OracleJspRuntime.getTagHandler(pageContext,javax.faces.webapp.FacetTag.class,"javax.faces.webapp.FacetTag name");
                                __jsp_taghandler_25.setParent(__jsp_taghandler_24);
                                __jsp_taghandler_25.setName("header");
                                __jsp_tag_starteval=__jsp_taghandler_25.doStartTag();
                                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                                {
                                  do {
                                    out.write(__oracle_jsp_text[33]);
                                    {
                                      com.sun.faces.taglib.html_basic.OutputTextTag __jsp_taghandler_26=(com.sun.faces.taglib.html_basic.OutputTextTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.OutputTextTag.class,"com.sun.faces.taglib.html_basic.OutputTextTag value");
                                      __jsp_taghandler_26.setParent(__jsp_taghandler_25);
                                      __jsp_taghandler_26.setValue("Categoria");
                                      __jsp_tag_starteval=__jsp_taghandler_26.doStartTag();
                                      if (__jsp_taghandler_26.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                        return;
                                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_26,8);
                                    }
                                    out.write(__oracle_jsp_text[34]);
                                  } while (__jsp_taghandler_25.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                }
                                if (__jsp_taghandler_25.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                  return;
                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_25,7);
                              }
                              out.write(__oracle_jsp_text[35]);
                              {
                                com.sun.faces.taglib.html_basic.OutputTextTag __jsp_taghandler_27=(com.sun.faces.taglib.html_basic.OutputTextTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.OutputTextTag.class,"com.sun.faces.taglib.html_basic.OutputTextTag value");
                                __jsp_taghandler_27.setParent(__jsp_taghandler_24);
                                __jsp_taghandler_27.setValue("#{item.produto.categoria}");
                                __jsp_tag_starteval=__jsp_taghandler_27.doStartTag();
                                if (__jsp_taghandler_27.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                  return;
                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_27,7);
                              }
                              out.write(__oracle_jsp_text[36]);
                            }
                            if (__jsp_taghandler_24.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                              return;
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_24,6);
                          }
                          out.write(__oracle_jsp_text[37]);
                          {
                            com.sun.faces.taglib.html_basic.ColumnTag __jsp_taghandler_28=(com.sun.faces.taglib.html_basic.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.ColumnTag.class,"com.sun.faces.taglib.html_basic.ColumnTag");
                            __jsp_taghandler_28.setParent(__jsp_taghandler_19);
                            __jsp_tag_starteval=__jsp_taghandler_28.doStartTag();
                            if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                            {
                              out.write(__oracle_jsp_text[38]);
                              {
                                javax.faces.webapp.FacetTag __jsp_taghandler_29=(javax.faces.webapp.FacetTag)OracleJspRuntime.getTagHandler(pageContext,javax.faces.webapp.FacetTag.class,"javax.faces.webapp.FacetTag name");
                                __jsp_taghandler_29.setParent(__jsp_taghandler_28);
                                __jsp_taghandler_29.setName("header");
                                __jsp_tag_starteval=__jsp_taghandler_29.doStartTag();
                                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                                {
                                  do {
                                    out.write(__oracle_jsp_text[39]);
                                    {
                                      com.sun.faces.taglib.html_basic.OutputTextTag __jsp_taghandler_30=(com.sun.faces.taglib.html_basic.OutputTextTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.OutputTextTag.class,"com.sun.faces.taglib.html_basic.OutputTextTag value");
                                      __jsp_taghandler_30.setParent(__jsp_taghandler_29);
                                      __jsp_taghandler_30.setValue("Marca");
                                      __jsp_tag_starteval=__jsp_taghandler_30.doStartTag();
                                      if (__jsp_taghandler_30.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                        return;
                                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_30,8);
                                    }
                                    out.write(__oracle_jsp_text[40]);
                                  } while (__jsp_taghandler_29.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                }
                                if (__jsp_taghandler_29.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                  return;
                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_29,7);
                              }
                              out.write(__oracle_jsp_text[41]);
                              {
                                com.sun.faces.taglib.html_basic.OutputTextTag __jsp_taghandler_31=(com.sun.faces.taglib.html_basic.OutputTextTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.OutputTextTag.class,"com.sun.faces.taglib.html_basic.OutputTextTag value");
                                __jsp_taghandler_31.setParent(__jsp_taghandler_28);
                                __jsp_taghandler_31.setValue("#{item.produto.marca}");
                                __jsp_tag_starteval=__jsp_taghandler_31.doStartTag();
                                if (__jsp_taghandler_31.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                  return;
                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_31,7);
                              }
                              out.write(__oracle_jsp_text[42]);
                            }
                            if (__jsp_taghandler_28.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                              return;
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_28,6);
                          }
                          out.write(__oracle_jsp_text[43]);
                          {
                            com.sun.faces.taglib.html_basic.ColumnTag __jsp_taghandler_32=(com.sun.faces.taglib.html_basic.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.ColumnTag.class,"com.sun.faces.taglib.html_basic.ColumnTag");
                            __jsp_taghandler_32.setParent(__jsp_taghandler_19);
                            __jsp_tag_starteval=__jsp_taghandler_32.doStartTag();
                            if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                            {
                              out.write(__oracle_jsp_text[44]);
                              {
                                javax.faces.webapp.FacetTag __jsp_taghandler_33=(javax.faces.webapp.FacetTag)OracleJspRuntime.getTagHandler(pageContext,javax.faces.webapp.FacetTag.class,"javax.faces.webapp.FacetTag name");
                                __jsp_taghandler_33.setParent(__jsp_taghandler_32);
                                __jsp_taghandler_33.setName("header");
                                __jsp_tag_starteval=__jsp_taghandler_33.doStartTag();
                                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                                {
                                  do {
                                    out.write(__oracle_jsp_text[45]);
                                    {
                                      com.sun.faces.taglib.html_basic.OutputTextTag __jsp_taghandler_34=(com.sun.faces.taglib.html_basic.OutputTextTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.OutputTextTag.class,"com.sun.faces.taglib.html_basic.OutputTextTag value style");
                                      __jsp_taghandler_34.setParent(__jsp_taghandler_33);
                                      __jsp_taghandler_34.setValue("Quantidade");
                                      __jsp_taghandler_34.setStyle("align:center");
                                      __jsp_tag_starteval=__jsp_taghandler_34.doStartTag();
                                      if (__jsp_taghandler_34.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                        return;
                                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_34,8);
                                    }
                                    out.write(__oracle_jsp_text[46]);
                                  } while (__jsp_taghandler_33.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                }
                                if (__jsp_taghandler_33.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                  return;
                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_33,7);
                              }
                              out.write(__oracle_jsp_text[47]);
                              {
                                com.sun.faces.taglib.html_basic.OutputTextTag __jsp_taghandler_35=(com.sun.faces.taglib.html_basic.OutputTextTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.OutputTextTag.class,"com.sun.faces.taglib.html_basic.OutputTextTag value");
                                __jsp_taghandler_35.setParent(__jsp_taghandler_32);
                                __jsp_taghandler_35.setValue("#{item.quantidade}");
                                __jsp_tag_starteval=__jsp_taghandler_35.doStartTag();
                                if (__jsp_taghandler_35.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                  return;
                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_35,7);
                              }
                              out.write(__oracle_jsp_text[48]);
                            }
                            if (__jsp_taghandler_32.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                              return;
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_32,6);
                          }
                          out.write(__oracle_jsp_text[49]);
                          {
                            com.sun.faces.taglib.html_basic.ColumnTag __jsp_taghandler_36=(com.sun.faces.taglib.html_basic.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.ColumnTag.class,"com.sun.faces.taglib.html_basic.ColumnTag");
                            __jsp_taghandler_36.setParent(__jsp_taghandler_19);
                            __jsp_tag_starteval=__jsp_taghandler_36.doStartTag();
                            if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                            {
                              out.write(__oracle_jsp_text[50]);
                              {
                                javax.faces.webapp.FacetTag __jsp_taghandler_37=(javax.faces.webapp.FacetTag)OracleJspRuntime.getTagHandler(pageContext,javax.faces.webapp.FacetTag.class,"javax.faces.webapp.FacetTag name");
                                __jsp_taghandler_37.setParent(__jsp_taghandler_36);
                                __jsp_taghandler_37.setName("header");
                                __jsp_tag_starteval=__jsp_taghandler_37.doStartTag();
                                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                                {
                                  do {
                                    out.write(__oracle_jsp_text[51]);
                                    {
                                      com.sun.faces.taglib.html_basic.OutputTextTag __jsp_taghandler_38=(com.sun.faces.taglib.html_basic.OutputTextTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.OutputTextTag.class,"com.sun.faces.taglib.html_basic.OutputTextTag value");
                                      __jsp_taghandler_38.setParent(__jsp_taghandler_37);
                                      __jsp_taghandler_38.setValue("Preco");
                                      __jsp_tag_starteval=__jsp_taghandler_38.doStartTag();
                                      if (__jsp_taghandler_38.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                        return;
                                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_38,8);
                                    }
                                    out.write(__oracle_jsp_text[52]);
                                  } while (__jsp_taghandler_37.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                }
                                if (__jsp_taghandler_37.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                  return;
                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_37,7);
                              }
                              out.write(__oracle_jsp_text[53]);
                              {
                                com.sun.faces.taglib.html_basic.OutputTextTag __jsp_taghandler_39=(com.sun.faces.taglib.html_basic.OutputTextTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.OutputTextTag.class,"com.sun.faces.taglib.html_basic.OutputTextTag value");
                                __jsp_taghandler_39.setParent(__jsp_taghandler_36);
                                __jsp_taghandler_39.setValue("R$ #{item.produto.preco}");
                                __jsp_tag_starteval=__jsp_taghandler_39.doStartTag();
                                if (__jsp_taghandler_39.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                  return;
                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_39,7);
                              }
                              out.write(__oracle_jsp_text[54]);
                            }
                            if (__jsp_taghandler_36.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                              return;
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_36,6);
                          }
                          out.write(__oracle_jsp_text[55]);
                        }
                        if (__jsp_taghandler_19.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_19,5);
                      }
                      out.write(__oracle_jsp_text[56]);
                    }
                    if (__jsp_taghandler_16.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_16,4);
                  }
                  out.write(__oracle_jsp_text[57]);
                }
                if (__jsp_taghandler_3.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_3,3);
              }
              out.write(__oracle_jsp_text[58]);
            }
            if (__jsp_taghandler_2.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
              return;
            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_2,2);
          }
          out.write(__oracle_jsp_text[59]);
        }
        if (__jsp_taghandler_1.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_1,1);
      }
      out.write(__oracle_jsp_text[60]);


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
  private static final char __oracle_jsp_text[][]=new char[61][];
  static {
    try {
    __oracle_jsp_text[0] = 
    "\n".toCharArray();
    __oracle_jsp_text[1] = 
    "\n".toCharArray();
    __oracle_jsp_text[2] = 
    "\n  ".toCharArray();
    __oracle_jsp_text[3] = 
    "\n    ".toCharArray();
    __oracle_jsp_text[4] = 
    "\n        ".toCharArray();
    __oracle_jsp_text[5] = 
    "\n            ".toCharArray();
    __oracle_jsp_text[6] = 
    "\n                ".toCharArray();
    __oracle_jsp_text[7] = 
    "\n            ".toCharArray();
    __oracle_jsp_text[8] = 
    "\n            ".toCharArray();
    __oracle_jsp_text[9] = 
    "\n                ".toCharArray();
    __oracle_jsp_text[10] = 
    "\n                ".toCharArray();
    __oracle_jsp_text[11] = 
    "\n                ".toCharArray();
    __oracle_jsp_text[12] = 
    "\n                ".toCharArray();
    __oracle_jsp_text[13] = 
    "\n                    ".toCharArray();
    __oracle_jsp_text[14] = 
    "\n                ".toCharArray();
    __oracle_jsp_text[15] = 
    "\n            ".toCharArray();
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
    "\n            ".toCharArray();
    __oracle_jsp_text[22] = 
    "\n                ".toCharArray();
    __oracle_jsp_text[23] = 
    "\n            ".toCharArray();
    __oracle_jsp_text[24] = 
    "\n            ".toCharArray();
    __oracle_jsp_text[25] = 
    "    \n                ".toCharArray();
    __oracle_jsp_text[26] = 
    "\n                    ".toCharArray();
    __oracle_jsp_text[27] = 
    "\n                        ".toCharArray();
    __oracle_jsp_text[28] = 
    "\n                    ".toCharArray();
    __oracle_jsp_text[29] = 
    "\n                    ".toCharArray();
    __oracle_jsp_text[30] = 
    "\n                ".toCharArray();
    __oracle_jsp_text[31] = 
    "\n                ".toCharArray();
    __oracle_jsp_text[32] = 
    "\n                    ".toCharArray();
    __oracle_jsp_text[33] = 
    "\n                        ".toCharArray();
    __oracle_jsp_text[34] = 
    "\n                    ".toCharArray();
    __oracle_jsp_text[35] = 
    "\n                    ".toCharArray();
    __oracle_jsp_text[36] = 
    "\n                ".toCharArray();
    __oracle_jsp_text[37] = 
    "\n                ".toCharArray();
    __oracle_jsp_text[38] = 
    "\n                    ".toCharArray();
    __oracle_jsp_text[39] = 
    "\n                        ".toCharArray();
    __oracle_jsp_text[40] = 
    "\n                    ".toCharArray();
    __oracle_jsp_text[41] = 
    "\n                    ".toCharArray();
    __oracle_jsp_text[42] = 
    "\n                ".toCharArray();
    __oracle_jsp_text[43] = 
    "\n                ".toCharArray();
    __oracle_jsp_text[44] = 
    "\n                    ".toCharArray();
    __oracle_jsp_text[45] = 
    "\n                        ".toCharArray();
    __oracle_jsp_text[46] = 
    "\n                    ".toCharArray();
    __oracle_jsp_text[47] = 
    "\n                    ".toCharArray();
    __oracle_jsp_text[48] = 
    "\n                ".toCharArray();
    __oracle_jsp_text[49] = 
    "\n                ".toCharArray();
    __oracle_jsp_text[50] = 
    "\n                    ".toCharArray();
    __oracle_jsp_text[51] = 
    "\n                        ".toCharArray();
    __oracle_jsp_text[52] = 
    "\n                    ".toCharArray();
    __oracle_jsp_text[53] = 
    "\n                    ".toCharArray();
    __oracle_jsp_text[54] = 
    "\n                ".toCharArray();
    __oracle_jsp_text[55] = 
    "\n            ".toCharArray();
    __oracle_jsp_text[56] = 
    "\n        ".toCharArray();
    __oracle_jsp_text[57] = 
    "\n    ".toCharArray();
    __oracle_jsp_text[58] = 
    "\n  ".toCharArray();
    __oracle_jsp_text[59] = 
    "\n".toCharArray();
    __oracle_jsp_text[60] = 
    "\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
