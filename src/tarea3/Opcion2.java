
package tarea3;

import java.io.*;
import static java.lang.System.exit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Opcion2 {
    
    public  void dameUsuario() throws IOException{
        
        Opcion1 regreso = new Opcion1();
        BufferedReader teclado = new BufferedReader(
                                 new InputStreamReader(System.in));
        String buscar;
        int opcion;
        int nombre = 0;
          final   int limite = 5;
         String[] usuario = new String[limite];
         String[] copiaUsuario = new String[limite];
         String[] doyUsuario = new String[limite];
        
        boolean salir = false;
        while(!false){
            
            System.out.println("Menu de Opciones 2");
            System.out.println("1. Ingrese Cinco Nombres de Usuarios");
            System.out.println("2. Mostrar Todos Los Usuarios");
            System.out.println("3. Mostrar Usuario Personalizado");
            System.out.println("4. Menu Principal");
            System.out.println("5. Salir");
            opcion = Integer.parseInt(teclado.readLine());
            
            switch(opcion){
                
       case 1:
          System.out.println("Ingrese 5 nombres");
        
           for(int i = 0; i < limite; i++){
            try {
                usuario[i] = teclado.readLine();
            } catch (IOException e) {
                System.out.println("Error no se puede Ingresar");
                
            }//fin del try catch
        }//fin del for
       
        break;
//********************** fin case 1 ********************************************        
                case 2:
            
                    System.out.println("Ver Usuarios");
                    for(int i = 0; i < usuario.length; i++){
                         copiaUsuario[i] = usuario[i];
                         System.out.println("El usuario: " +  
                                                          copiaUsuario[i]);
                    }//fin del for
                  
                   break; 
//************************** fin case 2 ****************************************                   
                case 3:
                    System.out.println("Ingrese nombre a Buscar");
                    buscar = teclado.readLine();
               
                  for(int i = 0; i < usuario.length; i++){
                      
                      if(buscar.equals(usuario[i]))
                          System.out.println("Si Existe" );
                 }//fin del del for
                  
                  for(int i = 0; i < usuario.length; i++){
                      
                      if(buscar.equals(usuario[i]))
                          System.out.println("Error" );
                 }//fin del del for
                      
                   break;
             
//************************** fin case 3 ****************************************                
                case 4: 
                    System.out.println("A decidido Regresar al Menu Principal");
                    regreso.MenuPrincipal();
                    
                    break; 
//************************** fin case 4 ****************************************                    
                case 5: 
                     System.out.print("Ha salido Exitosamente");
                     salir = true; 
                break;
       }//fin del switch
            salir = true;
     }//fin del método dameUsuario
   }//fin del while
    
    
 
    
}//fin de la clase Opcion2
