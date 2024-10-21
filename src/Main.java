//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Eliana Camila Guevara Cubillos


        Figura circulo = new Circulo(5);
        Figura rectangulo = new Rectangulo(4, 7);
        Figura triangulo = new Triangulo(3, 4, 3, 4, 5);

        System.out.println("Área del Círculo: " + circulo.area());
        System.out.println("Perímetro del Círculo: " + circulo.perimetro());

        System.out.println("Área del Rectángulo: " + rectangulo.area());
        System.out.println("Perímetro del Rectángulo: " + rectangulo.perimetro());

        System.out.println("Área del Triángulo: " + triangulo.area());
        System.out.println("Perímetro del Triángulo: " + triangulo.perimetro());


    }
}