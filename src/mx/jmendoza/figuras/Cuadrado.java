package mx.jmendoza.figuras;

/**
 *
 * @author jesuuca
 */
public class Cuadrado {

    private int ladoCuadrado;
    private int areaCuadrado;
    
    public Cuadrado(int ladoCuadrado) {
        this.ladoCuadrado = ladoCuadrado;
    }
    
    int obtenerAreaCuadro() {
        this.areaCuadrado = ladoCuadrado * ladoCuadrado;
        return this.areaCuadrado;
    }
    
    String mostrarDimension() {
        return "El lado del cuadrado es " + ladoCuadrado; 
    }

    public int getLadoCuadrado() {
        return ladoCuadrado;
    }

    public void setLadoCuadrado(int ladoCuadrado) {
        this.ladoCuadrado = ladoCuadrado;
    }

    public int getAreaCuadrado() {
        return areaCuadrado;
    }

    public void setAreaCuadrado(int areaCuadrado) {
        this.areaCuadrado = areaCuadrado;
    }
    
    
    
}
