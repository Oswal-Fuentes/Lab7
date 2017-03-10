package oswalfuentes_lab7;

public class Hombre_Lobo extends Guerrero{

    public Hombre_Lobo() {
    }

    public Hombre_Lobo(String nombre, String nickname, float poder_ataque, float poder_defensa, float salud, float puntos) {
        super(nombre, nickname, poder_ataque, poder_defensa, salud, puntos);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public float getPoder_ataque() {
        return poder_ataque;
    }

    public void setPoder_ataque(float poder_ataque) {
        this.poder_ataque = poder_ataque;
    }

    public float getPoder_defensa() {
        return poder_defensa;
    }

    public void setPoder_defensa(float poder_defensa) {
        this.poder_defensa = poder_defensa;
    }

    public float getSalud() {
        return salud;
    }

    public void setSalud(float salud) {
        this.salud = salud;
    }

    public float getPuntos() {
        return puntos;
    }

    public void setPuntos(float puntos) {
        this.puntos = puntos;
    }

    @Override
    public float Ataque(float DefensaRival, float AtaqueRival, float VidaRival) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
