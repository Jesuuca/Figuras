package mx.jmendoza.figuras;

/**
 *
 * @author jesuuca
 */
public class Circulo {
    private int radioCirculo;
    private int areaCirculo;
    private final double PI = 3.1416;
    
    public Circulo(int radioCirculo) {
        this.radioCirculo = radioCirculo;
    }
    
    /**
     * Método para obtener el área del circulo
     * 
     * @return 
     */
    int obtenerAreaCirculo() {
        this.areaCirculo = (int) (PI * (radioCirculo * radioCirculo));
        return this.areaCirculo;
    }
    
    String mostrarDimension() {
        return "El radio y el diametro del circulo es " + radioCirculo + " y " + radioCirculo * 2; 
    }

    public int getRadioCirculo() {
        return radioCirculo;
    }

    public void setRadioCirculo(int radioCirculo) {
        this.radioCirculo = radioCirculo;
    }

    public int getAreaCirculo() {
        return areaCirculo;
    }

    public void setAreaCirculo(int areaCirculo) {
        this.areaCirculo = areaCirculo;
    }
    
    
}
