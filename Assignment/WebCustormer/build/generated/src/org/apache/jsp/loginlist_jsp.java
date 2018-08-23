package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class loginlist_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.2.0/css/all.css\" integrity=\"sha384-hWVjflwFxL6sNzntih27bfxkr27PmbbK/iSvJ+a4+0owXq79v+lsFkW54bOGbiDQ\" crossorigin=\"anonymous\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n");
      out.write("        <!-- Google Fonts -->\n");
      out.write("        <link href='https://fonts.googleapis.com/css?family=Passion+One' rel='stylesheet' type='text/css'>\n");
      out.write("        <link href='https://fonts.googleapis.com/css?family=Oxygen' rel='stylesheet' type='text/css'>\n");
      out.write("        <link href=\"css/main1.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container w-75\"  style=\"background-color: #eee;\">\n");
      out.write("            <div class=\"panel-heading\">\n");
      out.write("                <div class=\"panel-title text-center\">\n");
      out.write("                    <h1 class=\"title1\" align=\"center\">Lựa chọn của bạn</h1>\n");
      out.write("                    <hr />\n");
      out.write("                </div>\n");
      out.write("            </div> \n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-6\">\n");
      out.write("                    <div class=\"panel-heading\">\n");
      out.write("                        <div class=\"panel-title text-center\">\n");
      out.write("                            <h4 class=\"title1\" align=\"center\">lịch sử với mã giao dịch</h4>                    \n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"main-login main-center\">\n");
      out.write("                            <form class=\"form-horizontal\" method=\"POST\" action=\"/WebCustormer/getlist\" name=\"codedg\">\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"codedg\" class=\"cols-sm-2 control-label\">Code chermar</label>\n");
      out.write("                                    <div class=\"cols-sm-10\">\n");
      out.write("                                        <div class=\"input-group\">\n");
      out.write("                                            <span class=\"input-group-text\"><i class=\"fa fa-user fa\" aria-hidden=\"true\"></i></span>\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" name=\"codedg\"  placeholder=\"Enter Code Custormer\"/>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>       \n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"passdg\" class=\"cols-sm-2 control-label\">pass chermar</label>\n");
      out.write("                                    <div class=\"cols-sm-10\">\n");
      out.write("                                        <div class=\"input-group\">\n");
      out.write("                                            <span class=\"input-group-text\"><i class=\"fa fa-lock fa-lg\" aria-hidden=\"true\"></i></span>\n");
      out.write("                                            <input type=\"password\" class=\"form-control\" name=\"passdg\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${passdg}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"  placeholder=\"Enter pass dg\"/>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"start\" class=\"cols-sm-2 control-label\">Start</label>\n");
      out.write("                                    <div class=\"cols-sm-10\">\n");
      out.write("                                        <div class=\"input-group\">\n");
      out.write("                                            <span class=\"input-group-text\"><i class=\"fas fa-calendar-alt fa-lg\" aria-hidden=\"true\"></i></span>\n");
      out.write("                                            <input type=\"datetime\" class=\"form-control\" name=\"trip\" value=\"2018-01-01\" min=\"2018-01-01\" max=\"2018-12-31\"/>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"end\" class=\"cols-sm-2 control-label\">End</label>\n");
      out.write("                                    <div class=\"cols-sm-10\">\n");
      out.write("                                        <div class=\"input-group\">\n");
      out.write("                                            <span class=\"input-group-text\"><i class=\"fas fa-calendar-alt fa-lg\" aria-hidden=\"true\"></i></span>\n");
      out.write("                                            <input type=\"datetime\" class=\"form-control\" name=\"trip\" value=\"2018-12-12\" min=\"2018-01-01\" max=\"2018-12-31\"/>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"form-group \">\n");
      out.write("                                    <input type=\"submit\" class=\"btn btn-primary btn-lg btn-block login-button\" name=\"buttonsm\" value=\"Submit charmer\"/>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"login-register\">\n");
      out.write("                                    <a href=\"index.jsp\">Back</a>\n");
      out.write("                                </div>\n");
      out.write("                            </form>\n");
      out.write("                        </div>         \n");
      out.write("                    </div> \n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"col-sm-6\">\n");
      out.write("                    <div class=\"panel-heading\">\n");
      out.write("                        <div class=\"panel-title text-center\">\n");
      out.write("                            <h4 class=\"title1\" align=\"center\">lịch sử với mã tài khoản</h4>                    \n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"main-login main-center\">\n");
      out.write("                            <form class=\"form-horizontal\" method=\"POST\" action=\"/WebCustormer/getlist\" name=\"codeuser\">\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"codeUser\" class=\"cols-sm-2 control-label\">Code User</label>\n");
      out.write("                                    <div class=\"cols-sm-10\">\n");
      out.write("                                        <div class=\"input-group\">\n");
      out.write("                                            <span class=\"input-group-text\"><i class=\"fa fa-user fa\" aria-hidden=\"true\"></i></span>\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" name=\"codedg\"  placeholder=\"Enter Code Custormer\"/>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>       \n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"codePin\" class=\"cols-sm-2 control-label\">code Pin</label>\n");
      out.write("                                    <div class=\"cols-sm-10\">\n");
      out.write("                                        <div class=\"input-group\">\n");
      out.write("                                            <span class=\"input-group-text\"><i class=\"fa fa-lock fa-lg\" aria-hidden=\"true\"></i></span>\n");
      out.write("                                            <input type=\"password\" class=\"form-control\" name=\"passdg\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${passdg}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"  placeholder=\"Enter pass dg\"/>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"start\" class=\"cols-sm-2 control-label\">Start</label>\n");
      out.write("                                    <div class=\"cols-sm-10\">\n");
      out.write("                                        <div class=\"input-group\">\n");
      out.write("                                            <span class=\"input-group-text\"><i class=\"fas fa-calendar-alt fa-lg\" aria-hidden=\"true\"></i></span>\n");
      out.write("                                            <input type=\"date\" class=\"form-control\" name=\"trip\" value=\"2018-01-01\" min=\"2018-01-01\" max=\"2018-12-31\"/>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"end\" class=\"cols-sm-2 control-label\">End</label>\n");
      out.write("                                    <div class=\"cols-sm-10\">\n");
      out.write("                                        <div class=\"input-group\">\n");
      out.write("                                            <span class=\"input-group-text\"><i class=\"fas fa-calendar-alt fa-lg\" aria-hidden=\"true\"></i></span>\n");
      out.write("                                            <input type=\"date\" class=\"form-control\" name=\"trip\" value=\"2018-12-12\" min=\"2018-01-01\" max=\"2018-12-31\"/>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>        \n");
      out.write("                                <div class=\"form-group \">\n");
      out.write("                                    <input type=\"submit\" class=\"btn btn-primary btn-lg btn-block login-button\" name=\"buttonsm\"value=\"Submit User\"/>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"login-register\">\n");
      out.write("                                    <a href=\"index.jsp\">Back</a>\n");
      out.write("                                </div>\n");
      out.write("                            </form>\n");
      out.write("                        </div>         \n");
      out.write("                    </div> \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
