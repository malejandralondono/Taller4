package uniandes.dpoo.taller4.interfaz;


import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelOptin extends JPanel implements ActionListener {
	
	private JButton[] botones;
	
    private VentanaPrincipal principal;

	
	public PanelOptin(VentanaPrincipal pPrincipal) {
		
    principal=pPrincipal;

		
    setLayout( new GridLayout( 9,1) );
    setBackground(new java.awt.Color(200,201,255));
    
    botones = new JButton[4];
    
    add(new JLabel( ));
    botones[0]= new JButton("NUEVO");
    botones[0].setBackground(new java.awt.Color(205,184,255));
    add(botones[0]);
    (botones[0]).addActionListener(this);
    (botones[0]).setActionCommand( "NUEVO" );
    
    add(new JLabel( ));
    botones[1]= new JButton("REINICIAR");
    botones[1].setBackground(new java.awt.Color(205,184,255));
    add(botones[1]);
    (botones[1]).addActionListener(this);
    (botones[1]).setActionCommand( "REINICIAR" );

    
    add(new JLabel( ));
    botones[2]= new JButton("TOP 10");
    botones[2].setBackground(new java.awt.Color(205,184,255));
    add(botones[2]);
    (botones[2]).addActionListener(this);
    (botones[2]).setActionCommand( "TOP" );

    
    add(new JLabel( ));
    botones[3]= new JButton("CAMBIAR JUGADOR");
    botones[3].setBackground(new java.awt.Color(205,184,255));
    add(botones[3]);
    (botones[3]).addActionListener(this);
    (botones[1]).setActionCommand( "JUGADOR" );

    
    add(new JLabel( ));
    
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand( ).equals( "NUEVO" ))
        {
			principal.correrTablero();
        }
		else if(e.getActionCommand( ).equals( "REINICIAR" ))
        {
            principal.reiniciar();
		}
		else if (e.getActionCommand( ).equals( "TOP" ))
        {

		}
	}
}
