
package modelo;

import java.util.ArrayList;
import java.util.List;


public class Carpeta extends Archivo{
    
    private List<Archivo> elementos = new ArrayList<Archivo>();
    
public Carpeta(String nombre) {
        this.nombre = nombre;
        
    }
    @Override
    public double getTamanio() {
        var retorno=0;
        for(var elemento: this.elementos){
            retorno+=elemento.getTamanio();  
            //System.out.println(elemento.getTamanio());
        }
        return retorno;
    }
   
    public String getNombre() {
        return this.nombre;
    }
    
    public void add(Archivo archivo){
        this.elementos.add(archivo);
    }
    

    public List<Archivo> getElementos() {
        return elementos;
    }
    

   // public String setNombre(String nombre) {
     //   return this.nombre;
    //}


}
