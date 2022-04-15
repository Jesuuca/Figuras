package mx.jmendoza.figuras;

/**
 *
 * @author Jesus del C. Mendoza M.
 */
public class Rectangulo extends Triangulo{ 
    
    private int areaRectangulo;
    
    /**
     * Constructor que llama al contructor de la clase padre Triangulo
     */
    public Rectangulo() {
        super();
    }
    
    public Rectangulo(int base, int altura) {
        super(base, altura);
    }
    
    
    /**
     * Método para obtener el área del rectangulo
     * 
     * @return 
     */
    int obtenerAreaRectangulo() {
        this.areaRectangulo = getBase() * getAltura();
        return this.areaRectangulo;
    }
    
}
