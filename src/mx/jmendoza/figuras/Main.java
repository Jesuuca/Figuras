package mx.jmendoza.figuras;

import java.util.*;

/**
 *
 * @author jesuuca
 */
public class Main {

    public static void main(String[] args) {
        
        Figura nombre = new Figura();
        
        System.out.println("..:Menú opciones:..\n1. Triangulo\n2. Rectangulo\n3. Circulo\n4. Cuadrado\n\n*Si requiere salir oprima cualquier tecla.*");
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca una opción: ");
        nombre.setNombreFigura(sc.nextInt());
        
        
        
        switch(nombre.getNombreFigura()) {
            case 1:
                Triangulo triangulo = new Triangulo(25, 15);
                System.out.println(triangulo.mostrarDimension());
                double areaTriangulo = triangulo.obtenerAreaTriangulo();
                System.out.println("El área del triangulo es " + areaTriangulo);
                break;
                
            case 2:
                Rectangulo rectangulo = new Rectangulo(8, 10);
                System.out.println(rectangulo.mostrarDimension());
                int areaRectangulo = rectangulo.obtenerAreaRectangulo();
                System.out.println("El área del rectangulo es " + areaRectangulo);
                break;
            
            case 3:
                Circulo circulo = new Circulo(8);
                System.out.println(circulo.mostrarDimension());
                int areaCirculo = circulo.obtenerAreaCirculo();
                System.out.println("El área del circulo es " + areaCirculo);
                break;
                
            case 4:
                Cuadrado cuadrado = new Cuadrado(8);
                System.out.println(cuadrado.mostrarDimension());
                int areaCuadrado = cuadrado.obtenerAreaCuadro();
                System.out.println("El área del cuadrado es " + areaCuadrado);                
                break;
                
            default:
                System.out.println("Adios...");
        }
        
    }
    
}
