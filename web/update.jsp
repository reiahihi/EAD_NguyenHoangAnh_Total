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
// *****    **    **    **    ******    ***** Time: 14:43
// *****    ***        ***    ******    ***** Name: update
// *****    **************    ******    ***** ************************************
// *****    **************    ******    ***** Created by IntelliJ IDEA.
// ****************************************** ************************************
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update</title>
</head>
<body>
<h1>Update product</h1>
<form action="UpdateServlet" method="post">
    ID: <input type="text" id="id" name="id" value="${pro.productId}" readonly> <br>
    Name: <input type="text" id="name" name="name" value="${pro.productName}"><br>
    Image: <input type="text" id="image" name="image" value="${pro.productImage}"><br>
    Price: <input type="text" id="price" name="price" value="${pro.productPrice}"><br>
    Details: <input type="text" id="details" name="details" value="${pro.productDetail}"><br>

    Manufacturer:
    <select id="manufacturer" name="manufacturer">

        <c:forEach var="m" items="${listManu}">
            <option value="${m.manufacturerId}" ${m.manufacturerId ==  pro.manufacturerId ? 'selected' : ''}>${m.manufacturerName}</option>
        </c:forEach>
    </select>
    <br>
    <input type="submit" value="Update">
</form>
</body>
</html>
