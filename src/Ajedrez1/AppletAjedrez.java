package Ajedrez1;

import java.applet.Applet;
import java.awt.*;

public class AppletAjedrez extends Applet {
        Button b1, b2, b3;
        Label lab1;
        TextField texto;
        TextField texto2;
	Tablero t;
	int margen=40;
	
	private Image imagenDB;
	private Graphics gDB;
	
	@Override
	public void init() {
		setBackground(Color.GREEN);
		t=new Tablero(this);
                
                b1= new Button("Boton 1");
                b1.setForeground(Color.RED);
                b1.setBackground(Color.CYAN);
                add(b1);
                b2= new Button("Boton 2");
                b2.setForeground(Color.RED);
                b2.setBackground(Color.CYAN);
                add(b2);
                b3= new Button("Boton 3");
                b3.setForeground(Color.RED);
                b3.setBackground(Color.CYAN);
                add(b3);
                
                lab1= new Label();
                lab1.setText("Etiqueta1");
                lab1.setAlignment(Label.CENTER);
                add(lab1);
                
                texto=new TextField("Usuario");
                texto.setText("Usuario");
                add(texto);
                
                texto2= new TextField("Contraseña");
                texto2.setEchoChar('*');
                add(texto2);
	}

	@Override
	public void start() {
		
	}

	@Override
	public void stop() {
		
	}

	@Override
	public void destroy() {
		
	}

	

	@Override
	public void paint(Graphics g) {
		t.pintar_tablero(g);
	}

	@Override
	public void update(Graphics g) {
		if (imagenDB == null) {
			imagenDB = createImage(getWidth(), getHeight());
			gDB = imagenDB.getGraphics();
		}
		gDB.setColor(getBackground());
		gDB.fillRect(0, 0, getWidth(), getHeight());
		gDB.setColor(getForeground());
		paint(gDB);
		g.drawImage(imagenDB, 0, 0, this);
	}
}
