<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
         "http://www.w3.org/TR/html4/loose.dtd">

<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<jsp:useBean id="users" class="example.Users" scope="page" />

<% 
   List<String> list = new ArrayList<String>();
   list.add("Products");
   list.add("Clothes");
   list.add("Shoes");
   list.add("Sport equipment");
   request.setAttribute("list", list); 
%>

<html>
  <head>
     <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">  
     <title>Пример JSP JSTL</title>
  </head>  
  <body>
     <h3>List of product groups</h3>
     <ul>
        <c:forEach var="i" items="${list}" >
          <li>${i}</li><br />
        </c:forEach>
     </ul>     
     <h3>Authors</h3>
     <table border="1" cellspacing="0" cellpadding="2">
          <tr>
               <td>UID</td>
               <td>Name</td>
          </tr>

          <c:forEach items="${users.data}" var="user">
          <tr>
               <td>${user.id}</td>
               <td>${user.name}</td>
          </tr>
          </c:forEach>
     </table>
  </body>  
</html>