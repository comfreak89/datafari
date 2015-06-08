/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.40
 * Generated at: 2015-05-13 12:12:57 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import org.apache.commons.fileupload.*;
import org.apache.commons.fileupload.disk.*;
import org.apache.commons.fileupload.servlet.*;
import org.apache.commons.io.output.*;
import java.util.ResourceBundle;
import java.nio.charset.StandardCharsets;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;

public final class alerts_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\t<head>\n");
      out.write("\t\t<meta charset=\"utf-8\" />\n");
      out.write("\t\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\" />\n");
      out.write("\t\t<title>Alerts Configuration</title>\n");
      out.write("\t\t<link rel=\"icon\" type=\"image/png\" href=\"images/bullet.png\">\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"../css/main.css\" media=\"screen\" />\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"../css/admin.css\" media=\"screen\" />\n");
      out.write("\t    <script type=\"text/javascript\" src=\"../js/jquery-1.8.1.min.js\"></script>\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"../js/menu.js\"></script>\n");
      out.write("\t</head>\n");
      out.write("\t<body class=\"gecko win\">\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../header.jsp", out, false);
      out.write('\n');
      out.write('	');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "menu.jsp", out, false);
      out.write('	');
      out.write('\n');
      out.write('\n');

if (request.getContentType()!=null) {

	ResourceBundle resourceBundle = ResourceBundle.getBundle("com.francelabs.i18n.text", request.getLocale()); 
   File file ;
   int maxFileSize = 5000 * 1024;
   int maxMemSize = 5000 * 1024;
   ServletContext context = pageContext.getServletContext();
   String filePath = request.getParameter("file").toString();
    if(request.getParameter("content")!=null){
    	String content = request.getParameter("content").toString();
    	try {   
    	    PrintWriter pw = new PrintWriter(new FileOutputStream(filePath));
    	    pw.println(content);
    	    //clean up
    	    pw.close();
    	} catch(IOException e) {
    	   out.println(e.getMessage());
    	}
    	 out.println(resourceBundle.getString("alertModifSuccess"));
    }
    else{
		String core = request.getParameter("core").toString();
		String keyword = request.getParameter("keyword").toString();
		String mail = request.getParameter("mail").toString();    
		String object = request.getParameter("object").toString();      
		try{
            FileWriter fstream = new FileWriter(filePath, true);
            BufferedWriter fbw = new BufferedWriter(fstream);
            fbw.write("core = "+core+";");
            fbw.newLine();
            fbw.write("keyword = "+keyword+";");
            fbw.newLine();
            fbw.write("address = "+mail+";");
            fbw.newLine();
            fbw.write("object = "+object+";");
            fbw.newLine();
            fbw.close();
		}catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
		out.println(resourceBundle.getString("alertAddSuccess"));
    }

    
    

	
//    // Verify the content type
//    String contentType = request.getContentType();
//    if ((contentType.indexOf("multipart/form-data") >= 0)) {

//       DiskFileItemFactory factory = new DiskFileItemFactory();
//       // maximum size that will be stored in memory
//       factory.setSizeThreshold(maxMemSize);
//       // Location to save data that is larger than maxMemSize.
//       factory.setRepository(new File("../"));

//       // Create a new file upload handler
//       ServletFileUpload upload = new ServletFileUpload(factory);
//       // maximum file size to be uploaded.
//       upload.setSizeMax( maxFileSize );
//       try{ 
//          // Parse the request to get file items.
//          List fileItems = upload.parseRequest(request);

//          // Process the uploaded file items
//          Iterator i = fileItems.iterator();

        
//          while ( i.hasNext () ) 
//          {
//             FileItem fi = (FileItem)i.next();
//             if ( !fi.isFormField () )	
//             {
//             // Get the uploaded file parameters
//             String fieldName = fi.getFieldName();
//             String fileName = fi.getName();
//             boolean isInMemory = fi.isInMemory();
//             long sizeInBytes = fi.getSize();
//             // Write the file
			
            
//             file = new File( filePath +"synonyms_en.txt");
// //             if(file.exists() && !file.isDirectory()){
// //             	FileWriter fw = new FileWriter(file,true);
// //             	 fw.write(fi.toString());
// //             }
// //             else{
//              fi.write( file ) ;
//  //           }
	
			
// 			Charset charset = StandardCharsets.UTF_8;
// 			Path path = Paths.get(filePath +"synonyms_en.txt");
// 			String content = new String(Files.readAllBytes(path), charset);
// 			content = content.replaceAll(" ", "\\\\ ");
// 			Files.write(path, content.getBytes(charset));
			
			
//             out.println(resourceBundle.getString("synonymSuccess"));
// 			out.println("<br />");
// 			out.println(resourceBundle.getString("synonymRestart"));
			
//             }
//          }
         
//       }catch(Exception ex) {
//          System.out.println(ex);
//       }
//    }else{
      
//       out.println("<p>No file uploaded</p>"); 
      
//    }
   }
   else {
		out.println("erreur");
		String site = new String("http://localhost:8080/Datafari/");
		response.setStatus(response.SC_MOVED_TEMPORARILY);
		response.setHeader("Location", site); 
		}

      out.write('\n');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../footer.jsp", out, false);
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
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
