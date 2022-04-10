package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class loadProduct_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Roboto:400,700\">\n");
      out.write("<title>Bootstrap Simple Registration Form</title>\n");
      out.write("<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.5.1.min.js\"></script>\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\"></script>\n");
      out.write("<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js\"></script>\n");
      out.write("<style>\n");
      out.write("body {\n");
      out.write("\tcolor: #fff;\n");
      out.write("\tbackground: #63738a;\n");
      out.write("\tfont-family: 'Roboto', sans-serif;\n");
      out.write("}\n");
      out.write(".form-control {\n");
      out.write("\theight: 40px;\n");
      out.write("\tbox-shadow: none;\n");
      out.write("\tcolor: #969fa4;\n");
      out.write("}\n");
      out.write(".form-control:focus {\n");
      out.write("\tborder-color: #5cb85c;\n");
      out.write("}\n");
      out.write(".form-control, .btn {        \n");
      out.write("\tborder-radius: 3px;\n");
      out.write("}\n");
      out.write(".signup-form {\n");
      out.write("\twidth: 450px;\n");
      out.write("\tmargin: 0 auto;\n");
      out.write("\tpadding: 30px 0;\n");
      out.write("  \tfont-size: 15px;\n");
      out.write("}\n");
      out.write(".signup-form h2 {\n");
      out.write("\tcolor: #636363;\n");
      out.write("\tmargin: 0 0 15px;\n");
      out.write("\tposition: relative;\n");
      out.write("\ttext-align: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".signup-form h2:after {\n");
      out.write("\tright: 0;\n");
      out.write("}\n");
      out.write(".signup-form .hint-text {\n");
      out.write("\tcolor: #999;\n");
      out.write("\tmargin-bottom: 30px;\n");
      out.write("\ttext-align: center;\n");
      out.write("}\n");
      out.write(".signup-form form {\n");
      out.write("\tcolor: #999;\n");
      out.write("\tborder-radius: 3px;\n");
      out.write("\tmargin-bottom: 15px;\n");
      out.write("\tbackground: #f2f3f7;\n");
      out.write("\tbox-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);\n");
      out.write("\tpadding: 30px;\n");
      out.write("}\n");
      out.write(".signup-form .form-group {\n");
      out.write("\tmargin-bottom: 20px;\n");
      out.write("}\n");
      out.write(".signup-form input[type=\"checkbox\"] {\n");
      out.write("\tmargin-top: 3px;\n");
      out.write("}\n");
      out.write(".signup-form .btn {        \n");
      out.write("\tfont-size: 16px;\n");
      out.write("\tfont-weight: bold;\t\t\n");
      out.write("\tmin-width: 140px;\n");
      out.write("\toutline: none !important;\n");
      out.write("}\n");
      out.write(".signup-form .row div:first-child {\n");
      out.write("\tpadding-right: 10px;\n");
      out.write("}\n");
      out.write(".signup-form .row div:last-child {\n");
      out.write("\tpadding-left: 10px;\n");
      out.write("}    \t\n");
      out.write(".signup-form a {\n");
      out.write("\tcolor: #fff;\n");
      out.write("\ttext-decoration: underline;\n");
      out.write("}\n");
      out.write(".signup-form a:hover {\n");
      out.write("\ttext-decoration: none;\n");
      out.write("}\n");
      out.write(".signup-form form a {\n");
      out.write("\tcolor: #5cb85c;\n");
      out.write("\ttext-decoration: none;\n");
      out.write("}\t\n");
      out.write(".signup-form form a:hover {\n");
      out.write("\ttext-decoration: underline;\n");
      out.write("}  \n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div class=\"signup-form\">\n");
      out.write("    <form method=\"post\">\n");
      out.write("\t\t<h2>Update Product</h2>\n");
      out.write("\t\t<p class=\"hint-text\">Edit information below to update product.</p>\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t<div class=\"col\"><input type=\"text\" class=\"form-control\" name=\"first_name\" placeholder=\"First Name\" required=\"required\"></div>\n");
      out.write("\t\t\t</div>        \t\n");
      out.write("        </div>\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("        \t<input type=\"email\" class=\"form-control\" name=\"email\" placeholder=\"Email\" required=\"required\">\n");
      out.write("        </div>\n");
      out.write("\t\t<div class=\"form-group\">\n");
      out.write("            <input type=\"password\" class=\"form-control\" name=\"password\" placeholder=\"Password\" required=\"required\">\n");
      out.write("        </div>\n");
      out.write("\t\t<div class=\"form-group\">\n");
      out.write("            <input type=\"password\" class=\"form-control\" name=\"confirm_password\" placeholder=\"Confirm Password\" required=\"required\">\n");
      out.write("        </div>        \n");
      out.write("        <div class=\"form-group\">\n");
      out.write("\t\t\t<label class=\"form-check-label\"><input type=\"checkbox\" required=\"required\"> I accept the <a href=\"#\">Terms of Use</a> &amp; <a href=\"#\">Privacy Policy</a></label>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"form-group\">\n");
      out.write("            <button type=\"submit\" class=\"btn btn-success btn-lg btn-block\">Register Now</button>\n");
      out.write("        </div>\n");
      out.write("    </form>\n");
      out.write("\t<div class=\"text-center\">Already have an account? <a href=\"#\">Sign in</a></div>\n");
      out.write("</div>\n");
      out.write("    <div id=\"update-product\" >\n");
      out.write("            <div class=\"modal-dialog\">\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    <form action=\"MainController\" method=\"POST\">\n");
      out.write("                        <div class=\"modal-header\">\t\t\t\t\t\t\n");
      out.write("                            <h4 class=\"modal-title\">Edit Product</h4>\n");
      out.write("                            <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">&times;</button>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"modal-body\">\t\t\t\t\t\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Product Name</label>\n");
      out.write("                                <input type=\"text\" class=\"form-control\" required>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Image</label>\n");
      out.write("                                <input type=\"text\" class=\"form-control\" required>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Price</label>\n");
      out.write("                                <textarea class=\"form-control\" required></textarea>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Quantity</label>\n");
      out.write("                                <input type=\"text\" class=\"form-control\" required>\n");
      out.write("                            </div>\t\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Category</label>\n");
      out.write("                                <select name=\"category\" aria-lable=\"Default select example\">\n");
      out.write("                                    <c:forEach items=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${List_Category}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" var=\"o\">\n");
      out.write("                                        <option value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.categoryID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write('"');
      out.write('>');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.categoryName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</option>\n");
      out.write("                                    </c:forEach>\n");
      out.write("                                </select>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"modal-footer\">\n");
      out.write("                            <input type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\" value=\"Cancel\">\n");
      out.write("                            <input type=\"submit\" class=\"btn btn-info\" value=\"Update\" name=\"action\">\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("</body>\n");
      out.write("</html>");
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
