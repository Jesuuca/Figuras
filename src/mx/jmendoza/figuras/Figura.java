package mx.jmendoza.figuras;

/**
 *
 * @author Jesus del C. Mendoza M.
 */
public class Figura {
    
    private int nombreFigura;

    public int getNombreFigura() {
        return nombreFigura;
    }

    public void setNombreFigura(int nombreFigura) {
        this.nombreFigura = nombreFigura;
    }

    @Override
    public String toString() {
        return "nombre de Figura: " + nombreFigura;
    }
    
    
    
}
