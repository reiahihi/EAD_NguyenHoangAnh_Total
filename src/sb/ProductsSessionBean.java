package sb;

import entities.Manufacturers;
import entities.Products;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless(name = "ProductsSessionEJB")
@LocalBean
public class ProductsSessionBean extends AbstractFacade<Products>
{
    @Override
    public List<Products> findAll()
    {
        return super.findAll();
    }

    @PersistenceContext(unitName = "NewPersistenceUnit")
    private EntityManager em;

    @Override
    public void create(Products entity)
    {
        super.create(entity);
    }

    @Override
    public void edit(Products entity)
    {
        super.edit(entity);
    }

    @Override
    protected Class getClassName()
    {
        return Products.class;
    }

    @Override
    protected EntityManager getEntityManager()
    {
        return em;
    }

    @Override
    public Products findEntity(String id)
    {
        return super.findEntity(id);
    }

    @Override
    public void destroy(Products entity)
    {
        super.destroy(entity);
    }
}
