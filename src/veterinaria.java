
///clase para ejecutar consola
import java.util.ArrayList;
import java.util.Scanner;

public class veterinaria {
    public veterinaria() {
        consola();
    }

    public void consola() {
        while (true) {
            opcionesMenuPrincial();
            try {
                System.out.print("\n\t\t  Digite la opcion deseada: ");
                opcionMenuPrincipal = entradaScanner.nextByte();
                entradaScanner.nextLine();
                SwitchMenuPrincipal();
            } catch (Exception e) {
                System.out.println("\t\t\t -- E R R O R -- ");
                System.out.println("\t\t\t DATO INCORRECTO");
                entradaScanner.next();
                borrarConsola();
            }
        }
    }

    private void opcionesMenuPrincial() {
        System.out.println("\t\t _____________________________");
        System.out.println("\t\t|    V E T E R I N A R I A    | ");
        System.out.println("\t\t| 1.Insertar mascota          |");
        System.out.println("\t\t| 2.Actualizar mascota        |");
        System.out.println("\t\t| 3.Eliminar mascota          |");
        System.out.println("\t\t| 4.Buscar mascota por nombre |");
        System.out.println("\t\t| 5.Listar todas las mascotas |");
        System.out.println("\t\t| 6.Salir                     |");
        System.out.println("\t\t|_____________________________|");
    }

    private void SwitchMenuPrincipal() {
        FuncionamientoMenuPrincipal funciones = new FuncionamientoMenuPrincipal();
        switch (opcionMenuPrincipal) {
            case 1:
                funciones.insertarAnimal();
                borrarConsola();
                break;
            case 2:
                funciones.actualizarMascota();;
                borrarConsola();
                break;
            case 3:
                funciones.eliminarMascota();
                borrarConsola();
                break;
            case 4:
                funciones.buscarMascotaNombre();
                borrarConsola();
                break;
            case 5:
                funciones.imprimirMascotas();
                borrarConsola();
                break;
            case 6:
                System.out.println("\t\t    Programa Finalizado");
                System.exit(1);
                break;
            default:
                System.out.println("\t\t Opcion Invalida");
                break;
        }
    }

    private void borrarConsola() {
        try {
            System.out.println("Presiona una tecla y luego [Enter] para continuar...");
            entradaScanner.next().charAt(0);
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            /* No hacer nada */
        }
    }

    private class FuncionamientoMenuPrincipal {
        public FuncionamientoMenuPrincipal() {

        }

        public void insertarAnimal() {
            System.out.println("\n\t\t -- I N S E R T A R  M A S C O T A --");
            System.out.print("Digite el nombre: ");
            nombreAnimal = entradaScanner.nextLine();
            System.out.println("\t\t 1.Perro ");
            System.out.println("\t\t 2. Gato ");
            System.out.print("\tingrese el tipo: ");
            opAnimaL = entradaScanner.nextByte();
            entradaScanner.nextLine();
            switch (opAnimaL) {
                case 1:
                    System.out.println(" \n\t\t Información  de " + nombreAnimal);
                    System.out.print("Precio: ");
                    precioAnimal = entradaScanner.nextDouble();
                    entradaScanner.nextLine();
                    System.out.print("Origen: ");
                    origenAnimal = entradaScanner.nextLine();
                    System.out.print("Color: ");
                    colorAnimal = entradaScanner.nextLine();
                    System.out.print("Edad: ");
                    edadAnimal = entradaScanner.nextShort();
                    entradaScanner.nextLine();
                    perros.add(new animalPerro(colorAnimal, edadAnimal, precioAnimal, origenAnimal, nombreAnimal));
                    System.out.println("\t El perro ha sido registrado con exito.");
                    System.out.println("\t\t Su id es: " + perros.get(iteradorPerro).getId());
                    iteradorPerro++;
                    break;
                case 2: // precio,origen,nombre,raza,cantidad de dientes
                    System.out.println(" \n\t\t Información  de " + nombreAnimal);
                    System.out.print("Precio: ");
                    precioAnimal = entradaScanner.nextDouble();
                    entradaScanner.nextLine();
                    System.out.print("Origen: ");
                    origenAnimal = entradaScanner.nextLine();
                    System.out.print("Raza: ");
                    razaAnimal = entradaScanner.nextLine();
                    System.out.print("Cantidad de dientes: ");
                    cantidadDientesAnimal = entradaScanner.nextByte();
                    gatos.add(new animalGato(precioAnimal, origenAnimal, nombreAnimal, razaAnimal,
                            cantidadDientesAnimal));
                    entradaScanner.nextLine();
                    System.out.println("\t El gato ha sido registrado con exito.");
                    System.out.println("\t\t Su id es: " + gatos.get(iteradorGato).getId());
                    iteradorGato++;

                    break;
            }
        }

