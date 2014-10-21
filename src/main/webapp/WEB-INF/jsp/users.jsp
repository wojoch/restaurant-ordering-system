<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ include file="../layout/taglib.jsp"%>

<table
	class="table table-bordered table-hover table-striped table-condensed">
	<thead>
		<tr>
			<th>Id</th>
			<th>Login</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>E-mail</th>
			<th>Address</th>
			<th>Phone number</th>
			<th>Operations</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${users}" var="user">
			<tr>
				<td>${user.id}</td>
				<td>${user.login}</td>
				<td>${user.firstName}</td>
				<td>${user.lastName}</td>
				<td>${user.email}</td>
				<td>${user.address}${user.postalCode} ${user.city}</td>
				<td>${user.phoneNumber}</td>
				<td><a href="<spring:url value="/users/remove/${user.id}.html" />" class="btn btn-danger"> Remove </a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>