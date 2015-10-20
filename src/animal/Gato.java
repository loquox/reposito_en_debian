package animal;

/**
 * Created by loquox on 9/10/15.
 */
public class Gato extends Absfelino{

    public Gato(int edad, String especie){
        this.setEdad(edad);
        this.setEspecie("gato");
    }

    private String nombre;


    public void moverse() {
        System.out.println("el "+ this.getEspecie() + "se mueve");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void comer() {
        System.out.println("el gato come " );

    }


    public int calculaedad(int edad) {

        return 0;
    }
}
