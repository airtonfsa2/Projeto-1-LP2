/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decaronaapp;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author airto
 */
class Transporte{
	private final String placa;
	private final String tipo;
	private final double valor;
	private final int capacidade;
	private final int saida;
	private final String localSaida;
	private final int retorno;
	private final String localRetorno;
        private final int id_car2;
        
        private static List<PontoTuristico> listaPontos = new ArrayList<>();
        
        
        public Transporte(String placa, String tipo, Double valor, Integer capacidade, Integer saida, String localSaida, Integer retorno, String localRetorno, Integer id_car2){
        this.placa = placa;
        this.tipo = tipo;
        this.valor = valor;
        this.capacidade = capacidade;
        this.saida = saida;
        this.localSaida = localSaida;
        this.retorno = retorno;
        this.localRetorno = localRetorno;
        this.id_car2 = id_car2;
        }
        

                

        public String getPlaca(){
        return this.placa;
        }
        
 
        public String getTipo(){
        return this.tipo;
        }
        

        public double getValor(){
        return this.valor;
        }
        

        public int getCapacidade(){
        return this.capacidade;
        }
        

        
        public int getSaida(){
        return this.saida;
        }
        

        public String getLocalSaida(){
        return this.localSaida;
        }
        

        public int getRetorno(){
        return this.retorno;
        }
        
        
        public String getLocalRetorno(){
        return this.localRetorno;
        }
        
}
