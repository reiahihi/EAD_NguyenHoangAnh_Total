<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
// ****************************************** ************************************
// **************************    ************ User: MiTom
// *****************************    ********* Phone: 0966 941 840
// ********************************    ****** Email: 
// ****************************************** ************************************
// *****       ********       ******    ***** Package: 
// *****        ******        ******    ***** Project: EAD_NguyenHoangAnh_AssignmentTotal
// *****    *    ****    *    ******    ***** Date: 07-Feb-18
// *****    **    **    **    ******    ***** Time: 14:48
// *****    ***        ***    ******    ***** Name: insert
// *****    **************    ******    ***** ************************************
// *****    **************    ******    ***** Created by IntelliJ IDEA.
// ****************************************** ************************************
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Insert</title>
</head>
<body>
<h1>Create new product</h1>
<form action="CreateServlet" method="post">
    ID: <input type="text" id="id" name="id"  ><br>
    Name: <input type="text" id="name" name="name"><br>
    Image: <input type="text" id="image" name="image"><br>
    Price: <input type="text" id="price" name="price" ><br>
    Details: <input type="text" id="details" name="details"><br>
    Manufacturer:
    <select id="manufacturer" name="manufacturer">
        <option value="0">Chọn hãng</option>

        <c:forEach var="m" items="${listManu}">
            <option value="${m.manufacturerId}">${m.manufacturerName}</option>
        </c:forEach>
    </select>
    <input type="submit" value="Create">
</form>
</body>
</html>
