/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.primerobjeto;
    
public class Auto {
    private String marca;
    private String color;
    private String tipo;
    private String modelo;
    private int cantidadPasajeros;

    public Auto(String marca, String color, String tipo, String modelo, int cantidadPasajeros) {
        this.marca = marca;
        this.color = color;
        this.tipo = tipo;
        this.modelo = modelo;
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    public void setCantidadPasajeros(int cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
    }
    public void mostrarInformacion(){
        System.out.println("Marca: "+marca);
        System.out.println("Color: "+color);
        System.out.println("Tipo: "+tipo);
        System.out.println("Modelo: "+modelo);
        System.out.println("Cantidd de Pasajeros: "+cantidadPasajeros);
    }
    
   
}
