package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class orderPage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<link href=\"//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>order Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.6.1/css/font-awesome.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.2.0/css/all.css\" integrity=\"sha384-hWVjflwFxL6sNzntih27bfxkr27PmbbK/iSvJ+a4+0owXq79v+lsFkW54bOGbiDQ\" crossorigin=\"anonymous\">\n");
      out.write("        <!-- Google Fonts -->\n");
      out.write("        <link href='https://fonts.googleapis.com/css?family=Passion+One' rel='stylesheet' type='text/css'>\n");
      out.write("        <link href='https://fonts.googleapis.com/css?family=Oxygen' rel='stylesheet' type='text/css'>\n");
      out.write("        <link href=\"main.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row main\">\n");
      out.write("                <div class=\"panel-heading\">\n");
      out.write("                    <div class=\"panel-title text-center\">\n");
      out.write("                        <h1 class=\"title\">Infor Order</h1>\n");
      out.write("                        <hr />\n");
      out.write("                    </div>\n");
      out.write("                </div> \n");
      out.write("                <div class=\"main-login main-center\">\n");
      out.write("                    <form class=\"form-horizontal\" method=\"POST\" action=\"/WebCustormer/order\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"codeOrder\" class=\"cols-sm-2 control-label\">Code Order</label>\n");
      out.write("                            <div class=\"cols-sm-10\">\n");
      out.write("                                <div class=\"input-group\">\n");
      out.write("                                    <span class=\"input-group-addon\"><i class=\"fa fa-user fa\" aria-hidden=\"true\"></i></span>\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" name=\"codeOrder\"  placeholder=\"Enter Code Order\"/>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"nameOrder\" class=\"cols-sm-2 control-label\">chosen Order</label>\n");
      out.write("                            <div class=\"cols-sm-10\">        \n");
      out.write("                                <div class=\"input-group\">\n");
      out.write("                                    <span class=\"input-group-addon\"><i class=\"fab fa-jedi-order\" aria-hidden=\"true\"></i></span>\n");
      out.write("                                    <div class=\"form-control\">\n");
      out.write("                                    <input style=\"margin-left: 10px;\" type=\"radio\" name=\"nameOrder\" value=\"0\" checked> your fee \n");
      out.write("                                    <input style=\"margin-left: 10px;\"type=\"radio\" name=\"nameOrder\" value=\"1\"> Custormer's fee<br></div>\n");
      out.write("                                     \n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                                \n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"moneyOrder\" class=\"cols-sm-2 control-label\">Money Order</label>\n");
      out.write("                            <div class=\"cols-sm-10\">\n");
      out.write("                                <div class=\"input-group\">\n");
      out.write("                                    <span class=\"input-group-addon\"><i class=\"fas fa-money-check-alt\" aria-hidden=\"true\"></i></span>\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" name=\"moneyOrder\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${moneyOrder}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"  placeholder=\"Enter bills of money\"/>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>        \n");
      out.write("\n");
      out.write("                        <div class=\"form-group\" >\n");
      out.write("                            <label for=\"codeCustomer\" class=\"cols-sm-2 control-label\">Username</label>\n");
      out.write("                            <div class=\"cols-sm-10\">\n");
      out.write("                                <div class=\"input-group\">\n");
      out.write("                                    <span class=\"input-group-addon\"><i class=\"fa fa-users fa\" aria-hidden=\"true\"></i></span>\n");
      out.write("                                    <input hidden=\"true\" type=\"text\" class=\"form-control\" name=\"codeCustomer\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.codeCustormer}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"  iplaceholder=\"Enter code khach hang\"/>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                                \n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"codeUser\" class=\"cols-sm-2 control-label\">Code User</label>\n");
      out.write("                            <div class=\"cols-sm-10\">\n");
      out.write("                                <div class=\"input-group\">\n");
      out.write("                                    <span class=\"input-group-addon\"><i class=\"fa fa-lock fa-lg\" aria-hidden=\"true\"></i></span>\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" name=\"codeUser\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${codeUser}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"  placeholder=\"Enter your code\"/>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>        \n");
      out.write("\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"codePin\" class=\"cols-sm-2 control-label\">code Pin</label>\n");
      out.write("                            <div class=\"cols-sm-10\">\n");
      out.write("                                <div class=\"input-group\">\n");
      out.write("                                    <span class=\"input-group-addon\"><i class=\"fa fa-lock fa-lg\" aria-hidden=\"true\"></i></span>\n");
      out.write("                                    <input type=\"password\" class=\"form-control\" name=\"codePin\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${codePin}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"  placeholder=\"Enter your pin\"/>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group \">\n");
      out.write("                            <input type=\"submit\" class=\"btn btn-primary btn-lg btn-block login-button\" value=\"chuyen tien\"/>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"login-register\">\n");
      out.write("                            <a href=\"index.jsp\">Back</a>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
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
