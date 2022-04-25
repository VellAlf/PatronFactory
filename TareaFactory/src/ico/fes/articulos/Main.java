/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.articulos;

import ico.fes.factory.ArtFactory;
import ico.fes.factory.Articulo;
import java.util.Scanner;

/**
 *
 * @author fredy
 */
public class Main
{
    public static void main(String[] args)
    {     
        int seleccion = 0;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Que deseas comprar?:");
        System.out.println(Computadora.COMPUTADORA_ACER + ") Computadora Acer");
        System.out.println(Computadora.COMPUTADORA_TOSHIBA + ") Computadora Toshiba");
        System.out.println(Computadora.COMPUTADORA_ASUS + ") Computadora Asus");
        System.out.println(Celular.CELULAR_SAMSUNG + ") Celular Samsung");
        System.out.println(Celular.CELULAR_ZTE + ") Celular ZTE");
        System.out.println(Celular.CELULAR_HUAWEI + ") Celular Huawei");
        System.out.println(Tablets.TABLET_LENOVO + ") Tablet Lenovo");
        System.out.println(Tablets.TABLET_AMAZON + ") Tablet Amazon");
        System.out.println(Tablets.TABLET_IPAD + ") Tablet iPad");
        
        try
        {
            System.out.print("Elige un numero: ");
            seleccion = teclado.nextInt();
        }
        catch (Exception e)
        {
            System.out.println("No tecleaste ningun numero");            
        }
        
        Articulo producto = ArtFactory.crearArticulo(seleccion);
        System.out.println(producto.toString());
    }
}
