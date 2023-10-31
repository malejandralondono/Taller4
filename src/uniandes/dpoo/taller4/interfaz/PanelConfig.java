package uniandes.dpoo.taller4.interfaz;


import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.*;

public class PanelConfig extends JPanel implements ItemListener, ChangeListener{
	
	private JComboBox<String> tamanio;
	private JRadioButton radio1,radio2,radio3;
	private ButtonGroup dificultad;
	
	private int t;
	private int d;
	
	public PanelConfig() {
		
		t= 5;
		d= 2;
		
		
	    setLayout( new GridLayout(1,9));
	    setBackground(new java.awt.Color(200,201,255));

	    
	    tamanio = new JComboBox<String>();
	    tamanio.setBackground(new java.awt.Color(205,184,255));
		    tamanio.addItem("5x5");
		    tamanio.addItem("7x7");
		    tamanio.addItem("9x9");
		tamanio.addItemListener(this);
	    
	    dificultad = new ButtonGroup();
		    radio1 =new JRadioButton("Fácil");
		    radio1.setBackground(new java.awt.Color(200,201,255));
		    dificultad.add(radio1);
	    
		    radio2 =new JRadioButton("Medio");
		    radio2.setBackground(new java.awt.Color(200,201,255));
		    dificultad.add(radio2);
		    
		    radio3 =new JRadioButton("Difícil");
		    radio3.setBackground(new java.awt.Color(200,201,255));
		    dificultad.add(radio3);
	    
	    
	    
	    add(new JLabel( ));
	    
	    add(new JLabel("Tamaño:"));
	    add(tamanio);
	    
	    add(new JLabel( ));
	    
	    add(new JLabel("Dificultad:"));
	    add(radio1);
	    radio1.addChangeListener(this);
	    add(radio2);
	    radio2.addChangeListener(this);
	    add(radio3);
	    radio3.addChangeListener(this);

	    
	    add(new JLabel( ));
	}
	
	public int getTamanio() 
	{
		return t;
	}
	
	public void  setTamanio(int value) 
	{
		this.t= value;
	}
	
	public int getDificultad() 
	{
		return d;
	}
	
	public void  setDificultad(int value) 
	{
		this.d= value;
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if (e.getSource()==tamanio){
			
			String numero = tamanio.getSelectedItem().toString();
			int ta= 1;
			
			if (numero.equals("5x5")) {
				ta= 5;
			}
			else if (numero.equals("7x7")) {
				ta= 7;
			}
			
			else if (numero.equals("9x9")) {
				ta= 9;
			}
			setTamanio(ta);
		}
		
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		
		int di = 0;
		if (radio1.isSelected()) {
			di=2;
			setDificultad(di);}
        if (radio2.isSelected()) {
        	di=3;
        	setDificultad(di);}
        if (radio3.isSelected()) {
            di=5;
            setDificultad(di);}
        

        }    
	}