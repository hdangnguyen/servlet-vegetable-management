package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class successFrom_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>Bootstrap Simple Success Confirmation Popup</title>\n");
      out.write("<link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Roboto|Varela+Round\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/icon?family=Material+Icons\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.5.1.min.js\"></script>\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\"></script>\n");
      out.write("<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js\"></script>\n");
      out.write("<style>\n");
      out.write("body {\n");
      out.write("\tfont-family: 'Varela Round', sans-serif;\n");
      out.write("}\n");
      out.write(".modal-confirm {\t\t\n");
      out.write("\tcolor: #636363;\n");
      out.write("\twidth: 325px;\n");
      out.write("\tfont-size: 14px;\n");
      out.write("}\n");
      out.write(".modal-confirm .modal-content {\n");
      out.write("\tpadding: 20px;\n");
      out.write("\tborder-radius: 5px;\n");
      out.write("\tborder: none;\n");
      out.write("}\n");
      out.write(".modal-confirm .modal-header {\n");
      out.write("\tborder-bottom: none;   \n");
      out.write("\tposition: relative;\n");
      out.write("}\n");
      out.write(".modal-confirm h4 {\n");
      out.write("\ttext-align: center;\n");
      out.write("\tfont-size: 26px;\n");
      out.write("\tmargin: 30px 0 -15px;\n");
      out.write("}\n");
      out.write(".modal-confirm .form-control, .modal-confirm .btn {\n");
      out.write("\tmin-height: 40px;\n");
      out.write("\tborder-radius: 3px; \n");
      out.write("}\n");
      out.write(".modal-confirm .close {\n");
      out.write("\tposition: absolute;\n");
      out.write("\ttop: -5px;\n");
      out.write("\tright: -5px;\n");
      out.write("}\t\n");
      out.write(".modal-confirm .modal-footer {\n");
      out.write("\tborder: none;\n");
      out.write("\ttext-align: center;\n");
      out.write("\tborder-radius: 5px;\n");
      out.write("\tfont-size: 13px;\n");
      out.write("}\t\n");
      out.write(".modal-confirm .icon-box {\n");
      out.write("\tcolor: #fff;\t\t\n");
      out.write("\tposition: absolute;\n");
      out.write("\tmargin: 0 auto;\n");
      out.write("\tleft: 0;\n");
      out.write("\tright: 0;\n");
      out.write("\ttop: -70px;\n");
      out.write("\twidth: 95px;\n");
      out.write("\theight: 95px;\n");
      out.write("\tborder-radius: 50%;\n");
      out.write("\tz-index: 9;\n");
      out.write("\tbackground: #82ce34;\n");
      out.write("\tpadding: 15px;\n");
      out.write("\ttext-align: center;\n");
      out.write("\tbox-shadow: 0px 2px 2px rgba(0, 0, 0, 0.1);\n");
      out.write("}\n");
      out.write(".modal-confirm .icon-box i {\n");
      out.write("\tfont-size: 58px;\n");
      out.write("\tposition: relative;\n");
      out.write("\ttop: 3px;\n");
      out.write("}\n");
      out.write(".modal-confirm.modal-dialog {\n");
      out.write("\tmargin-top: 80px;\n");
      out.write("}\n");
      out.write(".modal-confirm .btn {\n");
      out.write("\tcolor: #fff;\n");
      out.write("\tborder-radius: 4px;\n");
      out.write("\tbackground: #82ce34;\n");
      out.write("\ttext-decoration: none;\n");
      out.write("\ttransition: all 0.4s;\n");
      out.write("\tline-height: normal;\n");
      out.write("\tborder: none;\n");
      out.write("}\n");
      out.write(".modal-confirm .btn:hover, .modal-confirm .btn:focus {\n");
      out.write("\tbackground: #6fb32b;\n");
      out.write("\toutline: none;\n");
      out.write("}\n");
      out.write(".trigger-btn {\n");
      out.write("\tdisplay: inline-block;\n");
      out.write("\tmargin: 100px auto;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Modal HTML -->\n");
      out.write("<div id=\"myModal\" class=\"modal fade\">\n");
      out.write("\t<div class=\"modal-dialog modal-confirm\">\n");
      out.write("\t\t<div class=\"modal-content\">\n");
      out.write("\t\t\t<div class=\"modal-header\">\n");
      out.write("\t\t\t\t<div class=\"icon-box\">\n");
      out.write("\t\t\t\t\t<i class=\"material-icons\">&#xE876;</i>\n");
      out.write("\t\t\t\t</div>\t\t\t\t\n");
      out.write("\t\t\t\t<h4 class=\"modal-title w-100\">Awesome!</h4>\t\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"modal-body\">\n");
      out.write("\t\t\t\t<p class=\"text-center\">Your booking has been confirmed. Check your email for detials.</p>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"modal-footer\">\n");
      out.write("\t\t\t\t<button class=\"btn btn-success btn-block\" data-dismiss=\"modal\">OK</button>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div>     \n");
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
