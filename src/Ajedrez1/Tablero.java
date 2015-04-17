package Ajedrez1;

import java.awt.Graphics;

public class Tablero {

	private final int N = 8;
	Casilla casillas[][];
	AppletAjedrez applet;
	private int margen;
	int tamaño;

	Tablero(AppletAjedrez applet) {
		this.applet = applet;
		casillas = new Casilla[N][N];
		margen=applet.margen;
		tamaño = (menor(applet.getWidth(), applet.getHeight()) - margen * 2) / N;
		crear_casillas();
	}

	void crear_casillas() {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				casillas[i][j] = new Casilla(i, j);
			}
		}
	}

	int menor(int x, int y) {
		if (x < y) {
			return x;
		} else {
			return y;
		}
	}

	void pintar_tablero(Graphics g) {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				g.setColor(casillas[i][j].c);
				g.fillRect(margen+i*tamaño, margen+j*tamaño,tamaño,tamaño);
			}
		}
	}
}
