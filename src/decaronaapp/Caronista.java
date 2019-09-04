/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decaronaapp;


import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author airto
 */
class Caronista{
	private final String cpf;
	private final String rg;
	private final String nome;
	private final int idade;
        private final List<Caronista> listaCaronistas;
        
        
        public Caronista(String cpf, String rg, String nome, Integer idade){
        this.cpf = cpf;
        this.rg = rg;
        this.nome = nome;
        this.idade = idade;
        
        listaCaronistas = new ArrayList<>();
        }
        
        public String getCpf() {
        return this.cpf;
        }
        
        public String getRg(){
        return this.rg;
        }

        public String getNome(){
        return this.nome;
        }
  
        public int getIdade(){
        return this.idade;
        }
}
