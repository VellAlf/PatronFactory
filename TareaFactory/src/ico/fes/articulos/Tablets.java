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
public class Tablets implements Articulo
{
    private String modelo;
    private int ram;
    private float almacenamiento;

    public Tablets() {
    }

    public Tablets(String modelo, int ram, float almacenamiento) {
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

    public float getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(float almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    @Override
    public String toString() {
        return "Tablets{" + "modelo=" + modelo + ", ram=" + ram + ", almacenamiento=" + almacenamiento + '}';
    }
}
