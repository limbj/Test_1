<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="jdbc.connection.ConnectionProvider"%>
<%@ page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Connection Test</title>
</head>
<body>
	<%
	try (Connection conn = ConnectionProvider.getConnection()) {
		out.println("Connection Success");
	} catch (SQLException ex) {
		out.println("Connection Fail: " + ex.getMessage());
		application.log("Connectio Fail", ex);
	}
	%>
</body>
</html>