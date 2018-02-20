package sb;

import entities.Manufacturers;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless(name = "ManufacturersSessionEJB")
@LocalBean
public class ManufacturersSessionBean extends AbstractFacade<Manufacturers>
{
    @PersistenceContext(unitName = "NewPersistenceUnit")
    private EntityManager em;

    @Override
    public Manufacturers findEntity(String id)
    {
        return super.findEntity(id);
    }

    @Override
    public List<Manufacturers> findAll()
    {
        return super.findAll();
    }

    public ManufacturersSessionBean()
    {
    }

    @Override
    protected Class getClassName()
    {
        return Manufacturers.class;
    }

    @Override
    protected EntityManager getEntityManager()
    {
        return em;
    }
}
