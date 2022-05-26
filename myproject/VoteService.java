package myproject;

import java.util.logging.Level;
import java.util.logging.Logger;

public class VoteService {
    
    public void addVote(int vote)                                                                                       //adding votes given by user
    {                                                                                                                   //in the database
        try {                                                                                                           //through DAO class using .insertVote
            new DAO().insertVote(vote);
        }
        catch (VoteException ex) {
            Logger.getLogger(VoteService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
