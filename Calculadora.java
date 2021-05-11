//bnBN
package entrada.desde.teclado;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Calculadora {
    public static void main(String[] args){
        double cantidad1 = 0, cantidad2 = 0;
       
        BufferedReader leer = new BufferedReader (new InputStreamReader (System.in));
        try{
        System.out.println("Ingrese la cantidad 1:");
        cantidad1 = Double.parseDouble(leer.readLine());
        System.out.println("Ingrese la cantidad 2:");
        cantidad2 = Double.parseDouble(leer.readLine());
            System.out.println("El resultado de la suma es       :" + Calculadora.sumar(cantidad1, cantidad2));
            System.out.println("El resultado de la resta es      :" + Calculadora.restar(cantidad1, cantidad2));
            System.out.println("El resultado de la multiplicacion es    :" + Calculadora.multiplicar(cantidad1, cantidad2));
            System.out.println("El resultado de la division es         :" + Calculadora.dividir(cantidad1, cantidad2));
            
  } catch (Exception e){
            System.out.println(e.getMessage());
  }
        System.out.println(cantidad1 + "" + cantidad2);
}


public static double sumar(double cantidad1, double cantidad2){
double suma = cantidad1 + cantidad2;
return suma;
}

public static double restar(double cantidad1, double cantidad2){
double resta = cantidad1 - cantidad2;
return resta;
}

public static double dividir(double cantidad1, double cantidad2){
double division = cantidad1 / cantidad2;
return division;
}

public static double multiplicar(double cantidad1, double cantidad2){
double multiplicacion = cantidad1 * cantidad2;
return multiplicacion;
}

}
