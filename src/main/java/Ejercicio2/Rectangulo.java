package Ejercicio2;

/**
 * Created by Andrea on 29/09/2015.
 */
public class Rectangulo extends AbstractShape {

    private int grande;
    private int pequeño;

    public int getGrande() {
        return grande;
    }

    public void setGrande(int grande) {
        this.grande = grande;
    }

    public int getPequeño() {
        return pequeño;
    }

    public void setPequeño(int pequeño) {
        this.pequeño = pequeño;
    }

    public Rectangulo(int grande, int pequeño){
        super("rectangulo");
        this.grande = grande;
        this.pequeño = pequeño;
    }

    public double area(){
        return pequeño * grande;
    }
}
