package myproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

//connection w database
public class DAO {
    private Connection con;     //connection object

    public DAO() {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3305/polling_system", "root", "root");
            System.out.println("connected");

        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);      // throws nullPointerException
        }
    }

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("loaded");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void insertVoter(String fname,String lname,String gender,String pno,String prn,String password) throws VoteException {
        try {                                                                                           //registerService
            int id = 0;
            Statement st = con.createStatement();
            String q= "SELECT * FROM registration ORDER BY id DESC LIMIT 1";            //retrieving id of last voter
            ResultSet rs = st.executeQuery(q);
            if(rs.next()) {
                id = rs.getInt("id");
                id++;
            }
            String query = "INSERT INTO registration VALUES(?,?,?,?,?,?,?)";                         // inserting details of new voter in database
            PreparedStatement ps1 = con.prepareStatement(query);
            ps1.setInt(1, id);
            ps1.setString(2, fname);
            ps1.setString(3, lname);
            ps1.setString(4, gender);
            ps1.setString(5, pno);
            ps1.setString(6, prn);
            ps1.setString(7, password);
            
            ps1.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
            throw new VoteException();
        }
        finally {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void selectUser(String prn,String password) throws VoteException {                   //RegisterService class
        try {                                                                               //searching login details according to user input

            String query = "SELECT * FROM registration WHERE prn=? AND password=?";
            PreparedStatement ps1 = con.prepareStatement(query);
            Statement st = con.createStatement();
            ps1.setString(1, prn);
            ps1.setString(2, password);
            ResultSet rs = ps1.executeQuery();
            if(!rs.next()) {                    //if record not present
                throw new VoteException();
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
            throw new VoteException();
        } finally {
            try {

                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
     public int selectAdmin(String prn,String password) throws VoteException {
        try {                                                                                   //check id password of admin in admin table
            String query = "SELECT * FROM admin WHERE username=? AND password=?";
            PreparedStatement ps1 = con.prepareStatement(query);
            ps1.setString(1, prn);
            ps1.setString(2, password);
            ResultSet rs = ps1.executeQuery();
            if(!rs.next()) {                                           // if admin not found
                return 0;
            }
            return 1;
        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
     public void insertVote(int vote) throws VoteException {                                    //VoteService
          try {                                                                                 // inserting votes in vote table

            String query = "INSERT INTO votes(optid) VALUES(?)";
            PreparedStatement ps1 = con.prepareStatement(query);
            //String query1 = "SELECT * FROM registration WHERE id=?";
            //PreparedStatement ps2 = con.prepareStatement(query1);
            ps1.setInt(1,vote);
            //ps1.setString(2,query1);
              ps1.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
            throw new VoteException();
        } finally {
            try {

                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public int getVotes(int opt_id)                                                                           //ResultService class
    {
        try{
            String query = "SELECT COUNT(*) FROM VOTES WHERE optid="+opt_id;                            //adding the votes for each option
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            rs.next();
            int nvotes= rs.getInt(1);
            return nvotes;
        }
        catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
            //throw new VoteException();
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

     public String getWinner()                                                                          //ResultService
     {
         try{
             String query = "SELECT * FROM votes GROUP BY optid ORDER BY count(*) DESC LIMIT 1";            //getting id with max votes
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(query);
             rs.next();
             int woptid= rs.getInt(1);
             String query1 = "SELECT * FROM options WHERE optid = " + woptid;                               //retrieving the option name with max votes
             ResultSet rs1 = st.executeQuery(query1);
             rs1.next();

             return rs1.getString("optname");

         }
         catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
            //throw new VoteException();
        } finally {
            try {

                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

     }
}
   
    


