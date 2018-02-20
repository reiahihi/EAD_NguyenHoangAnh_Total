package controllers;// ****************************************** ************************************
// **************************    ************ User: MiTom
// *****************************    ********* Phone: 0966 941 840
// ********************************    ****** Email: 
// ****************************************** ************************************
// *****       ********       ******    ***** Package: "${PACKAGE_NAME}"
// *****        ******        ******    ***** Project: untitled27
// *****    *    ****    *    ******    ***** Date: 06-Feb-18
// *****    **    **    **    ******    ***** Time: 15:47
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

@WebServlet(name = "ListServlet", urlPatterns = {"/ListServlet"})
public class ListServlet extends HttpServlet
{
    @EJB
    private ProductsSessionBean productsSessionBean;
    @EJB
    private ManufacturersSessionBean manufacturersSessionBean;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        request.setAttribute("list", productsSessionBean.findAll());

        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
}
