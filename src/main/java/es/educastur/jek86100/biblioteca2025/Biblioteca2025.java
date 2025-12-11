/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package es.educastur.jek86100.biblioteca2025;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author 1dawd04
 */
public class Biblioteca2025 {

    private static ArrayList<Libro> libros = new ArrayList();
    private static ArrayList<Usuario> usuarios = new ArrayList();
    private static ArrayList<Prestamo> prestamos = new ArrayList();
    private static ArrayList<Prestamo> prestamosHist = new ArrayList();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        cargaDatos();
        menuPrincipal();
    }

    public static void menuPrincipal() {
        int Opcion;
        do {
            System.out.println("\n\n\n\n\n\t\t\t\tMENU PRINCIPAL\n");
            System.out.println("\t\t\t\t1 -PRESTAMOS");
            System.out.println("\t\t\t\t2 -LIBROS");
            System.out.println("\t\t\t\t3 -USUARIOS");
            System.out.println("\t\t\t\t4 -LISTADOS");
            System.out.println("\t\t\t\t9 -CERRAR EL PROGRAMA");

            Opcion = sc.nextInt();

            switch (Opcion) {
                case 1:
                    menuPrestamos();
                    break;
                case 2:
                    menuLibros();
                    break;
                case 3:
                    ;
                    menuUsuarios();
                    break;
                case 4:
                    menuListados();
                    break;
            }
        } while (Opcion != 9);
        System.out.println("Saliendo del programa...");
    }

    public static void menuPrestamos() {
        int Opcion;
        do {
            System.out.println("\n\n\n\n\n--------------------------------------");
            System.out.println("\t\t\t\tMENU PRESTAMOS\n");
            System.out.println("\t\t\t\t1 - NUEVO");
            System.out.println("\t\t\t\t2 - DEVOLUCION");
            System.out.println("\t\t\t\t3 - PRORROGA");
            System.out.println("\t\t\t\t4 - LISTADO");
            System.out.println("\t\t\t\t9 -VOLVER AL MENU PRINCIPAL");

            Opcion = sc.nextInt();

            switch (Opcion) {
                case 1:
                    nuevoPrestamo();
                    break;
                case 2:
                    devolucionPrestamo();
                    break;
                case 3:
                    prorroga();
                    break;
                case 4:
                    listadoPrestamo();
                    break;
            }
        } while (Opcion != 9);
        menuPrincipal();
    }

    public static void menuLibros() {
        int Opcion;
        do {
            System.out.println("\n\n\n\n\n--------------------------------------");
            System.out.println("\t\t\t\tMENU LIBROS\n");
            System.out.println("\t\t\t\t1 -AÑADIR");
            System.out.println("\t\t\t\t2 -LISTADO");
            System.out.println("\t\t\t\t3 -MODIFICAR");
            System.out.println("\t\t\t\t4 -ELIMINAR");
            System.out.println("\t\t\t\t9 -VOLVER AL MENU PRINCIPAL");

            Opcion = sc.nextInt();

            switch (Opcion) {
                case 1:
                    añadirLibro();
                    break;
                case 2:
                    listadoLibro();
                    break;
                case 3:
                    ;
                    modificarLibro();
                    break;
                case 4:
                    eliminaLibro();
                    break;
            }
        } while (Opcion != 9);

        menuPrincipal();
    }

    public static void menuUsuarios() {
        int Opcion;
        do {
            System.out.println("\n\n\n\n\n--------------------------------------");
            System.out.println("\t\t\t\tMENU USUARIO\n");
            System.out.println("\t\t\t\t1 -AÑADIR");
            System.out.println("\t\t\t\t2 -LISTADO");
            System.out.println("\t\t\t\t3 -MODIFICAR");
            System.out.println("\t\t\t\t4 -ELIMINAR");
            System.out.println("\t\t\t\t9 -VOLVER AL MENU PRINCIPAL");

            Opcion = sc.nextInt();

            switch (Opcion) {
                case 1:
                    añadirUsuario();
                    break;
                case 2:
                    listadoUsuario();
                    break;
                case 3:
                    modificarUsuario();
                    break;
                case 4:
                    eliminaLibro();
                    break;
            }
        } while (Opcion != 9);
        menuPrincipal();
    }

    public static void menuListados() {
        int Opcion;
        do {
            System.out.println("\n\n\n\n\n--------------------------------------");
            System.out.println("\t\t\t\tMENU LISTADOS\n");
            System.out.println("\t\t\t\t1 -LIBROS");
            System.out.println("\t\t\t\t2 -USUARIOS");
            System.out.println("\t\t\t\t3 -PRESTAMOS");
            System.out.println("\t\t\t\t4 -VOLVER AL MENU PRINCIPAL");

            Opcion = sc.nextInt();

            switch (Opcion) {
                case 1:
                    listadoLibro();
                    break;
                case 2:
                    listadoUsuario();
                    break;
                case 3:
                    listadoPrestamo();
                    break;
                case 4:
                    menuPrincipal();
                    break;
            }
        } while (Opcion != 9);
        menuPrincipal();
    }

    /**
     * Añaden usuarios y libros
     */
    //Scripts para añadir
    public static void añadirLibro() {
        System.out.print("\n\nISBN del libro: ");
        String isbn = sc.next();
        System.out.print("Titulo: ");
        sc.nextLine();
        String titulo = sc.nextLine();
        System.out.print("Autor: ");
        String autor = sc.nextLine();
        System.out.print("Genero: ");
        String genero = sc.next();
        System.out.println("Numero de ejemplares:");
        int ejemplares = sc.nextInt();
        libros.add(new Libro(isbn, titulo, autor, genero, ejemplares));
    }

    public static void añadirUsuario() {
        System.out.print("\n\nDNI del usuario: ");
        String dni = sc.next();
        System.out.print("Nombre: ");
        sc.next();
        String nombre = sc.nextLine();
        System.out.print("email: ");
        String email = sc.next();
        System.out.print("Telefono: ");
        String telefono = sc.next();
        usuarios.add(new Usuario(dni, nombre, email, telefono));
    }

    /**
     * Permiten modificar usuarios y libros
     */
