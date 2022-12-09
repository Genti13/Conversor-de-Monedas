package ar.genti.conversorMoneda;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.SwingConstants;
import javax.swing.DefaultComboBoxModel;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class VentanaPrincipal extends JFrame {

	private JPanel contentPane;
	private JTextField inputOrigen;
	private JTextField inputDestino;
	private JComboBox comoboOrigen;
	private JComboBox comboDestino;
	
	private Map<String,Integer> listaMonedas = new HashMap<String,Integer>();
	
	public VentanaPrincipal() {
		
		setSize(1000,375);
		setResizable(false);
		
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel footer = new JPanel();
		getContentPane().add(footer, BorderLayout.SOUTH);
		
		JPanel header = new JPanel();
		getContentPane().add(header, BorderLayout.NORTH);
		
		JPanel body = new JPanel();
		getContentPane().add(body, BorderLayout.CENTER);
		body.setLayout(new BorderLayout(0, 0));
		
		JLabel main__leftPadding = new JLabel("                                              ");
		body.add(main__leftPadding, BorderLayout.WEST);
		
		JLabel main__rigthPadding = new JLabel("                                              ");
		body.add(main__rigthPadding, BorderLayout.EAST);
		
		JPanel main = new JPanel();
		body.add(main, BorderLayout.CENTER);
		main.setLayout(new BorderLayout(0, 0));
		
		JPanel origen = new JPanel();
		origen.setBackground(Color.RED);
		main.add(origen, BorderLayout.WEST);
		origen.setLayout(new BorderLayout(0, 0));
		
		JPanel origen__top = new JPanel();
		FlowLayout fl_origen__top = (FlowLayout) origen__top.getLayout();
		fl_origen__top.setVgap(50);
		fl_origen__top.setHgap(75);
		origen.add(origen__top, BorderLayout.NORTH);
		
		JLabel origen__topPadding = new JLabel("");
		origen__top.add(origen__topPadding);
		
		JPanel origen__bottom = new JPanel();
		FlowLayout flowLayout = (FlowLayout) origen__bottom.getLayout();
		flowLayout.setVgap(50);
		flowLayout.setHgap(75);
		origen.add(origen__bottom, BorderLayout.SOUTH);
		
		JLabel origen__bottomPadding = new JLabel("");
		origen__bottom.add(origen__bottomPadding);
		
		JPanel origen__contenido = new JPanel();
		origen.add(origen__contenido, BorderLayout.CENTER);
		origen__contenido.setLayout(new GridLayout(0, 1, 5, 15));
		
		JLabel labelMonedaOrigen = new JLabel("Moneda de Origen");
		labelMonedaOrigen.setHorizontalAlignment(SwingConstants.CENTER);
		origen__contenido.add(labelMonedaOrigen);
		
		comoboOrigen = new JComboBox();
		comoboOrigen.setModel(new DefaultComboBoxModel(new String[] {"Dolar", "Euro", "Peso Argentino", "Peso Colombiano", "Real Brasileno"}));
		origen__contenido.add(comoboOrigen);
		
		inputOrigen = new JTextField();
		origen__contenido.add(inputOrigen);
		inputOrigen.setColumns(10);
		
		JPanel destino = new JPanel();
		destino.setBackground(Color.BLUE);
		main.add(destino, BorderLayout.EAST);
		destino.setLayout(new BorderLayout(0, 0));
		
		JPanel destino__top = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) destino__top.getLayout();
		flowLayout_1.setVgap(50);
		flowLayout_1.setHgap(75);
		destino.add(destino__top, BorderLayout.NORTH);
		
		JLabel destino__topPadding = new JLabel("");
		destino__top.add(destino__topPadding);
		
		JPanel destino_bottom = new JPanel();
		FlowLayout flowLayout_2 = (FlowLayout) destino_bottom.getLayout();
		flowLayout_2.setVgap(50);
		flowLayout_2.setHgap(75);
		destino.add(destino_bottom, BorderLayout.SOUTH);
		
		JLabel destino__bottomPadding = new JLabel("");
		destino_bottom.add(destino__bottomPadding);
		
		JPanel destino__contenido = new JPanel();
		destino.add(destino__contenido, BorderLayout.CENTER);
		destino__contenido.setLayout(new GridLayout(0, 1, 0, 15));
		
		JLabel labelMonedaDestino = new JLabel("Moneda Destino");
		labelMonedaDestino.setHorizontalAlignment(SwingConstants.CENTER);
		destino__contenido.add(labelMonedaDestino);
		
		comboDestino = new JComboBox();
		comboDestino.setModel(new DefaultComboBoxModel(new String[] {"Dolar", "Euro", "Peso Argentino", "Peso Colombiano", "Real Brasileno"}));
		destino__contenido.add(comboDestino);
		
		inputDestino = new JTextField();
		inputDestino.setColumns(10);
		destino__contenido.add(inputDestino);
		
		JPanel section__boton = new JPanel();
		section__boton.setBackground(Color.GREEN);
		main.add(section__boton, BorderLayout.CENTER);
		section__boton.setLayout(new BorderLayout(0, 0));
		
		JButton boton__convertir = new JButton("Convertir");
		
		section__boton.add(boton__convertir);
		
		JPanel boton__topPadding = new JPanel();
		FlowLayout fl_boton__topPadding = (FlowLayout) boton__topPadding.getLayout();
		fl_boton__topPadding.setVgap(70);
		section__boton.add(boton__topPadding, BorderLayout.NORTH);
		
		JPanel boton__leftPadding = new JPanel();
		FlowLayout fl_boton__leftPadding = (FlowLayout) boton__leftPadding.getLayout();
		fl_boton__leftPadding.setHgap(75);
		section__boton.add(boton__leftPadding, BorderLayout.WEST);
		
		JPanel boton__bottomPadding = new JPanel();
		FlowLayout fl_boton__bottomPadding = (FlowLayout) boton__bottomPadding.getLayout();
		fl_boton__bottomPadding.setVgap(70);
		section__boton.add(boton__bottomPadding, BorderLayout.SOUTH);
		
		JPanel boton__rigthPadding = new JPanel();
		FlowLayout fl_boton__rigthPadding = (FlowLayout) boton__rigthPadding.getLayout();
		fl_boton__rigthPadding.setHgap(75);
		section__boton.add(boton__rigthPadding, BorderLayout.EAST);
		
		
		
		cargarMapa();
		
		
		boton__convertir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double cantidad;
				
				try {
					cantidad = Double.valueOf(inputOrigen.getText());
				}
				catch (Exception err){
					inputDestino.setText("ERROR");
					return;
				}
				
				if(comboDestino.getSelectedIndex() == comoboOrigen.getSelectedIndex()) {
					inputDestino.setText(Double.toString(1.00));
					return;
				}
				
				Moneda monedaOrigen = crearMoneda(comoboOrigen.getSelectedIndex());
				Moneda monedaDestino = crearMoneda(comboDestino.getSelectedIndex());
				
				
				inputDestino.setText(Double.toString(cantidad * monedaOrigen.toUSA() * monedaDestino.toLocal()));
				
			}

		});
		
	}

	private void cargarMapa() {
		
		for(int i=0; i < comoboOrigen.getComponents().length; i++) {
			listaMonedas.put(comoboOrigen.getItemAt(i).toString(), i);			
		}
		
	}

	protected Moneda crearMoneda(Integer tipo) {
		Moneda moneda = null;
		
		switch(tipo) {
		case 0: moneda = new Dolar(); break;
		case 1: moneda = new Euro(); break;
		case 2: moneda = new PesoArg(); break;
		case 3: moneda = new PesoCol(); break;
		case 4: moneda = new Real(); break;
		}
		
		return moneda;
	}


}
