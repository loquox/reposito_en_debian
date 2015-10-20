package animal;

/**
 * Created by loquox on 9/10/15.
 */
public abstract class AbsAnimal implements Intanimal {
    private String especie;

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    private  int edad;
}
