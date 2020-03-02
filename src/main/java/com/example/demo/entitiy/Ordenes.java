// Generated with g9.

package com.example.demo.entitiy;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name="ordenes")
public class Ordenes implements Serializable {

	private static final long serialVersionUID = 1L;
	
    /** Primary key. */
    protected static final String PK = "ordenid";

    
    @Id
    @Column(unique=true, nullable=false, precision=10)
    private int ordenid;
    @Column(nullable=false, precision=10)
    private int empleadoid;
    @Column(nullable=false)
    private Date fechaorden;
    @Column(precision=10)
    private int descuento;
    @ManyToOne(optional=false)
    @JoinColumn(name="clienteid", nullable=false)
    private Clientes clientes;

    /** Default constructor. */
    public Ordenes() {
        super();
    }

    /**
     * Access method for ordenid.
     *
     * @return the current value of ordenid
     */
    public int getOrdenid() {
        return ordenid;
    }

    /**
     * Setter method for ordenid.
     *
     * @param aOrdenid the new value for ordenid
     */
    public void setOrdenid(int aOrdenid) {
        ordenid = aOrdenid;
    }

    /**
     * Access method for empleadoid.
     *
     * @return the current value of empleadoid
     */
    public int getEmpleadoid() {
        return empleadoid;
    }

    /**
     * Setter method for empleadoid.
     *
     * @param aEmpleadoid the new value for empleadoid
     */
    public void setEmpleadoid(int aEmpleadoid) {
        empleadoid = aEmpleadoid;
    }

    /**
     * Access method for fechaorden.
     *
     * @return the current value of fechaorden
     */
    public Date getFechaorden() {
        return fechaorden;
    }

    /**
     * Setter method for fechaorden.
     *
     * @param aFechaorden the new value for fechaorden
     */
    public void setFechaorden(Date aFechaorden) {
        fechaorden = aFechaorden;
    }

    /**
     * Access method for descuento.
     *
     * @return the current value of descuento
     */
    public int getDescuento() {
        return descuento;
    }

    /**
     * Setter method for descuento.
     *
     * @param aDescuento the new value for descuento
     */
    public void setDescuento(int aDescuento) {
        descuento = aDescuento;
    }

    /**
     * Access method for clientes.
     *
     * @return the current value of clientes
     */
    public Clientes getClientes() {
        return clientes;
    }

    /**
     * Setter method for clientes.
     *
     * @param aClientes the new value for clientes
     */
    public void setClientes(Clientes aClientes) {
        clientes = aClientes;
    }

    /**
     * Compares the key for this instance with another Ordenes.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Ordenes and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Ordenes)) {
            return false;
        }
        Ordenes that = (Ordenes) other;
        if (this.getOrdenid() != that.getOrdenid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Ordenes.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Ordenes)) return false;
        return this.equalKeys(other) && ((Ordenes)other).equalKeys(this);
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
        i = getOrdenid();
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
        StringBuffer sb = new StringBuffer("[Ordenes |");
        sb.append(" ordenid=").append(getOrdenid());
        sb.append("]");
        return sb.toString();
    }

}
