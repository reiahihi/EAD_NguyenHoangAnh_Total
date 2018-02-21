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
// *****    ***        ***    ******    ***** Name: Products
// *****    **************    ******    ***** ************************************
// *****    **************    ******    ***** Created by IntelliJ IDEA.
// ****************************************** ************************************

import javax.persistence.*;

@Entity
public class Products
{

    private String productId;
    private String productName;
    private String productImage;
    private Integer productPrice;
    private String productDetail;
    private Integer manufacturerId;
    private Manufacturers manufacturersByManufacturerId;

    @Id
    @Column(name = "product_id", nullable = false, length = 10)
    public String getProductId()
    {
        return productId;
    }

    public void setProductId(String productId)
    {
        this.productId = productId;
    }

    @Basic
    @Column(name = "product_name", nullable = true, length = 50)
    public String getProductName()
    {
        return productName;
    }

    public void setProductName(String productName)
    {
        this.productName = productName;
    }

    @Basic
    @Column(name = "product_image", nullable = true, length = 50)
    public String getProductImage()
    {
        return productImage;
    }

    public void setProductImage(String productImage)
    {
        this.productImage = productImage;
    }

    @Basic
    @Column(name = "product_price", nullable = true)
    public Integer getProductPrice()
    {
        return productPrice;
    }

    public void setProductPrice(Integer productPrice)
    {
        this.productPrice = productPrice;
    }

    @Basic
    @Column(name = "product_detail", nullable = true, length = 500)
    public String getProductDetail()
    {
        return productDetail;
    }

    public void setProductDetail(String productDetail)
    {
        this.productDetail = productDetail;
    }

    @Basic
    @Column(name = "manufacturer_id", nullable = true)
    public Integer getManufacturerId()
    {
        return manufacturerId;
    }

    public void setManufacturerId(Integer manufacturerId)
    {
        this.manufacturerId = manufacturerId;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Products products = (Products) o;

        if (productId != null ? !productId.equals(products.productId) : products.productId != null) return false;
        if (productName != null ? !productName.equals(products.productName) : products.productName != null)
            return false;
        if (productImage != null ? !productImage.equals(products.productImage) : products.productImage != null)
            return false;
        if (productPrice != null ? !productPrice.equals(products.productPrice) : products.productPrice != null)
            return false;
        if (productDetail != null ? !productDetail.equals(products.productDetail) : products.productDetail != null)
            return false;
        if (manufacturerId != null ? !manufacturerId.equals(products.manufacturerId) : products.manufacturerId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode()
    {
        int result = productId != null ? productId.hashCode() : 0;
        result = 31 * result + (productName != null ? productName.hashCode() : 0);
        result = 31 * result + (productImage != null ? productImage.hashCode() : 0);
        result = 31 * result + (productPrice != null ? productPrice.hashCode() : 0);
        result = 31 * result + (productDetail != null ? productDetail.hashCode() : 0);
        result = 31 * result + (manufacturerId != null ? manufacturerId.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "manufacturer_id", referencedColumnName = "manufacturer_id", nullable = false, insertable = false, updatable = false)
    public Manufacturers getManufacturersByManufacturerId()
    {
        return manufacturersByManufacturerId;
    }

    public void setManufacturersByManufacturerId(Manufacturers manufacturersByManufacturerId)
    {
        this.manufacturersByManufacturerId = manufacturersByManufacturerId;
    }
}
