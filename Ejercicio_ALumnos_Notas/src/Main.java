import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);

    Sistema[] estudiantes = new Sistema[10];

    for (int i = 0; i < estudiantes.length; i++) {
      System.out.println("\nIngrese los datos del estudiante #" + (i + 1));

      System.out.print("Ingrese el CI del estudiante: ");
      int ci = leer.nextInt();
      leer.nextLine(); 


      Sistema estudiante = new Sistema(ci);

      ingresarDatosPersonales(estudiante, leer);

      System.out.println("---");

      ingresarDatosMateria(estudiante, leer);


      estudiantes[i] = estudiante;

      double promedio = estudiante.calcularPromedio();
      System.out.println("El promedio del estudiante #" + (i + 1) + " es: " + promedio);
    }
  }

  private static void ingresarDatosPersonales(Sistema estudiante, Scanner leer) {
    System.out.print("Ingrese los nombres del estudiante: ");
    String nombres = leer.nextLine();
    estudiante.setNombres(nombres);

    System.out.print("Ingrese los apellidos del estudiante: ");
    String apellidos = leer.nextLine();
    estudiante.setApellidos(apellidos);
  }

  private static void ingresarDatosMateria(Sistema estudiante, Scanner leer) {
    System.out.print("Ingrese la Materia: ");
    String materia = leer.nextLine();
    estudiante.setMateria(materia);

    System.out.print("Ingrese la nota 1: ");
    double nota1 = leer.nextDouble();
    estudiante.setNota1(nota1);

    System.out.print("Ingrese la nota 2: ");
    double nota2 = leer.nextDouble();
    estudiante.setNota2(nota2);
  }
}