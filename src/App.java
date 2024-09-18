import java.nio.channels.Pipe.SourceChannel;
import java.util.concurrent.SynchronousQueue;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");


        String cadena = "Hola mundo";
        System.out.println(cadena);
        System.out.println("Tamaño de cadena");
        System.out.println(cadena.length());
        System.out.println(cadena.split(" ")[0]);
        



        for(int i = 0; i < cadena.length(); i ++) {
            //System.out.print(cadena.charAt(i)+"-");
            if (i == cadena.length()-1) {
                System.out.print(cadena.charAt(i));
            
                
            }else{
                System.out.print(cadena.charAt(i)+ "-");
                
                
                
                
                
                
                
                
                
            }
            
            
            
            
            
        }
        
    
        System.out.println();
            //
        int palabras =cadena.split(" ").length;
        System.out.println(palabras);
    } 
     
}
