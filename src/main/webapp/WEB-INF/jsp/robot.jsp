<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html;
 charset=ISO-8859-1">
<title>Robot</title>
</head>
<body>

<table>
<tr>
    <td>
           <tr><td align="center"><jsp:include page="robotHead.jsp" /></td> </tr>
           <tr><td align="center"><jsp:include page="robotBody.jsp" /> </td></tr>
           <tr><td align="center"><jsp:include page="robotLegs.jsp" /></td> </tr>

    </td>
    <td>
    </td>
</tr>
</table>


</body>
</html>