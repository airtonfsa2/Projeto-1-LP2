/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decaronaapp;


import static decaronaapp.DeCaronaApp.listaCaronista;
import java.io.IOException;
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
        private final int id_caro;
        
        private static List<Caronista> listaCaronistas;
        
      
        public Caronista(String cpf, String rg, String nome, Integer idade, Integer id_caro){
        this.cpf = cpf;
        this.rg = rg;
        this.nome = nome;
        this.idade = idade;
        this.id_caro = id_caro;
        }
        
        
       /*
        public void buscaCaronista(String cpf_busca) throws IOException{
            
        
           
        for(int i = 0; i < listaCaronista.size(); i++){
                if(listaCaronista.get(i).getCpf() == cpf_busca){
                    System.out.println("Nome: " +listaCaronista.get(i).getNome());
                    System.out.println("Idade: " +listaCaronista.get(i).getIdade());
                    System.out.println("RG: " +listaCaronista.get(i).getRg());
                }
                System.out.println("CPF de caronista Inválido!");
            
        }
        
        }*/
        
        public Integer getId(){
        return this.id_caro;
        }
        
        public String getCpf(){
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
