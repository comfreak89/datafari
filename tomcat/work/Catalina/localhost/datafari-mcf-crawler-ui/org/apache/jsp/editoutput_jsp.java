/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.40
 * Generated at: 2015-04-07 13:29:31 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.manifoldcf.core.interfaces.*;
import org.apache.manifoldcf.core.util.*;
import org.apache.manifoldcf.ui.i18n.*;
import org.apache.manifoldcf.agents.interfaces.*;
import org.apache.manifoldcf.crawler.interfaces.*;
import org.apache.manifoldcf.authorities.interfaces.*;
import java.util.*;

public final class editoutput_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("/WEB-INF/jsp/x.tld", Long.valueOf(1428407612000L));
    _jspx_dependants.put("/adminHeaders.jsp", Long.valueOf(1428407612000L));
    _jspx_dependants.put("/WEB-INF/jsp/c.tld", Long.valueOf(1428407612000L));
    _jspx_dependants.put("/WEB-INF/jsp/sql.tld", Long.valueOf(1428407612000L));
    _jspx_dependants.put("/WEB-INF/jsp/fmt.tld", Long.valueOf(1428407612000L));
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


/* $Id: adminHeaders.jsp 1601529 2014-06-09 23:19:08Z kwright $ */

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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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

	if (adminprofile.getLoggedOn() == false)
	{
		response.sendRedirect("login.jsp");
		return;
	}

	IThreadContext threadContext = thread.getThreadContext();
	org.apache.manifoldcf.ui.multipart.MultipartWrapper variableContext = (org.apache.manifoldcf.ui.multipart.MultipartWrapper)threadContext.get("__WRAPPER__");
	if (variableContext == null)
	{
		variableContext = new org.apache.manifoldcf.ui.multipart.MultipartWrapper(request,adminprofile);
		threadContext.save("__WRAPPER__",variableContext);
	}

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");


