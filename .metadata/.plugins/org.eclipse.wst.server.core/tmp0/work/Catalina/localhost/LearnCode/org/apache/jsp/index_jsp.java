/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.69
 * Generated at: 2022-01-24 04:08:48 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.learncode.helper.DBConnection;
import java.sql.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/component/all-css.jsp", Long.valueOf(1642093074916L));
    _jspx_dependants.put("/component/navbar.jsp", Long.valueOf(1642997310980L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("java.sql");
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.learncode.helper.DBConnection");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\"\r\n");
      out.write("	integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\"\r\n");
      out.write("	crossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\"\r\n");
      out.write("	integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\"\r\n");
      out.write("	crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\"\r\n");
      out.write("	integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\"\r\n");
      out.write("	crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"\r\n");
      out.write("	integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\"\r\n");
      out.write("	crossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("<script src=\"https://kit.fontawesome.com/a076d05399.js\"\r\n");
      out.write("	crossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.4.1.min.js\"\r\n");
      out.write("	integrity=\"sha256-CSXorXvZcTkaix6Yvo6HppcZGetbYMGWSFlBw8HfCJo=\"\r\n");
      out.write("	crossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script src=\"https://unpkg.com/sweetalert/dist/sweetalert.min.js\"></script>");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write(".banner-background {\r\n");
      out.write("	clip-path: polygon(50% 0%, 100% 0, 100% 95%, 80% 99%, 57% 96%, 39% 98%, 20% 93%, 0\r\n");
      out.write("		100%, 0 0);\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\"background-color: #f6f1f0\">\r\n");
      out.write("	");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<nav class=\"navbar navbar-expand-lg navbar-light bg-light sticky-top\" >\r\n");
      out.write("		<a class=\"navbar-brand\" href=\"index.jsp\"><span class=\"fas fa-dice-d20\"></span> ABC</a>\r\n");
      out.write("		<button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\"\r\n");
      out.write("			data-target=\"#navbarSupportedContent\"\r\n");
      out.write("			aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\"\r\n");
      out.write("			aria-label=\"Toggle navigation\">\r\n");
      out.write("			<span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("		</button>\r\n");
      out.write("\r\n");
      out.write("		<div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
      out.write("			<ul class=\"navbar-nav mr-auto\">\r\n");
      out.write("				<li class=\"nav-item \"><a class=\"nav-link\" href=\"profile.jsp\">Learn Code with ABC\r\n");
      out.write("						<span class=\"sr-only\">(current)</span>\r\n");
      out.write("				</a></li>\r\n");
      out.write("				<li class=\"nav-item\"><a class=\"nav-link\" href=\"#\">Contact</a></li>\r\n");
      out.write("				<li class=\"nav-item dropdown\"><a\r\n");
      out.write("					class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\"\r\n");
      out.write("					role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\r\n");
      out.write("					aria-expanded=\"false\"> Categories </a>\r\n");
      out.write("					<div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\r\n");
      out.write("						<a class=\"dropdown-item\" href=\"#\">Programming Language</a> <a\r\n");
      out.write("							class=\"dropdown-item\" href=\"#\">Data structure</a>\r\n");
      out.write("						<div class=\"dropdown-divider\"></div>\r\n");
      out.write("						<a class=\"dropdown-item\" href=\"#\">Something else here</a>\r\n");
      out.write("					</div></li>\r\n");
      out.write("				<li class=\"nav-item\"><a class=\"nav-link \" href=\"register.jsp\">Register</a>\r\n");
      out.write("				</li>\r\n");
      out.write("				<li class=\"nav-item \"><a class=\"nav-link\" href=\"login.jsp\">Login\r\n");
      out.write("				</a></li>\r\n");
      out.write("			</ul>\r\n");
      out.write("			<form class=\"form-inline my-2 my-lg-0\">\r\n");
      out.write("				<input class=\"form-control mr-sm-2\" type=\"search\"\r\n");
      out.write("					placeholder=\"Search\" aria-label=\"Search\">\r\n");
      out.write("				<button class=\"btn btn-outline-success my-2 my-sm-0\" type=\"submit\">Search</button>\r\n");
      out.write("			</form>\r\n");
      out.write("		</div>\r\n");
      out.write("	</nav>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write('\r');
      out.write('\n');
      out.write('	');

	String sucMsg = (String) session.getAttribute("sucMsg");
	if (sucMsg != null) {
	
      out.write("\r\n");
      out.write("	<div class=\"alert alert-success\" role=\"alert\">");
      out.print(sucMsg);
      out.write("\r\n");
      out.write("	</div>\r\n");
      out.write("	");

	session.removeAttribute("sucMsg");
	}
	
      out.write("\r\n");
      out.write("\r\n");
      out.write("	");

	String failedMsg = (String) session.getAttribute("failedMsg");
	if (failedMsg != null) {
	
      out.write("\r\n");
      out.write("	<div class=\"alert alert-danger\" role=\"alert\">");
      out.print(failedMsg);
      out.write("\r\n");
      out.write("	</div>\r\n");
      out.write("	");

	session.removeAttribute("failedMsg");
	}
	
      out.write("\r\n");
      out.write("	<div class=\"container-fluid p-0 m-0\">\r\n");
      out.write("		<div class=\"jumbotron bg-dark text-white banner-background\">\r\n");
      out.write("			<div class=\"container \">\r\n");
      out.write("				<h3 class=\"display-3\">Welcome to ABC Learn Code</h3>\r\n");
      out.write("				<p>Nam scelerisque posuere molestie. Praesent pellentesque\r\n");
      out.write("					faucibus aliquet. Sed euismod lacinia lacus, in aliquam ex luctus\r\n");
      out.write("					mollis. Vestibulum tincidunt, massa id tristique pulvinar, lacus\r\n");
      out.write("					neque dapibus libero, nec aliquet turpis ex a libero. Nunc auctor,\r\n");
      out.write("					nibh non semper dignissim, diam lacus tempus tortor, vitae dapibus\r\n");
      out.write("					ipsum libero at eros.</p>\r\n");
      out.write("\r\n");
      out.write("				<button type=\"button\" class=\"btn btn-outline-primary\">Let's\r\n");
      out.write("					start! It's free</button>\r\n");
      out.write("				<a href=\"login.jsp\" type=\"button\" class=\"btn btn-outline-primary\">Log\r\n");
      out.write("					in</a>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("	<div class=\"container\">\r\n");
      out.write("		<div class=\"row mb-3\">\r\n");
      out.write("			<div class=\"col-md-6\">\r\n");
      out.write("				<div class=\"card\">\r\n");
      out.write("					<div class=\"card-body\">\r\n");
      out.write("						<h5 class=\"card-title\">Java Core</h5>\r\n");
      out.write("						<p class=\"card-text\">Aliquam viverra, mauris imperdiet sodales\r\n");
      out.write("							aliquet, nisi massa tempus dui, eu viverra libero nunc id risus.\r\n");
      out.write("							Donec tellus elit, rhoncus aliquam sapien ut, cursus rutrum\r\n");
      out.write("							lorem. Suspendisse eget varius nulla. Sed mattis lorem est, sed\r\n");
      out.write("							mollis metus consequat sed. Vestibulum erat enim, placerat quis\r\n");
      out.write("							libero a, sollicitudin elementum augue.</p>\r\n");
      out.write("						<a href=\"#\" class=\"btn btn-outline-primary\">Read More</a>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"col-md-6\">\r\n");
      out.write("				<div class=\"card\">\r\n");
      out.write("					<div class=\"card-body\">\r\n");
      out.write("						<h5 class=\"card-title\">Java Core</h5>\r\n");
      out.write("						<p class=\"card-text\">Cras tempor non tellus eu vehicula.\r\n");
      out.write("							Suspendisse potenti. Maecenas sagittis nulla id quam faucibus, et\r\n");
      out.write("							vehicula metus luctus. Donec a finibus tellus, nec commodo eros.\r\n");
      out.write("							Fusce id pharetra mauris, eget hendrerit urna. Donec mattis sed\r\n");
      out.write("							orci vel laoreet. Nullam et erat ut velit rhoncus mattis non sed\r\n");
      out.write("							erat.</p>\r\n");
      out.write("						<a href=\"#\" class=\"btn btn-outline-primary\">Read More</a>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("		<div class=\"row mb-3\">\r\n");
      out.write("			<div class=\"col-md-6\">\r\n");
      out.write("				<div class=\"card\">\r\n");
      out.write("					<div class=\"card-body\">\r\n");
      out.write("						<h5 class=\"card-title\">Java Core</h5>\r\n");
      out.write("						<p class=\"card-text\">Aliquam viverra, mauris imperdiet sodales\r\n");
      out.write("							aliquet, nisi massa tempus dui, eu viverra libero nunc id risus.\r\n");
      out.write("							Donec tellus elit, rhoncus aliquam sapien ut, cursus rutrum\r\n");
      out.write("							lorem. Suspendisse eget varius nulla. Sed mattis lorem est, sed\r\n");
      out.write("							mollis metus consequat sed. Vestibulum erat enim, placerat quis\r\n");
      out.write("							libero a, sollicitudin elementum augue.</p>\r\n");
      out.write("						<a href=\"#\" class=\"btn btn-outline-primary\">Read More</a>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"col-md-6\">\r\n");
      out.write("				<div class=\"card\">\r\n");
      out.write("					<div class=\"card-body\">\r\n");
      out.write("						<h5 class=\"card-title\">Java Core</h5>\r\n");
      out.write("						<p class=\"card-text\">Etiam hendrerit neque at tempor\r\n");
      out.write("							ultricies. Fusce nec lorem lectus. Nullam nec neque scelerisque,\r\n");
      out.write("							venenatis lectus at, ultrices arcu. Pellentesque quis tempor\r\n");
      out.write("							ante, non gravida lacus. Nam ut elit vel velit vehicula varius.\r\n");
      out.write("							Sed fringilla ornare elit. Donec in purus sem.</p>\r\n");
      out.write("						<a href=\"#\" class=\"btn btn-outline-primary\">Read More</a>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("	</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
