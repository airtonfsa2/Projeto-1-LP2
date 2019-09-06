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
import java.util.Objects;


/**
 *
 * @author airton
 */

public class DeCaronaApp {
    
    

    public static void main(String[] args) throws IOException {
         
        menu(); 
        
    }
        //Criação das listas
         static List<Caronista> listaCaronista = new ArrayList<>();
         static List<Transporte> listaTransporte = new ArrayList<>();
         static List<PontoTuristico> listaPonto = new ArrayList<>();
        

        
        //Método Menu
        public static void menu() throws IOException{
        
        int opcao;
        
        System.out.println("Bem vindo ao Decarona, o que deseja fazer?\n");
        System.out.println("1 - cadastrar caronista\n2 - Cadastrar veículo\n3 - Cadastrar ponto turístico\n4 - Consultar ponto turístico");
        System.out.println("5 - Consultar Transporte\n6 - Buscar Caronista\n7 - Consultar pontos por bairro");
        System.out.println("8 - Consulta de transporte por ponto turístico\n0 - Sair");
        opcao = Console.readInt();
        
            if(opcao == 1){
            
            System.out.println("Informe os dados a seguir:");
            
            System.out.print("CPF: ");
            String cpf = Console.readString();
            
            //checagem de cpf para evitar duplicidade
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
            
            Integer id_caro = listaCaronista.size() + 1;
            
            Caronista c1 = new Caronista(cpf, rg, nome, idade, id_caro);
            
            listaCaronista.add(c1);
            listaCaronistaTransporte.add(c1);
            
         
            //Invoca o método menu após a realização da opção
            menu();
         }
        
        if(opcao == 2){
            
            System.out.println("Informe os dados necessários: ");
         
            System.out.println("Placa: ");
            String placa = Console.readString();
            
            //Checagem de duplicidade
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
            
            System.out.println("Informe o ID do ponto turístico a ser buscado: ");
            
            Integer id_busca = Console.readInt();
            
            //Exibição do ponto turístico por ID
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
        
        if(opcao == 5){
        
            System.out.println("Informe o ID do transporte buscado: ");
            
            Integer id_busca = Console.readInt();
            
            //Busca e exibição do transporte por ID, caso seja encontrado
            for(int i = 0; i< listaTransporte.size();i++){
                if(Objects.equals(listaTransporte.get(i).getId(), id_busca)){
                    System.out.println("As informações do transporte buscado:");
                    System.out.println("Placa: " +listaTransporte.get(i).getPlaca());
                    System.out.println("Tipo de veículo: " +listaTransporte.get(i).getTipo());
                    System.out.println("Valor cobrado: " +listaTransporte.get(i).getValor());
                    System.out.println("Capacidade do veículo: " +listaTransporte.get(i).getCapacidade());
                    System.out.println("Horário de saída: " +listaTransporte.get(i).getSaida());
                    System.out.println("Local de saída: " +listaTransporte.get(i).getLocalSaida());
                    System.out.println("Horário de retorno: " +listaTransporte.get(i).getRetorno());
                    System.out.println("Local de retorno: " +listaTransporte.get(i).getLocalRetorno());
                    System.out.println("ID do vepiculo: " +listaTransporte.get(i).getId());
                }
            }
            
            //Mensagem exibida caso o id não exista
            System.out.println("ID de transporte inválido!");
            
            menu();
            
        }
        
        if(opcao == 6){
            System.out.println("Informe o CPF do caronista a ser buscado: ");
            
            String cpf_busca = Console.readString();
            
            //Exibe os dados do caronista caso o cpf seja correspondente
            for(int i = 0; i < listaCaronista.size(); i++){
                if(listaCaronista.get(i).getCpf() == cpf_busca){
                    System.out.println("Nome: " +listaCaronista.get(i).getNome());
                    System.out.println("Idade: " +listaCaronista.get(i).getIdade());
                    System.out.println("RG: " +listaCaronista.get(i).getRg());
                }
               
            }
            
             System.out.println("CPF de caronista Inválido!");
                
                menu();

        }
        
        if(opcao == 7){
            System.out.println("Listar ponto Turístico por bairro.");
            System.out.println("Insira o Bairro: ");
            
            String bairro = Console.readString();
            
            //Busca do ponto por bairro
            for(int i = 0; i < listaPonto.size(); i++){
                if(listaPonto.get(i).getLocaPontoTuristico().equals(bairro)){
                    System.out.println(" \n" +listaPonto.get(i).getNomePontoTuristico());
                }
            
            }
            System.out.println("Bairro inválido!");
            
            menu();
        }
        
        if(opcao == 8){
            System.out.println("Transportes por ponto turístico.");
            System.out.println("Digite o ponto turístico: ");
            
            String ponto = Console.readString();
            
            //Busca do ponto turistico
            for(int i = 0; i < listaTransporte.size(); i++){
                if(listaTransporte.get(i).getLocalRetorno().equals(ponto)){
                    System.out.println("Placa: " +listaTransporte.get(i).getPlaca());
                    System.out.println("Tipo de transporte: " +listaTransporte.get(i).getTipo());
                    System.out.println("Capacidade: " +listaTransporte.get(i).getCapacidade());
                    System.out.println("Valor: " +listaTransporte.get(i).getValor());
                }
                
                System.out.println("Ponto turístisco inexistente!");
                menu();
            }
        }
        
        //Opção de saída
        if(opcao == 0){
            
            System.out.println("Obrigado e volte sempre!");
            
            System.exit(0);
        }
            
        }
        
        }

        
       
    
    
    
