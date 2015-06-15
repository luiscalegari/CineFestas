package engenharia.cine.festa.gui;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Luis Calegari
 */
public class ModeloTabela extends DefaultTableModel {
    
    public ModeloTabela(){
        super();
    }

    public ModeloTabela(Object[][] data, Object[] columnNames) {
        super(data, columnNames);
    }
    
    @Override
    public boolean isCellEditable(final int row, final int column) {
        return false;
    }
}
