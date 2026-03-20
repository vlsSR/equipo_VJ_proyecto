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
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }
            System.out.println();
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
