
package modelo;

import java.util.Scanner;

/**
 *
 * @author jonas
 */
public class Main {
/*
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Ciclistas ciclista = new Ciclistas();
        
        //Variaveis
        int opcao = 1;
        
        while(opcao != 0){
        //Interface do Usuário
            System.out.println("1 - Criar Pedal");
            System.out.println("2 - Remover Pedal");
            System.out.println("3 - Relatório");
            System.out.println("4 - Selecionar Pedal");
            System.out.println("0 - Sair");
            
            opcao = ler.nextInt(); ler.nextLine();
            
            switch(opcao){
                case 1:                        
                        System.out.println("\n\n#################\n");
                        System.out.println("Cadastro de Pedal");
                        System.out.println("Pedal POP: Adiquirindo este pacote você podera utilizar as bikes "
                                + "até que seu saldo em carteira acabe, caso continue pedalando, será cobrado "
                                + "taxa de operação.\n"
                                + "Pedal Premium: Pedalantes Premium possuem a vantagem de não se preocuparem "
                                + "com uma taxa adcional, nesta modalidade você possui um limite de credito "
                                + "caso seu saldo acabe. Para ser um Pedalante Premium você precisa acrescentar "
                                + "em carteira ao menos R$ 100,00\n");
                        
                        int submenu = 0;
                        while(submenu != 1 && submenu != 2){
                            
                            System.out.println("Escolha sua opção:");
                            System.out.println("1 - Pedal POP");
                            System.out.println("2 - Pedal Premium");
                            submenu = ler.nextInt(); ler.nextLine();
                            
                            if(submenu != 1 && submenu != 2){
                                System.out.println("Opção inválida, tente Novamente.");
                            }
                        }
                        switch(submenu){
                            case 1:
                                    System.out.println("Cadastro de Pedal POP");
                                    
                                break;
                                    
                            case 2:
                                     System.out.println("Cadastro de Pedal Premium");
                                break;
                                
                            default:
                                    System.out.println("Ocorreu um erro durante a execução!");
                                break;
                        }
                        
                        System.out.println("Digite seu nome:");
                        ler.nextLine();
                    break;
                case 2:
                        
                    break;
                case 3:
                        
                    break;
                case 4:
                        
                    break;
                case 0:  
                    break;
                default:
                        System.out.println("\n Opção inválida, tente novamente\n");
                    break;
            }
        }
        /*
        PedalPop pop = new PedalPop();
        PedalPremium premium = new PedalPremium();
        
        pop.setNumeroConta("123");
        premium.setNumeroConta("8888");
        
        ciclista.inserir(pop);
        ciclista.inserir(premium);
        
        System.out.println(ciclista.procurar(0));
    
    
    }
*/
}
