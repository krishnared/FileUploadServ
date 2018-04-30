package com.telsuko;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.tomcat.util.http.fileupload.FileItem;

public class upload extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public upload() {
      public void doPost(HttpRequestServlet req,HttpResponseServlet res) throws ServletException
      {
    	  
    	  ServletFileUpload sf=mew ServletFileUpload(new DiskFileItemFactory());
    	  List<FileItem> multiplefiles= sf.parseRequest(request);
    	  for(FileItem item : multiplefiles )
    	  {
    		  item.write(new File("/Users/krishnamac/Downloads/" +item.getName()));
    	  }
    	  System.out.println("Uploaded");
      }
    	  
      }
}
