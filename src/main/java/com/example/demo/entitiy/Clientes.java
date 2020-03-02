// Generated with g9.

package com.example.demo.entitiy;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="clientes")
public class Clientes implements Serializable {

	private static final long serialVersionUID = 1L;
	
    /** Primary key. */
    protected static final String PK = "clienteid";

    
    @Id
    @Column(unique=true, nullable=false, precision=10)
    private int clienteid;
    @Column(name="cedula_ruc", nullable=false, length=10)
    private String cedulaRuc;
    @Column(nullable=false, length=30)
    private String nombrecia;
    @Column(nullable=false, length=50)
    private String nombrecontacto;
    @Column(nullable=false, length=50)
    private String direccioncli;
    @Column(length=12)
    private String fax;
    @Column(length=50)
    private String email;
    @Column(length=12)
    private String celular;
    @Column(length=12)
    private String fijo;
    
    /** Default constructor. */
    public Clientes() {
        super();
    }

    /**
     * Access method for clienteid.
     *
     * @return the current value of clienteid
     */
    public int getClienteid() {
        return clienteid;
    }

    /**
     * Setter method for clienteid.
     *
     * @param aClienteid the new value for clienteid
     */
    public void setClienteid(int aClienteid) {
        clienteid = aClienteid;
    }

    /**
     * Access method for cedulaRuc.
     *
     * @return the current value of cedulaRuc
     */
    public String getCedulaRuc() {
        return cedulaRuc;
    }

    /**
     * Setter method for cedulaRuc.
     *
     * @param aCedulaRuc the new value for cedulaRuc
     */
    public void setCedulaRuc(String aCedulaRuc) {
        cedulaRuc = aCedulaRuc;
    }

    /**
     * Access method for nombrecia.
     *
     * @return the current value of nombrecia
     */
    public String getNombrecia() {
        return nombrecia;
    }

    /**
     * Setter method for nombrecia.
     *
     * @param aNombrecia the new value for nombrecia
     */
    public void setNombrecia(String aNombrecia) {
        nombrecia = aNombrecia;
    }

    /**
     * Access method for nombrecontacto.
     *
     * @return the current value of nombrecontacto
     */
    public String getNombrecontacto() {
        return nombrecontacto;
    }

    /**
     * Setter method for nombrecontacto.
     *
     * @param aNombrecontacto the new value for nombrecontacto
     */
    public void setNombrecontacto(String aNombrecontacto) {
        nombrecontacto = aNombrecontacto;
    }

    /**
     * Access method for direccioncli.
     *
     * @return the current value of direccioncli
     */
    public String getDireccioncli() {
        return direccioncli;
    }

    /**
     * Setter method for direccioncli.
     *
     * @param aDireccioncli the new value for direccioncli
     */
    public void setDireccioncli(String aDireccioncli) {
        direccioncli = aDireccioncli;
    }

    /**
     * Access method for fax.
     *
     * @return the current value of fax
     */
    public String getFax() {
        return fax;
    }

    /**
     * Setter method for fax.
     *
     * @param aFax the new value for fax
     */
    public void setFax(String aFax) {
        fax = aFax;
    }

    /**
     * Access method for email.
     *
     * @return the current value of email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Setter method for email.
     *
     * @param aEmail the new value for email
     */
    public void setEmail(String aEmail) {
        email = aEmail;
    }

    /**
     * Access method for celular.
     *
     * @return the current value of celular
     */
    public String getCelular() {
        return celular;
    }

    /**
     * Setter method for celular.
     *
     * @param aCelular the new value for celular
     */
    public void setCelular(String aCelular) {
        celular = aCelular;
    }

    /**
     * Access method for fijo.
     *
     * @return the current value of fijo
     */
    public String getFijo() {
        return fijo;
    }

    /**
     * Setter method for fijo.
     *
     * @param aFijo the new value for fijo
     */
    public void setFijo(String aFijo) {
        fijo = aFijo;
    }

    /**
     * Compares the key for this instance with another Clientes.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Clientes and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Clientes)) {
            return false;
        }
        Clientes that = (Clientes) other;
        if (this.getClienteid() != that.getClienteid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Clientes.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Clientes)) return false;
        return this.equalKeys(other) && ((Clientes)other).equalKeys(this);
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
        i = getClienteid();
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
        StringBuffer sb = new StringBuffer("[Clientes |");
        sb.append(" clienteid=").append(getClienteid());
        sb.append("]");
        return sb.toString();
    }

}
