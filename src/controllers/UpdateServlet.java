package controllers;
// ****************************************** ************************************
// **************************    ************ User: MiTom
// *****************************    ********* Phone: 0966 941 840
// ********************************    ****** Email: 
// ****************************************** ************************************
// *****       ********       ******    ***** Package: controllers
// *****        ******        ******    ***** Project: EAD_NguyenHoangAnh_AssignmentTotal
// *****    *    ****    *    ******    ***** Date: 07-Feb-18
// *****    **    **    **    ******    ***** Time: 14:48
// *****    ***        ***    ******    ***** Name: ${NAME}
// *****    **************    ******    ***** ************************************
// *****    **************    ******    ***** Created by IntelliJ IDEA.
// ****************************************** ************************************


import entities.Products;
import sb.ManufacturersSessionBean;
import sb.ProductsSessionBean;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "UpdateServlet", urlPatterns = {"/UpdateServlet"})
public class UpdateServlet extends HttpServlet
{
    @EJB
    private ProductsSessionBean productsSessionBean;

    @EJB
    private ManufacturersSessionBean manufacturersSessionBean;

    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        Products p = new Products();
        p.setProductId(request.getParameter("id"));
        p.setProductName(request.getParameter("name"));
        p.setProductImage(request.getParameter("image"));
        p.setProductPrice(Integer.valueOf(request.getParameter("price")));
        p.setProductDetail(request.getParameter("details"));
        p.setManufacturerId(Integer.valueOf(request.getParameter("manufacturer")));
        p.setManufacturersByManufacturerId(manufacturersSessionBean.findEntity(Integer.valueOf(request.getParameter("manufacturer"))));
        productsSessionBean.edit(p);
        response.sendRedirect("ListServlet");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

        request.setAttribute("listManu" , manufacturersSessionBean.findAll());
        request.setAttribute("pro", productsSessionBean.findEntity(request.getParameter("id")));
        request.getRequestDispatcher("update.jsp").forward(request, response);
    }
}
