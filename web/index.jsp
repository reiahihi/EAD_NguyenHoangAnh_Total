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
    <link href="assets/css/bootstrap.min.css" rel="stylesheet">
    <script src="assets/js/bootstrap.min.js"></script>

    <script src="assets/js/datatable.js"></script>
    <script src="assets/js/jquery.js" type="text/javascript"></script>
    <script src="assets/js/datatable.jquery.js"></script>

    <link rel="stylesheet" href="assets/css/datatable-bootstrap.css">
    <style>
        /*Generic*/
        .wrapper {
            margin: 60px auto;
            text-align: center;
        }

        h1 {
            margin-bottom: 1.25em;
        }

        /*Specific styling*/
        table {
            display: inline-block;
            border: 1px solid #373737;
            margin-bottom: 20px;
            text-align: center;
        }

        th {
            font-family: 'Lucida Grande', 'Helvetica Neue', Helvetica, Arial, sans-serif;
            padding: 10px;
            background: #373737;
            color: #fff;
        }

        td {
            padding: 10px;
            border: 1px solid #373737;
        }

        form {
            background: #f2f2f2;
            padding: 20px;
        }

    </style>


</head>
<body>

<div class="wrapper">
    <div class="container">

        <div class="row">
            <div class="col-sm-12">

                <table id="example-table">
                    <caption style="text-align: center"><h1>List of Product</h1></caption>
                    <thead>
                    <tr>
                        <td>ID</td>
                        <td>Name</td>
                        <td>image</td>
                        <td>Price</td>
                        <td>Details</td>
                        <td>manufacturer</td>
                        <td></td>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${list}" var="e">
                        <tr>
                            <td>${e.productId}</td>
                            <td>${e.productName}</td>
                            <td><img src="assets/images/${e.productImage}" alt="${e.productImage}" height="80px"></td>
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

                <div class="paging"></div>
            </div>
        </div>
    </div>
</div>
<script type="text/javascript">
    $('#example-table').datatable({

        pageSize: 4,
        sort: [true, true, false, true, true],
        filters: [true, true, false, true, true, 'select'],
        filterText: 'Type to filter... ',
        onChange: function (old_page, new_page) {
            console.log('changed from ' + old_page + ' to ' + new_page);
        }
    });
</script>
</body>
</html>
