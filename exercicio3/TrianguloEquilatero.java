package exercicio3;

public class TrianguloEquilatero implements Poligono {
    private double lado;
    

    public TrianguloEquilatero(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularPerimetro() {
        return 3*lado;
       
    }

    @Override
    public double calcularArea() {
        return lado*lado/2;
       
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
}
