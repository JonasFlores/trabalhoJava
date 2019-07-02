/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author jonas
 */
public class Pedal extends ContaUrbanBike implements Imprimivel{
    
    protected boolean isPremium;
    
    @Override
    public String mostrarDados() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String GetAssinatura() {
        if(isPremium){
            return "PREMIUM";
        }else{
            return "POP";
        }
    }

    public void setIsPremium(boolean isPremium) {
        this.isPremium = isPremium;
    }
    
    public boolean GetIsPremium(){
        return this.isPremium;
    }
}
