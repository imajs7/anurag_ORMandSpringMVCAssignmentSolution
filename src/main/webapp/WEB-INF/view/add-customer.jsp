<%@page import="com.springcrm.model.Customer"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Save Customer</title>
<link rel="stylesheet" 
			href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" 
			integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" 
			crossorigin="anonymous">
</head>
<body>

	<div class="container mt-3">
	
		<%@ include file="header.jsp" %>
		
		<h5>Save Customer</h5>
		
		<form action="${pageContext.request.contextPath }/save" method="POST">
			<input type="hidden" name ="id" value="${customer.id}" />
			<div class="form-inline">
				<input type="text" name ="firstName" value="${customer.firstName}" placeholder="First name" class="form-control mb-4 col-4" />
			</div>
			<div class="form-inline">
				<input type="text" name ="lastName" value="${customer.lastName}" placeholder="Last name" class="form-control mb-4 col-4" />
			</div>
			<div class="form-inline">
				<input type="text" name ="email" value="${customer.email}" placeholder="Email Id" class="form-control mb-4 col-4" />
			</div>
			<button type="submit" class="btn btn-info col-2">Save</button>
		</form>
		<br><br>
		<a href="home">Back to Customer list</a>
		
		<%@ include file="footer.jsp" %>
		
	</div>

</body>
</html>