package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class users_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.release();
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\n');
      out.write('\n');
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write('\n');
      if (_jspx_meth_c_005furl_005f1(_jspx_page_context))
        return;
      out.write('\n');
      if (_jspx_meth_c_005furl_005f2(_jspx_page_context))
        return;
      out.write('\n');
      if (_jspx_meth_c_005furl_005f3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<link rel='stylesheet' type='text/css' media='screen' href='");
      if (_jspx_meth_c_005furl_005f4(_jspx_page_context))
        return;
      out.write("'/>\n");
      out.write("\t<script type='text/javascript' src='");
      if (_jspx_meth_c_005furl_005f5(_jspx_page_context))
        return;
      out.write("'></script>\n");
      out.write("\t<script type='text/javascript' src='");
      if (_jspx_meth_c_005furl_005f6(_jspx_page_context))
        return;
      out.write("'></script>\n");
      out.write("\n");
      out.write("\t<title>User Records</title>\n");
      out.write("\n");
      out.write("\t<script type='text/javascript'>\n");
      out.write("\t$(function() {\n");
      out.write("\t\t// init\n");
      out.write("\t\turlHolder.records = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${recordsUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("';\n");
      out.write("\t\turlHolder.add = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${addUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("';\n");
      out.write("\t\turlHolder.edit = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${editUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("';\n");
      out.write("\t\turlHolder.del = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${deleteUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("';\n");
      out.write("\t\tloadTable();\n");
      out.write("\n");
      out.write("\t\t$('#newBtn').click(function() { \n");
      out.write("\t\t\ttoggleForms('new');\n");
      out.write("\t\t\ttoggleCrudButtons('hide');\n");
      out.write("\t\t});\n");
      out.write("\n");
      out.write("\t\t$('#editBtn').click(function() { \n");
      out.write("\t\t\tif (hasSelected()) {\n");
      out.write("\t\t\t\ttoggleForms('edit');\n");
      out.write("\t\t\t\ttoggleCrudButtons('hide');\n");
      out.write("\t\t\t\tfillEditForm();\n");
      out.write("\t\t\t}\n");
      out.write("\t\t});\n");
      out.write("\n");
      out.write("\t\t$('#reloadBtn').click(function() { \n");
      out.write("\t\t\tloadTable();\n");
      out.write("\t\t});\n");
      out.write("\n");
      out.write("\t\t$('#deleteBtn').click(function() {\n");
      out.write("\t\t\tif (hasSelected()) { \n");
      out.write("\t\t\t\tsubmitDeleteRecord();\n");
      out.write("\t\t\t}\n");
      out.write("\t\t});\n");
      out.write("\n");
      out.write("\t\t$('#newForm').submit(function() {\n");
      out.write("\t\t\tevent.preventDefault();\n");
      out.write("\t\t\tsubmitNewRecord();\n");
      out.write("\t\t});\n");
      out.write("\n");
      out.write("\t\t$('#editForm').submit(function() {\n");
      out.write("\t\t\tevent.preventDefault();\n");
      out.write("\t\t\tsubmitUpdateRecord();\n");
      out.write("\t\t});\n");
      out.write("\n");
      out.write("\t\t$('#closeNewForm').click(function() { \n");
      out.write("\t\t\ttoggleForms('hide'); \n");
      out.write("\t\t\ttoggleCrudButtons('show');\n");
      out.write("\t\t});\n");
      out.write("\n");
      out.write("\t\t$('#closeEditForm').click(function() { \n");
      out.write("\t\t\ttoggleForms('hide'); \n");
      out.write("\t\t\ttoggleCrudButtons('show');\n");
      out.write("\t\t});\n");
      out.write("\t});\n");
      out.write("\t</script>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\t<h1 id='banner'>Record System</h1>\n");
      out.write("\t<hr/>\n");
      out.write("\n");
      out.write("\t<table id='tableUsers'>\n");
      out.write("\t\t<caption></caption>\n");
      out.write("\t\t<thead>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<th></th>\n");
      out.write("\t\t\t\t<th>Username</th>\n");
      out.write("\t\t\t\t<th>First Name</th>\n");
      out.write("\t\t\t\t<th>Last Name</th>\n");
      out.write("\t\t\t\t<th>Role</th>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t</thead>\n");
      out.write("\t</table>\n");
      out.write("\n");
      out.write("\t<div id='controlBar'>\n");
      out.write("\t\t<input type='button' value='New' id='newBtn' />\n");
      out.write("\t\t<input type='button' value='Delete' id='deleteBtn' />\n");
      out.write("\t\t<input type='button' value='Edit' id='editBtn' />\n");
      out.write("\t\t<input type='button' value='Reload' id='reloadBtn' />\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t<div id='newForm'>\n");
      out.write("\t\t<form>\n");
      out.write("  \t\t\t<fieldset>\n");
      out.write("\t\t\t\t<legend>Create New Record</legend>\n");
      out.write("\t\t\t\t<label for='newUsername'>Username</label><input type='text' id='newUsername'/><br/>\n");
      out.write("\t\t\t\t<label for='newPassword'>Password</label><input type='password' id='newPassword'/><br/>\n");
      out.write("\t\t\t\t<label for='newFirstName'>First Name</label><input type='text' id='newFirstName'/><br/>\n");
      out.write("\t\t\t\t<label for='newLastName'>Last Name</label><input type='text' id='newLastName'/><br/>\n");
      out.write("\t\t\t\t<label for='newRole'>Role</label>\n");
      out.write("\t\t\t\t\t<select id='newRole'>\n");
      out.write("\t\t\t\t\t\t<option value='1'>Admin</option>\n");
      out.write("\t\t\t\t\t\t<option value='2' selected='selected'>Regular</option>\n");
      out.write("\t\t\t\t\t</select>\n");
      out.write("  \t\t\t</fieldset>\n");
      out.write("\t\t\t<input type='button' value='Close' id='closeNewForm' />\n");
      out.write("\t\t\t<input type='submit' value='Submit'/>\n");
      out.write("\t\t</form>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t<div id='editForm'>\n");
      out.write("\t\t<form>\n");
      out.write("  \t\t\t<fieldset>\n");
      out.write("\t\t\t\t<legend>Edit Record</legend>\n");
      out.write("\t\t\t\t<input type='hidden' id='editUsername'/>\n");
      out.write("\t\t\t\t<label for='editFirstName'>First Name</label><input type='text' id='editFirstName'/><br/>\n");
      out.write("\t\t\t\t<label for='editLastName'>Last Name</label><input type='text' id='editLastName'/><br/>\n");
      out.write("\t\t\t\t<label for='editRole'>Role</label>\n");
      out.write("\t\t\t\t\t<select id='editRole'>\n");
      out.write("\t\t\t\t\t\t<option value='1'>Admin</option>\n");
      out.write("\t\t\t\t\t\t<option value='2' selected='selected'>Regular</option>\n");
      out.write("\t\t\t\t\t</select>\n");
      out.write("\t\t\t</fieldset>\n");
      out.write("\t\t\t<input type='button' value='Close' id='closeEditForm' />\n");
      out.write("\t\t\t<input type='submit' value='Submit'/>\n");
      out.write("\t\t</form>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005furl_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f0.setParent(null);
    // /WEB-INF/jsp/users.jsp(3,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f0.setValue("/users/records");
    // /WEB-INF/jsp/users.jsp(3,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f0.setVar("recordsUrl");
    int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
    if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f1 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f1.setParent(null);
    // /WEB-INF/jsp/users.jsp(4,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f1.setValue("/users/create");
    // /WEB-INF/jsp/users.jsp(4,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f1.setVar("addUrl");
    int _jspx_eval_c_005furl_005f1 = _jspx_th_c_005furl_005f1.doStartTag();
    if (_jspx_th_c_005furl_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f2 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f2.setParent(null);
    // /WEB-INF/jsp/users.jsp(5,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f2.setValue("/users/update");
    // /WEB-INF/jsp/users.jsp(5,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f2.setVar("editUrl");
    int _jspx_eval_c_005furl_005f2 = _jspx_th_c_005furl_005f2.doStartTag();
    if (_jspx_th_c_005furl_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f2);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f3 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f3.setParent(null);
    // /WEB-INF/jsp/users.jsp(6,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f3.setValue("/users/delete");
    // /WEB-INF/jsp/users.jsp(6,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f3.setVar("deleteUrl");
    int _jspx_eval_c_005furl_005f3 = _jspx_th_c_005furl_005f3.doStartTag();
    if (_jspx_th_c_005furl_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f3);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f4 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f4.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f4.setParent(null);
    // /WEB-INF/jsp/users.jsp(10,61) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f4.setValue("/resources/css/style.css");
    int _jspx_eval_c_005furl_005f4 = _jspx_th_c_005furl_005f4.doStartTag();
    if (_jspx_th_c_005furl_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f4);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f5 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f5.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f5.setParent(null);
    // /WEB-INF/jsp/users.jsp(11,37) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f5.setValue("/resources/js/jquery.1.8.1.min.js");
    int _jspx_eval_c_005furl_005f5 = _jspx_th_c_005furl_005f5.doStartTag();
    if (_jspx_th_c_005furl_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f5);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f6 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f6.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f6.setParent(null);
    // /WEB-INF/jsp/users.jsp(12,37) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f6.setValue("/resources/js/custom.js");
    int _jspx_eval_c_005furl_005f6 = _jspx_th_c_005furl_005f6.doStartTag();
    if (_jspx_th_c_005furl_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f6);
    return false;
  }
}
