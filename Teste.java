/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dougl
 */
public class Teste {
    
    public static void main(String[] args) {
        Lampada lampada1 = new Lampada();
        Lampada outra = new Lampada();
        lampada1.apagar();
        
        System.out.println("Estado da Lampada: " + lampada1.estaAcesa());
        //lampada1.piscar(5);

        System.out.println("Estado da Lampada: " + outra.estaAcesa());
        //lampada1.piscar(5);
    }
}
