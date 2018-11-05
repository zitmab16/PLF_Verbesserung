
package gui;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;

public class TableCellRenderer implements javax.swing.table.TableCellRenderer{

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        JLabel label = new JLabel();
        
        label.setText(value.toString());
        
        Wetterstation w =(Wetterstation)value;
        
        switch(table.convertColumnIndexToModel(column)){
            case 0:
                label.setText(w.getPlace()); break;
            case 1:
                label.setText(String.format("%d",w.getSealvl())); break;
            case 2:
                label.setText(String.format("%.2f°", w.getTemp())); break;
            case 3:
                label.setText(String.format("%d %%",w.getHumidity()));
        }
        label.setOpaque(true);
        
        if(w.getTemp()>25 && w.getHumidity()<20){
            label.setBackground(Color.yellow);
        }
        if(w.getTemp()<0 && w.getHumidity()<30){
            label.setBackground(Color.blue);
        }
        if(w.getTemp()>=0 &&w.getTemp()<=25 && w.getHumidity()>50){
            label.setBackground(Color.green);
        }
        
        return label;
    }
    
}
