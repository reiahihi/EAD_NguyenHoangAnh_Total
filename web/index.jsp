<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
// ****************************************** ************************************
// **************************    ************ User: MiTom
// *****************************    ********* Phone: 0966 941 840
// ********************************    ****** Email:
// ****************************************** ************************************
// *****       ********       ******    ***** Package: ${PACKAGE_NAME}
// *****        ******        ******    ***** Project: EAD_NguyenHoangAnh_Total
// *****    *    ****    *    ******    ***** Date: 07-Feb-18
// *****    **    **    **    ******    ***** Time: 10:16
// *****    ***        ***    ******    ***** Name: ${NAME}
// *****    **************    ******    ***** ************************************
// *****    **************    ******    ***** Created by IntelliJ IDEA.
// ****************************************** ************************************
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List</title>
</head>
<body>
<table border="1" cellspacing="0" cellpadding="5">

    <caption><h1>List of Product</h1></caption>

    <thead>
    <tr>
        <td>ID</td>
        <td>Name</td>
        <td>image</td>
        <td>Price</td>
        <td>Details</td>
        <td>manufacturer</td>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${list}" var="e">
        <tr>
            <td>${e.productId}</td>
            <td>${e.productName}</td>
            <td><img src="uploadDir/${e.productImage}" alt="${e.productImage}" height="80px"></td>
            <td>${e.productPrice}</td>
            <td>${e.productDetail}</td>
            <td>${e.manufacturersByManufacturerId.manufacturerName} </td>
            <td>
                <a href="UpdateServlet?id=${e.productId}">Update </a> | <a
                    href="DeleteServlet?id=${e.productId}">Delete</a>
            </td>
        </tr>
    </c:forEach>

    </tbody>
</table>
<h2>
    <c:forEach begin="1" end="${pages}" var="p">
        <a href="ListServlet?page=${p}">${p}</a>
    </c:forEach>

</h2>
<h3><a href="CreateServlet">Create new product</a></h3>
</body>
</html>
