
package dao;

import dto.Category;
import dto.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.JOptionPane;
import ui.CustomerTableModelCategory;
import ultis.DBUItis;

public class TblCategoriesDAO {
    private String[] headeres={"Category ID", "Category Name", "Description"};
    private int[] indexes={0,1,2};
    private CustomerTableModelCategory modelCategory= new CustomerTableModelCategory(headeres, indexes);
    private Vector<String> listCategoriesComboBox= new Vector();
    
    public CustomerTableModelCategory getModelCategory(){
        return modelCategory;        
    }
    
    public TblCategoriesDAO(){
        try {
            loadCategoriesComboBox();
            loadData();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public Vector<String> loadCategoriesComboBox() throws Exception{
        listCategoriesComboBox.clear();
        Connection con= null; //doi tuong tao ket noi voi csdl
        PreparedStatement ps= null;//doi tuong tao cau truy van
        ResultSet rs= null;//doi tuong nhan kq truy van
        
        try {
            con= DBUItis.openConnection();
            if(con != null){
                String sql= "SELECT categoryID, categoryName FROM dbo.TblCategories";
                ps= con.prepareStatement(sql);
                rs= ps.executeQuery();
                while(rs.next()){
                    listCategoriesComboBox.add(rs.getString("categoryID")+" - "+rs.getString("categoryName"));
                }
                return listCategoriesComboBox;
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
        return null;
    }

    public Vector<String> getListCategoriesComboBox() {
        return listCategoriesComboBox;
    }
    
    public String getCategoryNameComboBox(String categoryID){
        for(Category ca : modelCategory.getList()){
            if(ca.getCategoryID().compareToIgnoreCase(categoryID)==0){
                return ca.getCategoryName();
            }
        }
        return "";
    }
    
    public void loadData() throws Exception{
        modelCategory.getList().clear();
        Connection con= null;
        PreparedStatement ps= null;
        ResultSet rs= null;
        try {
            con= DBUItis.openConnection();
            if(con != null){
                String sql= "SELECT * FROM dbo.TblCategories";
                ps= con.prepareStatement(sql);
                rs= ps.executeQuery();
                while(rs.next()){
                    Category ca= new Category(rs.getString("categoryID"), rs.getString("categoryName"), rs.getString("description"));
                    modelCategory.getList().add(ca);
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
    
    public int Insert(Category ca) throws Exception{
        Connection con= null;
        PreparedStatement ps= null;
        try {
            con= DBUItis.openConnection();
            if(con != null){
                String sql= "Insert dbo.TblCategories Values(?,?,?)";
                
                ps= con.prepareStatement(sql);
                ps.setString(1, ca.getCategoryID());
                ps.setString(2, ca.getCategoryName());                
                ps.setString(3, ca.getDescription());
                return ps.executeUpdate();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            if(con != null){
                con.close();
            }
            if(ps != null){
                ps.close();
            }            
        }
        return -1;
    }
    
    public int Save(Category ca) throws Exception{
        Connection con= null;
        PreparedStatement ps= null;
        try {
            con= DBUItis.openConnection();
            if(con != null){
                String sql= "Update dbo.TblCategories Set categoryName=?, description=? Where categoryID=?";
                ps= con.prepareStatement(sql);
                ps.setString(1, ca.getCategoryName());
                ps.setString(2, ca.getDescription());
                ps.setString(3, ca.getCategoryID());
                return ps.executeUpdate();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            if(ps != null){
                ps.close();
            }
            if(con != null){
                con.close();
            }           
        }
        return -1;
    }
    
    public int Delete(Category ca) throws Exception{
        Connection con= null;
        PreparedStatement ps= null;
        try {
            con= DBUItis.openConnection();
            if(con != null){
                String sql= "DELETE FROM dbo.TblCategories WHERE categoryID = ?";
                ps= con.prepareStatement(sql);
                ps.setString(1, ca.getCategoryID());
                return ps.executeUpdate();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            if(ps != null){
                ps.close();
            }
            if(con != null){
                con.close();
            }           
        }
        return -1;
    }
    
    public boolean validDataCategoryID(String categoryID){//xet trung category
        try {
            for(int i=0; i<modelCategory.getList().size(); i++){
                if(modelCategory.getList().get(i).getCategoryID().compareToIgnoreCase(categoryID)==0){
                    return false;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }
    
    public boolean validData(String categoryID, String categoryName, String description){
        if(!categoryID.toUpperCase().matches("[a-zA-Z]{2}")){
            JOptionPane.showMessageDialog(null, "Invalid Category ID");
            return false;
        }
        if(categoryName.isEmpty() || categoryName.length()>50){
            JOptionPane.showMessageDialog(null, "Invalid Category Name");
            return false;
        }
        if(description.isEmpty() || description.length()>200){
            JOptionPane.showMessageDialog(null, "Invalid Description");
            return false;
        }
        return true;
    }

}
