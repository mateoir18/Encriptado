package encriptado;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


import general.Posicion;



public class Read {

private static String FICHERO = "C:\\Users\\User\\Documents\\fichero.txt";
	
	public ArrayList<Posicion> getDatos() {
		
		
        ArrayList<Posicion> datos = new ArrayList<Posicion>();

        try {
        	
            BufferedReader ficheroEntrada = new BufferedReader(new FileReader(FICHERO));
  
                    
            String linea=ficheroEntrada.readLine();
            
            
            while(linea!=null){
            
            	Posicion posicion = new Posicion();
            	linea=ficheroEntrada.readLine();
            	datos.add(posicion);

            }           
            ficheroEntrada.close();
        }
        
        catch (Exception e) {
			
			e.printStackTrace();
		}
        
      
        return datos;
		
	}
}
