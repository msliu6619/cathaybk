<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<title>Hello</title>
	</head>
	<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
	<script type="text/javascript">
		function insertClickEvent() {
			alert("Insert");
			$('#form_main').attr('action', 'Insert').submit();
		}
		function updateClickEvent() {
			alert("update");
			$('#form_main').attr('action', 'Update').submit();
		}
		function deleteClickEvent() {
			alert("Delete");
			$('#form_main').attr('action', 'Delete').submit();
		}
		
	</script>
	<body>
	    <p>Hello, JSP!</p>
		<p>My name is ${name}.</p>
		<p>${message}.</p>
		
		<form id="form_main">
			<p><label>幣別：</label><input type="text" id="code" name="code"></p>
			<p><label>符號：</label><input type="text" id="symbol" name="symbol"></p>
			<p><label>匯率：</label><input type="text" id="rate" name="rate"></p>
			<p><label>備註：</label><input type="text" id="description" name="description"></p>
			<p>
				<button id="button_insert" onClick="insertClickEvent()">新增</button>
				<button id="button_update" onClick="updateClickEvent()">修改</button>
				<button id="button_delete" onClick="deleteClickEvent()">刪除</button>
			</p>
		</form>
		<table id="table" border="1" style="text-align: center;">
			<tr>
				<th>CODE</th>
				<th>SYMBOL</th>
				<th>RATE</th>
				<th>DESCRIPTION</th>
				<th>RATE_FLOAT</th>
			</tr>
			<c:forEach var="currency" items="${data}" >
				<tr>
					<td>${currency.code}</td>
					<td>${currency.symbol}</td>
					<td>${currency.rate}</td>
					<td>${currency.description}</td>
					<td>${currency.rate_float}</td>
				</tr>
			</c:forEach>
		</table>
	</body>
</html>