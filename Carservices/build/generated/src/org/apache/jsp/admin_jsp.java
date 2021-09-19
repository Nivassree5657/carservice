package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/header1.jsp");
    _jspx_dependants.add("/Template.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

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
      out.write("    ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Car service</title>\n");
      out.write("        <style>\n");
      out.write("            .title{\n");
      out.write("                top: 0;\n");
      out.write("                bottom: 0;\n");
      out.write("                height: 100px;\n");
      out.write("                font-family: fantasy;\n");
      out.write("                text-align: center;\n");
      out.write("                font-size: 80px;\n");
      out.write("                color: cyan;\n");
      out.write("                padding: 1px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"title\">Car service</div>\n");
      out.write("        <div align=\"right\">\n");
      out.write("        <a href=\"admin.jsp\"><input type=\"submit\" value=\"Admin\" /></a>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("    ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Car service</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <br> <br/><br/><br/><br/>\n");
      out.write("        <style> \n");
      out.write("            body{\n");
      out.write("                height: 100%;\n");
      out.write("                background-image: url('service.jpg');\n");
      out.write("                background-repeat: no-repeat;\n");
      out.write("                background-size: 100%;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <style>\n");
      out.write("            ::-Webkit-scrollbar{\n");
      out.write("                width: 10px;\n");
      out.write("            }\n");
      out.write("            ::-Webkit-scrollbar-track{\n");
      out.write("                background: black;\n");
      out.write("            }\n");
      out.write("            ::-Webkit-scrollbar-thumb{\n");
      out.write("                background: whitesmoke;\n");
      out.write("            }\n");
      out.write("            ::-Webkit-scrollbar-thumb:hover{\n");
      out.write("                background: #ffff99;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <center>    \n");
      out.write("        <form action=\"logindao\" method=\"POST\">\n");
      out.write("            <table style=\"border: solid white; border-spacing: 15px;  background-color: white; opacity: 0.5\">\n");
      out.write("                <tr><td> \n");
      out.write("                        <h1>Admin Login</h1>\n");
      out.write("       <div align=\"Center\"> \n");
      out.write("           <input type=\"text\" name=\"user\" value=\"\" autofocus=\"\" required=\"\" placeholder=\"username\"/><br/><br/>\n");
      out.write("           <input type=\"password\" name=\"pass\" value=\"\" required=\"\" placeholder=\"password\"/><br/><br/>\n");
      out.write("       </div>\n");
      out.write("                        <div align=\"center\">              \n");
      out.write("                        \n");
      out.write("            <input type=\"submit\" value=\"submit\" style=\"color: white; background-color: black; border-radius: 4px\"/>\n");
      out.write("                        </div>                           \n");
      out.write("            \n");
      out.write("                    </td></tr>   </table>\n");
      out.write("       \n");
      out.write("        </form>\n");
      out.write("    </center>\n");
      out.write("    </body>\n");
      out.write("    <br><br><br>\n");
      out.write("    ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Car service</title>\n");
      out.write("        <style>\n");
      out.write("            .footer{\n");
      out.write("                text-align: left;\n");
      out.write("                font-size:  20px;\n");
      out.write("                color: red;\n");
      out.write("                padding:  1px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"footer\">\n");
      out.write("            <p>E-mail :<a href=\"mailto:choicefist281@gmail.com\" style=\"color: yellow\">choicefist2812@gamil.com</a></p>\n");
      out.write("            <p>Phone :<a href=\"tel:044-3459812\" style=\"color: yellow\">044-3459812</a></p>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("</html>\n");
      out.write("\n");
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
