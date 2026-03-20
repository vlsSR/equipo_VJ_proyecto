import java.util.Scanner;

public class Main {
    private static Scanner tec;

    public static void main(String[] args) {
        System.out.println("Bienvenido al gestor de tareas");
        GestorTareas gestorTareas = new GestorTareas();
        tec = new Scanner(System.in);
        do {
            System.out.println("Elige una opcion");
            System.out.println("1. listar tareas");
            System.out.println("2. añadir tarea");
            System.out.println("3. completar una tarea");
            System.out.println("4. Salir");
            int opcion = leerInt("Introduce el numero");
            switch (opcion) {
                case 1:
                    gestorTareas.imprimirTareas();
                    break;
                case 2:
                    String descripcion = leerString("Introduce la descripcion de la tarea");
                    gestorTareas.agregarTarea(descripcion);
                    break;
                case 3:
                    int id = leerInt("Introduce el id");
                    gestorTareas.completarTarea(id);
                    break;
                case 4:
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }
            System.out.println();
            if (opcion == 4) break;
        } while (true);


    }

    public static int leerInt(String mensaje) {
        int num = -1;
        do {
            try {
                System.out.println(mensaje);
                num = Integer.parseInt(tec.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Introduce solo numeros");
            }
        } while (num < 0);
        return num;
    }

    public static String leerString(String mensaje) {
        System.out.println(mensaje);
        return tec.nextLine().trim();

    }
}
