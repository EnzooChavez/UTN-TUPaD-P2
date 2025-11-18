/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion2.IntroduccionAPOO;

/**
 *
 * @author USER
 */
public class IntroduccionAPOO {
    public static void main(String[] args) {
        //*Ejercicio 1: Registro de Estudiantes*    ---*
        
        // Instanciar un estudiante
        Estudiante estudiante1 = new Estudiante();
        estudiante1.setNombre("Enzo");
        estudiante1.setApellido("Chavez");
        estudiante1.setCurso("Programacion");
        estudiante1.setCalificacion(6.0);
                
        // Mostrar información inicial
   
        estudiante1.mostrarInfo();
        
        // Subir calificación
        System.out.println("\nAumentar calificacion: ");
        estudiante1.subirCalificacion(3.0);
        estudiante1.mostrarInfo();
        
        // Bajar calificación
        System.out.println("\nDisminuir calificacion: ");
        estudiante1.bajarCalificacion(2.0);
        estudiante1.mostrarInfo();
        
        //*Ejercicio 2: Registro de Mascotas*   ---*
        
        Mascotas mascota = new Mascotas();
        mascota.setNombre("Mac");
        mascota.setEspecie("Perro");
        mascota.setEdad(10);
        
        mascota.mostrarInfo();
        mascota.cumplirAnios();
        mascota.cumplirAnios();
        
       System.out.println("");
       mascota.mostrarInfo();
       
       //*Ejercicio 3: Registro de Libros*   ---*
       
       Libro libro = new Libro();
       
       libro.setTitulo("Colmillo Blanco");
       libro.setAutor("Enzo Chavez");
       libro.setAnioPublicacion(2030);
               
       libro.mostrarInfo();
       System.out.println("");
       libro.setAnioPublicacion(2005);
       libro.mostrarInfo();
       
       //*Ejercicio 4: Registro de Gallinas*   ---*
       
       Gallina g1 = new Gallina();
       g1.setIdGallina("asd123");
       g1.setEdad(2);
       g1.setHuevosPuestos(0);
       Gallina g2 = new Gallina();
       g2.setIdGallina("abc111");
       g2.setEdad(3);
       g2.setHuevosPuestos(2);
       
       g1.mostrarEstado();
       g2.mostrarEstado();
       
       g1.ponerHuevo();
       g1.ponerHuevo();
       g1.ponerHuevo();
       
       g2.ponerHuevo();
       g2.ponerHuevo();
       g2.ponerHuevo();
       
       g1.mostrarEstado();
       g2.mostrarEstado();
       
       //*Ejercicio 5: Registro de Nave Espacial*   ---*
       
       NaveEspacial nave = new NaveEspacial();
       nave.setNombre("Explorador");
       nave.setCombustible(40);
       
       System.out.println("Estado inicial: ");
       nave.mostrarEstado();
       nave.despegar();
       nave.mostrarEstado();
       
       System.out.println("Avanzando 20km: ");
       nave.avanzar(20);
       
       System.out.println("Recargando combustible: ");
       nave.recargarCombustible(30);
       
       System.out.println("Avanzando 30km: ");
       nave.avanzar(30);
       
       System.out.println("Estado final: ");
       nave.mostrarEstado();
    }
}

