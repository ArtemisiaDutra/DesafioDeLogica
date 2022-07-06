/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafiodelogica;

/**
 *
 * @author Artemisia Dutra
 */
public class DesafioDeLogica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 0; i < 101; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " Universo");
            } else if (i % 3 == 0) {
                System.out.println(i + " Uni");
            } else if (i % 5 == 0) {
                System.out.println(i + " Verso");
            }
        }
    }

}
