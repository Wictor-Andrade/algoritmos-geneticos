/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algoritmogenetico;

/**
 *
 * @author UniCesumar
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        /*Populacao p = new Populacao(1000, 12);
        p.imprimirPopulacao();*/
        
        Individuo pai = new Individuo(4);
        pai.imprimirIndividuo();
        Individuo mae = new Individuo(4);
        mae.imprimirIndividuo();
        
        Individuo[] filhos = Individuo.cruzamento(pai, mae);
        
        filhos[0].imprimirIndividuo();
        filhos[1].imprimirIndividuo();
        
    }
    
}
