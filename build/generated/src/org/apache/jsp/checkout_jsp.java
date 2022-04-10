package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class checkout_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("    <!-- Breadcrumb Section Begin -->\n");
      out.write("    <section class=\"breadcrumb-section set-bg\" data-setbg=\"img/breadcrumb.jpg\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-12 text-center\">\n");
      out.write("                    <div class=\"breadcrumb__text\">\n");
      out.write("                        <h2>Checkout</h2>\n");
      out.write("                        <div class=\"breadcrumb__option\">\n");
      out.write("                            <a href=\"./index.html\">Home</a>\n");
      out.write("                            <span>Checkout</span>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("    <!-- Breadcrumb Section End -->\n");
      out.write("\n");
      out.write("    <!-- Checkout Section Begin -->\n");
      out.write("    <section class=\"checkout spad\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-12\">\n");
      out.write("                    <h6><span class=\"icon_tag_alt\"></span> Have a coupon? <a href=\"#\">Click here</a> to enter your code\n");
      out.write("                    </h6>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"checkout__form\">\n");
      out.write("                <h4>Billing Details</h4>\n");
      out.write("                <form action=\"#\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-lg-8 col-md-6\">\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-lg-6\">\n");
      out.write("                                    <div class=\"checkout__input\">\n");
      out.write("                                        <p>Fist Name<span>*</span></p>\n");
      out.write("                                        <input type=\"text\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-lg-6\">\n");
      out.write("                                    <div class=\"checkout__input\">\n");
      out.write("                                        <p>Last Name<span>*</span></p>\n");
      out.write("                                        <input type=\"text\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"checkout__input\">\n");
      out.write("                                <p>Country<span>*</span></p>\n");
      out.write("                                <input type=\"text\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"checkout__input\">\n");
      out.write("                                <p>Address<span>*</span></p>\n");
      out.write("                                <input type=\"text\" placeholder=\"Street Address\" class=\"checkout__input__add\">\n");
      out.write("                                <input type=\"text\" placeholder=\"Apartment, suite, unite ect (optinal)\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"checkout__input\">\n");
      out.write("                                <p>Town/City<span>*</span></p>\n");
      out.write("                                <input type=\"text\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"checkout__input\">\n");
      out.write("                                <p>Country/State<span>*</span></p>\n");
      out.write("                                <input type=\"text\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"checkout__input\">\n");
      out.write("                                <p>Postcode / ZIP<span>*</span></p>\n");
      out.write("                                <input type=\"text\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-lg-6\">\n");
      out.write("                                    <div class=\"checkout__input\">\n");
      out.write("                                        <p>Phone<span>*</span></p>\n");
      out.write("                                        <input type=\"text\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-lg-6\">\n");
      out.write("                                    <div class=\"checkout__input\">\n");
      out.write("                                        <p>Email<span>*</span></p>\n");
      out.write("                                        <input type=\"text\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"checkout__input__checkbox\">\n");
      out.write("                                <label for=\"acc\">\n");
      out.write("                                    Create an account?\n");
      out.write("                                    <input type=\"checkbox\" id=\"acc\">\n");
      out.write("                                    <span class=\"checkmark\"></span>\n");
      out.write("                                </label>\n");
      out.write("                            </div>\n");
      out.write("                            <p>Create an account by entering the information below. If you are a returning customer\n");
      out.write("                                please login at the top of the page</p>\n");
      out.write("                            <div class=\"checkout__input\">\n");
      out.write("                                <p>Account Password<span>*</span></p>\n");
      out.write("                                <input type=\"text\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"checkout__input__checkbox\">\n");
      out.write("                                <label for=\"diff-acc\">\n");
      out.write("                                    Ship to a different address?\n");
      out.write("                                    <input type=\"checkbox\" id=\"diff-acc\">\n");
      out.write("                                    <span class=\"checkmark\"></span>\n");
      out.write("                                </label>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"checkout__input\">\n");
      out.write("                                <p>Order notes<span>*</span></p>\n");
      out.write("                                <input type=\"text\"\n");
      out.write("                                       placeholder=\"Notes about your order, e.g. special notes for delivery.\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-lg-4 col-md-6\">\n");
      out.write("                            <div class=\"checkout__order\">\n");
      out.write("                                <h4>Your Order</h4>\n");
      out.write("                                <div class=\"checkout__order__products\">Products <span>Total</span></div>\n");
      out.write("                                <ul>\n");
      out.write("                                    <li>Vegetable’s Package <span>$75.99</span></li>\n");
      out.write("                                    <li>Fresh Vegetable <span>$151.99</span></li>\n");
      out.write("                                    <li>Organic Bananas <span>$53.99</span></li>\n");
      out.write("                                </ul>\n");
      out.write("                                <div class=\"checkout__order__subtotal\">Subtotal <span>$750.99</span></div>\n");
      out.write("                                <div class=\"checkout__order__total\">Total <span>$750.99</span></div>\n");
      out.write("                                <div class=\"checkout__input__checkbox\">\n");
      out.write("                                    <label for=\"acc-or\">\n");
      out.write("                                        Create an account?\n");
      out.write("                                        <input type=\"checkbox\" id=\"acc-or\">\n");
      out.write("                                        <span class=\"checkmark\"></span>\n");
      out.write("                                    </label>\n");
      out.write("                                </div>\n");
      out.write("                                <p>Lorem ipsum dolor sit amet, consectetur adip elit, sed do eiusmod tempor incididunt\n");
      out.write("                                    ut labore et dolore magna aliqua.</p>\n");
      out.write("                                <div class=\"checkout__input__checkbox\">\n");
      out.write("                                    <label for=\"payment\">\n");
      out.write("                                        Check Payment\n");
      out.write("                                        <input type=\"checkbox\" id=\"payment\">\n");
      out.write("                                        <span class=\"checkmark\"></span>\n");
      out.write("                                    </label>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"checkout__input__checkbox\">\n");
      out.write("                                    <label for=\"paypal\">\n");
      out.write("                                        Paypal\n");
      out.write("                                        <input type=\"checkbox\" id=\"paypal\">\n");
      out.write("                                        <span class=\"checkmark\"></span>\n");
      out.write("                                    </label>\n");
      out.write("                                </div>\n");
      out.write("                                <button type=\"submit\" class=\"site-btn\">PLACE ORDER</button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
      out.write("<!-- Checkout Section End -->");
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
