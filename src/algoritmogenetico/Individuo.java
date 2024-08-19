/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algoritmogenetico;

import java.util.Random;

/**
 *
 * @author UniCesumar
 */
public class Individuo {
    private StringBuilder genotipo;
    private int fitness;

    public Individuo(int tamanhoGenotipo){
        this.genotipo = this.inicializarGenotipo(tamanhoGenotipo);
        this.fitness = this.calcularFitness();
    }

    public Individuo(StringBuilder genotipo) {
        this.genotipo = genotipo;
        this.fitness = this.calcularFitness();
    }
    
    

    private StringBuilder inicializarGenotipo(int tamanhoGenotipo) {
        Random random = new Random();
        StringBuilder retorno = new StringBuilder();
        
        for(int i = 0; i < tamanhoGenotipo; i++){
            retorno.append(random.nextInt(2));
        }
        
        return retorno;
    }

    private int calcularFitness() {
        int retorno = Integer.parseInt(this.genotipo.toString(), 2);
        return retorno;
    }

    public void imprimirIndividuo(){
        System.out.println("Genotipo: " + this.genotipo + " Fitness: " + this.fitness);
    }

    public StringBuilder getGenotipo() {
        return genotipo;
    }

    public int getFitness() {
        return fitness;
    }
    
    
    
    public static Individuo[] cruzamento(Individuo pai, Individuo mae){
        Individuo[] filhos = new Individuo[2];
        
        StringBuilder filho = new StringBuilder();
        StringBuilder filha = new StringBuilder();
        
        int pontoCorte =  new Random().nextInt(pai.getGenotipo().length());
        
        
        filho.append(pai.getGenotipo().substring(0, pontoCorte));
        filho.append(mae.getGenotipo().substring(pontoCorte, mae.getGenotipo().length()));
    
        filha.append(mae.getGenotipo().substring(0, pontoCorte));
        filha.append(pai.getGenotipo().substring(pontoCorte, pai.getGenotipo().length()));
        
        filhos[0] = new Individuo(filho);
        filhos[1] = new Individuo(filha);
        
        return filhos;
    }
    
    
}
