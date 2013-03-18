
import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _editaCliente_2e_jsp extends com.orionserver.http.OrionHttpJspPage {


  // ** Begin Declarations


  // ** End Declarations

  public void _jspService(HttpServletRequest request, HttpServletResponse response) throws java.io.IOException, ServletException {

    response.setContentType( "text/html;charset=windows-1252");
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
    _editaCliente_2e_jsp page = this;
    ServletConfig config = pageContext.getServletConfig();
    javax.servlet.jsp.el.VariableResolver __ojsp_varRes = (VariableResolver)new OracleVariableResolverImpl(pageContext);

    try {


      out.write(__oracle_jsp_text[0]);
      out.write(__oracle_jsp_text[1]);
      out.write(__oracle_jsp_text[2]);
      out.write(__oracle_jsp_text[3]);
      {
        com.sun.faces.taglib.jsf_core.SubviewTag __jsp_taghandler_1=(com.sun.faces.taglib.jsf_core.SubviewTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.jsf_core.SubviewTag.class,"com.sun.faces.taglib.jsf_core.SubviewTag id");
        __jsp_taghandler_1.setParent(null);
        __jsp_taghandler_1.setId("editaCliente");
        __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
        {
          out.write(__oracle_jsp_text[4]);
          {
            com.sun.faces.taglib.html_basic.FormTag __jsp_taghandler_2=(com.sun.faces.taglib.html_basic.FormTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.FormTag.class,"com.sun.faces.taglib.html_basic.FormTag");
            __jsp_taghandler_2.setParent(__jsp_taghandler_1);
            __jsp_tag_starteval=__jsp_taghandler_2.doStartTag();
            if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
            {
              out.write(__oracle_jsp_text[5]);
              {
                com.sun.faces.taglib.html_basic.PanelGridTag __jsp_taghandler_3=(com.sun.faces.taglib.html_basic.PanelGridTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.PanelGridTag.class,"com.sun.faces.taglib.html_basic.PanelGridTag columns styleClass");
                __jsp_taghandler_3.setParent(__jsp_taghandler_2);
                __jsp_taghandler_3.setColumns("1");
                __jsp_taghandler_3.setStyleClass("tabelaJSF");
                __jsp_tag_starteval=__jsp_taghandler_3.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  out.write(__oracle_jsp_text[6]);
                  {
                    javax.faces.webapp.FacetTag __jsp_taghandler_4=(javax.faces.webapp.FacetTag)OracleJspRuntime.getTagHandler(pageContext,javax.faces.webapp.FacetTag.class,"javax.faces.webapp.FacetTag name");
                    __jsp_taghandler_4.setParent(__jsp_taghandler_3);
                    __jsp_taghandler_4.setName("header");
                    __jsp_tag_starteval=__jsp_taghandler_4.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        out.write(__oracle_jsp_text[7]);
                        {
                          com.sun.faces.taglib.html_basic.GraphicImageTag __jsp_taghandler_5=(com.sun.faces.taglib.html_basic.GraphicImageTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.GraphicImageTag.class,"com.sun.faces.taglib.html_basic.GraphicImageTag url height width");
                          __jsp_taghandler_5.setParent(__jsp_taghandler_4);
                          __jsp_taghandler_5.setUrl("images/titulos/cadastrarNovoCliente.gif");
                          __jsp_taghandler_5.setHeight("30");
                          __jsp_taghandler_5.setWidth("400");
                          __jsp_tag_starteval=__jsp_taghandler_5.doStartTag();
                          if (__jsp_taghandler_5.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_5,5);
                        }
                        out.write(__oracle_jsp_text[8]);
                      } while (__jsp_taghandler_4.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_4.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_4,4);
                  }
                  out.write(__oracle_jsp_text[9]);
                  {
                    com.sun.faces.taglib.html_basic.PanelGridTag __jsp_taghandler_6=(com.sun.faces.taglib.html_basic.PanelGridTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.PanelGridTag.class,"com.sun.faces.taglib.html_basic.PanelGridTag columns");
                    __jsp_taghandler_6.setParent(__jsp_taghandler_3);
                    __jsp_taghandler_6.setColumns("2");
                    __jsp_tag_starteval=__jsp_taghandler_6.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      out.write(__oracle_jsp_text[10]);
                      {
                        com.sun.faces.taglib.html_basic.OutputLabelTag __jsp_taghandler_7=(com.sun.faces.taglib.html_basic.OutputLabelTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.OutputLabelTag.class,"com.sun.faces.taglib.html_basic.OutputLabelTag value for");
                        __jsp_taghandler_7.setParent(__jsp_taghandler_6);
                        __jsp_taghandler_7.setValue("Nome");
                        __jsp_taghandler_7.setFor("nome");
                        __jsp_tag_starteval=__jsp_taghandler_7.doStartTag();
                        if (__jsp_taghandler_7.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_7,5);
                      }
                      out.write(__oracle_jsp_text[11]);
                      {
                        com.sun.faces.taglib.html_basic.InputTextTag __jsp_taghandler_8=(com.sun.faces.taglib.html_basic.InputTextTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.InputTextTag.class,"com.sun.faces.taglib.html_basic.InputTextTag id required value size");
                        __jsp_taghandler_8.setParent(__jsp_taghandler_6);
                        __jsp_taghandler_8.setId("nome");
                        __jsp_taghandler_8.setRequired("true");
                        __jsp_taghandler_8.setValue("#{ClienteMB.cliente.nome}");
                        __jsp_taghandler_8.setSize("60");
                        __jsp_tag_starteval=__jsp_taghandler_8.doStartTag();
                        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                        {
                          out.write(__oracle_jsp_text[12]);
                          {
                            com.sun.faces.taglib.jsf_core.ValidateLengthTag __jsp_taghandler_9=(com.sun.faces.taglib.jsf_core.ValidateLengthTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.jsf_core.ValidateLengthTag.class,"com.sun.faces.taglib.jsf_core.ValidateLengthTag maximum minimum");
                            __jsp_taghandler_9.setParent(__jsp_taghandler_8);
                            __jsp_taghandler_9.setMaximum("50");
                            __jsp_taghandler_9.setMinimum("10");
                            __jsp_tag_starteval=__jsp_taghandler_9.doStartTag();
                            if (__jsp_taghandler_9.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                              return;
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_9,6);
                          }
                          out.write(__oracle_jsp_text[13]);
                        }
                        if (__jsp_taghandler_8.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_8,5);
                      }
                      out.write(__oracle_jsp_text[14]);
                      {
                        com.sun.faces.taglib.html_basic.OutputLabelTag __jsp_taghandler_10=(com.sun.faces.taglib.html_basic.OutputLabelTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.OutputLabelTag.class,"com.sun.faces.taglib.html_basic.OutputLabelTag value for");
                        __jsp_taghandler_10.setParent(__jsp_taghandler_6);
                        __jsp_taghandler_10.setValue("Telefone");
                        __jsp_taghandler_10.setFor("telefone");
                        __jsp_tag_starteval=__jsp_taghandler_10.doStartTag();
                        if (__jsp_taghandler_10.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_10,5);
                      }
                      out.write(__oracle_jsp_text[15]);
                      {
                        com.sun.faces.taglib.html_basic.PanelGridTag __jsp_taghandler_11=(com.sun.faces.taglib.html_basic.PanelGridTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.PanelGridTag.class,"com.sun.faces.taglib.html_basic.PanelGridTag columns");
                        __jsp_taghandler_11.setParent(__jsp_taghandler_6);
                        __jsp_taghandler_11.setColumns("3");
                        __jsp_tag_starteval=__jsp_taghandler_11.doStartTag();
                        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                        {
                          out.write(__oracle_jsp_text[16]);
                          {
                            com.sun.faces.taglib.html_basic.InputTextTag __jsp_taghandler_12=(com.sun.faces.taglib.html_basic.InputTextTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.InputTextTag.class,"com.sun.faces.taglib.html_basic.InputTextTag id required value size");
                            __jsp_taghandler_12.setParent(__jsp_taghandler_11);
                            __jsp_taghandler_12.setId("telefone");
                            __jsp_taghandler_12.setRequired("true");
                            __jsp_taghandler_12.setValue("#{ClienteMB.cliente.telefone}");
                            __jsp_taghandler_12.setSize("15");
                            __jsp_tag_starteval=__jsp_taghandler_12.doStartTag();
                            if (__jsp_taghandler_12.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                              return;
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_12,6);
                          }
                          out.write(__oracle_jsp_text[17]);
                          {
                            com.sun.faces.taglib.html_basic.OutputLabelTag __jsp_taghandler_13=(com.sun.faces.taglib.html_basic.OutputLabelTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.OutputLabelTag.class,"com.sun.faces.taglib.html_basic.OutputLabelTag value for");
                            __jsp_taghandler_13.setParent(__jsp_taghandler_11);
                            __jsp_taghandler_13.setValue("Email");
                            __jsp_taghandler_13.setFor("email");
                            __jsp_tag_starteval=__jsp_taghandler_13.doStartTag();
                            if (__jsp_taghandler_13.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                              return;
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_13,6);
                          }
                          out.write(__oracle_jsp_text[18]);
                          {
                            com.sun.faces.taglib.html_basic.InputTextTag __jsp_taghandler_14=(com.sun.faces.taglib.html_basic.InputTextTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.InputTextTag.class,"com.sun.faces.taglib.html_basic.InputTextTag id required value size");
                            __jsp_taghandler_14.setParent(__jsp_taghandler_11);
                            __jsp_taghandler_14.setId("email");
                            __jsp_taghandler_14.setRequired("true");
                            __jsp_taghandler_14.setValue("#{ClienteMB.cliente.email}");
                            __jsp_taghandler_14.setSize("40");
                            __jsp_tag_starteval=__jsp_taghandler_14.doStartTag();
                            if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                            {
                              out.write(__oracle_jsp_text[19]);
                              {
                                com.sun.faces.taglib.jsf_core.ValidateLengthTag __jsp_taghandler_15=(com.sun.faces.taglib.jsf_core.ValidateLengthTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.jsf_core.ValidateLengthTag.class,"com.sun.faces.taglib.jsf_core.ValidateLengthTag maximum minimum");
                                __jsp_taghandler_15.setParent(__jsp_taghandler_14);
                                __jsp_taghandler_15.setMaximum("40");
                                __jsp_taghandler_15.setMinimum("10");
                                __jsp_tag_starteval=__jsp_taghandler_15.doStartTag();
                                if (__jsp_taghandler_15.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                  return;
                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_15,7);
                              }
                              out.write(__oracle_jsp_text[20]);
                            }
                            if (__jsp_taghandler_14.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                              return;
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_14,6);
                          }
                          out.write(__oracle_jsp_text[21]);
                        }
                        if (__jsp_taghandler_11.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_11,5);
                      }
                      out.write(__oracle_jsp_text[22]);
                      {
                        com.sun.faces.taglib.html_basic.OutputLabelTag __jsp_taghandler_16=(com.sun.faces.taglib.html_basic.OutputLabelTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.OutputLabelTag.class,"com.sun.faces.taglib.html_basic.OutputLabelTag value for");
                        __jsp_taghandler_16.setParent(__jsp_taghandler_6);
                        __jsp_taghandler_16.setValue("Senha");
                        __jsp_taghandler_16.setFor("senha");
                        __jsp_tag_starteval=__jsp_taghandler_16.doStartTag();
                        if (__jsp_taghandler_16.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_16,5);
                      }
                      out.write(__oracle_jsp_text[23]);
                      {
                        com.sun.faces.taglib.html_basic.PanelGridTag __jsp_taghandler_17=(com.sun.faces.taglib.html_basic.PanelGridTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.PanelGridTag.class,"com.sun.faces.taglib.html_basic.PanelGridTag columns");
                        __jsp_taghandler_17.setParent(__jsp_taghandler_6);
                        __jsp_taghandler_17.setColumns("3");
                        __jsp_tag_starteval=__jsp_taghandler_17.doStartTag();
                        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                        {
                          out.write(__oracle_jsp_text[24]);
                          {
                            com.sun.faces.taglib.html_basic.InputSecretTag __jsp_taghandler_18=(com.sun.faces.taglib.html_basic.InputSecretTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.InputSecretTag.class,"com.sun.faces.taglib.html_basic.InputSecretTag id required value");
                            __jsp_taghandler_18.setParent(__jsp_taghandler_17);
                            __jsp_taghandler_18.setId("senha");
                            __jsp_taghandler_18.setRequired("false");
                            __jsp_taghandler_18.setValue("#{ClienteMB.cliente.senha}");
                            __jsp_tag_starteval=__jsp_taghandler_18.doStartTag();
                            if (__jsp_taghandler_18.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                              return;
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_18,6);
                          }
                          out.write(__oracle_jsp_text[25]);
                          {
                            com.sun.faces.taglib.html_basic.OutputLabelTag __jsp_taghandler_19=(com.sun.faces.taglib.html_basic.OutputLabelTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.OutputLabelTag.class,"com.sun.faces.taglib.html_basic.OutputLabelTag value for");
                            __jsp_taghandler_19.setParent(__jsp_taghandler_17);
                            __jsp_taghandler_19.setValue("Ativo");
                            __jsp_taghandler_19.setFor("ativo");
                            __jsp_tag_starteval=__jsp_taghandler_19.doStartTag();
                            if (__jsp_taghandler_19.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                              return;
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_19,6);
                          }
                          out.write(__oracle_jsp_text[26]);
                          {
                            com.sun.faces.taglib.html_basic.SelectBooleanCheckboxTag __jsp_taghandler_20=(com.sun.faces.taglib.html_basic.SelectBooleanCheckboxTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.SelectBooleanCheckboxTag.class,"com.sun.faces.taglib.html_basic.SelectBooleanCheckboxTag id value");
                            __jsp_taghandler_20.setParent(__jsp_taghandler_17);
                            __jsp_taghandler_20.setId("ativo");
                            __jsp_taghandler_20.setValue("#{ClienteMB.cliente.ativo}");
                            __jsp_tag_starteval=__jsp_taghandler_20.doStartTag();
                            if (__jsp_taghandler_20.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                              return;
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_20,6);
                          }
                          out.write(__oracle_jsp_text[27]);
                        }
                        if (__jsp_taghandler_17.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_17,5);
                      }
                      out.write(__oracle_jsp_text[28]);
                      {
                        com.sun.faces.taglib.html_basic.OutputLabelTag __jsp_taghandler_21=(com.sun.faces.taglib.html_basic.OutputLabelTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.OutputLabelTag.class,"com.sun.faces.taglib.html_basic.OutputLabelTag value for");
                        __jsp_taghandler_21.setParent(__jsp_taghandler_6);
                        __jsp_taghandler_21.setValue(" Rua");
                        __jsp_taghandler_21.setFor("rua");
                        __jsp_tag_starteval=__jsp_taghandler_21.doStartTag();
                        if (__jsp_taghandler_21.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_21,5);
                      }
                      out.write(__oracle_jsp_text[29]);
                      {
                        com.sun.faces.taglib.html_basic.PanelGridTag __jsp_taghandler_22=(com.sun.faces.taglib.html_basic.PanelGridTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.PanelGridTag.class,"com.sun.faces.taglib.html_basic.PanelGridTag columns");
                        __jsp_taghandler_22.setParent(__jsp_taghandler_6);
                        __jsp_taghandler_22.setColumns("3");
                        __jsp_tag_starteval=__jsp_taghandler_22.doStartTag();
                        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                        {
                          out.write(__oracle_jsp_text[30]);
                          {
                            com.sun.faces.taglib.html_basic.InputTextTag __jsp_taghandler_23=(com.sun.faces.taglib.html_basic.InputTextTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.InputTextTag.class,"com.sun.faces.taglib.html_basic.InputTextTag id required value size");
                            __jsp_taghandler_23.setParent(__jsp_taghandler_22);
                            __jsp_taghandler_23.setId("rua");
                            __jsp_taghandler_23.setRequired("false");
                            __jsp_taghandler_23.setValue("#{ClienteMB.cliente.enderecoRua}");
                            __jsp_taghandler_23.setSize("50");
                            __jsp_tag_starteval=__jsp_taghandler_23.doStartTag();
                            if (__jsp_taghandler_23.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                              return;
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_23,6);
                          }
                          out.write(__oracle_jsp_text[31]);
                          {
                            com.sun.faces.taglib.html_basic.OutputLabelTag __jsp_taghandler_24=(com.sun.faces.taglib.html_basic.OutputLabelTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.OutputLabelTag.class,"com.sun.faces.taglib.html_basic.OutputLabelTag value for");
                            __jsp_taghandler_24.setParent(__jsp_taghandler_22);
                            __jsp_taghandler_24.setValue(" Numero");
                            __jsp_taghandler_24.setFor("numero");
                            __jsp_tag_starteval=__jsp_taghandler_24.doStartTag();
                            if (__jsp_taghandler_24.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                              return;
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_24,6);
                          }
                          out.write(__oracle_jsp_text[32]);
                          {
                            com.sun.faces.taglib.html_basic.InputTextTag __jsp_taghandler_25=(com.sun.faces.taglib.html_basic.InputTextTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.InputTextTag.class,"com.sun.faces.taglib.html_basic.InputTextTag id required value size");
                            __jsp_taghandler_25.setParent(__jsp_taghandler_22);
                            __jsp_taghandler_25.setId("numero");
                            __jsp_taghandler_25.setRequired("false");
                            __jsp_taghandler_25.setValue("#{ClienteMB.cliente.enderecoNumero}");
                            __jsp_taghandler_25.setSize("4");
                            __jsp_tag_starteval=__jsp_taghandler_25.doStartTag();
                            if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                            {
                              out.write(__oracle_jsp_text[33]);
                              {
                                com.sun.faces.taglib.jsf_core.ValidateLongRangeTag __jsp_taghandler_26=(com.sun.faces.taglib.jsf_core.ValidateLongRangeTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.jsf_core.ValidateLongRangeTag.class,"com.sun.faces.taglib.jsf_core.ValidateLongRangeTag maximum minimum");
                                __jsp_taghandler_26.setParent(__jsp_taghandler_25);
                                __jsp_taghandler_26.setMaximum("99999");
                                __jsp_taghandler_26.setMinimum("1");
                                __jsp_tag_starteval=__jsp_taghandler_26.doStartTag();
                                if (__jsp_taghandler_26.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                  return;
                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_26,7);
                              }
                              out.write(__oracle_jsp_text[34]);
                            }
                            if (__jsp_taghandler_25.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                              return;
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_25,6);
                          }
                          out.write(__oracle_jsp_text[35]);
                        }
                        if (__jsp_taghandler_22.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_22,5);
                      }
                      out.write(__oracle_jsp_text[36]);
                      {
                        com.sun.faces.taglib.html_basic.OutputLabelTag __jsp_taghandler_27=(com.sun.faces.taglib.html_basic.OutputLabelTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.OutputLabelTag.class,"com.sun.faces.taglib.html_basic.OutputLabelTag value for");
                        __jsp_taghandler_27.setParent(__jsp_taghandler_6);
                        __jsp_taghandler_27.setValue("Bairro");
                        __jsp_taghandler_27.setFor("bairro");
                        __jsp_tag_starteval=__jsp_taghandler_27.doStartTag();
                        if (__jsp_taghandler_27.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_27,5);
                      }
                      out.write(__oracle_jsp_text[37]);
                      {
                        com.sun.faces.taglib.html_basic.PanelGridTag __jsp_taghandler_28=(com.sun.faces.taglib.html_basic.PanelGridTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.PanelGridTag.class,"com.sun.faces.taglib.html_basic.PanelGridTag columns");
                        __jsp_taghandler_28.setParent(__jsp_taghandler_6);
                        __jsp_taghandler_28.setColumns("3");
                        __jsp_tag_starteval=__jsp_taghandler_28.doStartTag();
                        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                        {
                          out.write(__oracle_jsp_text[38]);
                          {
                            com.sun.faces.taglib.html_basic.InputTextTag __jsp_taghandler_29=(com.sun.faces.taglib.html_basic.InputTextTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.InputTextTag.class,"com.sun.faces.taglib.html_basic.InputTextTag id required value");
                            __jsp_taghandler_29.setParent(__jsp_taghandler_28);
                            __jsp_taghandler_29.setId("bairro");
                            __jsp_taghandler_29.setRequired("false");
                            __jsp_taghandler_29.setValue("#{ClienteMB.cliente.enderecoBairro}");
                            __jsp_tag_starteval=__jsp_taghandler_29.doStartTag();
                            if (__jsp_taghandler_29.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                              return;
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_29,6);
                          }
                          out.write(__oracle_jsp_text[39]);
                          {
                            com.sun.faces.taglib.html_basic.OutputLabelTag __jsp_taghandler_30=(com.sun.faces.taglib.html_basic.OutputLabelTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.OutputLabelTag.class,"com.sun.faces.taglib.html_basic.OutputLabelTag value for");
                            __jsp_taghandler_30.setParent(__jsp_taghandler_28);
                            __jsp_taghandler_30.setValue("Cep");
                            __jsp_taghandler_30.setFor("cep");
                            __jsp_tag_starteval=__jsp_taghandler_30.doStartTag();
                            if (__jsp_taghandler_30.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                              return;
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_30,6);
                          }
                          out.write(__oracle_jsp_text[40]);
                          {
                            com.sun.faces.taglib.html_basic.InputTextTag __jsp_taghandler_31=(com.sun.faces.taglib.html_basic.InputTextTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.InputTextTag.class,"com.sun.faces.taglib.html_basic.InputTextTag id required value size");
                            __jsp_taghandler_31.setParent(__jsp_taghandler_28);
                            __jsp_taghandler_31.setId("cep");
                            __jsp_taghandler_31.setRequired("false");
                            __jsp_taghandler_31.setValue("#{ClienteMB.cliente.enderecoCep}");
                            __jsp_taghandler_31.setSize("9");
                            __jsp_tag_starteval=__jsp_taghandler_31.doStartTag();
                            if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                            {
                              out.write(__oracle_jsp_text[41]);
                              {
                                com.sun.faces.taglib.jsf_core.ValidateLengthTag __jsp_taghandler_32=(com.sun.faces.taglib.jsf_core.ValidateLengthTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.jsf_core.ValidateLengthTag.class,"com.sun.faces.taglib.jsf_core.ValidateLengthTag maximum minimum");
                                __jsp_taghandler_32.setParent(__jsp_taghandler_31);
                                __jsp_taghandler_32.setMaximum("8");
                                __jsp_taghandler_32.setMinimum("9");
                                __jsp_tag_starteval=__jsp_taghandler_32.doStartTag();
                                if (__jsp_taghandler_32.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                  return;
                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_32,7);
                              }
                              out.write(__oracle_jsp_text[42]);
                            }
                            if (__jsp_taghandler_31.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                              return;
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_31,6);
                          }
                          out.write(__oracle_jsp_text[43]);
                        }
                        if (__jsp_taghandler_28.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_28,5);
                      }
                      out.write(__oracle_jsp_text[44]);
                      {
                        com.sun.faces.taglib.html_basic.OutputLabelTag __jsp_taghandler_33=(com.sun.faces.taglib.html_basic.OutputLabelTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.OutputLabelTag.class,"com.sun.faces.taglib.html_basic.OutputLabelTag value for");
                        __jsp_taghandler_33.setParent(__jsp_taghandler_6);
                        __jsp_taghandler_33.setValue("Cidade");
                        __jsp_taghandler_33.setFor("cidade");
                        __jsp_tag_starteval=__jsp_taghandler_33.doStartTag();
                        if (__jsp_taghandler_33.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_33,5);
                      }
                      out.write(__oracle_jsp_text[45]);
                      {
                        com.sun.faces.taglib.html_basic.PanelGridTag __jsp_taghandler_34=(com.sun.faces.taglib.html_basic.PanelGridTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.PanelGridTag.class,"com.sun.faces.taglib.html_basic.PanelGridTag columns");
                        __jsp_taghandler_34.setParent(__jsp_taghandler_6);
                        __jsp_taghandler_34.setColumns("3");
                        __jsp_tag_starteval=__jsp_taghandler_34.doStartTag();
                        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                        {
                          out.write(__oracle_jsp_text[46]);
                          {
                            com.sun.faces.taglib.html_basic.InputTextTag __jsp_taghandler_35=(com.sun.faces.taglib.html_basic.InputTextTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.InputTextTag.class,"com.sun.faces.taglib.html_basic.InputTextTag id value size");
                            __jsp_taghandler_35.setParent(__jsp_taghandler_34);
                            __jsp_taghandler_35.setId("cidade");
                            __jsp_taghandler_35.setValue("#{ClienteMB.cliente.enderecoCidade}");
                            __jsp_taghandler_35.setSize("20");
                            __jsp_tag_starteval=__jsp_taghandler_35.doStartTag();
                            if (__jsp_taghandler_35.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                              return;
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_35,6);
                          }
                          out.write(__oracle_jsp_text[47]);
                          {
                            com.sun.faces.taglib.html_basic.OutputLabelTag __jsp_taghandler_36=(com.sun.faces.taglib.html_basic.OutputLabelTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.OutputLabelTag.class,"com.sun.faces.taglib.html_basic.OutputLabelTag value for");
                            __jsp_taghandler_36.setParent(__jsp_taghandler_34);
                            __jsp_taghandler_36.setValue("Estado");
                            __jsp_taghandler_36.setFor("estado");
                            __jsp_tag_starteval=__jsp_taghandler_36.doStartTag();
                            if (__jsp_taghandler_36.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                              return;
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_36,6);
                          }
                          out.write(__oracle_jsp_text[48]);
                          {
                            com.sun.faces.taglib.html_basic.InputTextTag __jsp_taghandler_37=(com.sun.faces.taglib.html_basic.InputTextTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.InputTextTag.class,"com.sun.faces.taglib.html_basic.InputTextTag id required value size");
                            __jsp_taghandler_37.setParent(__jsp_taghandler_34);
                            __jsp_taghandler_37.setId("estado");
                            __jsp_taghandler_37.setRequired("false");
                            __jsp_taghandler_37.setValue("#{ClienteMB.cliente.enderecoEstado}");
                            __jsp_taghandler_37.setSize("20");
                            __jsp_tag_starteval=__jsp_taghandler_37.doStartTag();
                            if (__jsp_taghandler_37.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                              return;
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_37,6);
                          }
                          out.write(__oracle_jsp_text[49]);
                        }
                        if (__jsp_taghandler_34.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_34,5);
                      }
                      out.write(__oracle_jsp_text[50]);
                      {
                        com.sun.faces.taglib.html_basic.CommandButtonTag __jsp_taghandler_38=(com.sun.faces.taglib.html_basic.CommandButtonTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.CommandButtonTag.class,"com.sun.faces.taglib.html_basic.CommandButtonTag action value");
                        __jsp_taghandler_38.setParent(__jsp_taghandler_6);
                        __jsp_taghandler_38.setAction("#{ClienteMB.save}");
                        __jsp_taghandler_38.setValue("Salvar");
                        __jsp_tag_starteval=__jsp_taghandler_38.doStartTag();
                        if (__jsp_taghandler_38.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_38,5);
                      }
                      out.write(__oracle_jsp_text[51]);
                    }
                    if (__jsp_taghandler_6.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_6,4);
                  }
                  out.write(__oracle_jsp_text[52]);
                }
                if (__jsp_taghandler_3.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_3,3);
              }
              out.write(__oracle_jsp_text[53]);
              {
                com.sun.faces.taglib.html_basic.MessagesTag __jsp_taghandler_39=(com.sun.faces.taglib.html_basic.MessagesTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.MessagesTag.class,"com.sun.faces.taglib.html_basic.MessagesTag");
                __jsp_taghandler_39.setParent(__jsp_taghandler_2);
                __jsp_tag_starteval=__jsp_taghandler_39.doStartTag();
                if (__jsp_taghandler_39.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_39,3);
              }
              out.write(__oracle_jsp_text[54]);
            }
            if (__jsp_taghandler_2.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
              return;
            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_2,2);
          }
          out.write(__oracle_jsp_text[55]);
        }
        if (__jsp_taghandler_1.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_1,1);
      }
      out.write(__oracle_jsp_text[56]);


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
  private static final char __oracle_jsp_text[][]=new char[57][];
  static {
    try {
    __oracle_jsp_text[0] = 
    "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n\"http://www.w3.org/TR/html4/loose.dtd\">\n".toCharArray();
    __oracle_jsp_text[1] = 
    "\n".toCharArray();
    __oracle_jsp_text[2] = 
    "\n".toCharArray();
    __oracle_jsp_text[3] = 
    "\n".toCharArray();
    __oracle_jsp_text[4] = 
    "\n    ".toCharArray();
    __oracle_jsp_text[5] = 
    "\n        ".toCharArray();
    __oracle_jsp_text[6] = 
    "\n            ".toCharArray();
    __oracle_jsp_text[7] = 
    "\n                ".toCharArray();
    __oracle_jsp_text[8] = 
    "\n            ".toCharArray();
    __oracle_jsp_text[9] = 
    "\n            ".toCharArray();
    __oracle_jsp_text[10] = 
    "\n                ".toCharArray();
    __oracle_jsp_text[11] = 
    "\n                ".toCharArray();
    __oracle_jsp_text[12] = 
    "\n                    ".toCharArray();
    __oracle_jsp_text[13] = 
    "\n                ".toCharArray();
    __oracle_jsp_text[14] = 
    "\n                ".toCharArray();
    __oracle_jsp_text[15] = 
    "\n                ".toCharArray();
    __oracle_jsp_text[16] = 
    "\n                    ".toCharArray();
    __oracle_jsp_text[17] = 
    "\n                    ".toCharArray();
    __oracle_jsp_text[18] = 
    "\n                    ".toCharArray();
    __oracle_jsp_text[19] = 
    "\n                        ".toCharArray();
    __oracle_jsp_text[20] = 
    "\n                    ".toCharArray();
    __oracle_jsp_text[21] = 
    "\n                ".toCharArray();
    __oracle_jsp_text[22] = 
    "\n                ".toCharArray();
    __oracle_jsp_text[23] = 
    "\n                ".toCharArray();
    __oracle_jsp_text[24] = 
    "\n                    ".toCharArray();
    __oracle_jsp_text[25] = 
    "\n                    ".toCharArray();
    __oracle_jsp_text[26] = 
    "\n                    ".toCharArray();
    __oracle_jsp_text[27] = 
    "\n                ".toCharArray();
    __oracle_jsp_text[28] = 
    "\n                ".toCharArray();
    __oracle_jsp_text[29] = 
    "\n                ".toCharArray();
    __oracle_jsp_text[30] = 
    "\n                    ".toCharArray();
    __oracle_jsp_text[31] = 
    "\n                    ".toCharArray();
    __oracle_jsp_text[32] = 
    "\n                    ".toCharArray();
    __oracle_jsp_text[33] = 
    "\n                        ".toCharArray();
    __oracle_jsp_text[34] = 
    "\n                    ".toCharArray();
    __oracle_jsp_text[35] = 
    "\n                ".toCharArray();
    __oracle_jsp_text[36] = 
    "\n                ".toCharArray();
    __oracle_jsp_text[37] = 
    "\n                ".toCharArray();
    __oracle_jsp_text[38] = 
    "\n                    ".toCharArray();
    __oracle_jsp_text[39] = 
    "\n                    ".toCharArray();
    __oracle_jsp_text[40] = 
    "\n                    ".toCharArray();
    __oracle_jsp_text[41] = 
    "\n                        ".toCharArray();
    __oracle_jsp_text[42] = 
    "\n                    ".toCharArray();
    __oracle_jsp_text[43] = 
    "\n                ".toCharArray();
    __oracle_jsp_text[44] = 
    "\n                ".toCharArray();
    __oracle_jsp_text[45] = 
    "\n                ".toCharArray();
    __oracle_jsp_text[46] = 
    "\n                    ".toCharArray();
    __oracle_jsp_text[47] = 
    "\n                    ".toCharArray();
    __oracle_jsp_text[48] = 
    "\n                    ".toCharArray();
    __oracle_jsp_text[49] = 
    "\n                ".toCharArray();
    __oracle_jsp_text[50] = 
    "\n                ".toCharArray();
    __oracle_jsp_text[51] = 
    "\n            ".toCharArray();
    __oracle_jsp_text[52] = 
    "\n        ".toCharArray();
    __oracle_jsp_text[53] = 
    "\n        ".toCharArray();
    __oracle_jsp_text[54] = 
    "\n    ".toCharArray();
    __oracle_jsp_text[55] = 
    "\n    \n".toCharArray();
    __oracle_jsp_text[56] = 
    "\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
