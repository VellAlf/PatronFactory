/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.articulos;

import ico.fes.factory.Articulo;

/**
 *
 * @author fredy
 */
public class Celular implements Articulo
{
    private String modelo;
    private int ram;
    private int almacenamiento;

    public Celular() {
    }

    public Celular(String modelo, int ram, int almacenamiento)
    {
        this.modelo = modelo;
        this.ram = ram;
        this.almacenamiento = almacenamiento;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    @Override
    public String toString()
    {
        return "Celular{" + "modelo=" + modelo + ", ram=" + ram + ", almacenamiento=" + almacenamiento + '}';
    }
}
