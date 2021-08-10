
package dao;

import dto.Product;
import dto.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;
import ultis.DBUItis;

public class TblUsersDAO {
    private Vector<User> listUsers= new Vector<User>();
    
    public Vector<User> getListUser(){
        return listUsers;
    }
    
    public void loadData() throws Exception{
        Connection con= null;
        PreparedStatement ps= null;
        ResultSet rs= null;
        try {
            con= DBUItis.openConnection();
            if(con != null){
                String sql= "SELECT * FROM dbo.TblUsers";
                ps= con.prepareStatement(sql);
                rs= ps.executeQuery();
                while(rs.next()){
                    User user= new User(rs.getString("userID"), rs.getString("fullName"), rs.getString("password"),
                                            rs.getBoolean("status"));
                    listUsers.add(user);
                    
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            if(rs != null){
                rs.close();
            }
            if(ps != null){
                ps.close();
            }
            if(con != null){
                con.close();
            }
        }
    }
    
    public boolean checkLogin(String userID, String password){
        for(int i=0; i<listUsers.size(); i++){
            if(userID.equals(listUsers.get(i).getUserID()) && password.equals(listUsers.get(i).getPassword())){
                return true;
            }
        }
        return false;
    }
}
