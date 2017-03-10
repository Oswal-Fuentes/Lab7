package oswalfuentes_lab7;

import java.io.Serializable;

public abstract class Guerrero implements Serializable {

    private static final long SerialVersionUID = 777L;

    protected String nombre, nickname;
    protected float poder_ataque, poder_defensa, salud, puntos;

    public Guerrero() {
    }

    public Guerrero(String nombre, String nickname, float poder_ataque, float poder_defensa, float salud, float puntos) {
        this.nombre = nombre;
        this.nickname = nickname;
        this.poder_ataque = poder_ataque;
        this.poder_defensa = poder_defensa;
        this.salud = salud;
        this.puntos = puntos;
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
    public String toString() {
        return nombre;
    }

    public abstract float Ataque(float DefensaRival, float AtaqueRival, float VidaRival);

}
