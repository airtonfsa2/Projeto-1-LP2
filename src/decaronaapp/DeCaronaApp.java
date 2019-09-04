/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decaronaapp;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;


/**
 *
 * @author airton
 */

public class DeCaronaApp {
    
    

    public static void main(String[] args) throws IOException {
         
        menu(); 
        
    }
         static List<Caronista> listaCaronista = new ArrayList<>();
         static List<Transporte> listaTransporte = new ArrayList<>();
         static List<PontoTuristico> listaPonto = new ArrayList<>();
        

        
        
        public static void menu() throws IOException{
        
        int opcao;
        
        System.out.println("Bem vindo ao Decarona, o que deseja fazer?\n");
        System.out.println("1 - cadastrar caronista\n2 - Cadastrar veículo\n3 - Cadastrar ponto turístico\n4 - Consultar ponto turístico\n0 - Sair");
        
        opcao = Console.readInt();
        
            if(opcao == 1){
            
            System.out.println("Informe os dados a seguir:");
            
            System.out.print("CPF: ");
            String cpf = Console.readString();
            
            for(int i = 0; i < listaCaronista.size();i++){
                
                if(listaCaronista.get(i).getCpf().equals(cpf)){
                
                    System.out.println("Cpf já cadastrado!\n");
                    
                    menu();
                }   
            }
            
            System.out.print("RG: ");
            String rg = Console.readString();
            
            System.out.println("Nome completo: ");
            String nome = Console.readString();
            
            System.out.println("Idade: ");
            Integer idade = Console.readInt();
            
            Caronista c1 = new Caronista(cpf, rg, nome, idade);
            
            listaCaronista.add(c1);
            
            
            
            menu();
         }
        
        if(opcao == 2){
            
            System.out.println("Informe os dados necessários: ");
         
            System.out.println("Placa: ");
            String placa = Console.readString();
            
            for(int i = 0; i < listaTransporte.size();i++){
                
            if(listaTransporte.get(i).getPlaca().equals(placa)){
                
                    System.out.println("Veículo já cadastrado!\n");
                    
                    menu();
                }   
            }
            
            System.out.println("Tipo de veiculo: ");
            String tipo = Console.readString();
            
            System.out.println("Valor: ");
            Double valor = Console.readDouble();
            
            System.out.println("Capacidade do veículo: ");
            Integer capacidade = Console.readInt();
            
            System.out.println("Saida: ");
            Integer horaSaida = Console.readInt();
            
            System.out.println("Local de saída: ");
            String localSaida = Console.readString();
            
            System.out.println("Hora de retorno: ");
            Integer horaRetorno = Console.readInt();
            
            System.out.println("Local de retorno: ");
            String localRetorno = Console.readString();
            
            Integer id_car2 = listaTransporte.size() + 1;
            
            Transporte t1 = new Transporte(placa, tipo, valor, capacidade, horaSaida, localSaida, horaRetorno, localRetorno, id_car2);
            
            listaTransporte.add(t1);
            
            menu();
            
            
    }
        if(opcao == 3){
            
            System.out.println("Informe os dados necessários do ponto turístico: ");
            
            System.out.println("Informe o nome do ponto turístico: ");
            String nomePonto = Console.readString();
            
            System.out.println("Bairro do ponto turístico: ");
            String bairro = Console.readString();
            
            System.out.println("Informe a abertura do ponto turístico: ");
            Integer horaAbertura = Console.readInt();
            
            System.out.println("Informe o fechamento do ponto turístco: ");
            Integer horaFechamento = Console.readInt();
            
            Integer id_ponto = listaPonto.size() +1;

            PontoTuristico pt1 = new PontoTuristico(nomePonto, bairro, horaAbertura, horaFechamento, id_ponto);
            
            listaPonto.add(pt1);
            
            menu();
            }
        
        if(opcao == 4){
            
            System.out.println("Informe o ID do ponto buscado: ");
            
            Integer id_busca = Console.readInt();
            
            for(int i = 0; i < listaPonto.size(); i++){
                if(listaPonto.get(i).getIdPonto() == id_busca){
                    System.out.println("As informações do ponto turístico: ");
                    System.out.println("Local: " +listaPonto.get(i).getLocaPontoTuristico());
                    System.out.println("Nome: " +listaPonto.get(i).getNomePontoTuristico());
                    System.out.println("Horário de abertura:  " +listaPonto.get(i).getAbertura());
                    System.out.println("Horário de fechamento: " +listaPonto.get(i).getFechamento());
                    System.out.println("ID do ponto turístico: " +listaPonto.get(i).getIdPonto());
                }
            }
                System.out.println("ID inválido!\n");
            menu();
        }
        }
}
        
       
    
    
    
