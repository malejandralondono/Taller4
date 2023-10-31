package uniandes.dpoo.taller4.interfaz;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import uniandes.dpoo.taller4.modelo.Tablero;



public class VentanaPrincipal extends JFrame {
	
	private PanelTablero panelPPl;
	private PanelJugadas panelSur;
	private PanelConfig panelNorte;
	private PanelOptin panelderecha;
	private Tablero tablero;
	
	
	public VentanaPrincipal()
    {
        setSize( 750, 750 );
        setTitle( "Lights out" );
        setDefaultCloseOperation( EXIT_ON_CLOSE );
	
        setLayout( new BorderLayout( ) );
        
        
        panelNorte = new PanelConfig();
        add(panelNorte, BorderLayout.NORTH);
                
        panelderecha = new PanelOptin(this);
        add(panelderecha, BorderLayout.EAST);
        
        panelSur = new PanelJugadas(this);
        add(panelSur, BorderLayout.SOUTH);	
        
        
        correrTablero();
    }
	
	public void correrTablero() {
		
		if (panelPPl!=null) {
			remove(panelPPl);
		}
		
		int tamanioTablero= panelNorte.getTamanio();
        
        tablero= new Tablero(tamanioTablero);
        
        panelPPl = new PanelTablero( tablero.darTablero( ), this);
        add(panelPPl, BorderLayout.CENTER);
        
        desordenar();
        salvar_tablero();
        
	}
	
	public void jugar(int fila, int columna) {
		tablero.jugar(fila, columna);
	}
	
	public void desordenar() {
		int dif = panelNorte.getDificultad();
		tablero.desordenar(dif);
	}
	
	public void salvar_tablero() {
		tablero.salvar_tablero();
	}
	
	public int darJugadas() {
		if (tablero==null) {return 0;}
		else {
	 return	tablero.darJugadas();}
	}
	
	public boolean tableroIluminado() {
		return tablero.tableroIluminado();
	}
	
	public void reiniciar() {
		
		if (panelPPl!=null) {
			remove(panelPPl);
		}
		
		tablero.reiniciar();
		panelPPl = new PanelTablero( tablero.darTablero( ), this);
        add(panelPPl, BorderLayout.CENTER);
        
        salvar_tablero();

	}
	
	public static void main(String[] args)
    {
        VentanaPrincipal ventana = new VentanaPrincipal( );
        ventana.setLocationRelativeTo( null );
        ventana.setVisible( true );
    }
}