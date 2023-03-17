/*
 Esta clase prueba diferentes acciones realizadas en diversas figuras
 geométricas.
 */
package Parte2;
import javax.swing.JOptionPane;
/**
 * @author daniel_krauze
 */
public class PruebaFiguras {
    
    public static void main(String args[]){
        Circulo figura1 = new Circulo(2);
        Rectangulo figura2 = new Rectangulo(1,2);
        Cuadrado figura3 = new Cuadrado(3);
        TrianguloRectangulo figura4 = new TrianguloRectangulo(3,5);
        Rombo figura5 = new Rombo(5,4);
        Trapecio figura6 = new Trapecio(8,6,4);
        
        //Mostramos en pantalla los resultados para el círculo:
        JOptionPane.showMessageDialog(null, "El área del círculo es = "+figura1.calcularArea()+".\nEl perímetro del círculo es = "+figura1.calcularPerimetro());
        
        //Mostramos en pantalla los resultados para el rectángulo:
        JOptionPane.showMessageDialog(null, "El área del rectángulo es = "+figura2.calcularArea()+".\nEl perímetro del rectángulo es = "+figura2.calcularPerimetro());
        
        //Mostramos en pantalla los resultados para el cuadrado:
        JOptionPane.showMessageDialog(null, "El área del cuadrado es = "+figura3.calcularArea()+".\nEl perímetro del cuadrado es = "+figura3.calcularPerimetro());
        
        //Mostramos en pantalla los resultados para el triangulo:
        JOptionPane.showMessageDialog(null, "El área del triangulo es = "+figura4.calcularArea()+".\nEl perímetro del triangulo es = "+figura4.calcularPerimetro());
        figura4.caracterizarTriangulo();
        //figura4.caracterizarTriangulo();
        
        //Mostramos en pantalla los resultados para el rombo:
        JOptionPane.showMessageDialog(null, "El área del rombo es = "+figura5.calcularArea()+".\nEl perímetro del rombo es = "+figura5.calcularPerimetro());
        
        //Mostramos en pantalla los resultados para el trapecio:
        JOptionPane.showMessageDialog(null, "El área del trapecio es = "+figura6.calcularArea()+".\nEl perímetro del trapecio es = "+figura6.calcularPerimetro());
        
    }
}
