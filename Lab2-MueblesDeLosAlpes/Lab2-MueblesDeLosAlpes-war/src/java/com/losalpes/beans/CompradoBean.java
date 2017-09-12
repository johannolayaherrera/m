/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.losalpes.beans;

import com.losalpes.bos.Mueble;
import com.losalpes.bos.TipoMueble;
import com.losalpes.servicios.IServicioCatalogo;
import com.losalpes.servicios.IServicioCompra;
import com.losalpes.servicios.ServicioCatalogoMock;
import com.losalpes.servicios.ServicioComprarMock;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.SelectItem;

/**
 *
 * @author user
 */
@ManagedBean
@SessionScoped
public class CompradoBean {
    
        
    //-----------------------------------------------------------
    // Atributos
    //-----------------------------------------------------------

    /**
     * Representa un nuevo mueble a ingresar
     */
    private Mueble mueble;

    /**
     * Relación con la interfaz que provee los servicios necesarios del catálogo.
     */
    private IServicioCompra catalogo;

    //-----------------------------------------------------------
    // Constructor
    //-----------------------------------------------------------

    /**
     * Constructor de la clase principal
     */
    public CompradoBean()
    {
        mueble=new Mueble();
        catalogo=new ServicioComprarMock();
    }

    //-----------------------------------------------------------
    // Getters y setters
    //-----------------------------------------------------------

    /**
     * Devuelve el objeto mueble
     * @return mueble Objeto mueble
     */
    public Mueble getMueble()
    {
        return mueble;
    }

    /**
     * Modifica el objeto mueble
     * @param mueble Nuevo mueble
     */
    public void setMueble(Mueble mueble)
    {
        this.mueble = mueble;
    }

    /**
     * Devuelve una lista con todos los muebles del sistema
     * @return muebles Muebles del sistema
     */
    public List<Mueble> getMuebles()
    {

        return catalogo.darMuebles();
    }

    //-----------------------------------------------------------
    // Métodos
    //-----------------------------------------------------------

    /**
     * Agrega un nuevo mueble al sistema
    
    public String agregarMueble()
    {
        catalogo.agregarMueble(mueble);
        mueble=new Mueble();
        
        return "agregado.xhtml";
    }
     */
        public String agregarMueble(Mueble pmueble)
    {
        catalogo.agregarMueble(pmueble);
        mueble=new Mueble();
        
        return "agregado.xhtml";
    }

    /**
     * Elimina la información del mueble
     */
    public void limpiar()
    {
        mueble=new Mueble();
    }


    
}
