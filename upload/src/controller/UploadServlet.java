package controller;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@WebServlet("/upload.do")
@MultipartConfig(fileSizeThreshold = 5_242_880, // 5MB    //对下载做的一些限制
maxFileSize = 20_971_520L, // 20MB
maxRequestSize = 41_943_040L // 40MB
)
public class UploadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UploadServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		Part  filePart =request.getPart("file");
		InputStream inputStream = filePart.getInputStream();
		OutputStream outputStream = new FileOutputStream("C:\\aeclipse\\new\\"+filePart.getSubmittedFileName());

		int read;
		final byte[] bytes = new byte[1024];

		while ((read = inputStream.read(bytes)) != -1) {
			outputStream.write(bytes, 0, read);
		}

		
		System.out.println(filePart.getSubmittedFileName());
		outputStream.flush();
		outputStream.close();

	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
