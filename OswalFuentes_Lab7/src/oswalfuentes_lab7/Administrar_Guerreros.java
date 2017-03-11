package oswalfuentes_lab7;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Administrar_Guerreros {

    private ArrayList<Guerrero> Guerreros = new ArrayList();
    private File archivo = null;

    public ArrayList<Guerrero> getGuerreros() {
        return Guerreros;
    }

    public void setGuerreros(ArrayList<Guerrero> Guerreros) {
        this.Guerreros = Guerreros;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public void setAlumno(Guerrero a) {
        Guerreros.add(a);
    }

    public void setGuerrero(Guerrero guerrero) {
        Guerreros.add(guerrero);
    }

    public Administrar_Guerreros() {
    }

    public Administrar_Guerreros(String path) {
        archivo = new File(path);
    }

    public void cargarArchivo() {
        try {
            Guerreros = new ArrayList();
            Guerrero temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Guerrero) objeto.readObject()) != null) {
                        Guerreros.add(temp);
                    }
                } catch (EOFException e) {
                   
                }
                objeto.close();
                entrada.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Guerrero t : Guerreros) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception e) {
            }
        }
    }
}
