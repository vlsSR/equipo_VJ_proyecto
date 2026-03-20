import java.util.ArrayList;

public class GestorTareas {

        ArrayList<Tarea> tareas;

    public GestorTareas() {
            this.tareas = new ArrayList<Tarea>();
        }

    public void agregarTarea(String descripcion) {
        tareas.add(new Tarea(tareas.size(), descripcion));
    }

    public void imprimirTareas(ArrayList<Tarea> tareas) {
        for(Tarea tarea : tareas) {
            System.out.println(tarea);
        }
    }

    public void completarTarea(int id) {
        for(Tarea tarea : tareas) {
            if(id==tarea.getId()) {
                tarea.setCompletada(true);
                return;
            }
        }
        System.out.println("Tarea no encontrada");
    }
}
