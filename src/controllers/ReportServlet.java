package controllers;// ****************************************** ************************************
// **************************    ************ User: MiTom
// *****************************    ********* Phone: 0966 941 840
// ********************************    ****** Email: 
// ****************************************** ************************************
// *****       ********       ******    ***** Package: ${PACKAGE_NAME}
// *****        ******        ******    ***** Project: EAD_NguyenHoangAnh_Total
// *****    *    ****    *    ******    ***** Date: 21-Feb-18
// *****    **    **    **    ******    ***** Time: 14:28
// *****    ***        ***    ******    ***** Name: ${NAME}
// *****    **************    ******    ***** ************************************
// *****    **************    ******    ***** Created by IntelliJ IDEA.
// ****************************************** ************************************


import entities.Manufacturers;
import sb.ManufacturersSessionBean;
import sb.ProductsSessionBean;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ReportServlet", urlPatterns = {"/ReportServlet"})
public class ReportServlet extends HttpServlet
{
    @EJB
    private ManufacturersSessionBean manufacturersSessionBean;

    @EJB
    private ProductsSessionBean productsSessionBean;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

        List manufacturers = new ArrayList();
        List sumPrice = new ArrayList();


        List<Object[]> temp = productsSessionBean.runQuery("select c.manufacturersByManufacturerId.manufacturerName , sum(c.productPrice) from Products c group by  c.manufacturersByManufacturerId.manufacturerName");
        for(Object[] t : temp )
        {
            manufacturers.add("'"+t[0]+"'");
            sumPrice.add(t[1]);
        }

        request.setAttribute("manufacturers", manufacturers);
        request.setAttribute("sumPrice", sumPrice);
        request.getRequestDispatcher("report.jsp").forward(request, response);
    }
}
