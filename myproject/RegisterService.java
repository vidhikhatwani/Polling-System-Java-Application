package myproject;

public class RegisterService {
    
    public boolean addVoter(String fname,String lname,String gender,String pno,String prn,String password)              //RegistrationFrame
    {
        fname=fname.toLowerCase();                                                                                      //getting parameters from Rframe and
        lname=lname.toLowerCase();                                                                                      //using them in insertVoter function
        try{
            new DAO().insertVoter(fname, lname, gender,pno, prn, password);                                             // DAO called
            return true;
        }
        catch (VoteException ex) {
            return false;
        }
    }
    
     public boolean validateAdmin(String username, String password) {                                                   //getting parameters from Rframe and
        try {                                                                                                           //using them to check whether the
            username = username.toLowerCase();                                                                          //details are correct or not
            int a=new DAO().selectAdmin(username, password);                                                            //selectAdmin function in DAO
            if(a==1)
               return true;
            else
                return false;
        }
        catch (VoteException ex) {
                    return false;
        }
    }
     
    public boolean validateVoter(String username, String password) {                                                    //user log in details are checked
        try {
            username = username.toLowerCase();
            new DAO().selectUser(username, password);                                                                   //selectUser function in DAO
            return true;
        }
        catch (VoteException ex) {
                    return false;
        }
    }
}