import java.util.Scanner;

public class PrincipalSistemaUTA {

    public static void main(String[] args) {

        Scanner tecladoUTA = new Scanner(System.in);

        RegistroUniversitarioABB gestorArbolUTA = new RegistroUniversitarioABB();

        int opcionMenu;

        do {

            System.out.println("\n========= MENU =========");
            System.out.println("1. Insertar estudiante");
            System.out.println("2. Buscar estudiante");
            System.out.println("3. Eliminar estudiante");
            System.out.println("4. Recorrido Inorden");
            System.out.println("5. Recorrido Preorden");
            System.out.println("6. Recorrido Postorden");
            System.out.println("7. Recorrido BFS");
            System.out.println("8. Contar estudiantes");
            System.out.println("9. Calcular altura");
            System.out.println("10. Mayor nota");
            System.out.println("11. Menor nota");
            System.out.println("12. Mostrar aprobados");
            System.out.println("13. Mostrar reprobados");
            System.out.println("14. Salir");

            System.out.print("Seleccione opcion: ");
            opcionMenu = tecladoUTA.nextInt();
            tecladoUTA.nextLine();

            switch (opcionMenu) {

                case 1:

                    System.out.print("Cedula: ");
                    String cedula = tecladoUTA.nextLine();

                    System.out.print("Apellidos: ");
                    String apellidos = tecladoUTA.nextLine();

                    System.out.print("Nombres: ");
                    String nombres = tecladoUTA.nextLine();

                    System.out.print("Nota final: ");
                    double nota = tecladoUTA.nextDouble();

                    System.out.print("Nivel: ");
                    int nivel = tecladoUTA.nextInt();
                    tecladoUTA.nextLine();

                    System.out.print("Carrera: ");
                    String carrera = tecladoUTA.nextLine();

                    NodoAcademico nuevo = new NodoAcademico(
                            cedula,
                            apellidos,
                            nombres,
                            nota,
                            carrera,
                            nivel
                    );

                    gestorArbolUTA.insertarEstudiante(nuevo);

                    System.out.println("Estudiante insertado correctamente");
                    break;

                case 2:

                    System.out.print("Cedula a buscar: ");
                    String buscar = tecladoUTA.nextLine();

                    NodoAcademico encontrado = gestorArbolUTA.buscarEstudiante(buscar);

                    if (encontrado != null) {

                        encontrado.mostrarFicha();

                    } else {

                        System.out.println("No encontrado");
                    }

                    break;

                case 3:

                    System.out.print("Cedula a eliminar: ");
                    String eliminar = tecladoUTA.nextLine();

                    gestorArbolUTA.eliminarEstudiante(eliminar);

                    System.out.println("Registro eliminado");
                    break;

                case 4:
                    gestorArbolUTA.recorridoInorden();
                    break;

                case 5:
                    gestorArbolUTA.recorridoPreorden();
                    break;

                case 6:
                    gestorArbolUTA.recorridoPostorden();
                    break;

                case 7:
                    gestorArbolUTA.recorridoPorNiveles();
                    break;

                case 8:
                    System.out.println("Total estudiantes: "
                            + gestorArbolUTA.contarNodos());
                    break;

                case 9:
                    System.out.println("Altura del arbol: "
                            + gestorArbolUTA.calcularAltura());
                    break;

                case 10:
                    gestorArbolUTA.buscarNotaMayor();
                    break;

                case 11:
                    gestorArbolUTA.buscarNotaMenor();
                    break;

                case 12:
                    gestorArbolUTA.mostrarAprobados();
                    break;

                case 13:
                    gestorArbolUTA.mostrarReprobados();
                    break;

                case 14:
                    System.out.println("Sistema finalizado");
                    break;

                default:
                    System.out.println("Opcion invalida");
            }

        } while (opcionMenu != 14);
    }
}