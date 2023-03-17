/*
 * Esta clase define objetos de tipo Triángulo Rectángulo con una
 * base y una altura como atributos.
 */
package Parte2;
import javax.swing.JOptionPane;

/**
 * @author daniel_krauze
 */
public class TrianguloRectangulo {
    
    //Atributos que definen la base y altura del triángulo:
    int base, altura; 
    String caracterizacion, equilatero, escaleno, isosceles;
    
    //Constructor de la clase de TriánguloRectangulo:
    public TrianguloRectangulo(int base, int altura){
        
        //Definir el parámetro de la base:
        this.base = base;
        
        //Definir el parámetro de la altura:
        this.altura = altura;
    }
    
    //Método para calcular el área de un triángulo:
    double calcularArea(){
        return (base*altura)/2;
    }
    
    //Método para calcular el perímetro de un triángulo:
    double calcularPerimetro(){
        return (base + altura + calcularHipotenusa());
    }
    
    //Método para calcular la hipotenusa de un triángulo:
    double calcularHipotenusa(){
        return Math.pow((base*base + altura*altura), 0.5);
    }
    
    //Método para determinar el tipo de triángulo de acuerdo a sus lados:
    void caracterizarTriangulo(){
        if ((base == altura) && (base == calcularHipotenusa() && (altura == calcularHipotenusa())))
           JOptionPane.showMessageDialog(null, "Es un triángulo equilátero.");
        else if ((base != altura) && (base != calcularHipotenusa()) && (altura != calcularHipotenusa()))
           JOptionPane.showMessageDialog(null, "El triángulo es escaleno.");
        else
           JOptionPane.showMessageDialog(null, "Es un triángulo isósceles.");
    }

}

