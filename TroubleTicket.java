package w17feb7;

import java.time.LocalDate;
import java.time.LocalDateTime;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author krupa
 */
public class TroubleTicket {
    private String fullName , emailAddress , description, status;
    private int ticketNum;
    private LocalDateTime openedOnDate;
    private static int nextTicketNumber = 10001;
    
    
    //the constructor is used when a new TroubleTicket is created
    //it must have the wxact same name as the class and does NOT have return type 
    public TroubleTicket(String fullName, String email, String description)
    {
        this.fullName = fullName;
        this.emailAddress = emailAddress;
        this.description = description;
        
        openedOnDate = LocalDateTime.now();
        ticketNum = nextTicketNumber;
        nextTicketNumber++;
        status = "open";
    }

    /**
     * This method will update the status with the given String 
     * @param The technician's update 
     */
       public void updateTicket(String update)
       {
           if (status.equalsIgnoreCase("open"))
           description += String.format("%n%s %s " , LocalDateTime.now().toString(),
                                                    update);
           
    }
    /**
     * This method will put the ticket in a closed state. It must have an
     * update provided as an argument to close the ticket
     */
     public void closeTicket(String finalUpdate)
     {
         updateTicket(finalUpdate);
         status = "closed";
     }

    public String getFullName() {
        return fullName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getDescription() {
        return description;
    }

    public String getStatus() {
        return status;
    }

    public int getTicketNum() {
        return ticketNum;
    }

    public LocalDateTime getOpenedOnDate() {
        return openedOnDate;
    }

    public static int getNextTicketNumber() {
        return nextTicketNumber;
    }
     
    }
