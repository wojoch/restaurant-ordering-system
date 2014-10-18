<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ include file="../layout/taglib.jsp" %>

<table class="table table-bordered table-hover table-striped table-condensed">
	<thead>
		<tr>
			<th>Login</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Address</th>
			<th>E-mail</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${users}" var="user">
			<tr>
				<td>${user.login}</td>
				<td>${user.firstName}</td>
				<td>${user.lastName}</td>
				<td>${user.address}</td>
				<td>${user.email}</td>
			</tr>
		</c:forEach>
	</tbody>
</table>