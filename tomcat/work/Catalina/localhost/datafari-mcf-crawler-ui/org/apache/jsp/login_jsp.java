/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.40
 * Generated at: 2015-04-07 13:25:13 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.manifoldcf.core.interfaces.*;
import org.apache.manifoldcf.ui.i18n.*;
import org.apache.manifoldcf.agents.interfaces.*;
import org.apache.manifoldcf.authorities.interfaces.*;
import org.apache.manifoldcf.crawler.interfaces.*;
import java.util.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("/WEB-INF/jsp/x.tld", Long.valueOf(1428407612000L));
    _jspx_dependants.put("/WEB-INF/jsp/c.tld", Long.valueOf(1428407612000L));
    _jspx_dependants.put("/WEB-INF/jsp/sql.tld", Long.valueOf(1428407612000L));
    _jspx_dependants.put("/WEB-INF/jsp/fmt.tld", Long.valueOf(1428407612000L));
    _jspx_dependants.put("/adminDefaults.jsp", Long.valueOf(1428407612000L));
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

 response.setHeader("Pragma","No-cache");
response.setDateHeader("Expires",0);
response.setHeader("Cache-Control", "no-cache");
response.setDateHeader("max-age", 0);
response.setContentType("text/html;charset=utf-8");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");


/* $Id: adminDefaults.jsp 1601529 2014-06-09 23:19:08Z kwright $ */

/**
* Licensed to the Apache Software Foundation (ASF) under one or more
* contributor license agreements. See the NOTICE file distributed with
* this work for additional information regarding copyright ownership.
* The ASF licenses this file to You under the Apache License, Version 2.0
* (the "License"); you may not use this file except in compliance with
* the License. You may obtain a copy of the License at
* 
* http://www.apache.org/licenses/LICENSE-2.0
* 
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

      out.write("\r\n");
      out.write("\r\n");
      org.apache.manifoldcf.ui.beans.ThreadContext thread = null;
      thread = (org.apache.manifoldcf.ui.beans.ThreadContext) _jspx_page_context.getAttribute("thread", javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      if (thread == null){
        thread = new org.apache.manifoldcf.ui.beans.ThreadContext();
        _jspx_page_context.setAttribute("thread", thread, javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      }
      out.write('\r');
      out.write('\n');
      org.apache.manifoldcf.ui.beans.AdminProfile adminprofile = null;
      synchronized (session) {
        adminprofile = (org.apache.manifoldcf.ui.beans.AdminProfile) _jspx_page_context.getAttribute("adminprofile", javax.servlet.jsp.PageContext.SESSION_SCOPE);
        if (adminprofile == null){
          adminprofile = new org.apache.manifoldcf.ui.beans.AdminProfile();
          _jspx_page_context.setAttribute("adminprofile", adminprofile, javax.servlet.jsp.PageContext.SESSION_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

	IThreadContext threadContext = thread.getThreadContext();
	org.apache.manifoldcf.ui.multipart.MultipartWrapper variableContext = (org.apache.manifoldcf.ui.multipart.MultipartWrapper)threadContext.get("__WRAPPER__");
	if (variableContext == null)
	{
		variableContext = new org.apache.manifoldcf.ui.multipart.MultipartWrapper(request,adminprofile);
		threadContext.save("__WRAPPER__",variableContext);
	}

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");

/* $Id: login.jsp 1601529 2014-06-09 23:19:08Z kwright $ */

/**
* Licensed to the Apache Software Foundation (ASF) under one or more
* contributor license agreements. See the NOTICE file distributed with
* this work for additional information regarding copyright ownership.
* The ASF licenses this file to You under the Apache License, Version 2.0
* (the "License"); you may not use this file except in compliance with
* the License. You may obtain a copy of the License at
* 
* http://www.apache.org/licenses/LICENSE-2.0
* 
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

      out.write("\r\n");
      out.write("<?xml version=\"1.0\" encoding=\"utf-8\"?>\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\"/>\r\n");
      out.write("\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("\t\t<link rel=\"StyleSheet\" href=\"style.css\" type=\"text/css\" media=\"screen\"/>\r\n");
      out.write("\t\t<title>\r\n");
      out.write("\t\t\t");
      out.print(Messages.getBodyString(pageContext.getRequest().getLocale(),"index.ApacheManifoldCFLogin"));
      out.write("\r\n");
      out.write("\t\t</title>\r\n");
      out.write("\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\t<!--\r\n");
      out.write("\t\t\tfunction login()\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\t\tdocument.loginform.submit();\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t//-->\r\n");
      out.write("\t\t</script>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body class=\"standardbody\">\r\n");
      out.write("\t\t<table class=\"page\">\r\n");
      out.write("\t\t\t<tr><td colspan=\"2\" class=\"banner\">");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "banner.jsp", out, true);
      out.write("</td></tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td colspan=\"2\" class=\"window\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<form class=\"standardform\" name=\"loginform\" action=\"setupAdminProfile.jsp\" method=\"POST\">\r\n");
      out.write("\t\t\t\t\t\t<table class=\"displaytable\">\r\n");

String value = variableContext.getParameter("loginfailed");
if (value != null && value.equals("true"))
{

      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<tr><td class=\"message\" colspan=\"2\">");
      out.print(Messages.getBodyString(pageContext.getRequest().getLocale(),"index.LoginFailed"));
      out.write("</td></tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr><td class=\"separator\" colspan=\"2\"><hr/></td></tr>\r\n");

}

      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"description\"><nobr>");
      out.print(Messages.getBodyString(pageContext.getRequest().getLocale(),"index.UserIDColon"));
      out.write("</nobr></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"value\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input name=\"userID\" type=\"text\" size=\"32\" value=\"\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"description\"><nobr>");
      out.print(Messages.getBodyString(pageContext.getRequest().getLocale(),"index.PasswordColon"));
      out.write("</nobr></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"value\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input name=\"password\" type=\"password\" size=\"32\" value=\"\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr><td class=\"separator\" colspan=\"2\"><hr/></td></tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"message\" colspan=\"2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"button\" onclick='Javascript:login();' value='");
      out.print(Messages.getAttributeString(pageContext.getRequest().getLocale(),"index.Login"));
      out.write("' alt='");
      out.print(Messages.getAttributeString(pageContext.getRequest().getLocale(),"index.Login"));
      out.write("'/>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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
}
