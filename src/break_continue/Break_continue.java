/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package break_continue;

/**
 *
 * @author Jennifer
 */
public class Break_continue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i =3; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println("Número par encontrado: " + i);
                continue; /*Já encontrou o numero então ele continua para o próximo */
            }
            System.out.println("Passou aqui: " + i);
        }
        
    }
    
}
