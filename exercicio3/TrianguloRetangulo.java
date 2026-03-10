package exercicio3;

public class TrianguloRetangulo implements Poligono{
    private double catetoa;
    private double catetoB;
    private double hipotenusa;
    
    public TrianguloRetangulo(double catetoa, double catetoB, double hipotenusa) {
        this.catetoa = catetoa;
        this.catetoB = catetoB;
        this.hipotenusa = Math.sqrt((catetoa*catetoa)+ (catetoB*catetoB));
    }

    public double getCatetoa() {
        return catetoa;
    }
    public void setCatetoa(double catetoa) {
        this.catetoa = catetoa;
    }
     public double getCatetoB() {
        return catetoB;
    }
    public void setCatetoB(double catetoB) {
        this.catetoB = catetoB;
    }
     public double getHipotenusa() {
        return hipotenusa;
    }
    public void setHipotenusa(double hipotenusa) {
        this.hipotenusa = hipotenusa;
    }
    

    @Override
    public double calcularArea() {
       return catetoa+catetoB/2;
    }

    @Override
    public double calcularPerimetro() {
        return catetoa+catetoB+hipotenusa;
    }

}
