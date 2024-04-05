package co.edu.unbosque.view;

import java.awt.Component;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class MostrarImagen extends DefaultTableCellRenderer {
	@Override
	public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
			int row, int column) {
		JLabel label = new JLabel();
		if (value != null) {
			String url = (String) value;
			ImageIcon icon = new ImageIcon(
					new ImageIcon(url).getImage().getScaledInstance(200, 150, Image.SCALE_DEFAULT));
			label.setIcon(icon);
		}
		return label;
	}
}
