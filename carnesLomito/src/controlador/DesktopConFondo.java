
package controlador;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
        
public class DesktopConFondo extends JDesktopPane{
    private Image imagen;

    public DesktopConFondo() {
        imagen = new ImageIcon(getClass().getResource("/img/fondoAc.jpg")).getImage(); // Ruta de la imagen.
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
        int alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
        g.drawImage(imagen, 0, 0,  ancho, (alto - 110), this); // Ajustar la imagen al tamaño del panel.
    }
}
