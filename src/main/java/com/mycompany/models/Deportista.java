/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.models;

import com.mycompany.models.Persona;
import java.sql.Date;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author Diego
 */
public class Deportista extends Persona{

     IntegerProperty dorsal;
     SimpleStringProperty deporte_jugado;
     SimpleStringProperty equipo;
     
    public Deportista() {
    }

    public Deportista(Integer dorsal, String deporte_jugado, String equipo, String nombre, String nacionalidad, Date fecha_nacimiento, Integer altura) {
        super(nombre, nacionalidad, fecha_nacimiento, altura);
        this.dorsal = new SimpleIntegerProperty(dorsal);
        this.deporte_jugado = new SimpleStringProperty (deporte_jugado);
        this.equipo = new SimpleStringProperty (equipo);
    }
    
    
   

    /**
     * @return the dorsal
     */
    public Integer getDorsal() {
        return dorsal.get();
    }

    /**
     * @param dorsal the dorsal to set
     */
    public void setDorsal(int dorsal) {
        this.dorsal = new SimpleIntegerProperty(dorsal);
    }

    /**
     * @return the deporte_jugado
     */
    public String getDeporte_jugado() {
        return deporte_jugado.get();
    }

    /**
     * @param deporte_jugado the deporte_jugado to set
     */
    public void setDeporte_jugado(String deporte_jugado) {
        this.deporte_jugado = new SimpleStringProperty (deporte_jugado);
    }

    /**
     * @return the equipo
     */
    public String getEquipo() {
        return equipo.get();
    }

    /**
     * @param equipo the equipo to set
     */
    public void setEquipo(String equipo) {
        this.equipo = new SimpleStringProperty (equipo);
    }
    
}
