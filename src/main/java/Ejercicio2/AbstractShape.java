package Ejercicio2;

/**
 * Created by Andrea on 29/09/2015.
 */
public abstract class AbstractShape implements Shape {

    private String tipo;

    public AbstractShape(String tipo){
        this.tipo = tipo;
    }

    @Override
    public String toString(){
        return "Soy un " + tipo;
    }

}
