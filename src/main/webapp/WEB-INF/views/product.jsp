<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="<c:url value="main.css"/>">
<title>Product Page</title>
</head>
<body>
<c:import url="header.jsp"></c:import>
<div class = "centered">
	<h1>Products Page</h1>
	</div>
	
	<table cellpadding="2" cellspacing="2" border="1" align="center">
	
		<tr>
	
			<th>Id</th>
			<th>Name</th>
			<th>Description</th>
			<th>Photo</th>
			<th>Price</th>
			<th>Buy</th>
		</tr>
		<c:forEach var="product" items="${products }">
			<tr>
				<td>${product.id }</td>
				<td>${product.name }</td>
				<td>${product.description }</td>
				<td><img src="${product.photo }" width="150"></td>
				<td>$ ${product.price }</td>
				<td align="center">
				<form action = "${pageContext.request.contextPath }/buy/${product.id }" method = "POST">
				
					
					<input type="tel" name="quantity" placeholder="quantity"
					  maxlength="2" required="true" autofocus="true">
					  <input type="submit" value="Submit" />
					  </form>
				</td>
			</tr>
		
		</c:forEach>
	</table>
	<div class = "centered">
	<a href="cart"><div>
				<p>Go To Cart</p>
	</div>
</body>
</html>