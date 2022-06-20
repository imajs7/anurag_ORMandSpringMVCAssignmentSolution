<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Customer List</title>
<link rel="stylesheet" 
			href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" 
			integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" 
			crossorigin="anonymous">
</head>
<body>

	<div class="container mt-3">
		
		<%@ include file="header.jsp" %>  
	
		<a href="addcustomer" class="btn btn-primary btn-sm mb-3">Add Customer</a>
		
		<table class="table table-bordered table-striped">
		
			<thead class="thead-dark">
				<tr>
					<th>Id</th>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Email</th>
					<th>Action</th>
				</tr>
			</thead>
			
			<tbody>
			
				<c:forEach items="${customers}" var = "customer">
				
					<tr>
						<td><c:out value="${customer.id}"></c:out></td>
						<td><c:out value="${customer.firstName}"></c:out></td>
						<td><c:out value="${customer.lastName}"></c:out></td>
						<td><c:out value="${customer.email}"></c:out></td>
						<td>
							<a href="update/${customer.id}" class="btn btn-info btn-sm">Update</a>
							<a href="delete/${customer.id}" onclick="if (!(confirm('Are you sure you want to delete this customer?'))) return false" class="btn btn-danger btn-sm">Delete</a>
						</td>
					</tr>
				
				</c:forEach>
				
			</tbody>
		
		</table>
		
		<%@ include file="footer.jsp" %>
	
	</div>

</body>
</html>