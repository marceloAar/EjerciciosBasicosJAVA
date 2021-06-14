//Marcelo Aceituno R
//Full Stack JAVA 0034
import java.util.ArrayList;

public class BasicJava {
	
	//1. Imprimir 1 - 255
	//Escriba un método que imprima todos los número del 1 al 255.
	
	 void imprimeUno(int num) {
			
		 for(int i = 0; i<= num; i++) {
			 System.out.print(i+",");
		 }
		 		 
	 }
	 
	 //2. Imprimir los Números Impares Entre 1 - 255
	 //Escriba un método que imprima todos los número impares entre el 1 al 255.
	 
	 void imprimeImpares(int num1) {
	 
		 for(int i = 0 ; i <= num1 ; i++ ){
			 if ( i % 2 == 1 ) {
				 System.out.print(i+",");
			 }	 
		 }	 
	 }
	 
	 //3. Imprimir la Suma
	 //Escriba un método que imprima los números desde el 0 hasta el 255, pero esta vez muestre también las suma de los números que ha mostrado en pantalla hasta ahora. Por ejemplo, su salida debe ser algo como esto:
	 //Nuevo numero: 0 Suma: 0
	 //Nuevo numero: 1 Suma: 1
	 //Nuevo numero: 2 Suma: 3
	 //Nuevo numero: 3 Suma: 6
	 //...
	 //Nuevo numero: 255 Suma: ___
	 
	 void sumatoria(int num3) {
		 
		 int suma = 0;
		 int contador = 0;
		 		
		 for (int i = 0; i <= num3; i++) {
		 		   
		   suma = suma + contador;
		   System.out.println("Nuevo numero: " + i + " Suma: " + suma);
		   contador++;		 	 
		 }		 
	 }
	 
	 //4. Recorrer un Arreglo
	 //Dado un arreglo X, digamos [1,3,5,7,9,13], escriba un método que recorra cada uno de 
	 //los elementos del arreglo e imprima cada valor. 
	 //Ser capaz de recorrer cada elemento de un arreglo es extremadamente importante.
	 
	 void recorreArreglo(){
		 int [] arreglo = {1,3,5,7,9,13};
		 
		 for (int mostrar : arreglo) {
			 System.out.print(mostrar+",");
		 }
	 }
	 
	 //5. Encontrar el Máximo
	 //Escribir un método que tome un arreglo e imprima el valor máximo en el arreglo. 
	 //Su método debería funcionar también con todos los números en negativo (ejemplo [-3,-5,-7]), 
	 //o incluso una mezcla de números positivos, números negativos y cero.
	 
	 void maximo(){
		 int [] arreglo = {-3,-5,-7};   
		 int mayor = arreglo[0];

		 for (int i = 0; i < arreglo.length; i++) {
			 if(arreglo[i]>mayor){ 
	                mayor = arreglo[i];	               		             
			 } 			 
		 }
		 System.out.println("El numero mayor del arreglo es: "+mayor);	 
	 }	
	 
	 //6. Obtener el Promedio
	 //Escribir un método que tome un arreglo e imprima el promedio de los valores en el arreglo. 
	 //Por ejemplo en un arreglo hay [2,10,3], su método debería Imprimir “Promedio de 5”. 
	 //Nuevamente, asegúrese de crear un caso simple y escriba las instrucciones para resolver ese caso primero, 
	 //luego pruebe sus instrucciones con casos más complicados.
	 
	 void promedio() {
		 int [] arreglo = {2,10,3};
		 int acumulador = 0;
		 int prom = 0;

		    for(int nl : arreglo) {
		        acumulador += nl;
		    }
		   
		    prom = acumulador / (arreglo.length);
		   
		    System.out.println("El promedio del arreglo es: "+prom);		 
	 }
	 
	 //7. Arreglo con Números Impares
	 //Escribir un método que cree un arreglo ‘y’ que contenga todos los números impares entre 1 - 255. 
	 //Cuando el método haya terminado, ‘y’ debe tener los valores de [1,3,5,7…255].
	 
	 public ArrayList<Integer> impares255() {
		 
		 ArrayList<Integer> numeros = new ArrayList<Integer>();
		 
		 for(int i = 0 ; i <= 255 ; i++ ){
			 if ( i % 2 == 1 ) {
				 numeros.add(i);				 
			 }	 
		 }	
		 return numeros;		 
	 }
	 
