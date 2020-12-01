<%-- 
    Document   : searchoffer
    Created on : Aug 11, 2020, 8:01:57 PM
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
	aqua.AquaWeb_Service service = new aqua.AquaWeb_Service();
	aqua.AquaWeb port = service.getAquaWebPort();
	 // TODO initialize WS operation arguments here
	int id = Integer.parseInt(request.getParameter("id"));
	// TODO process result here
	java.util.List<java.lang.Object> result = port.searchOffer(id);
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
    </body>
</html>
