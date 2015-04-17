import java.awt.*;
import java.applet.*;
import java.util.*;

public class Ejercicio1 extends Applet {

        Font f;

        public void init() {
                f = new Font("Serif", Font.BOLD, 20);
                setFont(f);
                setBackground(Color.BLACK);
        }

        public void paint(Graphics g) {
                double fin = Math.PI * 2;
                int n = 200;
                double incremento = fin / n;
                int x = getWidth() / 2;
                int y = getHeight() / 2;
                int r = 200;
                Random ale = new Random();
                double i = 0;
                while (i < fin) {
                        Color c = new Color((int) (ale.nextFloat() * 255), (int) (ale.nextFloat() * 255), (int) (ale.nextFloat() * 255));
                        g.setColor(c);
                        int fx = (int) Math.round(r * Math.cos(i) + x);
                        int fy = (int) Math.round(r * Math.sin(i) + y);
                        g.drawLine(x, y, fx, fy);
                        i = i + incremento;
                        try {
                                Thread.sleep(10);
                        } catch (InterruptedException e) {
                        }
                }
                g.setColor(Color.YELLOW);
                g.drawString("Autor: Juan Bernardo Aldonza Ibáñez", 10, 20);
        }
}