// Scripts para modificar
    public static void modificarLibro() {
        System.out.print("\nTeclea el isbn del libro a modificar: ");
        String isbn = sc.next();
        int l = buscaLibro(isbn);
        if (l == -1) {
            System.out.println("Este libro no existe");
        } else {
            System.out.print("\n\nTitulo a modificar:");
            sc.next();
            String titulo = sc.nextLine();
            System.out.print("Autor:");
            sc.next();
            String autor = sc.next();
            System.out.println("Genero:");
            String genero = sc.next();
            System.out.println("Ejemplares:");
            int ejemplares = sc.nextInt();

            libros.get(l).setTitulo(titulo);
            libros.get(l).setAutor(autor);
            libros.get(l).setGenero(genero);
            libros.get(l).setEjemplares(ejemplares);

            System.out.println("Modificacion realizada con exito.");
        }
    }

    public static void modificarUsuario() {
        System.out.print("\nTeclea el dni del usuario a modificar: ");
        String dni = sc.next();
        int u = buscaUsuario(dni);
        if (u == -1) {
            System.out.println("Este usuario no existe.");
        } else {
            System.out.print("\n\nNombre del Usuario al que quieres modificar: ");
            String nombre = sc.next();
            System.out.print("email: ");
            String email = sc.next();
            System.out.print("telefono: ");
            String telefono = sc.next();
            usuarios.get(u).setNombre(nombre);
            usuarios.get(u).setTelefono(telefono);
            usuarios.get(u).setEmail(email);

            System.out.println("Modificacion realizada con exito.");
        }
    }

    /**
     * Sirver para buscar la posicion de un contacto en el arraylist
     *
     * @param nombre String nombre del contacto a buscar
     * @return int posicion del libro y usuario en el arraylist o -1 si no lo
     * encuentra
     */
    public static int buscaLibro(String isbn) {
        int posicion = -1;
        for (int l = 0; l < libros.size(); l++) {
            if (libros.get(l).getIsbn().equalsIgnoreCase(isbn)) {
                posicion = l;
                break;
            }
        }
        return posicion;

    }

    public static int buscaUsuario(String dni) {
        int posicion = -1;
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getDni().equalsIgnoreCase(dni)) {
                posicion = i;
                break;
            }
        }
        return posicion;
        /*
        int = 0;
        for (Usuario u : usuarios){
        if (u.getDni().equals(dni){
        posicion=1;
        break;
         */
    }

    public static int buscaPrestamo(String dni, String isbn) {
        int posicion = -1;
        for (int i = 0; i < prestamos.size(); i++) {
            if (prestamos.get(i).getLibroPrest().getIsbn().equalsIgnoreCase(isbn)
                    && prestamos.get(i).getUsuarioPrest().getDni().equalsIgnoreCase(dni)) {
                posicion = i;
                break;
            }
        }
        return posicion;
    }

    /**
     * Esta parte es para los prestamos
     */
    public static void nuevoPrestamo() {
        String dni, isbn;
        int posUsuario, posLibro;
        System.out.print("Solicita el DNI del usuario: ");
        dni = sc.next();// next se usa para una palabra, el nextline es para varias palabras hasta que uses enter
        posUsuario = buscaUsuario(dni);
        if (posUsuario == -1) {
            System.out.println("Este usuario no existe.");
        } else {
            System.out.print("Solicita el ISBN del libro: ");
            isbn = sc.next();
            posLibro = buscaLibro(isbn);
            LocalDate hoy = LocalDate.now();
            prestamos.add(new Prestamo(libros.get(posLibro), usuarios.get(posUsuario), hoy, hoy.plusDays(15)));
            libros.get(posLibro).setEjemplares(libros.get(posLibro).getEjemplares() - 1);

        }
        System.out.println("Prestamo ha sido completada");
    }

    public static void prorroga() {
        System.out.print("Solicita el DNI del usuario: ");
        String dni = sc.next();
        System.out.print("Solicita el ISBN del libro: ");
        String isbn = sc.next();
        int posPrestamo = buscaPrestamo(dni, isbn);
        if (posPrestamo == -1) {
            System.out.println("No hay ningun prestamo con esos datos.");
        } else {
            prestamos.get(posPrestamo).setFechaDev(prestamos.get(posPrestamo).getFechaDev().plusDays(15));
        }
        System.out.println("Prorroga ha sido completada");

    }

    public static void devolucionPrestamo() {
        System.out.println("Solicita el DNI del usuario:");
        String dni = sc.next();
        System.out.println("Solicita el ISBN del libro");
        String isbn = sc.next();
        int posPrestamo = buscaPrestamo(dni, isbn);
        if (posPrestamo == -1) {
            System.out.println("No hay ningun prestamo con esos datos.");
        } else {
            prestamos.get(posPrestamo).setFechaDev(LocalDate.now());
            libros.get(buscaLibro(isbn)).setEjemplares(libros.get(buscaLibro(isbn)).getEjemplares() + 1);
            prestamosHist.add(prestamos.get(posPrestamo));
            prestamos.remove(posPrestamo);

        }
        System.out.println("Devolucion ha sido completada");
    }

    /**
     * Sirve para eliminar libros y usuarios
     */
    public static void eliminaLibro() {
        System.out.print("\nTeclea el isbn del libro a borrar: ");
        String isbn = sc.next();
        int l = buscaLibro(isbn);
        if (l == -1) {
            System.out.println("Ese libro no existe.");
        } else {
            libros.remove(l);
            System.out.println("El libro ha sido eliminado");
        }
    }

    public static void eliminaUsusario() {
        System.out.print("\nTeclea el dni del usuario a borrar: ");
        String dni = sc.next();
        int u = buscaUsuario(dni);
        if (u == -1) {
            System.out.println("Ese dni no existe.");
        } else {
            libros.remove(u);
            System.out.println("El usuario ha sido eliminado");
        }
    }

    /**
     * Listados de libros, usuarios y prestamos
     */
    public static void listadoLibro() {

        for (Libro l : libros) {
            System.out.println(l);
        }
    }

    public static void listadoUsuario() {
        for (Usuario u : usuarios) {
            System.out.println(u);
        }
    }

    public static void listadoPrestamo() {

        for (Prestamo p : prestamos) {
            System.out.println(p);
        }

    }

    /**
     * Carga datos, no tocar
     */
    public static void cargaDatos() {
        libros.add(new Libro("1-11", "El Hobbit", "JRR Tolkien", "Aventuras", 3));
        libros.add(new Libro("1-22", "El Silmarillon", "JRR Tolkien", "Aventuras", 3));
        libros.add(new Libro("1-33", "El Medico", "N. Gordon", "Aventuras", 4));
        libros.add(new Libro("1-44", "Chaman", "N. Gordon", "Aventuras", 3));
        libros.add(new Libro("1-55", "Momo", "M. Ende", "Aventuras", 2));
        libros.add(new Libro("1-66", "Paraiso inhabitado", "A.M.Matute", "Aventuras", 2));
        libros.add(new Libro("1-77", "Olvidado Rey Gudu", "A.M.Matute", "Aventuras", 0));
        libros.add(new Libro("1-88", "El ultimo barco", "D.Villar", "Novela Negra", 3));
        libros.add(new Libro("1-99", "Ojos de agua", "D.Villar", "Novela Negra", 0));

        usuarios.add(new Usuario("11", "Ana", "ana@email.com", "621111111"));
        usuarios.add(new Usuario("22", "David", "david@email.com", "622222222"));
        usuarios.add(new Usuario("33", "Bea", "bea@email.com", "623333333"));
        usuarios.add(new Usuario("44", "Lucas", "lucas@email.com", "624444444"));
        usuarios.add(new Usuario("55", "Carlota", "carlota@email.com", "625555555"));
        usuarios.add(new Usuario("66", "Juan", "juan@email.com", "626666666"));

        LocalDate hoy = LocalDate.now();
        prestamos.add(new Prestamo(libros.get(0), usuarios.get(0), hoy.minusDays(20), hoy.minusDays(5)));
        prestamos.add(new Prestamo(libros.get(1), usuarios.get(0), hoy, hoy.plusDays(15)));
        prestamos.add(new Prestamo(libros.get(5), usuarios.get(0), hoy, hoy.plusDays(15)));
        prestamos.add(new Prestamo(libros.get(5), usuarios.get(1), hoy.minusDays(20), hoy.minusDays(5)));
        prestamos.add(new Prestamo(libros.get(1), usuarios.get(4), hoy.minusDays(20), hoy.minusDays(5)));
        prestamos.add(new Prestamo(libros.get(2), usuarios.get(4), hoy.minusDays(20), hoy.minusDays(5)));
        prestamos.add(new Prestamo(libros.get(3), usuarios.get(4), hoy.minusDays(20), hoy.minusDays(5)));
        prestamos.add(new Prestamo(libros.get(6), usuarios.get(4), hoy, hoy.plusDays(2)));
        prestamos.add(new Prestamo(libros.get(6), usuarios.get(1), hoy, hoy.plusDays(5)));
    }
}
