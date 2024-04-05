package co.edu.unbosque.view;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import co.edu.unbosque.model.NodoDTO;

public class VentanaMosNodo {

	private ArrayList<NodoDTO> listNodos;

	public VentanaMosNodo(ArrayList<NodoDTO> nodos) {
		listNodos = nodos;
	}

	String[] columnas1 = { "Nombre del lugar", "Direcccion" };

	public JTable tablaNodos() {
		DefaultTableModel modelo = new DefaultTableModel(columnas1, 0);
		for (NodoDTO nodo : listNodos) {

			Object[] fila = { nodo.getNameOfPlace(), nodo.getDirection() };
			modelo.addRow(fila);
		}
		JTable table = new JTable(modelo);
		JFrame frame = new JFrame("Tabla nodos");
		frame.add(new JScrollPane(table));
		frame.pack();
		Dimension tamanio = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setSize(tamanio.width, tamanio.height);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		table.setDefaultEditor(Object.class, null);
		table.setRowHeight(100);
		table.getColumnModel().getColumn(8);
		return table;
	}

}
