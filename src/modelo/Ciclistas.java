package modelo;

import java.util.ArrayList;

/**
 *
 * @author jonas
 */
public class Ciclistas {
    static private ArrayList<Pedal> pedais = new ArrayList();
    
    public void inserir(Pedal pedal){
        pedais.add(pedal);
    }
        
    public boolean remover(String numConta){
        
        int posicao = getPosicaoPedalByConta(numConta);
        
        if(posicao < 0){
            return false;
        }else{
            pedais.remove(posicao);
            return true;    
        }
    }
    
    public ArrayList<Pedal> procurar(String text){
        
        ArrayList<Pedal> listaFiltrada = new ArrayList<Pedal>();
        
        
        boolean isAdicionar = false;
        
        for(int i = 0; i < pedais.size(); i++){
            
           if(pedais.get(i).getNome().toUpperCase().contains(text.toUpperCase())){
               isAdicionar = true;
           }
           
           if(pedais.get(i).getNumeroConta().toUpperCase().contains(text.toUpperCase())){
               isAdicionar = true;
           }
        
           if(pedais.get(i).GetAssinatura().toUpperCase().contains(text.toUpperCase())){
               isAdicionar = true;
           }
        
           if(isAdicionar){
               listaFiltrada.add(pedais.get(i));
           }
           isAdicionar = false;
        }
        
        return listaFiltrada;   
    
    }
    
    public ArrayList<Pedal> listarPedais(){
        return this.pedais;
    }
    
    public int getPosicaoPedalByConta(String numConta){
        
        int posicao = -1;
        
        for(int i = 0; i < pedais.size(); i++){
            if(pedais.get(i).numeroConta.equalsIgnoreCase(numConta)){
                posicao = i;
            }
        }
        return posicao;
    }
    
    public String transferir(String Origem, double valor, String Destino){
        
        int idOrigem = getPosicaoPedalByConta(Origem);
        int idDestino = getPosicaoPedalByConta(Destino);
        
        if(idOrigem < 0){
            return "Conta Origem não foi encontrada";
        }
        
        if(idDestino < 0){
            return "Conta Destino não foi encontrada";
        }
        
        if(valor < 0){
            return "O valor não pode ser negativo";
        }
        
        if(pedais.get(idOrigem).isPremium){
            if(pedais.get(idOrigem).saldo + pedais.get(idOrigem).getLimite() < valor){
                return "Este valor não está disponivel para a tranferência";
            }
        }else if(pedais.get(idOrigem).getSaldo() < valor){
            return "Este valor não está disponivel para a tranferência";
        }
        
        pedais.get(idOrigem).pedalar(valor,pedais.get(idOrigem).isPremium);
        pedais.get(idDestino).creditar(valor);
        
        return "";
    }
}
