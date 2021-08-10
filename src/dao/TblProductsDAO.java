package dao;

import dto.Category;
import dto.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.JOptionPane;
import ui.CustomerTableModelProduct;
import ultis.DBUItis;

public class TblProductsDAO {
    private String[] headeres= {"Product ID", "Product Name", "Unit", "Price", "Quantity", "Category ID"};
    private int[] indexes={0,1,2,3,4,5};
    private CustomerTableModelProduct modelProduct= new CustomerTableModelProduct(headeres, indexes);
    
    public CustomerTableModelProduct getModelProduct(){
        return modelProduct;
    }
    
    public TblProductsDAO(){
        try {
            loadData();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void loadData() throws Exception{
        modelProduct.getList().clear();
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            con = DBUItis.openConnection();
            if (con != null) {
                String sql = "SELECT * FROM dbo.TblProducts";
                ps = con.prepareStatement(sql);
                rs = ps.executeQuery();
                while (rs.next()) {
                    Product pro = new Product(rs.getString("productID"), rs.getString("productName"), rs.getString("unit"),
                            rs.getFloat("price"), rs.getInt("quantity"), rs.getString("categoryID"));
                    modelProduct.getList().add(pro);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (ps != null) {
                ps.close();
            }
            if (con != null) {
                con.close();
            }
        }
    }
    
    public String loadCategoryIDIntoProduct(String category) {
        StringTokenizer stk = new StringTokenizer(category, " - ");
        return stk.nextToken();
    }
    
    public int Insert(Product pro) throws Exception {
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = DBUItis.openConnection();
            if (con != null) {
                String sql = "Insert dbo.TblProducts Values(?,?,?,?,?,?)";
                ps = con.prepareStatement(sql);
                ps.setString(1, pro.getProductID());
                ps.setString(2, pro.getProductName());
                ps.setString(3, pro.getUnit());
                ps.setFloat(4, pro.getPrice());
                ps.setInt(5, pro.getQuantity());
                ps.setString(6, pro.getCategoryID());
                return ps.executeUpdate();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (con != null) {
                con.close();
            }
            if (ps != null) {
                ps.close();
            }
        }
        return -1;
    }
    
    public int Save(Product pro) throws Exception {
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = DBUItis.openConnection();
            if (con != null) {
                String sql = "Update dbo.TblProducts Set productName=?, unit=?, price=?, quantity=?, categoryID=? Where productID=?";
                ps = con.prepareStatement(sql);
                ps.setString(1, pro.getProductName());
                ps.setString(2, pro.getUnit());
                ps.setFloat(3, pro.getPrice());
                ps.setInt(4, pro.getQuantity());
                ps.setString(5, pro.getCategoryID());
                ps.setString(6, pro.getProductID());
                return ps.executeUpdate();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (ps != null) {
                ps.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return -1;
    }
    
    public int Delete(Product pro) throws Exception {
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = DBUItis.openConnection();
            if (con != null) {
                String sql = "DELETE FROM dbo.TblProducts WHERE productID = ?";
                ps = con.prepareStatement(sql);
                ps.setString(1, pro.getProductID());
                return ps.executeUpdate();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (ps != null) {
                ps.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return -1;
    }

    public boolean validDataProductID(String productID) {
        try {
            for (int i = 0; i < modelProduct.getList().size(); i++) {
                if (modelProduct.getList().get(i).getProductID().compareToIgnoreCase(productID) == 0) {
                    return false;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

    public boolean validData(String productID, String productName, String unit, String price, String quantity, Object categoryID) {

        if (!productID.toUpperCase().matches("[a-zA-Z]{2}[0-9]{1}")) {
            JOptionPane.showMessageDialog(null, "Invalid Product ID");
            return false;
        }
        if (productName.isEmpty() || productName.length()>50) {
            JOptionPane.showMessageDialog(null, "Invalid Product Name");
            return false;
        }
        if (unit.isEmpty() || unit.length()>50) {
            JOptionPane.showMessageDialog(null, "Invalid Unit");
            return false;
        }
        if (price.isEmpty() || !price.matches("\\d+.?\\d*")) {
            JOptionPane.showMessageDialog(null, "Invalid Price");
            return false;
        }
        if (quantity.isEmpty() || !quantity.matches("\\d{1,5}")) {
            JOptionPane.showMessageDialog(null, "Invalid Quantity");
            return false;
        }
        if (categoryID == null) {
            JOptionPane.showMessageDialog(null, "Choose the CategoryID");
            return false;
        }
        return true;
    }

    public boolean checkconstraintCategoryID(String categoryID) {
        for (int i = 0; i < modelProduct.getList().size(); i++) {
            if (categoryID.compareToIgnoreCase(modelProduct.getList().get(i).getCategoryID()) == 0) {
                return false;
            }
        }
        return true;
    }
}
