// Generated with g9.

package com.example.demo.entitiy;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Version;

@Entity(name="productos")
public class Productos implements Serializable {

    /** Primary key. */
    protected static final String PK = "productoid";

    
    @Id
    @Column(unique=true, nullable=false, precision=10)
    private int productoid;
    @Column(length=50)
    private String descripcion;
    @Column(nullable=false, precision=131089)
    private float preciounit;
    @Column(nullable=false, precision=131089)
    private float preciounituf;
    @Column(nullable=false, precision=10)
    private int existencia;
    
    @OneToOne(optional=false)
    @JoinColumn(name="proveedorid", nullable=false)
    private Proveedores proveedores;

    @OneToOne(optional=false)
    @JoinColumn(name="categoriaid", nullable=false)
    private Categorias categorias;

    
    /** Default constructor. */
    public Productos() {
        super();
    }

    /**
     * Access method for productoid.
     *
     * @return the current value of productoid
     */
    public int getProductoid() {
        return productoid;
    }

    /**
     * Setter method for productoid.
     *
     * @param aProductoid the new value for productoid
     */
    public void setProductoid(int aProductoid) {
        productoid = aProductoid;
    }

    /**
     * Access method for descripcion.
     *
     * @return the current value of descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Setter method for descripcion.
     *
     * @param aDescripcion the new value for descripcion
     */
    public void setDescripcion(String aDescripcion) {
        descripcion = aDescripcion;
    }

    /**
     * Access method for preciounit.
     *
     * @return the current value of preciounit
     */
    public float getPreciounit() {
        return preciounit;
    }

    /**
     * Setter method for preciounit.
     *
     * @param aPreciounit the new value for preciounit
     */
    public void setPreciounituf(float aPreciounit) {
        preciounituf = aPreciounit;
    }
    
    /**
     * Access method for preciounit.
     *
     * @return the current value of preciounit
     */
    public float getPreciounituf() {
        return preciounituf;
    }

    /**
     * Setter method for preciounit.
     *
     * @param aPreciounit the new value for preciounit
     */
    public void setPreciounit(float aPreciounit) {
        preciounit = aPreciounit;
    }

    /**
     * Access method for existencia.
     *
     * @return the current value of existencia
     */
    public int getExistencia() {
        return existencia;
    }

    /**
     * Setter method for existencia.
     *
     * @param aExistencia the new value for existencia
     */
    public void setExistencia(int aExistencia) {
        existencia = aExistencia;
    }

    
    /**
     * Access method for proveedores.
     *
     * @return the current value of proveedores
     */
    public Proveedores getProveedor() {
        return proveedores;
    }

    /**
     * Setter method for proveedores.
     *
     * @param aProveedores the new value for proveedores
     */
    public void setProveedor(Proveedores aProveedores) {
    	proveedores = aProveedores;
    }
    
    /**
     * Access method for categorias.
     *
     * @return the current value of categorias
     */
    public Categorias getCategoria() {
        return categorias;
    }

    /**
     * Setter method for categorias.
     *
     * @param aProveedores the new value for categorias
     */
    public void setCategoria(Categorias aCategoria) {
    	categorias = aCategoria;
    }

    /**
     * Compares the key for this instance with another Productos.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Productos and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Productos)) {
            return false;
        }
        Productos that = (Productos) other;
        if (this.getProductoid() != that.getProductoid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Productos.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Productos)) return false;
        return this.equalKeys(other) && ((Productos)other).equalKeys(this);
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
        i = getProductoid();
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
        StringBuffer sb = new StringBuffer("[Productos |");
        sb.append(" productoid=").append(getProductoid());
        sb.append("]");
        return sb.toString();
    }


}
