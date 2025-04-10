import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre_estudiante = sc.nextLine();
        System.out.println("Ingrese el documento del estudiante");
        String documento_estudiante = sc.nextLine();
        System.out.println("Seleccione el programa: \n1- Desarrolo de Software\n2- Diseño Grafico\n3- Gastronomia");
        String programa = sc.nextLine();
        switch (programa){
            case "1":
                System.out.println("Programa de desarrollo de software");
                System.out.println("Seleccione la materia: \n1- Logica de programación\n2- Metodologias agiles\n3- Introducción a la programación");
                String materia = sc.nextLine();
                switch (materia){
                    case "1":
                        System.out.println("Nota de logica de programación");
                        break;
                    case "2":
                        System.out.println("Nota de Metodologias agiles");
                        break;
                    case "3":
                        System.out.println("Nota de Introducción a la programación");
                        break;
                }
                break;
            case "2":
                System.out.println("Programa de diseño grafico");
                break;
            case "3":
                System.out.println("Programa de gastronomia");
                break;
        }
    }
}