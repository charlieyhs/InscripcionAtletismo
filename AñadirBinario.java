/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import java.io.File;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 *
 * @author MARTHA
 */
public class AñadirBinario extends ObjectOutputStream{

    public AñadirBinario(OutputStream out) throws IOException {
        super(out);
    }

    public AñadirBinario() throws IOException, SecurityException {
    }
    
    
    @Override
    public void writeStreamHeader() throws IOException{
        
       File archivo = new File("registroAtletas.bin"); 
       
       if(archivo.length()==0){//si el archivo esta vacio
           super.writeStreamHeader();
       }
       else{
           reset();
       }
    }
    
    
    
    
}
