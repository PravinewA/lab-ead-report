<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="ISO-8859-1" />
    <title>Insert title here</title>
  </head>
  <body>
    <%! int count = 0; int increaseCount() { return count++; } String
    returnName() { return "pravinewa"; } %> <% out.print("Hello Jsp"); %> <%=
    "Value of count is = " + increaseCount() + "\tYour Name is " + returnName()
    %> Current Time: <%= java.util.Calendar.getInstance().getTime()%>
  </body>
</html>
