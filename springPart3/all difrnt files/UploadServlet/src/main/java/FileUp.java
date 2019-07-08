import java.io.File;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 * FileUp
 */

 @WebServlet("/servelt")
 @MultipartConfig(
fileSizeThreshold = 1024*1024*2,// 2mp 
maxFileSize=1024*10244*10,  //10Mb
maxRequestSize = 1024*1024*50 //50mb  
 )
public class FileUp extends HttpServlet {
    private static final String upFile="files ";
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // gets absolute path of the web application
        String abpath= req.getServletContext().getRealPath("");
 // constructs path of the directory to save uploaded file
        String savepath=abpath+File.separator+upFile;
        File saveDer= new File(savepath);
        if(!saveDer.exists()){
            saveDer.mkdir();
        }
 for(Part part : req.getParts()){
     String Sfile=  extractFileName(part);
     
 }


    }




    

    private String extractFileName(Part part) {
        return null;
    }

    
}