import java.util.ArrayList;

public class GestorTareas {

        ArrayList<Tarea> tareas;

    public GestorTareas() {
            this.tareas = new ArrayList<Tarea>();
        }

    public void agregarTarea(String descripcion) {
        tareas.add(new Tarea(tareas.size(), descripcion));
    }

    public void imprimirTareas() {
        for(Tarea tarea : tareas) {
            System.out.println(tarea);
        }
    }


}
