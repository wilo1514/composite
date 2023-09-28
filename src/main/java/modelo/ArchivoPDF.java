
package modelo;


public class ArchivoPDF extends Archivo {

    public ArchivoPDF() {
    }
    
    public ArchivoPDF(String nombre) {
        this.nombre = nombre;
     
    }
 public ArchivoPDF(String nombre, double tamanio) {
        this.nombre = nombre;
        this.tamanio = tamanio; 
    }
 
    @Override
    public double getTamanio() {
        return 4;
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
