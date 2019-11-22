<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="<c:url value="/main.css"/>">
<title>Cart Page</title>
</head>
<body>
<c:import url="header.jsp"></c:import>
		<div class = "centered">
			<h1>Cart Page</h1>
		</div>
	<table cellpadding="2" cellspacing="2" border="1" align="center">
		<tr>
			
			<th>Id</th>
			<th>Name</th>
			<th>Description</th>
			
			<th>Price</th>
			<th>Quantity</th>
			<th>Sub Total</th>
		</tr>
		<c:set var="total" value="0"></c:set>
		<c:forEach var="item" items="${sessionScope.cart }">
			<c:set var="total"
				value="${total + item.product.price * item.quantity }"></c:set>
			<tr>
				
				<td>${item.product.id }</td>
				<td>${item.product.name }</td>
				<td>${item.product.description }</td>
				
				<td>${item.product.price }</td>
				<td>${item.quantity }</td>
				<td>$ ${item.product.price * item.quantity }</td>
			</tr>
		</c:forEach>
		<tr>
			<td colspan="5" align="right">Sum</td>
			<td>$ ${total }</td>
		</tr>
	</table>
	<br>
	<div class = "centered">
	<a href="${pageContext.request.contextPath }/product">Continue
		Shopping</a>
	</div>

</body>
</html>