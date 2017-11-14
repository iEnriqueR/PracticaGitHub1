/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicagithub1;

import java.util.Scanner;

/**
 *
 * @author Enrique
 */
public class PracticaGitHub1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double radio;
        Scanner sc = new Scanner(System.in);
        System.out.println("Holiwi dijo el kiwi :v");
        System.out.print("Ingresa el radio del cirulo: ");
        radio = sc.nextDouble();
        System.out.println("El area del circulo es: " + calcularAreaCirculo(radio));
    }
    
    public static double calcularAreaCirculo(double radio){
        return Math.PI * (radio * radio);
    }
    
}
