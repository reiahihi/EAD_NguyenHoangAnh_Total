<%--
// ****************************************** ************************************
// **************************    ************ User: MiTom
// *****************************    ********* Phone: 0966 941 840
// ********************************    ****** Email:
// ****************************************** ************************************
// *****       ********       ******    ***** Package:
// *****        ******        ******    ***** Project: EAD_NguyenHoangAnh_Total
// *****    *    ****    *    ******    ***** Date: 22-Feb-18
// *****    **    **    **    ******    ***** Time: 09:51
// *****    ***        ***    ******    ***** Name: testJquery
// *****    **************    ******    ***** ************************************
// *****    **************    ******    ***** Created by IntelliJ IDEA.
// ****************************************** ************************************
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

    <script src="assets/js/jquery.js"></script>

    <script>



        function aa() {
            var text = $("#textT").text();
            console.log(text)
        }


    </script>
</head>
<body>
<h1 id="textT"> ahihi</h1>
<input type="button" value="click" id="btnC" onclick="aa()">
</body>
</html>
