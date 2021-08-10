
package ui;

import dto.Category;
import java.util.Vector;
import javax.swing.table.AbstractTableModel;

public class CustomerTableModelCategory extends AbstractTableModel{
    private String[] headeres;
    private int[] indexes;
    private Vector<Category> data;
    
    public Vector<Category> getList(){
        return data;
    }
    
    public CustomerTableModelCategory(String[] headeres, int[] indexes){
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
        Category ca= data.get(rowIndex);
        switch(indexes[columnIndex]){
            case 0: return ca.getCategoryID();
            case 1: return ca.getCategoryName();
            case 2: return ca.getDescription();
        }
        return null;
    }
}
