<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>fileUpload</title>
</head>
<body> <center>
    <h1> File Upload</h1>
    <form action="/servelt" method="POST" enctype="multipart/from-data"><br>
      
    
       name: <input type="text" name="naeme"> <br>
       select file <input type="file" name= "file" size="1000"> <br>
       <input type="submit" value="UpLoaD">
    </form>
    </center>
</body>
</html>


















<!-- 



<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>File Upload</title>
</head>
<body>
<center>
    <h1>File Upload</h1>
    <form method="post" action="UploadServlet"
        enctype="multipart/form-data">
        Select file to upload: <input type="file" name="file" size="60" /><br />
        <br /> <input type="submit" value="Upload" />
    </form>
</center>
</body>
</html> -->