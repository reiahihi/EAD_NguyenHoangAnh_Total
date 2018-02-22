package reponsitory;

// ****************************************** ************************************
// **************************    ************ User: MiTom
// *****************************    ********* Phone: 0966 941 840
// ********************************    ****** Email: 
// ****************************************** ************************************
// *****       ********       ******    ***** Package: reponsitory
// *****        ******        ******    ***** Project: EAD_NguyenHoangAnh_Total
// *****    *    ****    *    ******    ***** Date: 21-Feb-18
// *****    **    **    **    ******    ***** Time: 09:52
// *****    ***        ***    ******    ***** Name: Pager
// *****    **************    ******    ***** ************************************
// *****    **************    ******    ***** Created by IntelliJ IDEA.
// ****************************************** ************************************

import entities.Products;

import java.util.ArrayList;
import java.util.List;

public class Pager
{
    private int limit = 4;
    private List<Products> list = new ArrayList();
    private int countPage;
    private int currentPage;
    private List<Products> pageList = new ArrayList();


    public List<Products> getPageList()
    {
        int end = list.size() % limit;
        if (getCountPage() == getCurrentPage())
        {
            pageList = list.subList((currentPage - 1) * limit, (currentPage - 1) * limit + end);
        }
        else
        {
            pageList = list.subList((currentPage - 1) * limit, (currentPage - 1) * limit + limit);
        }
        return pageList;
    }

    public void setPageList(List<Products> pageList)
    {
        this.pageList = pageList;
    }

    public int getCountPage()
    {
        countPage = list.size() / limit;
        if (list.size() % limit != 0)
        {
            countPage += 1;
        }
        return countPage;
    }

    public int getCurrentPage()
    {
        return currentPage;
    }

    public void setCurrentPage(int currentPage)
    {
        this.currentPage = currentPage;
    }

    public void setCountPage(int countPage)
    {
        this.countPage = countPage;
    }

    public List<Products> getList()
    {
        return list;
    }

    public void setList(List<Products> temp)
    {
        this.list = temp;
    }

}
