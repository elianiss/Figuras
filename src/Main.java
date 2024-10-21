import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Eliana Camila Guevara Cubillos

        Scanner entrada = new Scanner(System.in);
        int op;

        do {
            System.out.println("\n=== Menú de Figuras ===");
            System.out.println("1. Crear Círculo");
            System.out.println("2. Crear Rectángulo");
            System.out.println("3. Crear Triángulo");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            op = entrada.nextInt();

            switch (op) {
                case 1:

                    System.out.print("Ingrese el radio del círculo: ");
                    double radio = entrada.nextDouble();
                    Circulo circulo = new Circulo(radio);
                    System.out.println("Área del Círculo: " + circulo.area());
                    System.out.println("Perímetro del Círculo: " + circulo.perimetro());
                    break;

                case 2:

                    System.out.print("Ingrese el ancho del rectángulo: ");
                    double ancho = entrada.nextDouble();
                    System.out.print("Ingrese el largo del rectángulo: ");
                    double largo = entrada.nextDouble();
                    Rectangulo rectangulo = new Rectangulo(ancho, largo);
                    System.out.println("Área del Rectángulo: " + rectangulo.area());
                    System.out.println("Perímetro del Rectángulo: " + rectangulo.perimetro());
                    break;

                case 3:

                    System.out.print("Ingrese la base del triángulo: ");
                    double base = entrada.nextDouble();
                    System.out.print("Ingrese la altura del triángulo: ");
                    double altura = entrada.nextDouble();
                    System.out.print("Ingrese el lado 1 del triángulo: ");
                    double la1 = entrada.nextDouble();
                    System.out.print("Ingrese el lado 2 del triángulo: ");
                    double la2 = entrada.nextDouble();
                    System.out.print("Ingrese el lado 3 del triángulo: ");
                    double la3 = entrada.nextDouble();
                    Triangulo triangulo = new Triangulo(altura, base, la1, la2, la3);
                    System.out.println("Área del Triángulo: " + triangulo.area());
                    System.out.println("Perímetro del Triángulo: " + triangulo.perimetro());
                    break;

                case 4:

                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (op != 4);

        entrada.close();
    }

}