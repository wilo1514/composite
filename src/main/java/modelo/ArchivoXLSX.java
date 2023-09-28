
package modelo;


public class ArchivoXLSX extends Archivo{

    public ArchivoXLSX() {
    }
public ArchivoXLSX(String nombre) {
        this.nombre = nombre;
        
    }
    public ArchivoXLSX(String nombre, double tamanio) {
        this.nombre = nombre;
        this.tamanio = tamanio; 
    }

    @Override
    public double getTamanio() {
        return 3;
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
