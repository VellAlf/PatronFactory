/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.factory;

import ico.fes.articulos.Celular;
import ico.fes.articulos.Computadora;
import ico.fes.articulos.Tablets;

/**
 *
 * @author fredy
 */
public class ArtFactory
{
    public static Articulo crearArticulo (int tipo )
    {
        switch(tipo)
        {
            case Articulo.COMPUTADORA_ACER:
                return new Computadora("Acer", "Rizen 7", 16, 1000);
            case Articulo.COMPUTADORA_TOSHIBA:
                return new Computadora("Toshiba", "Rizen 5", 8, 500);
            case Articulo.COMPUTADORA_ASUS:
                return new Computadora("Asus", "Intel Core i6", 16, 1000);
            case Articulo.CELULAR_SAMSUNG:
                return new Celular("Samasung Galaxy A12", 4, 32);
            case Articulo.CELULAR_ZTE:
                return new Celular("ZTE Blade", 2, 16);
            case Articulo.CELULAR_HUAWEI:
                return new Celular("Huawei P30", 4, 64);
            case Articulo.TABLET_LENOVO:
                return new Tablets("Lenovo Tab M10", 4, 500.0f);
            case Articulo.TABLET_AMAZON:
                return new Tablets("Amazon Kindle Fire", 4, 500.0f);
            case Articulo.TABLET_IPAD:
                return new Tablets("Apple iPad Air", 4, 500.0f);
            default:
                throw new AssertionError();
        }
    }
}
