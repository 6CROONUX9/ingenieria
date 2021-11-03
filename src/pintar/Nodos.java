/* UNIVERSIDAD DE PAMPLONA
    Ingeniería de Sistemas - Matemáticas discretas: Grafos
    M.Sc. Luis Armando Portilla Granados
    Abril 24 de 2018
*/

package pintar;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Mariana
 */
public class Nodos {
    private int x;
    private int y; 
    private String nombre;
    static final int d = 20; //diámetro del círculo

    public Nodos(int x, int y, int i) {
        this.x = x;
        this.y = y;
        this.nombre = Character.toString((char)(65+i)); //+" "+ Integer.toString(x) + "," + Integer.toString(y);
        
    }
    public void pintarNodo (Graphics g){
        g.setColor(Color.pink);
        g.fillOval(this.getX() - getD()/2, this.getY() - getD()/2, getD(), getD()); // relleno del círculo
        g.setColor(Color.BLACK);
        g.drawOval(this.getX() - getD()/2, this.getY() - getD()/2, getD(), getD()); // *** contorno del círculo
        //drawOval(int x, int y, int width, int height)
        //La esquina superior izquierda esta en (x,y), y se especifica la anchura (width) y la altura (height)
        //Si la anchura y la altura son iguales, se dibuja la circunferencia.
        g.setColor(Color.blue);
        g.drawString(this.getNombre(), this.getX() - getD()/2, this.getY() - getD()/2); // *** nombre del vértice
        //drawString(String str, int x, int y)
        //Dibuja la string str, empieza en el punto (x,y). x define la posición de la izquierda de la String. y define la altura para la línea base 
    }

    /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return the d
     */
    public static int getD() {
        return d;
    }
    
}