        public void actualizarMascota() {

            System.out.println("\n\t\t -- A C T U A L I Z A R  M A S C O T A --");
            System.out.println("\t\t 1.Perro ");
            System.out.println("\t\t 2. Gato ");
            System.out.print("\tingrese el tipo: ");
            opAnimaL = entradaScanner.nextByte();
            entradaScanner.nextLine();
            switch (opAnimaL) {
                case 1:
                    if (perros.isEmpty()) {
                        System.out.println("no hay perros por actualizar");
                    } else {
                        System.out.print("Ingrese el ID de la mascota: ");
                        IDAnimal = entradaScanner.nextShort();
                        entradaScanner.nextLine();

                        for (int i = 0; i < perros.size(); i++) {
                            if (perros.get(i).getId() == IDAnimal) {
                                switchPerroActualizar(i);
                                break;

                            } else {
                                System.out.println("No se encuentra la mascota");
                                break;
                            }
                        }
                    }
                    break;
                case 2:

                    if (gatos.isEmpty()) {
                        System.out.println("No hay gatos por actualizar");
                    } else {
                        System.out.print("Ingrese el ID de la mascota: ");
                        IDAnimal = entradaScanner.nextShort();
                        entradaScanner.nextLine();
                        for (int i = 0; i < gatos.size(); i++) {
                            if (gatos.get(i).getId() == IDAnimal) {
                                switchGatoActualizar(i);
                                break;
                            } else {
                                System.out.println("No se encuentra la mascota");
                                break;
                            }
                        }
                    }
                    break;
            }

        }

        private void switchPerroActualizar(int i) {
            System.out.println("1. color");
            System.out.println("2.edad");
            System.out.println("3.precio");
            System.out.println("4.origen");
            System.out.print("¿Qué desea actualizar?: ");
            actualizarAnimal = entradaScanner.nextByte();
            entradaScanner.nextLine();
            switch (actualizarAnimal) {
                case 1:
                    System.out.print("Ingrese el nuevo color: ");
                    colorAnimal = entradaScanner.nextLine();
                    perros.get(i).setColorPelo(colorAnimal);
                    break;

                case 2:
                    System.out.print("Ingrese la nueva edad: ");
                    edadAnimal = entradaScanner.nextShort();
                    entradaScanner.nextLine();
                    perros.get(i).setEdad(edadAnimal);
                    break;
                case 3:
                    System.out.print("Ingrese el nuevo precio: ");
                    precioAnimal = entradaScanner.nextDouble();
                    entradaScanner.nextLine();
                    perros.get(i).setCuantoCuesta(precioAnimal);
                    break;
                case 4:
                    System.out.print("Ingrese el nuevo origen: ");
                    origenAnimal = entradaScanner.nextLine();
                    perros.get(i).setPaisOrigen(origenAnimal);
                    break;
                default:
                    System.out.println("Opción invalida");
                    break;
            }
        }

        private void switchGatoActualizar(int i) {
            System.out.println("1. cantidad de dientes");
            System.out.println("2.precio");
            System.out.println("3.origen");
            System.out.print("¿Qué desea actualizar?: ");
            actualizarAnimal = entradaScanner.nextByte();
            entradaScanner.nextLine();
            switch (actualizarAnimal) {
                case 1:
                    System.out.print("Ingrese la nueva cantidad de dientes: ");
                    cantidadDientesAnimal = entradaScanner.nextShort();
                    gatos.get(i).setCantidadDientes(cantidadDientesAnimal);
                    break;

                case 2:
                    System.out.print("Ingrese el nuevo precio: ");
                    precioAnimal = entradaScanner.nextDouble();
                    entradaScanner.nextLine();
                    gatos.get(i).setCuantoCuesta(precioAnimal);
                    break;
                case 3:
                    System.out.print("Ingrese el nuevo origen: ");
                    origenAnimal = entradaScanner.nextLine();
                    gatos.get(i).setPaisOrigen(origenAnimal);
                    break;
                default:
                    System.out.println("Opción invalida");
                    break;
            }
        }

      
 

