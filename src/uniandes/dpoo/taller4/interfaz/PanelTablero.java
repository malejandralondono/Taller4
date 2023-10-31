package uniandes.dpoo.taller4.interfaz;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Rectangle2D;

import javax.swing.JLabel;
import javax.swing.JPanel;





public class PanelTablero extends JPanel implements MouseListener {
	
	
	private boolean[][] tablero;
    private VentanaPrincipal principal;

    
    public PanelTablero( boolean[][] tableroP, VentanaPrincipal pPrincipal)
    {
        principal=pPrincipal;
        tablero= tableroP;
        add(new JLabel(""));
        addMouseListener( this );
    }
	

    
    
    public void paint(Graphics g)
    {
    	Graphics2D g2d = (Graphics2D) g;
        int ancho= getWidth( );
        int alto= getHeight( );
        int anchoRect= ancho/tablero.length;
        int altoRect= alto/tablero.length;
        for( int i = 0; i < tablero.length; i++ )
        {
            for( int j = 0; j < tablero.length; j++ )
            {
                Rectangle2D.Double rect= new Rectangle2D.Double( i*anchoRect , j*altoRect, anchoRect, altoRect );
                if(tablero[i][j]==true)
                {
                    g.setColor( new Color(255,249,118));
                }
                else
                {
                    g.setColor(new Color(32,32,32));
                }
                g2d.fill(rect);
                g.setColor( new Color(32,32,32));
                g2d.draw( rect );
            }
        }   
    }
    
    private int[] convertirCoordenadasACasilla(int x, int y)
    {
    int ladoTablero = tablero.length;
    int altoPanelTablero = getHeight();
    int anchoPanelTablero = getWidth();
    int altoCasilla = altoPanelTablero/ladoTablero;
    int anchoCasilla = anchoPanelTablero / ladoTablero;
    int columna = (int) (y / altoCasilla);
    int fila = (int) (x / anchoCasilla);
    return new int[] { fila, columna };
    }

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
		 int click_x = e.getX();
		    int click_y = e.getY();
		    int[] casilla = convertirCoordenadasACasilla(click_x, click_y);
		    
		    principal.jugar(casilla[0], casilla[1]);
		
		    repaint();
		}
	
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}