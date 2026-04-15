import java.util.*;

public class App {

    // Esta será nuestra base de datos
    static List<Estudiante> estudiantes = new ArrayList<>();
    static List<Curso> cursos = new ArrayList<>();
    static List<Registro> registros = new ArrayList<>();
    static List<Profesor> profesores = new ArrayList<>();

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        int opcion;
        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    registrarEstudiante();
                    break;
                case 2:
                    crearCurso();
                    break;
                case 3:
                    crearProfesor();
                    break;
                case 4:
                    asignarProfesor();
                    break;
                case 5:
                    matricularEstudiante();
                    break;
                case 6:
                    agregarLeccionACurso();
                    break;
                case 7:
                    agregarVideoALeccion();
                    break;
                case 8:
                    mostrarSistema();
                    break;
                case 9:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");    
                    
            }
        } while (opcion != 9);
    }

    private static void mostrarMenu() {
        System.out.println("1. Agregar Estudiante");
        System.out.println("2. Crear Curso");
        System.out.println("3. Crear Profesor");
        System.out.println("4. Asignar Profesor a Curso");
        System.out.println("5. Matricular Estudiante");
        System.out.println("6. Agregar Lección al Curso");
        System.out.println("7. Agregar Video a la Lección");
        System.out.println("8. Mostrar Sistema");
        System.out.println("9. Salir");
        System.out.print("Seleccione una opción: ");
    }


    private static void registrarEstudiante() {
        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese el ID del estudiante: ");
        Long id = scanner.nextLong();
        estudiantes.add(new Estudiante(id, nombre));
        System.out.println("Estudiante registrado exitosamente.");
    }

    private static void crearCurso() {
        System.out.print("Ingrese el nombre del curso: ");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese el ID del curso: ");
        Long id = scanner.nextLong();
        cursos.add(new Curso(id, nombre));
        System.out.println("Curso creado exitosamente.");
    }

    private static void crearProfesor() {
        System.out.print("Ingrese el nombre del profesor: ");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese el ID del profesor: ");
        Long id = scanner.nextLong();
        profesores.add(new Profesor(id, nombre));
        System.out.println("Profesor creado exitosamente.");
    }

    private static void asignarProfesor() {
        Curso curso = seleccionarCurso();
        Profesor profesor = seleccionarProfesor();
        if (curso != null && profesor != null) {
            curso.asignarProfesor(profesor);
            System.out.println("Profesor asignado al curso exitosamente.");
        } else {
            System.out.println("Curso o profesor no encontrado.");
        }
    }

    private static void matricularEstudiante() {
        Curso curso = seleccionarCurso();
        Estudiante estudiante = seleccionarEstudiante();
        if (curso != null && estudiante != null) {
            Registro registro = new Registro((long)(registros.size() + 1),estudiante, curso);
            curso.agregarRegistro(registro);
            registros.add(registro);
            estudiante.agregarRegistro(registro);
            System.out.println("Estudiante matriculado en el curso exitosamente.");
        } else {
            System.out.println("Curso o estudiante no encontrado.");
        }
    }

    private static void agregarLeccionACurso() {
        Curso curso = seleccionarCurso();
        if (curso != null) {
            System.out.print("Ingrese el título de la lección: ");
            String titulo = scanner.nextLine();
            curso.agregarLeccion(titulo); //composición
            System.out.println("Lección agregada al curso exitosamente.");
        } else {
            System.out.println("Curso no encontrado.");
        }
    }

    private static void agregarVideoALeccion() {
        Curso curso = seleccionarCurso();
        if (curso != null) {
            List<Leccion> lecciones = curso.getLecciones();
            if (lecciones.isEmpty()) {
                System.out.println("El curso no tiene lecciones. Agregue una lección primero.");
                return;
            }
            System.out.println("Seleccione una lección:");
            //recorremos la lista de lecciones para mostrar sus títulos y permitir al usuario seleccionar una
            for (int i = 0; i < lecciones.size(); i++) {
                System.out.println((i + 1) + ". " + lecciones.get(i).getTitulo());
            }
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea
            if (opcion > 0 && opcion <= lecciones.size()) {
                Leccion leccion = lecciones.get(opcion - 1);
                System.out.print("Ingrese el título del video: ");
                String tituloVideo = scanner.nextLine();
                leccion.agregarVideo(tituloVideo); //composición
                System.out.println("Video agregado a la lección exitosamente.");
            } else {
                System.out.println("Opción no válida.");
            }
        } else {
            System.out.println("Curso no encontrado.");
        }
    }

    private static void mostrarSistema() {
        System.out.println("=== Estudiantes ===");
        for (Estudiante estudiante : estudiantes) { //for each para recorrer la lista de estudiantes
            System.out.println(estudiante);
            for (Registro registro : estudiante.getRegistros()) {
                System.out.println("  - " + registro.getCurso().getNombre());
            }
        }

        System.out.println("\n=== Cursos ===");
        for (Curso curso : cursos) {
            System.out.println(curso);
            if (curso.getProfesor() != null) {
                System.out.println("  Profesor: " + curso.getProfesor().getNombre());
            }
            for (Leccion leccion : curso.getLecciones()) {
                System.out.println("  - " + leccion.getTitulo());
                for (Video video : leccion.getVideos()) {
                    System.out.println("    * " + video.getTitulo());
                }
            }
        }

        System.out.println("\n=== Profesores ===");
        for (Profesor profesor : profesores) {
            System.out.println(profesor);
        }
    }

    // SELECTORES
    static Estudiante seleccionarEstudiante() {
        if (estudiantes.isEmpty()) {
            System.out.println("No hay estudiantes registrados.");
            return null;
        }
        System.out.println("Seleccione un estudiante:");
        for (int i = 0; i < estudiantes.size(); i++) {
            System.out.println((i + 1) + ". " + estudiantes.get(i));
        }
        int opcion = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea
        if (opcion > 0 && opcion <= estudiantes.size()) {
            return estudiantes.get(opcion - 1);
        } else {
            System.out.println("Opción no válida.");
            return null;
        }
    }
}   
