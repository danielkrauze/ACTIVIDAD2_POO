/*
* Esta clase define objetos de tipo Rectángulo con una base y una
* altura como atributos.
 */
package Parte2;

/**
 * @author daniel_krauze
 */
public class Rectangulo {
    
    //Atributos que definen la base y la altura del rectángulo:
    int base, altura;
    
    //Constructor de la clase rectangulo:
    Rectangulo(int base, int altura){
        
        //Definimos parámetro base del rectángulo:
        this.base = base;
        
        //Definimos parámetro altura del rectángulo:
        this.altura = altura;
    }
    
    // Método que calcula y devuelve el área de un rectángulo como la
    // multiplicación de la base por la altura.
    double calcularArea(){
        return base*altura;
    }
    
    //Método que calcula y devuelve el perímetro de un rectángulo
    double calcularPerimetro(){
        return (2*base)+(2*altura);
    }
}
