/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ups.msof.jtree;

import modelo.ArchivoDOCX;
import modelo.ArchivoPDF;
import modelo.ArchivoXLSX;
import modelo.Carpeta;
import vista.Vista;

/**
 *
 * @author flopezs
 */
public class Jtree {

    public static void main(String[] args) {
        System.out.println("Hello World!");
      
       // Modelo modelo=new Modelo();
        Vista view=new Vista();
       var root = new Carpeta("root");
        Controlador controlador=new Controlador(view,root);
        controlador.iniciar();
        controlador.listar();
        view.setVisible(true);
        
        
        
        
    }
}
