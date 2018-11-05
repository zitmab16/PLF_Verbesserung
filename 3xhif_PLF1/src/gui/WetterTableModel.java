/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author vizug
 */
public class WetterTableModel extends AbstractTableModel {
    private ArrayList<Wetterstation> stations = new ArrayList();
    private ArrayList<String> colnames = new ArrayList();

    @Override
    public int getRowCount() {
        return stations.size();
    }

    @Override
    public int getColumnCount() {
        return colnames.size();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Wetterstation w;
        w=stations.get(rowIndex);
        
        return w;
    }

    @Override
    public String getColumnName(int column) {
     return colnames.get(column);
    }
    public void add(Wetterstation w){
        stations.add(w);
        fireTableRowsInserted(stations.size()-1, stations.size()-1);
    }
    public void initColNames(){
        colnames.add("Place");
        colnames.add("Sea Level");
        colnames.add("Temperature");
        colnames.add("Humidity");
        
        fireTableStructureChanged();
    }
    
    
}
