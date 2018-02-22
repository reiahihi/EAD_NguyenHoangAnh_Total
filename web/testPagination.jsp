<%--
// ****************************************** ************************************
// **************************    ************ User: MiTom
// *****************************    ********* Phone: 0966 941 840
// ********************************    ****** Email:
// ****************************************** ************************************
// *****       ********       ******    ***** Package:
// *****        ******        ******    ***** Project: EAD_NguyenHoangAnh_Total
// *****    *    ****    *    ******    ***** Date: 22-Feb-18
// *****    **    **    **    ******    ***** Time: 10:18
// *****    ***        ***    ******    ***** Name: testPagination
// *****    **************    ******    ***** ************************************
// *****    **************    ******    ***** Created by IntelliJ IDEA.
// ****************************************** ************************************
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

    <link rel="stylesheet" href="assets/css/bootstrap.min.css">
    <script src="assets/js/jquery.js"></script>
    <script src="assets/js/bootstrap.min.js"></script>

    <script>
        $('#pagination-container').pagination({
            dataSource: [1, 2, 3, 4, 5, 6, 7, 4, 5, 6, 7, 4, 5, 6, 7, 4, 5, 6, 7, 4, 5, 6, 7, 195],
            callback: function (data, pagination) {
                // template method of yourself
                var html = template(data);
                $('#data-container').html(html);
            }
        })
    </script>
</head>
<body>

<div id="data-container"></div>
<div id="pagination-container"></div>


</body>
</html>
