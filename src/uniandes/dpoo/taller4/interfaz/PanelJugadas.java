package uniandes.dpoo.taller4.interfaz;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelJugadas extends JPanel{
	
	private VentanaPrincipal principal;
	
	public PanelJugadas(VentanaPrincipal pPrincipal) {
		
	principal=pPrincipal;	
		
	setLayout( new GridLayout( 1, 4) );
    setBackground(new java.awt.Color(200,201,255));

    
	 add(new JLabel("Jugadas"));
	 int mm = principal.darJugadas();
	 String hm = String.valueOf(mm);
	 add(new JLabel(hm));
	 add(new JLabel("Jugador" ));
	 add(new JLabel( ));
	}

}
