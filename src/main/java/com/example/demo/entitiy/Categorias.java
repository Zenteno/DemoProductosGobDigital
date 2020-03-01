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

@Entity(name="categorias")
public class Categorias implements Serializable {

    /** Primary key. */
    protected static final String PK = "categoriaid";

    @Id
    @Column(unique=true, nullable=false, precision=10)
    private int categoriaid;
    @Column(nullable=false, length=50)
    private String nombrecat;
    
    /** Default constructor. */
    public Categorias() {
        super();
    }

    /**
     * Access method for categoriaid.
     *
     * @return the current value of categoriaid
     */
    public int getCategoriaid() {
        return categoriaid;
    }

    /**
     * Setter method for categoriaid.
     *
     * @param aCategoriaid the new value for categoriaid
     */
    public void setCategoriaid(int aCategoriaid) {
        categoriaid = aCategoriaid;
    }

    /**
     * Access method for nombrecat.
     *
     * @return the current value of nombrecat
     */
    public String getNombrecat() {
        return nombrecat;
    }

    /**
     * Setter method for nombrecat.
     *
     * @param aNombrecat the new value for nombrecat
     */
    public void setNombrecat(String aNombrecat) {
        nombrecat = aNombrecat;
    }

    /**
     * Compares the key for this instance with another Categorias.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Categorias and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Categorias)) {
            return false;
        }
        Categorias that = (Categorias) other;
        if (this.getCategoriaid() != that.getCategoriaid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Categorias.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Categorias)) return false;
        return this.equalKeys(other) && ((Categorias)other).equalKeys(this);
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
        i = getCategoriaid();
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
        StringBuffer sb = new StringBuffer("[Categorias |");
        sb.append(" categoriaid=").append(getCategoriaid());
        sb.append("]");
        return sb.toString();
    }
}