	 //8. Mayor que Y
	 //Escribir un método que tome un arreglo y devuelva el número de valores mayores a un valor Y dado. 
	 //Por ejemplo, si el arreglo es [1,3,5,7] y Y = 3, después de terminar el proceso el método debe Imprimir 
	 //el número 2 (ya que hay 2 valores en el arreglo que son mayores que 3).
	 
	 void mayorY() {
		 int [] arreglo = {1,3,5,7};
		 int Y = 3;
		 int cifra = 0;
		 ArrayList<Integer> nuevo = new ArrayList<Integer>();
			   for (int i=0; i<arreglo.length; i++){
			     if (arreglo[i] > Y){	
			    	
			         nuevo.add(i);  	 
			    	 
			     } 
			     cifra = nuevo.size();
			   }		
		
		System.out.println("<< Hay "+cifra+" valores en el arreglo que son mayores que "+Y+" >> ");	   
					   
		}	
	 
	 //9. Valores al Cuadrado
	 //Dado cualquier arreglo x, digamos [1,5,10,-2], escribir un método que multiplique cada valor 
	 //en el arreglo por sí mismo. Cuando el método haya terminado, el arreglo x debe contener valores que han sido 
	 //elevados al cuadrado, digamos [1,25,100,4].
	 
	 
	 void cuadrado() {
		 int [] arreglo = {1,5,10,-2};
		 ArrayList<Integer> nuevo = new ArrayList<Integer>();

	     for (int i=0; i<arreglo.length; i++){
	    	 
	    	 nuevo.add(arreglo[i]*arreglo[i]);
	    	 
	     }	
	 System.out.println("El nuevo arreglo con valores al cuadrado es: "+nuevo);

	 }
	 
	 
	 //10. Eliminar Números Negativos
	 //Dado un arreglo x, digamos [1,5,10,-2], escribir un método que reemplace cualquier número negativo por 0.
	 //Cuando el método haya terminado, x no debe tener valores negativos, digamos como [1,5,10,0].
	 
	 
	 void eliminaNumerosNegativos() {
		 
		 ArrayList<Integer> nuevo = new ArrayList<Integer>();
		 int [] arreglo = {1,5,10,-2};		 

		 for (int i=0; i < arreglo.length; i++){			 
			 nuevo.add(arreglo[i]);
			 if (arreglo[i] < 0){				
				nuevo.remove(i); 
				nuevo.add(0);				
			 }			
		 }
		 
		 System.out.print(nuevo);
	 }
	
	 
	 //11. Mínimo, Máximo y Promedio
	 //Dado un arreglo x, digamos [1,5,10,-2], escribir un método que devuelva un arreglo con el número máximo, 
	 //el número mínimo y el valor promedio que hay en el arreglo x. 
	 //El arreglo devuelto debe contener solo 3 valores [Max, Min, Prom].
	 
	 void maximoMinimoPromedio() {
		 
	 int [] arreglo = {1,5,10,-2};
	 
	     int suma = 0;
	     int max = 0;
	     int min = 1;
	     int promed = 0;
	     
	     for (int i = 0; i < arreglo.length; i++) {
	         if (arreglo[i] < min) {
	             min = arreglo[i];
	         }
	         else if (arreglo[i] > max) {
	             max = arreglo[i];
	         }
	     suma += arreglo[i];
	     promed ++; 
	     }
	     	     
	     System.out.print("Valor maximo: " +max+ "\nValor minimo: "+min+"\nPromedio: "+suma / promed);	    	    
	 }
	 
	 
	 //12. Cambiando los Valores del Arreglo
	 //Dado un arreglo x, digamos [1,5,10,7,-2], escribir un método que cambie cada valor por el valor que sigue. 
	 //Por ejemplo, cuando el método haya terminado, un arreglo x [1,5,10,7,-2] 
	 //se convertirá en [5,10,7,-2,0]. Observe que el último número es 0. 
	 //El método no necesita ajustarse para los valores que están fuera de los límites.
	 
	 
	 void  cambiando() {
		 int [] arreglo = {1,5,10,7,-2};
		 ArrayList<Integer> nuevo = new ArrayList<Integer>();
		 int ultimo = arreglo.length-1;
		 
		 for (int i=0; i < arreglo.length; i++){			 
			 nuevo.add(arreglo[i]);
			 
			 if (arreglo[i] < 0){				
				nuevo.remove(0); 
				nuevo.add(0);				
			 }			
		 }
			 
		 arreglo[0] = arreglo[2];			 
		 arreglo[ultimo] = 0;
		 
	 System.out.print("Arreglo con valores cambiados: "+nuevo);  
	 }

	
	 
}
