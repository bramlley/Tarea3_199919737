/*
 *Escribir un programa que contenga 2 menus, el primer menu es el menu principal
 *el segundo menu(menu interno) de la priemra opcion.
 */
package tarea3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Tarea3 {

    public static void main(String[] args)throws IOException {
         BufferedReader teclado = new BufferedReader(
                            new InputStreamReader(System.in));
  // esto es una instancia de la clase Opcion 1       
        Opcion1 mostrar = new Opcion1();
        mostrar.MenuPrincipal();//llamada al método mostrar
        
//esto es una instancia de la clase Palindromo   
    Palindrom palindrome = new Palindrom();
          String fraseAux = teclado.readLine();
            palindrome.palíndromo(fraseAux);//llamada al método palíndromo
        
    }
    
}