        public void eliminarMascota() {
            System.out.println("\n\t\t -- E L I M I N A R  M A S C O T A --");
            System.out.println("\t\t 1.Perro ");
            System.out.println("\t\t 2. Gato ");
            System.out.print("\tingrese el tipo: ");
            opAnimaL = entradaScanner.nextByte();
            entradaScanner.nextLine();
            switch (opAnimaL) {
                case 1:
                    if (perros.isEmpty()) {
                        System.out.println("No hay mascota perro por eliminar ");
                    } else {
                        System.out.print("Ingrese el ID: ");
                        IDAnimal = entradaScanner.nextShort();
                        for (int i = 0; i < perros.size(); i++) {
                            if (perros.get(i).getId() == IDAnimal) {
                                perros.remove(i);
                                System.out.println("La mascota se ha eliminado con exito");
                                iteradorPerro--;
                                break;
                            } else {
                                System.out.println("No se ha encontrado la mascota");
                            }
                        }
                    }
                    break;
                case 2:
                    if (gatos.isEmpty()) {
                        System.out.println("No hay mascota gato por eliminar ");
                    } else {
                        System.out.print("Ingrese el ID: ");
                        IDAnimal = entradaScanner.nextShort();
                        for (int i = 0; i < gatos.size(); i++) {
                            if (gatos.get(i).getId() == IDAnimal) {
                                gatos.remove(i);
                                System.out.println("La mascota se ha eliminado con exito");
                                iteradorGato--;
                                break;
                            } else {
                                System.out.println("No se ha encontrado la mascota");
                            }
                        }
                    }
                    break;

                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        }

        public void buscarMascotaNombre() {
            System.out.println("\n\t\t -- B U S C A R  M A S C O T A  N O M B R E --");
            System.out.println("\t\t 1.Perro ");
            System.out.println("\t\t 2. Gato ");
            System.out.print("\tingrese el tipo: ");
            opAnimaL = entradaScanner.nextByte();
            entradaScanner.nextLine();
            switch (opAnimaL) {
                case 1:
                    if (perros.isEmpty()) {
                        System.out.println("No hay mascota perro por buscar ");
                    } else {
                        System.out.print("\tIngrese el nombre: ");
                        nombreAnimal = entradaScanner.nextLine();
                        for (int i = 0; i < perros.size(); i++) {
                            if (perros.get(i).getNombreDelanimal().equals(nombreAnimal)) {
                                System.out.println("\n\t\t I N F O R M A C I O N  A N I M A L");
                                System.out.println("Nombre: " + perros.get(i).getNombreDelanimal());
                                System.out.println("Identificador: " + perros.get(i).getId());
                                System.out.println("País de origen: " + perros.get(i).getPaisOrigen());
                                System.out.println("Costo:" + perros.get(i).getCuantoCuesta());
                                System.out.println("Color de pelo: " + perros.get(i).getColorPelo());
                                System.out.println("Edad: " + perros.get(i).getEdad());
                                System.out.println("___________________________________________________________");
                                break;
                            } else {
                                System.out.println("No se ha encontrado la mascota");
                            }
                        }
                    }
                    break;
                case 2:
                    if (gatos.isEmpty()) {
                        System.out.println("No hay mascota gato por buscar ");
                    } else {
                        System.out.print("Ingrese el nombre: ");
                        nombreAnimal = entradaScanner.nextLine();
                        for (int i = 0; i < gatos.size(); i++) {
                            if (gatos.get(i).getNombreDelanimal().equals(nombreAnimal)) {
                                System.out.println("I N F O R M A C I O N  A N I M A L");
                                System.out.println("Nombre: " + gatos.get(i).getNombreDelanimal());
                                System.out.println("Identificador: " + gatos.get(i).getId());
                                System.out.println("País de origen: " + gatos.get(i).getPaisOrigen());
                                System.out.println("Costo:" + gatos.get(i).getCuantoCuesta());
                                System.out.println("Raza: " + gatos.get(i).getRaza());
                                System.out.println("Cantidad de dientes: " + gatos.get(i).getCantidadDientes());
                                System.out.println("___________________________________________________________");
                                break;
                            } else {
                                System.out.println("No se ha encontrado la mascota");
                            }
                        }
                    }
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        }

        public void imprimirMascotas() {
            System.out.println("\n\t -- M A S C O T A S  R E G I S T R A D A S --");
            System.out.println("\n\t   - p e r r o s  r e g i s t r a d o s  -");
            if (perros.isEmpty()) {
                System.out.println("No hay perros registrados");
            } else {
                for (int i = 0; i < perros.size(); i++) {
                    System.out.println("Identificador: " + perros.get(i).getId());
                    System.out.println("Nombre: " + perros.get(i).getNombreDelanimal());
                    System.out.println("País de origen: " + perros.get(i).getPaisOrigen());
                    System.out.println("Costo:" + perros.get(i).getCuantoCuesta());
                    System.out.println("Color de pelo: " + perros.get(i).getColorPelo());
                    System.out.println("Edad: " + perros.get(i).getEdad());
                    System.out.println("\n ________________________________________________________________________");
                }
            }
            System.out.println("\n ________________________________________________________________________");
            System.out.println("\n\t   - g a t o s  r e g i s t r a d o s  -");
            if (gatos.isEmpty()) {
                System.out.println("No hay gatos registrados");
            } else {
                for (int i = 0; i < gatos.size(); i++) {
                    System.out.println("Identificador: " + gatos.get(i).getId());
                    System.out.println("Nombre: " + gatos.get(i).getNombreDelanimal());
                    System.out.println("País de origen: " + gatos.get(i).getPaisOrigen());
                    System.out.println("Costo:" + gatos.get(i).getCuantoCuesta());
                    System.out.println("Raza: " + gatos.get(i).getRaza());
                    System.out.println("Cantidad de dientes: " + gatos.get(i).getCantidadDientes());
                    System.out.println("\n ________________________________________________________________________");
                }
            }
        }

        private byte opAnimaL,actualizarAnimal;
        private String nombreAnimal, colorAnimal, origenAnimal, razaAnimal;
        private Double precioAnimal;
        private short cantidadDientesAnimal, edadAnimal, IDAnimal;
    }

    private Scanner entradaScanner = new Scanner(System.in);
    private byte opcionMenuPrincipal = 0;
    ArrayList<animalPerro> perros = new ArrayList<>();
    ArrayList<animalGato> gatos = new ArrayList<>();
    private int iteradorPerro = 0, iteradorGato = 0;
}
