
package prueba_combobox;
    
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Leer_Escribir_Archivos {
    String ruta = "C:/Users/Alexis/Documents/GitHub/Prueba_ComboBox_Java/prueba_ComboBox/src/prueba_combobox/Data.txt";
    File archivo = new File(ruta);
    BufferedWriter bw;

    public Leer_Escribir_Archivos() {
      leeEscribe();
    }
    
    private void leeEscribe (){
          try {
            if (archivo.exists()){
            bw = new BufferedWriter(new FileWriter(archivo));
            bw.write("Archivo ya estaba creado");
            }
            else{
                bw = new BufferedWriter(new FileWriter(archivo));
                bw.write("Archivo recien creado");
            }
        } catch (IOException e) {}
        finally{
            try {
                bw.close();
            } catch (Exception e2) {}
        } 
    }
}
