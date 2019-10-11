/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenados;

import java.util.Scanner;

/**
 *
 * @author Usuario DAM 1
 */
public class OrdenaDos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dame tres numeros por favor");
        int num1 = teclado.nextInt();
        int num2 = teclado.nextInt();
        int num3 = teclado.nextInt();

        if (num1 > num2 && num2 > num3) {
            System.out.printf("%d > %d > %d", num1, num2, num3);
        } else if (num2 > num1 && num1 > num3) {
            System.out.printf("%d > %d > %d", num2, num1, num3);
        } else if (num3 > num1 && num2 > num1) {
            System.out.printf("%d > %d > %d", num3, num2, num1);
        } else if (num2 > num3 && num3 > num1) {
            System.out.printf("%d > %d > %d", num2, num3, num1);
        } else if (num3 > num1 && num1 > num2) {
            System.out.printf("%d > %d > %d", num3, num1, num2);
        } else if (num1 > num3 && num3 > 2) {
            System.out.printf("%d > %d > %d", num1, num3, num2);
        } else {
            System.out.println("Algunos de los numeros son iguales");
        }
    }

}
