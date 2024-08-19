/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algoritmogenetico;

/**
 *
 * @author UniCesumar
 */
public class Agente {
    private int tamanhoGenotipo;
    private int tamanhoPopulacao;
    private int numeroGeracoes;

    public Agente(int tamanhoGenotipo, int tamanhoPopulacao, int numeroGeracoes) {
        this.tamanhoGenotipo = tamanhoGenotipo;
        this.tamanhoPopulacao = tamanhoPopulacao;
        this.numeroGeracoes = numeroGeracoes;
    }
    
    public Individuo run(){
        Populacao p = new Populacao(tamanhoPopulacao, tamanhoGenotipo);
        int i = 0;
        
        while(i < numeroGeracoes){
            
            
            i++;
        }
        return null;
    }

    
    
}
