<%-- 
    Document   : updateProduct
    Created on : Aug 11, 2020, 1:52:19 AM
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Aquamachine</title>
    </head>
    <body>
        <style>
	body{	background-image:url("aqua_web.jpg");
	    	 background-repeat:no-repeat;
		 background-attachment:fixed;
		 background-position:center;
		 background-size:100% 100%;
	        }
</style>
    <%-- start web service invocation --%><hr/>
    <%
    try {
	aqua.AquaProduct_Service service = new aqua.AquaProduct_Service();
	aqua.AquaProduct port = service.getAquaProductPort();
	 // TODO initialize WS operation arguments here
        int id = Integer.parseInt(request.getParameter("id"));
	java.lang.String description = request.getParameter("description");
	java.lang.String price = request.getParameter("price");
	port.updateProduct(id, description, price);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
    </body>
    <h4>Update Successful!</h4>
</html>
