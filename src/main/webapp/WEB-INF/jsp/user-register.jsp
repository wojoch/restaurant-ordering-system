<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ include file="../layout/taglib.jsp"%>

<form:form commandName="user" cssClass="form-horizontal">
	
	<c:if test="${param.success eq true }">
		<div class="alert alert-success">Registration successfull</div>
	</c:if>

	<div class="form-group">
		<label for="firstName" class="col-sm-2 control-label">First name</label>
		<div class="col-sm-10">
			<form:input path="firstName" cssClass="form-control" placeholder="Enter first name"/>
		</div>
	</div>
	<div class="form-group">
		<label for="lastName" class="col-sm-2 control-label">Last name</label>
		<div class="col-sm-10">
			<form:input path="lastName" cssClass="form-control" placeholder="Enter last name"/>
		</div>
	</div>
	<div class="form-group">
		<label for="login" class="col-sm-2 control-label">Login</label>
		<div class="col-sm-10">
			<form:input path="login" cssClass="form-control" placeholder="Enter login"/>
		</div>
	</div>
	<div class="form-group">
		<label for="password" class="col-sm-2 control-label">Password</label>
		<div class="col-sm-10">
			<form:password path="password" cssClass="form-control" placeholder="Enter password"/>
		</div>
		
	</div>
	<div class="form-group">
		<label for="email" class="col-sm-2 control-label">E-mail</label>
		<div class="col-sm-10">
			<form:input path="email" cssClass="form-control" placeholder="Enter email"/>
		</div>
	</div>
	<div class="form-group">
		<label for="address" class="col-sm-2 control-label">Address</label>
		<div class="col-sm-10">
			<form:input path="address" cssClass="form-control" placeholder="Enter address"/>
		</div>
	</div>
	<div class="form-group">
		<label for="postalCode" class="col-sm-2 control-label">Postal Code</label>
		<div class="col-sm-10">
			<form:input path="postalCode" cssClass="form-control" placeholder="Enter postal Code"/>
		</div>
	</div>
	<div class="form-group">
		<label for="city" class="col-sm-2 control-label">City</label>
		<div class="col-sm-10">
			<form:input path="city" cssClass="form-control" placeholder="Enter city"/>
		</div>
	</div>
	<div class="form-group">
		<label for="phoneNumber" class="col-sm-2 control-label">Phone Number</label>
		<div class="col-sm-10">
			<form:input path="phoneNumber" cssClass="form-control" placeholder="Enter phone number"/>
		</div>
	</div>
	<div class="form-group">
		<div class="col-sm-2">
			<input type="submit" value="Register" class="btn btn-lg btn-primary">
		</div>
	</div>
</form:form>