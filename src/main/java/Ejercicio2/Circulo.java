package Ejercicio2;

/**
 * Created by Andrea on 29/09/2015.
 */
public class Circulo extends AbstractShape {

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    private double radio;

    public Circulo(double radio){

        super("cirulo");
        this.radio = radio;
    }

    public double area(){
        return Math.PI * radio * radio;
    }


}
