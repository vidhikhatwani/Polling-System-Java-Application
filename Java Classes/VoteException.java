package myproject;
import java.lang.Exception;

public class VoteException extends Exception {
    
    public VoteException() {
   }
   
  public VoteException(String message)
  {
      super(message);
  }
}
