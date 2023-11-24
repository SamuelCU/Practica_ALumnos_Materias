import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);

    // Crear un array para almacenar los objetos Sistema
    Sistema[] estudiantes = new Sistema[5];

    for (int i = 0; i < estudiantes.length; i++) {
      System.out.println("\nIngrese los datos del estudiante #" + (i + 1));

      System.out.print("Ingrese el CI del estudiante: ");
      int ci = leer.nextInt();
      leer.nextLine(); // Consumir el salto de línea

      // Crear un objeto Sistema para el estudiante actual
      Sistema estudiante = new Sistema(ci);

      System.out.print("Ingrese los nombres del estudiante: ");
      String nombres = leer.nextLine();
      estudiante.setNombres(nombres);

      System.out.print("Ingrese los apellidos del estudiante: ");
      String apellidos = leer.nextLine();
      estudiante.setApellidos(apellidos);

      System.out.println("---");

      System.out.print("Ingrese la Materia: ");
      String materia = leer.nextLine();
      estudiante.setMateria(materia);

      System.out.print("Ingrese la nota 1: ");
      int nota1 = leer.nextInt();
      estudiante.setNota1(nota1);

      System.out.print("Ingrese la nota 2: ");
      int nota2 = leer.nextInt();
      estudiante.setNota2(nota2);

      // Almacenar el objeto Sistema en el array
      estudiantes[i] = estudiante;

      double promedio = estudiante.calcularPromedio();
      System.out.println("El promedio del estudiante #" + (i + 1) + " es: " + promedio);
    }
  }
}