/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decaronaapp;

/**
 *
 * @author airto
 */
class PontoTuristico{
	private int id;
	private final String nome;
	private final String bairro;
	private final int abertura;
	private final int fechamento;
        private final int id_ponto;

        public PontoTuristico(String nome, String bairro, Integer abertura, Integer fechamento, Integer id_ponto){
        this.nome = nome;
        this.bairro = bairro;
        this.abertura = abertura;
        this.fechamento = fechamento;
        this.id_ponto = id_ponto;
        }
        
        public int getIdPonto(){
        return this.id_ponto;
        }
        
        
        public String getNomePontoTuristico(){
        return this.nome;
        }

        
        public String getLocaPontoTuristico(){
        return this.bairro;
        }

        
        public int getAbertura(){
        return this.abertura;
        }

        
        public int getFechamento(){
        return this.fechamento;
        }
        
}
