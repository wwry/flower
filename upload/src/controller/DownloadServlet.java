package controller;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/download.do")
public class DownloadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public DownloadServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		InputStream is = new FileInputStream("C:\\aeclipse\\new\\1.txt");
		BufferedInputStream bs = new BufferedInputStream(is);
		byte[] file = new byte[bs.available()];
		bs.read(file,0,bs.available());
		response.setHeader("Content-Disposition", "attachment;filename="+"2.txt");
		response.setContentType("application/octet-stream");
		ServletOutputStream stream =response.getOutputStream();
		stream.write(file);
		stream.flush();
		stream.close();
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
