package org.apache.jsp.views.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cart_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/common/taglib.jsp");
    _jspx_dependants.add("/common/web/header.jsp");
    _jspx_dependants.add("/common/web/footer.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_url_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_url_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_url_value_nobody.release();
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

      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"fr\">\n");
      out.write("    <head>\n");
      out.write("        <!-- Site meta -->\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <!-- Site meta -->\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <title>Free Bootstrap 4 Ecommerce Template</title>\n");
      out.write("        <!-- CSS -->\n");
      out.write("        <link href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <link href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Open+Sans:400,300,600\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <link href=\"");
      if (_jspx_meth_c_url_0(_jspx_page_context))
        return;
      out.write("\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        ");
      out.write("<nav class=\"navbar navbar-expand-md navbar-dark bg-dark\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <a class=\"navbar-brand\" href=\"index.html\">Simple Ecommerce</a>\n");
      out.write("        <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarsExampleDefault\" aria-controls=\"navbarsExampleDefault\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("            <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("        </button>\n");
      out.write("\n");
      out.write("        <div class=\"collapse navbar-collapse justify-content-end\" id=\"navbarsExampleDefault\">\n");
      out.write("            <ul class=\"navbar-nav m-auto\">\n");
      out.write("                <li class=\"nav-item active\">\n");
      out.write("                    <a class=\"nav-link\" href=\"#\">Home <span class=\"sr-only\">(current)</span></a>\n");
      out.write("                </li>\n");
      out.write("               \n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link\" href=\"product\">Product</a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link\" href=\"product.html\">Cart</a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link\" href=\"contact.html\">Contact</a>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("\n");
      out.write("            <form class=\"form-inline my-2 my-lg-0\">\n");
      out.write("                <div class=\"input-group input-group-sm\">\n");
      out.write("                    <input type=\"text\" class=\"form-control\" placeholder=\"Search...\">\n");
      out.write("                    <div class=\"input-group-append\">\n");
      out.write("                        <button type=\"button\" class=\"btn btn-secondary btn-number\">\n");
      out.write("                            <i class=\"fa fa-search\"></i>\n");
      out.write("                        </button>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <a class=\"btn btn-success btn-sm ml-3\" href=\"cart.html\">\n");
      out.write("                    <i class=\"fa fa-shopping-cart\"></i> Cart\n");
      out.write("                    <span class=\"badge badge-light\">3</span>\n");
      out.write("                </a>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</nav>");
      out.write("\n");
      out.write("        <section class=\"jumbotron text-center\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <h1 class=\"jumbotron-heading\">E-COMMERCE PRODUCT</h1>\n");
      out.write("                <p class=\"lead text-muted mb-0\">Le Lorem Ipsum est simplement du faux texte employé dans la composition et la mise en page avant impression. Le Lorem Ipsum est le faux texte standard de l'imprimerie depuis les années 1500...</p>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("<div class=\"container mb-4\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("        <div class=\"col-12\">\n");
      out.write("            <div class=\"table-responsive\">\n");
      out.write("                <table class=\"table table-striped\">\n");
      out.write("                    <thead>\n");
      out.write("                        <tr>\n");
      out.write("                            <th scope=\"col\"> </th>\n");
      out.write("                            <th scope=\"col\">Product</th>\n");
      out.write("                            <th scope=\"col\">Available</th>\n");
      out.write("                            <th scope=\"col\" class=\"text-center\">Quantity</th>\n");
      out.write("                            <th scope=\"col\" class=\"text-right\">Price</th>\n");
      out.write("                            <th> </th>\n");
      out.write("                        </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <tbody>\n");
      out.write("                        <tr>\n");
      out.write("                            <td><img src=\"https://dummyimage.com/50x50/55595c/fff\" /> </td>\n");
      out.write("                            <td>Product Name Dada</td>\n");
      out.write("                            <td>In stock</td>\n");
      out.write("                            <td><input class=\"form-control\" type=\"text\" value=\"1\" /></td>\n");
      out.write("                            <td class=\"text-right\">124,90 €</td>\n");
      out.write("                            <td class=\"text-right\"><button class=\"btn btn-sm btn-danger\"><i class=\"fa fa-trash\"></i> </button> </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td><img src=\"https://dummyimage.com/50x50/55595c/fff\" /> </td>\n");
      out.write("                            <td>Product Name Toto</td>\n");
      out.write("                            <td>In stock</td>\n");
      out.write("                            <td><input class=\"form-control\" type=\"text\" value=\"1\" /></td>\n");
      out.write("                            <td class=\"text-right\">33,90 €</td>\n");
      out.write("                            <td class=\"text-right\"><button class=\"btn btn-sm btn-danger\"><i class=\"fa fa-trash\"></i> </button> </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td><img src=\"https://dummyimage.com/50x50/55595c/fff\" /> </td>\n");
      out.write("                            <td>Product Name Titi</td>\n");
      out.write("                            <td>In stock</td>\n");
      out.write("                            <td><input class=\"form-control\" type=\"text\" value=\"1\" /></td>\n");
      out.write("                            <td class=\"text-right\">70,00 €</td>\n");
      out.write("                            <td class=\"text-right\"><button class=\"btn btn-sm btn-danger\"><i class=\"fa fa-trash\"></i> </button> </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td></td>\n");
      out.write("                            <td></td>\n");
      out.write("                            <td></td>\n");
      out.write("                            <td></td>\n");
      out.write("                            <td>Sub-Total</td>\n");
      out.write("                            <td class=\"text-right\">255,90 €</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td></td>\n");
      out.write("                            <td></td>\n");
      out.write("                            <td></td>\n");
      out.write("                            <td></td>\n");
      out.write("                            <td>Shipping</td>\n");
      out.write("                            <td class=\"text-right\">6,90 €</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td></td>\n");
      out.write("                            <td></td>\n");
      out.write("                            <td></td>\n");
      out.write("                            <td></td>\n");
      out.write("                            <td><strong>Total</strong></td>\n");
      out.write("                            <td class=\"text-right\"><strong>346,90 €</strong></td>\n");
      out.write("                        </tr>\n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col mb-2\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-12  col-md-6\">\n");
      out.write("                    <button class=\"btn btn-block btn-light\">Continue Shopping</button>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-12 col-md-6 text-right\">\n");
      out.write("                    <button class=\"btn btn-lg btn-block btn-success text-uppercase\">Checkout</button>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Footer -->\n");
      out.write("        ");
      out.write("<footer class=\"text-light bg-dark\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-3 col-lg-4 col-xl-3\">\n");
      out.write("                        <h5>About</h5>\n");
      out.write("                        <hr class=\"bg-white mb-2 mt-0 d-inline-block mx-auto w-25\">\n");
      out.write("                        <p class=\"mb-0\">\n");
      out.write("                             la composition et la mise en page avant impression.\n");
      out.write("                        </p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-2 col-lg-2 col-xl-2 mx-auto\">\n");
      out.write("                        <h5>Informations</h5>\n");
      out.write("                        <hr class=\"bg-white mb-2 mt-0 d-inline-block mx-auto w-25\">\n");
      out.write("                        <ul class=\"list-unstyled\">\n");
      out.write("                            <li><a href=\"\">Link 1</a></li>\n");
      out.write("                            <li><a href=\"\">Link 2</a></li>\n");
      out.write("                            <li><a href=\"\">Link 3</a></li>\n");
      out.write("                            <li><a href=\"\">Link 4</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col-md-3 col-lg-2 col-xl-2 mx-auto\">\n");
      out.write("                        <h5>Others links</h5>\n");
      out.write("                        <hr class=\"bg-white mb-2 mt-0 d-inline-block mx-auto w-25\">\n");
      out.write("                        <ul class=\"list-unstyled\">\n");
      out.write("                            <li><a href=\"\">Link 1</a></li>\n");
      out.write("                            <li><a href=\"\">Link 2</a></li>\n");
      out.write("                            <li><a href=\"\">Link 3</a></li>\n");
      out.write("                            <li><a href=\"\">Link 4</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col-md-4 col-lg-3 col-xl-3\">\n");
      out.write("                        <h5>Contact</h5>\n");
      out.write("                        <hr class=\"bg-white mb-2 mt-0 d-inline-block mx-auto w-25\">\n");
      out.write("                        <ul class=\"list-unstyled\">\n");
      out.write("                            <li><i class=\"fa fa-home mr-2\"></i> My company</li>\n");
      out.write("                            <li><i class=\"fa fa-envelope mr-2\"></i> email@example.com</li>\n");
      out.write("                            <li><i class=\"fa fa-phone mr-2\"></i> + 33 12 14 15 16</li>\n");
      out.write("                            <li><i class=\"fa fa-print mr-2\"></i> + 33 12 14 15 16</li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-12 copyright mt-3\">\n");
      out.write("                        <p class=\"float-left\">\n");
      out.write("                            <a href=\"#\">Back to top</a>\n");
      out.write("                        </p>\n");
      out.write("                        <p class=\"text-right text-muted\">created with <i class=\"fa fa-heart\"></i> by <a href=\"https://t-php.fr/43-theme-ecommerce-bootstrap-4.html\"><i>t-php</i></a> | <span>v. 1.0</span></p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </footer>");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("       \n");
      out.write("        <!-- JS -->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- JS -->\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        \n");
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

  private boolean _jspx_meth_c_url_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_0.setPageContext(_jspx_page_context);
    _jspx_th_c_url_0.setParent(null);
    _jspx_th_c_url_0.setValue("/theme/web/css/style.css");
    int _jspx_eval_c_url_0 = _jspx_th_c_url_0.doStartTag();
    if (_jspx_th_c_url_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_0);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_0);
    return false;
  }
}
