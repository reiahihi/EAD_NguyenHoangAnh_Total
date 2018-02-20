package entities;

// ****************************************** ************************************
// **************************    ************ User: MiTom
// *****************************    ********* Phone: 0966 941 840
// ********************************    ****** Email: 
// ****************************************** ************************************
// *****       ********       ******    ***** Package: entities
// *****        ******        ******    ***** Project: EAD_NguyenHoangAnh_Total
// *****    *    ****    *    ******    ***** Date: 20-Feb-18
// *****    **    **    **    ******    ***** Time: 20:54
// *****    ***        ***    ******    ***** Name: Manufacturers
// *****    **************    ******    ***** ************************************
// *****    **************    ******    ***** Created by IntelliJ IDEA.
// ****************************************** ************************************

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Manufacturers
{

    private int manufacturerId;
    private String manufacturerName;
    private Collection<Products> productsByManufacturerId;

    @Id
    @Column(name = "manufacturer_id", nullable = false)
    public int getManufacturerId()
    {
        return manufacturerId;
    }

    public void setManufacturerId(int manufacturerId)
    {
        this.manufacturerId = manufacturerId;
    }

    @Basic
    @Column(name = "manufacturer_name", nullable = true, length = 30)
    public String getManufacturerName()
    {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName)
    {
        this.manufacturerName = manufacturerName;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Manufacturers that = (Manufacturers) o;

        if (manufacturerId != that.manufacturerId) return false;
        if (manufacturerName != null ? !manufacturerName.equals(that.manufacturerName) : that.manufacturerName != null)
            return false;

        return true;
    }

    @Override
    public int hashCode()
    {
        int result = manufacturerId;
        result = 31 * result + (manufacturerName != null ? manufacturerName.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "manufacturersByManufacturerId" , fetch = FetchType.EAGER , cascade = CascadeType.ALL)
    public Collection<Products> getProductsByManufacturerId()
    {
        return productsByManufacturerId;
    }

    public void setProductsByManufacturerId(Collection<Products> productsByManufacturerId)
    {
        this.productsByManufacturerId = productsByManufacturerId;
    }
}
