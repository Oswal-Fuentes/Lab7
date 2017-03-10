package oswalfuentes_lab7;

public class Alumnos extends Guerrero {

    private String carrera;
    private int edad, n_cuenta;

    public Alumnos() {
    }

    public Alumnos(String carrera, int edad, int n_cuenta, String nombre, String nickname, float poder_ataque, float poder_defensa, float salud, float puntos) {
        super(nombre, nickname, poder_ataque, poder_defensa, salud, puntos);
        this.carrera = carrera;
        this.edad = edad;
        this.n_cuenta = n_cuenta;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getN_cuenta() {
        return n_cuenta;
    }

    public void setN_cuenta(int n_cuenta) {
        this.n_cuenta = n_cuenta;
    }

    @Override
    public float Ataque(float DefensaRival, float AtaqueRival, float VidaRival) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
