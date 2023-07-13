/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gimnasioegg;

import gimnasioegg.entidades.Cliente;
import gimnasioegg.entidades.Rutina;
import gimnasioegg.servicios.ClienteService;
import gimnasioegg.servicios.RutinaService;
import java.util.Scanner;

/**
 *
 * @author jpgaleanoaldett
 */
public class GimnasioEgg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        ClienteService cs = new ClienteService();
        Cliente c1 = new Cliente();
        Rutina r1 = new Rutina();
        RutinaService rs = new RutinaService();

        int opc = 0;
        while (opc != 9) {
            System.out.println("Bienvenido al gimnasio.");
            System.out.println("--------Opciones---------");
            System.out.println("1.Registrar Clientes");
            System.out.println("2.Obtener Clientes");
            System.out.println("3.Actualizar Datos de clientes");
            System.out.println("4.Eliminar cliente");
            System.out.println("5.Registrar Rutina");
            System.out.println("6.Obtener Rutinas");
            System.out.println("7.Actualizar Datos de Rutinas");
            System.out.println("8.Eliminar Rutina");
            System.out.println("9.Salir");
            System.out.println("------------------");
            System.out.print("ingrese la opcion deseada");
            opc = leer.nextInt();

            switch (opc) {
                case 1:
                    cs.registrarCliente();
                    break;
                case 2:
                    cs.obtenerClientes();
                    break;
                case 3:
                    System.out.println("Ingrese su ID");
                    int idCliente = leer.nextInt();
                    System.out.println("Ingresar nombre");
                    String nombre = leer.next();
                    System.out.println("Ingresar edad");
                    int edad = leer.nextInt();
                    System.out.println("Ingresar altura en cm");
                    int altura = leer.nextInt();
                    System.out.println("Ingresar peso");
                    double peso = leer.nextDouble();
                    System.out.println("Ingresar objetivo");
                    String objetivo = leer.next();

                    cs.actualizarCliente(idCliente, nombre, edad, altura, peso, objetivo);
                    break;
                case 4:
                    System.out.println("Ingrese a quien borramos");
                    int idC = leer.nextInt();
                    cs.eliminarCliente(idC);
                    break;
                case 5:
                    rs.crearRutina();
                    break;
                case 6:
                    rs.obtenerRutinas();
                    break;
                case 7:
                    System.out.println("Ingresar ID");
                    int idRutina = leer.nextInt();
                    System.out.println("Ingresar nombre");
                    String nombrerutina = leer.next();
                    System.out.println("Ingresar duración");
                    int duracion = leer.nextInt();
                    System.out.println("Ingresar Nivel de Dificultad");
                    String nivelDificultad = leer.next();
                    System.out.println("Ingresar descripción");
                    String descripcion = leer.next();

                    rs.actualizarRutina(idRutina, nombrerutina, duracion, nivelDificultad, descripcion);
                    break;
                case 8:
                    System.out.println("Ingrese que rutina borramos");
                    int idR = leer.nextInt();
                    rs.eliminarRutina(idR);
                    break;
                case 9:
                    System.out.println("Byeeee!!!");
                    break;
                default:
                    break;
            }

        }
    }
}
