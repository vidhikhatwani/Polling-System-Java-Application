package myproject;

public class ResultService {

    public int retVotes(int opt_id)                                                                                     //retreiving votes
    {
        int novotes = new DAO().getVotes(opt_id);
        return novotes;
    }
    public String retWinner(){                                                                                          //retreiving opt name with max votes
        String w_opt=new DAO().getWinner();
        return w_opt;
    }
}