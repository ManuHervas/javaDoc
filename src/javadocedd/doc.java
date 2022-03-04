/*
*clase separada del metodo main y de la clase principal
 */
package javadocedd;

import java.util.Scanner;

/**
 *
 * @author Manuel Hervás
 */
public class doc {

    public doc() {
        String name; // El valor inicial se puede omitir aquí, el nombre predeterminado es nulo

	 System.out.println ("bienvenido, ven a la computadora perenne");

	 String exit = ""; // = variable vacía; informará una excepción de puntero nulo
	while(!exit.equals("exit")) {
		
		Scanner scanner = new Scanner(System.in);
		 System.out.println ("Introduzca su primer número:");
		 // El método scanner.nextDouble bloqueará el programa aquí
		double firstNum = scanner.nextDouble();

		 System.out.println ("Introduzca su segundo número:");
		double secondNum = scanner.nextDouble();

		 System.out.println ("Introduzca la operación que desea realizar: + - * /");
		 String caoZuo = scanner.next (); // siguiente es string
		
		 // romper; Saltar de todo el bloque de código, el bloque de código ha terminado
		switch (caoZuo) {

			case "+":
				 System.out.println ("El resultado es:" + (firstNum + secondNum));
				break;
			case "-":
				 System.out.println ("El resultado es:" + (firstNum-secondNum));
				break;
                                
                                //hasta aquí tenemos los 2 metodos para realizar las sumas
                                
			case "*":
				 System.out.println ("El resultado es:" + (firstNum * secondNum));
				break;
                                
                                //metodo para multiplicar
                                
			case "/":
				 System.out.println ("El resultado es:" + (firstNum / secondNum));
				break;
                                
                                //metodo de división
			default:
				 System.out.println ("¡Hombre, no hagas problemas! ¡Por favor, pórtate bien!");
				 break; // Se puede omitir el break en default
		}
		
		 System.out.println ("¿Desea continuar con el cálculo? Si desea salir, ingrese exit, si continúa, ingrese cualquier carácter!");
		exit = scanner.next(); 
                //salida 
		if(exit.equals("exit")) {
			 System.out.println ("¡Bienvenido a usar la próxima vez!");
		}
	
}

}
    }
    
    

