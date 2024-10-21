public class Triangulo extends Figura{
    private double base;
    private double altura;
    private double la1;
    private double la2;
    private double la3;

    public Triangulo(double altura, double base, double la1, double la2, double la3) {
        this.altura = altura;
        this.base = base;
        this.la1 = la1;
        this.la2 = la2;
        this.la3 = la3;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getLa1() {
        return la1;
    }

    public void setLa1(double la1) {
        this.la1 = la1;
    }

    public double getLa2() {
        return la2;
    }

    public void setLa2(double la2) {
        this.la2 = la2;
    }

    public double getLa3() {
        return la3;
    }

    public void setLa3(double la3) {
        this.la3 = la3;
    }
    @Override
    public double area() {
        return (base * altura) / 2;
    }

    @Override
    public double perimetro() {
        return la1 + la2 + la3;
    }
}