/* $Id: editoutput.jsp 1601529 2014-06-09 23:19:08Z kwright $ */

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

    // The contract of this edit page is as follows.  It is either called directly, in which case it is expected to be creating
    // a connection or beginning the process of editing an existing connection, or it is called via redirection from execute.jsp, in which case
    // the connection object being edited will be placed in the thread context under the name "ConnectionObject".
    try
    {
	// Get the connection manager handle
	IOutputConnectionManager connMgr = OutputConnectionManagerFactory.make(threadContext);
	// Also get the list of available connectors
	IOutputConnectorManager connectorManager = OutputConnectorManagerFactory.make(threadContext);

	// Figure out what the current tab name is.
	String tabName = variableContext.getParameter("tabname");
	if (tabName == null || tabName.length() == 0)
		tabName = Messages.getString(pageContext.getRequest().getLocale(),"editoutput.Name");
	String connectionName = null;
	IOutputConnection connection = (IOutputConnection)threadContext.get("ConnectionObject");
	if (connection == null)
	{
		// We did not go through execute.jsp
		// We might have received an argument specifying the connection name.
		connectionName = variableContext.getParameter("connname");
		// If the connectionname is not null, load the connection description and prepopulate everything with what comes from it.
		if (connectionName != null && connectionName.length() > 0)
		{
			connection = connMgr.load(connectionName);
		}
	}

	// Set up default fields.
	boolean isNew = true;
	String description = "";
	String className = "";
	int maxConnections = 10;
	ConfigParams parameters = new ConfigParams();

	// If there's a connection object, set up all our parameters from it.
	if (connection != null)
	{
		// Set up values
		isNew = connection.getIsNew();
		connectionName = connection.getName();
		description = connection.getDescription();
		className = connection.getClassName();
		parameters = connection.getConfigParams();
		maxConnections = connection.getMaxConnections();
	}
	else
		connectionName = null;

	if (connectionName == null)
		connectionName = "";

	// Initialize tabs array.
	ArrayList tabsArray = new ArrayList();

	// Set up the predefined tabs
	tabsArray.add(Messages.getString(pageContext.getRequest().getLocale(),"editoutput.Name"));
	tabsArray.add(Messages.getString(pageContext.getRequest().getLocale(),"editoutput.Type"));
	if (className.length() > 0)
		tabsArray.add(Messages.getString(pageContext.getRequest().getLocale(),"editoutput.Throttling"));


      out.write("\r\n");
      out.write("\r\n");
      out.write("<?xml version=\"1.0\" encoding=\"utf-8\"?>\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\"/>\r\n");
      out.write("\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("\t<link rel=\"StyleSheet\" href=\"style.css\" type=\"text/css\" media=\"screen\"/>\r\n");
      out.write("\t<title>\r\n");
      out.write("\t\t");
      out.print(Messages.getBodyString(pageContext.getRequest().getLocale(),"editoutput.ApacheManifoldCFEditOutputConnection"));
      out.write("\r\n");
      out.write("\t</title>\r\n");
      out.write("\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t<!--\r\n");
      out.write("\r\n");
      out.write("\t// Use this method to repost the form and pick a new tab\r\n");
      out.write("\tfunction SelectTab(newtab)\r\n");
      out.write("\t{\r\n");
      out.write("\t\tif (checkForm())\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tdocument.editconnection.tabname.value = newtab;\r\n");
      out.write("\t\t\tdocument.editconnection.submit();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\t// Use this method to repost the form,\r\n");
      out.write("\t// and set the anchor request.\r\n");
      out.write("\tfunction postFormSetAnchor(anchorValue)\r\n");
      out.write("\t{\r\n");
      out.write("\t\tif (checkForm())\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tif (anchorValue != \"\")\r\n");
      out.write("\t\t\t\tdocument.editconnection.action = document.editconnection.action + \"#\" + anchorValue;\r\n");
      out.write("\t\t\tdocument.editconnection.submit();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\t// Use this method to repost the form\r\n");
      out.write("\tfunction postForm()\r\n");
      out.write("\t{\r\n");
      out.write("\t\tif (checkForm())\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tdocument.editconnection.submit();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tfunction Save()\r\n");
      out.write("\t{\r\n");
      out.write("\t\tif (checkForm())\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\t// Can't submit until all required fields have been set.\r\n");
      out.write("\t\t\t// Some of these don't live on the current tab, so don't set\r\n");
      out.write("\t\t\t// focus.\r\n");
      out.write("\r\n");
      out.write("\t\t\t// Check our part of the form, for save\r\n");
      out.write("\t\t\tif (editconnection.connname.value == \"\")\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\t\talert(\"");
      out.print(Messages.getBodyJavascriptString(pageContext.getRequest().getLocale(),"editoutput.ConnectionMustHaveAName"));
      out.write("\");\r\n");
      out.write("\t\t\t\tSelectTab(\"");
      out.print(Messages.getBodyJavascriptString(pageContext.getRequest().getLocale(),"editoutput.Name"));
      out.write("\");\r\n");
      out.write("\t\t\t\tdocument.editconnection.connname.focus();\r\n");
      out.write("\t\t\t\treturn;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tif (window.checkConfigForSave)\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\t\tif (!checkConfigForSave())\r\n");
      out.write("\t\t\t\t\treturn;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tdocument.editconnection.op.value=\"Save\";\r\n");
      out.write("\t\t\tdocument.editconnection.submit();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tfunction Continue()\r\n");
      out.write("\t{\r\n");
      out.write("\t\tdocument.editconnection.op.value=\"Continue\";\r\n");
      out.write("\t\tpostForm();\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tfunction Cancel()\r\n");
      out.write("\t{\r\n");
      out.write("\t\tdocument.editconnection.op.value=\"Cancel\";\r\n");
      out.write("\t\tdocument.editconnection.submit();\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tfunction checkForm()\r\n");
      out.write("\t{\r\n");
      out.write("\t\tif (!checkConnectionCount())\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\tif (window.checkConfig)\r\n");
      out.write("\t\t\treturn checkConfig();\r\n");
      out.write("\t\treturn true;\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tfunction checkConnectionCount()\r\n");
      out.write("\t{\r\n");
      out.write("\t\tif (!isInteger(editconnection.maxconnections.value))\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\talert(\"");
      out.print(Messages.getBodyJavascriptString(pageContext.getRequest().getLocale(),"editoutput.TheMaximumNumberOfConnectionsMustBeAValidInteger"));
      out.write("\");\r\n");
      out.write("\t\t\teditconnection.maxconnections.focus();\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\treturn true;\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tfunction isRegularExpression(value)\r\n");
      out.write("\t{\r\n");
      out.write("\t\ttry\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tvar foo = \"teststring\";\r\n");
      out.write("                        foo.search(value.replace(/\\(\\?i\\)/,\"\"));\r\n");
      out.write("\t\t\treturn true;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tcatch (e)\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction isInteger(value)\r\n");
      out.write("\t{\r\n");
      out.write("\t\tvar anum=/(^\\d+$)/;\r\n");
      out.write("\t\treturn anum.test(value);\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\t//-->\r\n");
      out.write("\t</script>\r\n");

	OutputConnectorFactory.outputConfigurationHeader(threadContext,className,new org.apache.manifoldcf.ui.jsp.JspWrapper(out,adminprofile),pageContext.getRequest().getLocale(),parameters,tabsArray);

      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body class=\"standardbody\">\r\n");
      out.write("\r\n");
      out.write("    <table class=\"page\">\r\n");
      out.write("      <tr><td colspan=\"2\" class=\"banner\">");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "banner.jsp", out, true);
      out.write("</td></tr>\r\n");
      out.write("      <tr><td class=\"navigation\">");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "navigation.jsp", out, true);
      out.write("</td>\r\n");
      out.write("       <td class=\"darkwindow\">\r\n");

	// Get connector list; need this to decide what to do
	IResultSet set = connectorManager.getConnectors();
	if (set.getRowCount() == 0)
	{

      out.write("\r\n");
      out.write("\t<p class=\"windowtitle\">");
      out.print(Messages.getBodyString(pageContext.getRequest().getLocale(),"editoutput.EditOutputConnection"));
      out.write("</p>\r\n");
      out.write("\t<table class=\"displaytable\"><tr><td class=\"message\">No output connectors registered</td></tr></table>\r\n");

	}
	else
	{

      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<form class=\"standardform\" name=\"editconnection\" action=\"execute.jsp\" method=\"POST\" enctype=\"multipart/form-data\">\r\n");
      out.write("\t    <input type=\"hidden\" name=\"op\" value=\"Continue\"/>\r\n");
      out.write("\t    <input type=\"hidden\" name=\"type\" value=\"output\"/>\r\n");
      out.write("\t    <input type=\"hidden\" name=\"tabname\" value='");
      out.print(org.apache.manifoldcf.ui.util.Encoder.attributeEscape(tabName));
      out.write("'/>\r\n");
      out.write("\t    <input type=\"hidden\" name=\"isnewconnection\" value='");
      out.print((isNew?"true":"false"));
      out.write("'/>\r\n");
      out.write("\t    <table class=\"tabtable\">\r\n");
      out.write("\t      <tr class=\"tabspacerrow\">\r\n");
      out.write("\t\t<td class=\"spacertab\" colspan=\"");
      out.print(tabsArray.size());
      out.write("\"></td>\r\n");
      out.write("\t\t<td class=\"remaindertab\" rowspan=\"3\">\r\n");

	  if (description.length() > 0)
	  {

      out.write("\r\n");
      out.write("\t\t\t<nobr>");
      out.print(Messages.getBodyString(pageContext.getRequest().getLocale(),"editoutput.EditOutputConnection"));
      out.write(' ');
      out.write('\'');
      out.print(org.apache.manifoldcf.ui.util.Encoder.bodyEscape(description));
      out.write("'</nobr>\r\n");

	  }
	  else
	  {

      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t          <nobr>");
      out.print(Messages.getBodyString(pageContext.getRequest().getLocale(),"editoutput.EditAnOutputConnection"));
      out.write("</nobr>\r\n");

	  }

      out.write("\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t      </tr>\r\n");
      out.write("\t      <tr class=\"tabsequencerow\">\r\n");
      out.write("\t\t<td class=\"blanksequencetab\" colspan=\"");
      out.print(tabsArray.size());
      out.write("\"></td>\r\n");
      out.write("\t      </tr>\r\n");
      out.write("\t      <tr class=\"tabrow\">\r\n");

	  int tabNum = 0;
	  while (tabNum < tabsArray.size())
	  {
		String tab = (String)tabsArray.get(tabNum++);
		if (tab.equals(tabName))
		{

      out.write("\r\n");
      out.write("\t\t      <td class=\"activetab\"><nobr>");
      out.print(org.apache.manifoldcf.ui.util.Encoder.bodyEscape(tab));
      out.write("</nobr></td>\r\n");

		}
		else
		{

      out.write("\r\n");
      out.write("\t\t      <td class=\"passivetab\"><nobr><a href=\"javascript:void(0);\" alt='");
      out.print(org.apache.manifoldcf.ui.util.Encoder.attributeEscape(tab)+" "+Messages.getAttributeString(pageContext.getRequest().getLocale(),"editoutput.tab"));
      out.write("' onclick='");
      out.print("javascript:SelectTab(\""+tab+"\");return false;");
      out.write('\'');
      out.write('>');
      out.print(org.apache.manifoldcf.ui.util.Encoder.bodyEscape(tab));
      out.write("</a></nobr></td>\r\n");

		}
	  }

      out.write("\r\n");
      out.write("\t      </tr>\r\n");
      out.write("\t      <tr class=\"tabbodyrow\">\r\n");
      out.write("\t\t<td class=\"tabbody\" colspan='");
      out.print(Integer.toString(tabsArray.size()+1));
      out.write("'>\r\n");



	  // Name tab
	  if (tabName.equals(Messages.getString(pageContext.getRequest().getLocale(),"editoutput.Name")))
	  {

      out.write("\r\n");
      out.write("\t\t    <table class=\"displaytable\">\r\n");
      out.write("\t\t\t<tr><td class=\"separator\" colspan=\"5\"><hr/></td></tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td class=\"description\"><nobr>");
      out.print(Messages.getBodyString(pageContext.getRequest().getLocale(),"editoutput.NameColon"));
      out.write("</nobr></td><td class=\"value\" colspan=\"4\">\r\n");

	    // If the connection doesn't exist yet, we are allowed to change the name.
	    if (connection == null || connectionName.length() < 1)
	    {

      out.write("\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" size=\"32\" name=\"connname\" value='");
      out.print(org.apache.manifoldcf.ui.util.Encoder.attributeEscape(connectionName));
      out.write("'/>\r\n");

	    }
	    else
	    {

      out.write("\r\n");
      out.write("\t\t\t\t\t");
      out.print(org.apache.manifoldcf.ui.util.Encoder.bodyEscape(connectionName));
      out.write("\r\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" name=\"connname\" value='");
      out.print(org.apache.manifoldcf.ui.util.Encoder.attributeEscape(connectionName));
      out.write("'/>\r\n");

	    }

      out.write("\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td class=\"description\"><nobr>");
      out.print(Messages.getBodyString(pageContext.getRequest().getLocale(),"editoutput.DescriptionColon"));
      out.write("</nobr></td><td class=\"value\" colspan=\"4\">\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" size=\"50\" name=\"description\" value='");
      out.print(org.apache.manifoldcf.ui.util.Encoder.attributeEscape(description));
      out.write("'/>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t    </table>\r\n");

	  }
	  else
	  {
		// Hiddens for the Name tab

      out.write("\r\n");
      out.write("\t\t    <input type=\"hidden\" name=\"connname\" value='");
      out.print(org.apache.manifoldcf.ui.util.Encoder.attributeEscape(connectionName));
      out.write("'/>\r\n");
      out.write("\t\t    <input type=\"hidden\" name=\"description\" value='");
      out.print(org.apache.manifoldcf.ui.util.Encoder.attributeEscape(description));
      out.write("'/>\r\n");

	  }


	  // "Type" tab
	  if (tabName.equals(Messages.getString(pageContext.getRequest().getLocale(),"editoutput.Type")))
	  {

      out.write("\r\n");
      out.write("\t\t    <table class=\"displaytable\">\r\n");
      out.write("\t\t\t<tr><td class=\"separator\" colspan=\"5\"><hr/></td></tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td class=\"description\"><nobr>");
      out.print(Messages.getBodyString(pageContext.getRequest().getLocale(),"editoutput.ConnectionTypeColon"));
      out.write("</nobr></td><td class=\"value\" colspan=\"4\">\r\n");

	    if (className.length() > 0)
	    {
		String value = connectorManager.getDescription(className);
		if (value == null)
		{

      out.write("\r\n");
      out.write("\t\t\t\t\t<nobr>");
      out.print(Messages.getBodyString(pageContext.getRequest().getLocale(),"editoutput.UNREGISTERED"));
      out.write(' ');
      out.print(org.apache.manifoldcf.ui.util.Encoder.bodyEscape(className));
      out.write("</nobr>\r\n");

		}
		else
		{

      out.write("\r\n");
      out.write("\t\t\t\t\t");
      out.print(org.apache.manifoldcf.ui.util.Encoder.bodyEscape(value));
      out.write('\r');
      out.write('\n');

		}

      out.write("\r\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" name=\"classname\" value='");
      out.print(org.apache.manifoldcf.ui.util.Encoder.attributeEscape(className));
      out.write("'/>\r\n");

	    }
	    else
	    {
		int i = 0;

      out.write("\r\n");
      out.write("\t\t\t\t\t<select name=\"classname\" size=\"1\">\r\n");

		while (i < set.getRowCount())
		{
			IResultRow row = set.getRow(i++);
			String thisClassName = row.getValue("classname").toString();
			String thisDescription = row.getValue("description").toString();

      out.write("\r\n");
      out.write("\t\t\t\t\t\t<option value='");
      out.print(org.apache.manifoldcf.ui.util.Encoder.attributeEscape(thisClassName));
      out.write("'\r\n");
      out.write("\t\t\t\t\t\t\t");
      out.print(className.equals(thisClassName)?"selected=\"selected\"":"");
      out.write('>');
      out.print(org.apache.manifoldcf.ui.util.Encoder.bodyEscape(thisDescription));
      out.write("</option>\r\n");

		}

      out.write("\r\n");
      out.write("\t\t\t\t\t</select>\r\n");

	    }

      out.write("\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t    </table>\r\n");

	  }
	  else
	  {
		// Hiddens for the "Type" tab

      out.write("\r\n");
      out.write("\t\t    <input type=\"hidden\" name=\"classname\" value='");
      out.print(org.apache.manifoldcf.ui.util.Encoder.attributeEscape(className));
      out.write("'/>\r\n");

	  }


	  // The "Throttling" tab
	  if (tabName.equals(Messages.getString(pageContext.getRequest().getLocale(),"editoutput.Throttling")))
	  {

      out.write("\r\n");
      out.write("\t\t    <table class=\"displaytable\">\r\n");
      out.write("\t\t\t<tr><td class=\"separator\" colspan=\"2\"><hr/></td></tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td class=\"description\"><nobr>");
      out.print(Messages.getBodyString(pageContext.getRequest().getLocale(),"editoutput.MaxConnectionsColon"));
      out.write("</nobr></td>\r\n");
      out.write("\t\t\t\t<td class=\"value\"><input type=\"text\" size=\"6\" name=\"maxconnections\" value='");
      out.print(Integer.toString(maxConnections));
      out.write("'/></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t    </table>\r\n");

	  }
	  else
	  {
		// Hiddens for "Throttling" tab

      out.write("\r\n");
      out.write("\t\t    <input type=\"hidden\" name=\"maxconnections\" value='");
      out.print(Integer.toString(maxConnections));
      out.write("'/>\r\n");

	  }

	  if (className.length() > 0)
		OutputConnectorFactory.outputConfigurationBody(threadContext,className,new org.apache.manifoldcf.ui.jsp.JspWrapper(out,adminprofile),pageContext.getRequest().getLocale(),parameters,tabName);


      out.write("\r\n");
      out.write("\t\t    <table class=\"displaytable\">\r\n");
      out.write("\t\t\t<tr><td class=\"separator\" colspan=\"4\"><hr/></td></tr>\r\n");
      out.write("\t\t\t<tr><td class=\"message\" colspan=\"4\"><nobr>\r\n");

	  if (className.length() > 0)
	  {

      out.write("\r\n");
      out.write("\t\t\t    <input type=\"button\" value=\"");
      out.print(Messages.getAttributeString(pageContext.getRequest().getLocale(),"editoutput.Save"));
      out.write("\" onClick=\"javascript:Save()\" alt=\"");
      out.print(Messages.getAttributeString(pageContext.getRequest().getLocale(),"editoutput.SaveThisOutputConnection"));
      out.write("\"/>\r\n");

	  }
	  else
	  {
		if (tabName.equals(Messages.getString(pageContext.getRequest().getLocale(),"editoutput.Type")))
		{

      out.write("\r\n");
      out.write("\t\t\t    <input type=\"button\" value=\"");
      out.print(Messages.getAttributeString(pageContext.getRequest().getLocale(),"editoutput.Continue"));
      out.write("\" onClick=\"javascript:Continue()\" alt=\"");
      out.print(Messages.getAttributeString(pageContext.getRequest().getLocale(),"editoutput.ContinueToNextPage"));
      out.write("\"/>\r\n");

		}
	  }

      out.write("\r\n");
      out.write("\t\t\t    &nbsp;<input type=\"button\" value=\"");
      out.print(Messages.getAttributeString(pageContext.getRequest().getLocale(),"editoutput.Cancel"));
      out.write("\" onClick=\"javascript:Cancel()\" alt=\"");
      out.print(Messages.getAttributeString(pageContext.getRequest().getLocale(),"editoutput.CancelOutputConnectionEditing"));
      out.write("\"/></nobr></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t    </table>\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t      </tr>\r\n");
      out.write("\t    </table>\r\n");
      out.write("\t</form>\r\n");
      out.write("\r\n");

	}

      out.write("\r\n");
      out.write("\r\n");
      out.write("       </td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </table>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");

    }
    catch (ManifoldCFException e)
    {
	e.printStackTrace();
	variableContext.setParameter("text",e.getMessage());
	variableContext.setParameter("target","listoutputs.jsp");

      out.write('\r');
      out.write('\n');
      out.write('	');
      if (true) {
        _jspx_page_context.forward("error.jsp");
        return;
      }
      out.write('\r');
      out.write('\n');

    }

      out.write("\r\n");
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
