package medicine.model;

import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.table.AbstractTableModel;
import medicine.entity.GSL;
import medicine.entity.POM;
import medicine.entity.P;

public class CustomTable extends AbstractTableModel{
    private String name[] = {"Image","Name","Category","Component","Usage"};
    private Class classes[] = {ImageIcon.class,String.class,String.class,String.class,String.class};

    List<GSL> gslList = new ArrayList<>();
    List<P> pList = new ArrayList<>();
    List<POM> pomList = new ArrayList<>();
    
    public CustomTable(List<GSL> gslList, List<P> pList,List<POM> pomList){
        this.gslList = gslList;
        this.pList = pList;
        this.pomList = pomList;
    }   
    
    @Override
    public int getRowCount() {
        if(gslList != null){
            return this.gslList.size();
        }
        else if(pList != null){
            return this.pList.size();
        }      
        else{
            return this.pomList.size();
        }     
    }

    @Override
    public int getColumnCount() {
        return this.name.length;
    }
    
    public ImageIcon getIcon(String name){
        String rename = name.replace("%", "_");
        ImageIcon icon = new ImageIcon("Image\\" + rename + ".jpg");
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(30, 20, Image.SCALE_SMOOTH);
        ImageIcon scaleIcon = new ImageIcon(imgScale);
        return scaleIcon;
    } 

    @Override
    public Object getValueAt(int rowIndex, int ColumnIndex) {
        switch(ColumnIndex){
            case 0: 
                if(gslList != null){
            return getIcon(gslList.get(rowIndex).getName());
        }
        else if(pList != null){
            return getIcon(pList.get(rowIndex).getName());
        }      
        else{
            return getIcon(pomList.get(rowIndex).getName());
        } 
            case 1: 
                if(gslList != null){
            return gslList.get(rowIndex).getName();
        }
        else if(pList != null){
            return pList.get(rowIndex).getName();
        }      
        else{
            return pomList.get(rowIndex).getName();
        } 
                
            case 2: if(gslList != null){
            return gslList.get(rowIndex).getCategory();
        }
        else if(pList != null){
            return pList.get(rowIndex).getCategory();
        }      
        else{
            return pomList.get(rowIndex).getCategory();
        }
            case 3: if(gslList != null){
            return gslList.get(rowIndex).getComponent();
        }
        else if(pList != null){
            return pList.get(rowIndex).getComponent();
        }      
        else{
            return pomList.get(rowIndex).getComponent();
        }
            case 4: if(gslList != null){
            return gslList.get(rowIndex).getUsage();
        }
        else if(pList != null){
            return pList.get(rowIndex).getUsage();
        }      
        else{
            return pomList.get(rowIndex).getUsage();
        }
            default: return null;
        }
    }
    
    
     @Override
    public Class getColumnClass(int columnIndex){
        return classes[columnIndex];
    }
    
    @Override
    public String getColumnName(int columnIndex){
        return name[columnIndex];
    }
    
    
}
