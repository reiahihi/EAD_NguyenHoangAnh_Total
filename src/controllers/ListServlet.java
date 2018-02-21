package controllers;// ****************************************** ************************************
// **************************    ************ User: MiTom
// *****************************    ********* Phone: 0966 941 840
// ********************************    ****** Email: 
// ****************************************** ************************************
// *****       ********       ******    ***** Package: controllers
// *****        ******        ******    ***** Project: untitled27
// *****    *    ****    *    ******    ***** Date: 06-Feb-18
// *****    **    **    **    ******    ***** Time: 15:47
// *****    ***        ***    ******    ***** Name: ${NAME}
// *****    **************    ******    ***** ************************************
// *****    **************    ******    ***** Created by IntelliJ IDEA.
// ****************************************** ************************************


import entities.Manufacturers;
import entities.Products;
import reponsitory.Pager;
import sb.ManufacturersSessionBean;
import sb.ProductsSessionBean;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

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
        Pager p = new Pager();
        p.setList(productsSessionBean.findAll());

        String pageNumber = request.getParameter("page");
        if (pageNumber == null)
        {
            p.setCurrentPage(1);
        }
        else
        {
            p.setCurrentPage(Integer.parseInt(pageNumber));
        }
//        System.out.println(p.getCurrentPage() + "a");
//        System.out.println(p.getCountPage() + "b");

        request.setAttribute("list", p.getPageList());
        request.setAttribute("pages" , p.getCountPage());
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
}
