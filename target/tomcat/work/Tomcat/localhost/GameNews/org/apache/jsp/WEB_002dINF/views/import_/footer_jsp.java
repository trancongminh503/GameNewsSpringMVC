/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-11-11 14:57:30 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.import_;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class footer_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<body>\r\n");
      out.write("\t<footer class=\"footer\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"col-lg-7\">\r\n");
      out.write("\t\t\t\t\t<div class=\"widget\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"footer-text text-left\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"index.html\"><img\r\n");
      out.write("\t\t\t\t\t\t\t\tsrc=\"");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("\" alt=\"\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"img-fluid\"></a>\r\n");
      out.write("\t\t\t\t\t\t\t<p>Tech Blog is a technology blog, we sharing marketing, news\r\n");
      out.write("\t\t\t\t\t\t\t\tand gadget articles.</p>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"social\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\" data-toggle=\"tooltip\" data-placement=\"bottom\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttitle=\"Facebook\"><i class=\"fa fa-facebook\"></i></a> <a href=\"#\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tdata-toggle=\"tooltip\" data-placement=\"bottom\" title=\"Twitter\"><i\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"fa fa-twitter\"></i></a> <a href=\"#\" data-toggle=\"tooltip\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tdata-placement=\"bottom\" title=\"Instagram\"><i\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"fa fa-instagram\"></i></a> <a href=\"#\" data-toggle=\"tooltip\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tdata-placement=\"bottom\" title=\"Google Plus\"><i\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"fa fa-google-plus\"></i></a> <a href=\"#\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tdata-toggle=\"tooltip\" data-placement=\"bottom\" title=\"Pinterest\"><i\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"fa fa-pinterest\"></i></a>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<hr class=\"invis\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"newsletter-widget text-left\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<form class=\"form-inline\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tplaceholder=\"Enter your email address\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<button type=\"submit\" class=\"btn btn-primary\">SUBMIT</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<!-- end newsletter -->\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<!-- end footer-text -->\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<!-- end widget -->\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!-- end col -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"col-lg-3 col-md-12 col-sm-12 col-xs-12\">\r\n");
      out.write("\t\t\t\t\t<div class=\"widget\">\r\n");
      out.write("\t\t\t\t\t\t<h2 class=\"widget-title\">Popular Categories</h2>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"link-widget\">\r\n");
      out.write("\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Marketing <span>(21)</span></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">SEO Service <span>(15)</span></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Digital Agency <span>(31)</span></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Make Money <span>(22)</span></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Blogging <span>(66)</span></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<!-- end link-widget -->\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<!-- end widget -->\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!-- end col -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"col-lg-2 col-md-12 col-sm-12 col-xs-12\">\r\n");
      out.write("\t\t\t\t\t<div class=\"widget\">\r\n");
      out.write("\t\t\t\t\t\t<h2 class=\"widget-title\">Copyrights</h2>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"link-widget\">\r\n");
      out.write("\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">About us</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Advertising</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Write for us</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Trademark</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">License & Help</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<!-- end link-widget -->\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<!-- end widget -->\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!-- end col -->\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"col-md-12 text-center\">\r\n");
      out.write("\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t<div class=\"copyright\">\r\n");
      out.write("\t\t\t\t\t\t&copy; Tech Blog. Design: <a href=\"http://html.design\">HTML\r\n");
      out.write("\t\t\t\t\t\t\tDesign</a>.\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- end container -->\r\n");
      out.write("\t</footer>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005furl_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f0.setParent(null);
    // /WEB-INF/views/import/footer.jsp(14,13) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f0.setValue("/lib/images/version/tech-footer-logo.png");
    int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
    if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
    return false;
  }
}
