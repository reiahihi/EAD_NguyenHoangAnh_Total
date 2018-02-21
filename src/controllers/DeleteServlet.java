package controllers;// ****************************************** ************************************
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


import sb.ProductsSessionBean;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "DeleteServlet", urlPatterns = {"/DeleteServlet"})
public class DeleteServlet extends HttpServlet
{
    @EJB
    private ProductsSessionBean productsSessionBean;
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        productsSessionBean.destroy(productsSessionBean.findEntity(request.getParameter("id")));
        response.sendRedirect("ListServlet");
    }
}
