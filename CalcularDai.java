/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entrada.desde.teclado;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.NumberFormat;


public class CalcularDai {
    public static void main(String[] args) {
        NumberFormat formato = new DecimalFormat("$#,###.##");
        Scanner leer = new Scanner(System.in);
        double valorMaquina, valorFlete, valorSeguro;
        System.out.println("Valor de la maquina:");
        valorMaquina = leer.nextDouble();
        System.out.println("Valor del flete:");
        valorFlete = leer.nextDouble();
        System.out.println("Valor del seguro");
        valorSeguro = leer.nextDouble();
        
        double valorDai = CalcularDai.obtenerDai(valorMaquina, valorFlete, valorSeguro);
        double valorConIva = CalcularDai.obtenerIva(valorDai);
        
        System.out.println("Valor del DAI:" + formato.format(valorDai));
        System.out.println("Valor del IVA:" + formato.format(valorConIva));
    }
    
    public static double obtenerDai(double valorMaquina, double valorFlete, double valorSeguro){
    double dai = 0;
    dai = (valorMaquina - valorFlete - valorSeguro) * 0.10;
    return dai;
    }
    public static double obtenerIva(double dai){
    double pagoConIva = 0;
    pagoConIva = dai * 1.13;
    return pagoConIva;
    }
    
}

