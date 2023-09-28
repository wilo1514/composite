
package modelo;


public class ArchivoDOCX extends Archivo {

    public ArchivoDOCX() {
    }

    public ArchivoDOCX(String nombre) {
        this.nombre = nombre;

    }
    public ArchivoDOCX(String nombre, double tamanio) {
        this.nombre = nombre;
        this.tamanio = tamanio; 
    }

    @Override
    public double getTamanio() { 
        return 2;
    }

    @Override
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }
    
}
