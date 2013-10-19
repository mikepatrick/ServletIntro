<%@ page import="com.mike.beer.web.*" %>
<html>
<body>
The page has been requested: 
<%
	out.println(Counter.getCount());
%>
times.
</body>
</html>