package Ejercicio2;

/**
 * Created by Andrea on 29/09/2015.
 */
public class AppInheritance {
    public static void main (String[] args){
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circulo(2.5);
        shapes[1] = new Rectangulo (3, 5);

        for (Shape shape : shapes)
        System.out.println(shape + " con area = " + shape.area());
    }
}
