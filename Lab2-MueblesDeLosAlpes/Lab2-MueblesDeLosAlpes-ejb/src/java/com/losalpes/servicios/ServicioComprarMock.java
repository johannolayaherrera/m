/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.losalpes.servicios;

import com.losalpes.bos.Mueble;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class ServicioComprarMock implements IServicioCompra {
    //-----------------------------------------------------------
    // Atributos
    //-----------------------------------------------------------

    /**
     * Arreglo con los muebles del sistema
     */
    private ArrayList<Mueble> muebles;

    public ServicioComprarMock() {

        //Inicializa el arreglo de los muebles
        muebles = new ArrayList<Mueble>();
    }
    
        //-----------------------------------------------------------
    // Métodos
    //-----------------------------------------------------------

    /**
     * Agrega un mueble al sistema
     * @param mueble Nuevo mueble
     */
    @Override
    public void agregarMueble(Mueble mueble)
    {
        muebles.add(mueble);
    }

    /**
     * Devuelve los muebles del sistema
     * @return muebles Arreglo con todos los muebles del sistema
     */
    @Override
    public List<Mueble> darMuebles()
    {
        return muebles;
    }

}
