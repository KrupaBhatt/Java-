/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w17feb7;

/**
 *
 * @author krupa
 */
public class W17Feb7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TroubleTicket newTicket = new TroubleTicket("Daffy Duck", "Complainer@duckCo.com" , "Siracha broke my computer");
        
        newTicket.updateTicket("Did it happen because of the Texan?");
        newTicket.closeTicket("Break time - fix your own computer");
        newTicket.updateTicket("new update that will not be added");
        
        System.out.printf("The ticket description is : %s" , newTicket.getDescription());
    }
    
}
