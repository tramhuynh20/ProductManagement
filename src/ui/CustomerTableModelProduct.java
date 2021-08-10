
package ui;

import dao.TblCategoriesDAO;
import dto.Product;
import java.util.Vector;
import javax.swing.table.AbstractTableModel;

public class CustomerTableModelProduct extends AbstractTableModel{
    private String[] headeres;
    private int[] indexes;
    private Vector<Product> data;
    TblCategoriesDAO dao= new TblCategoriesDAO();
    
    public void loadCategoriesComboBox(){
        try {
            dao.loadCategoriesComboBox();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public String getCategories(String categoryID){
        for(String ca : dao.getListCategoriesComboBox()){
            if(ca.contains(categoryID)){
                return ca;
            }
        }
        return "";
    }
    
    public Vector<Product> getList(){
        return data;
    }
    
    public CustomerTableModelProduct(String[] headeres, int[] indexes){
        this.headeres= new String[headeres.length];
        for(int i=0; i<headeres.length; i++){
            this.headeres[i]= headeres[i];
        }
        this.indexes= new int[indexes.length];
        for(int i=0; i<indexes.length; i++){
            this.indexes[i]= indexes[i];
        }
        data= new Vector<>();
    }

    @Override
    public String getColumnName(int column) {
        if(column>=0 || column<headeres.length){
            return headeres[column];
        }
        else return "";
    }
    
    @Override
    public int getRowCount() {
        return data.size();
    }

    @Override
    public int getColumnCount() {
        return headeres.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if(rowIndex<0 || rowIndex>=data.size() || columnIndex<0|| columnIndex>=headeres.length){
            return null;
        }
        Product pro= data.get(rowIndex);
        switch(indexes[columnIndex]){
            
            case 0: return pro.getProductID();
            case 1: return pro.getProductName();
            case 2: return pro.getUnit();
            case 3: return pro.getPrice();
            case 4: return pro.getQuantity();
            case 5: return pro.getCategoryID();
        }
        return null;
    }
}
