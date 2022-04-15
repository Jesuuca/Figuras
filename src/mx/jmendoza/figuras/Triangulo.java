package mx.jmendoza.figuras;

/**
 *
 * @author Jesus del C. Mendoza M.
 */
public class Triangulo {
    
    private int base;
    private int altura;
    private int areaTriangulo;
    
    public Triangulo() {
        
    }
    
    
    /**
     * Constructor de la clase Triangulo
     * 
     * @param base
     * @param altura 
     */
    public Triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    
    /**
     * Método para obttener el área del triangulo
     * 
     * @return 
     */
    double obtenerAreaTriangulo() {
        return this.base*this.altura/2;
    }
    
    /**
     * Método para mostrar la dimension del triangulo y del rectangulo
     * 
     * @return 
     */
    String mostrarDimension() {
        return "La base y la altura es: " + base + " y " + altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getAreaTriangulo() {
        return areaTriangulo;
    }

    public void setAreaTriangulo(int areaTriangulo) {
        this.areaTriangulo = areaTriangulo;
    }
    
}
