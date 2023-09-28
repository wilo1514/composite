/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ups.msof.jtree;

import vista.Vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import modelo.Archivo;
import modelo.ArchivoDOCX;
import modelo.ArchivoPDF;
import modelo.ArchivoXLSX;
import modelo.Carpeta;

/**
 *
 * @author flopezs
 */
public class Controlador implements ActionListener{
    
    private Vista view;
    
    private ArchivoDOCX archivodocx;
    private ArchivoPDF archivopdf;
    private ArchivoXLSX archivoxlsx;
    private Carpeta carpeta;
    private Carpeta root;
    private String rutacom;
    
    public Controlador (Vista view,Carpeta carpeta)
    {
        this.view=view;
       this.rutacom="";
       this.root=new Carpeta(carpeta.getNombre());
       
        this.view.jButtonAgregar.addActionListener(this);
        this.view.jButtonEliminar.addActionListener(this);
        this.view.jButtoned.addActionListener(this);
    }
    public void iniciar(){
        view.setTitle("Gestion de Archivos");
        view.setLocationRelativeTo(null);
    }
    
    public void actionPerformed (ActionEvent e){
       if(e.getSource().equals(view.jButtonAgregar))
        {
            System.out.println("Se pulso boton");
            rutacom=view.getRutaCompleta();
            var ruta=rutacom.split("/");
        if (view.getPath()==1)
        {
            if (view.jRadioButtonDoc.isSelected()==true)
            {
                System.out.println("Se pulso boton DOC");
                archivodocx=new ArchivoDOCX(view.jTextNombre.getText());
                view.setNombre(archivodocx.getNombre()+" - "+archivodocx.getTamanio()+" mb" );
                root.add(archivodocx);
            }
            else if(view.jRadioButtonPDF.isSelected()==true)
            {
                System.out.println("Se pulso boton PDF");

                archivopdf=new ArchivoPDF(view.jTextNombre.getText());
                view.setNombre(archivopdf.getNombre()+" - "+archivopdf.getTamanio()+" mb" );
                root.add(archivopdf);
            }else if(view.jRadioButtonXlS.isSelected()==true)
            {
                System.out.println("Se pulso boton XLS");
                archivoxlsx=new ArchivoXLSX(view.jTextNombre.getText());
                view.setNombre(archivoxlsx.getNombre()+" - "+archivoxlsx.getTamanio()+" mb" );
                root.add(archivoxlsx);

            }else if(view.jRadioButtonSubc.isSelected()==true)
            {
                System.out.println("Se pulso boton SUBC");
                carpeta=new Carpeta(view.jTextNombre.getText());
                view.setNombre(carpeta.getNombre());
                root.add(carpeta);
            }
        }else
        {
            System.out.println("Ruta "+rutacom);
            String ultimoElemento = ruta[ruta.length - 1];
            System.out.println("Último elemento: " + ultimoElemento);
            for (String elem : ruta) {
                System.out.println("Elementos 1"+elem);
            }
            int index=0;
            System.out.println("VA A INGRESAR A BUSCAR");
           for(int i = 0; i < root.getElementos().size(); i++){
            if (root.getNombre().equals(ultimoElemento)) {
                System.out.println("ENCONTRO: "+root.getNombre());
                index = i+1;
                  break; // Si encontramos una coincidencia, salimos del bucle
                 }
            }
            System.out.println("Indice "+index);
            if (view.jRadioButtonDoc.isSelected()==true)
            {
               
                archivodocx=new ArchivoDOCX(view.jTextNombre.getText());
                view.setNombre(archivodocx.getNombre()+" - "+archivodocx.getTamanio()+" mb" );
                root.add(archivodocx);
            }
            else if(view.jRadioButtonPDF.isSelected()==true)
            {
               

                archivopdf=new ArchivoPDF(view.jTextNombre.getText());
                view.setNombre(archivopdf.getNombre()+" - "+archivopdf.getTamanio()+" mb" );
                root.add(archivopdf);
            }else if(view.jRadioButtonXlS.isSelected()==true)
            {
                
                archivoxlsx=new ArchivoXLSX(view.jTextNombre.getText());
                view.setNombre(archivoxlsx.getNombre()+" - "+archivoxlsx.getTamanio()+" mb" );
                root.add(archivoxlsx);

            }else if(view.jRadioButtonSubc.isSelected()==true)
            {
                
                carpeta=new Carpeta(view.jTextNombre.getText());
                view.setNombre(carpeta.getNombre());
                root.add(carpeta);
            }
        }
        
        
       }
       
       
       
       
       if(e.getSource().equals(view.jButtonEliminar))
       {
           System.out.println("PULSO ELIMINAR");
       }
       if(e.getSource().equals(view.jButtoned))
       {
           System.out.println("PULSO CALCULAR");
           
             if (view.getPath()==1)
             {
                 System.out.println(root.getTamanio());
                 view.jLabelTam.setText(root.getTamanio()+" mb");
             }
            
        
       }
    }
    
    public void listar(){
        System.out.println("LISTADO GENERAL"+this.root.getElementos().size()
        +" -- "+this.root.getNombre()+ "--"+this.root.getTamanio());
        for(var elemento: this.root.getElementos()){
            System.out.println(elemento.getNombre());
        }
    }
}
