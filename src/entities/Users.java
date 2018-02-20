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
// *****    ***        ***    ******    ***** Name: Users
// *****    **************    ******    ***** ************************************
// *****    **************    ******    ***** Created by IntelliJ IDEA.
// ****************************************** ************************************

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Users
{

    private String username;
    private String password;
    private String fullname;
    private String photo;
    private String email;
    private byte level;

    @Id
    @Column(name = "username", nullable = false, length = 50)
    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    @Basic
    @Column(name = "password", nullable = false, length = 50)
    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    @Basic
    @Column(name = "fullname", nullable = false, length = 50)
    public String getFullname()
    {
        return fullname;
    }

    public void setFullname(String fullname)
    {
        this.fullname = fullname;
    }

    @Basic
    @Column(name = "photo", nullable = false, length = 50)
    public String getPhoto()
    {
        return photo;
    }

    public void setPhoto(String photo)
    {
        this.photo = photo;
    }

    @Basic
    @Column(name = "email", nullable = false, length = 50)
    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    @Basic
    @Column(name = "level", nullable = false)
    public byte getLevel()
    {
        return level;
    }

    public void setLevel(byte level)
    {
        this.level = level;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Users users = (Users) o;

        if (level != users.level) return false;
        if (username != null ? !username.equals(users.username) : users.username != null) return false;
        if (password != null ? !password.equals(users.password) : users.password != null) return false;
        if (fullname != null ? !fullname.equals(users.fullname) : users.fullname != null) return false;
        if (photo != null ? !photo.equals(users.photo) : users.photo != null) return false;
        if (email != null ? !email.equals(users.email) : users.email != null) return false;

        return true;
    }

    @Override
    public int hashCode()
    {
        int result = username != null ? username.hashCode() : 0;
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (fullname != null ? fullname.hashCode() : 0);
        result = 31 * result + (photo != null ? photo.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (int) level;
        return result;
    }
}
