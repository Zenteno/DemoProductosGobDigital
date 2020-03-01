// Generated with g9.

package com.example.demo.entitiy;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Version;

@Entity(name="proveedores")
public class Proveedores implements Serializable {

    /** Primary key. */
    protected static final String PK = "proveedorid";

   
    @Id
    @Column(unique=true, nullable=false, precision=10)
    private int proveedorid;
    @Column(nullable=false, length=50)
    private String nombreprov;
    @Column(nullable=false, length=50)
    private String contacto;
    @Column(length=12)
    private String celuprov;
    @Column(length=12)
    private String fijoprov;
    
    /** Default constructor. */
    public Proveedores() {
        super();
    }

    /**
     * Access method for proveedorid.
     *
     * @return the current value of proveedorid
     */
    public int getProveedorid() {
        return proveedorid;
    }

    /**
     * Setter method for proveedorid.
     *
     * @param aProveedorid the new value for proveedorid
     */
    public void setProveedorid(int aProveedorid) {
        proveedorid = aProveedorid;
    }

    /**
     * Access method for nombreprov.
     *
     * @return the current value of nombreprov
     */
    public String getNombreprov() {
        return nombreprov;
    }

    /**
     * Setter method for nombreprov.
     *
     * @param aNombreprov the new value for nombreprov
     */
    public void setNombreprov(String aNombreprov) {
        nombreprov = aNombreprov;
    }

    /**
     * Access method for contacto.
     *
     * @return the current value of contacto
     */
    public String getContacto() {
        return contacto;
    }

    /**
     * Setter method for contacto.
     *
     * @param aContacto the new value for contacto
     */
    public void setContacto(String aContacto) {
        contacto = aContacto;
    }

    /**
     * Access method for celuprov.
     *
     * @return the current value of celuprov
     */
    public String getCeluprov() {
        return celuprov;
    }

    /**
     * Setter method for celuprov.
     *
     * @param aCeluprov the new value for celuprov
     */
    public void setCeluprov(String aCeluprov) {
        celuprov = aCeluprov;
    }

    /**
     * Access method for fijoprov.
     *
     * @return the current value of fijoprov
     */
    public String getFijoprov() {
        return fijoprov;
    }

    /**
     * Setter method for fijoprov.
     *
     * @param aFijoprov the new value for fijoprov
     */
    public void setFijoprov(String aFijoprov) {
        fijoprov = aFijoprov;
    }

    

    /**
     * Compares the key for this instance with another Proveedores.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Proveedores and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Proveedores)) {
            return false;
        }
        Proveedores that = (Proveedores) other;
        if (this.getProveedorid() != that.getProveedorid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Proveedores.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Proveedores)) return false;
        return this.equalKeys(other) && ((Proveedores)other).equalKeys(this);
    }

    /**
     * Returns a hash code for this instance.
     *
     * @return Hash code
     */
    @Override
    public int hashCode() {
        int i;
        int result = 17;
        i = getProveedorid();
        result = 37*result + i;
        return result;
    }

    /**
     * Returns a debug-friendly String representation of this instance.
     *
     * @return String representation of this instance
     */
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("[Proveedores |");
        sb.append(" proveedorid=").append(getProveedorid());
        sb.append("]");
        return sb.toString();
    }

}
