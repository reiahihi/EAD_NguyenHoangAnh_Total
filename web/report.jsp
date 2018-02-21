<%--
// ****************************************** ************************************
// **************************    ************ User: MiTom
// *****************************    ********* Phone: 0966 941 840
// ********************************    ****** Email:
// ****************************************** ************************************
// *****       ********       ******    ***** Package:
// *****        ******        ******    ***** Project: EAD_NguyenHoangAnh_Total
// *****    *    ****    *    ******    ***** Date: 21-Feb-18
// *****    **    **    **    ******    ***** Time: 14:25
// *****    ***        ***    ******    ***** Name: report
// *****    **************    ******    ***** ************************************
// *****    **************    ******    ***** Created by IntelliJ IDEA.
// ****************************************** ************************************
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Report</title>
    <script src="assets/js/Chart.bundle.js"></script>
    <script src="assets/js/utils.js"></script>
    <script src="assets/js/jquery.js"></script>


</head>
<body>

<div>
    <div id="canvas-holder" style="width:40%">
        <canvas id="chart-area"/>
    </div>
    <h1>Percent sum price product by manufacturer</h1>
</div>


<script>

    var config = {
        type: 'pie',
        data: {
            datasets: [{
                data: ${sumPrice},
                backgroundColor: [
                    window.chartColors.red,
                    window.chartColors.orange,
                    window.chartColors.blue,
                    window.chartColors.green,
                    window.chartColors.purple,
                    window.chartColors.grey,
                    window.chartColors.yellow
                ],
                label: 'Dataset 1'
            }],
            labels: ${manufacturers}
        },
        options: {
            responsive: true
        }
    };


    window.onload = function () {
        var ctx = document.getElementById("chart-area").getContext("2d");
        window.myPie = new Chart(ctx, config);
    };


</script>
<h3><a href="home.jsp">home page</a></h3>
</body>
</html>
