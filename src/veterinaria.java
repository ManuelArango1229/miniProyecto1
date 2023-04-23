
///clase para ejecutar consola
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
        FuncionamientoMenuPrincipal funciones= new FuncionamientoMenuPrincipal();
        switch (opcionMenuPrincipal) {
            case 1:
                funciones.insertarAnimal();
                borrarConsola();
                break;
            case 2:
                System.out.println("Funcionó");
                borrarConsola();
                break;
            case 3:
                System.out.println("Funcionó");
                borrarConsola();
                break;
            case 4:
                System.out.println("Funcionó");
                borrarConsola();
                break;
            case 5:
                System.out.println("Funcionó");
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
    private class FuncionamientoMenuPrincipal{
        public FuncionamientoMenuPrincipal(){

        }
        public void insertarAnimal(){
            System.out.println("\n\t\t -- I N S E R T A R  A N I M A L --");
            System.out.print("Digite el nombre: ");
            nombreAnimal= entradaScanner.nextLine();
            System.out.println("\t\t 1.Perro ");
            System.out.println("\t\t 2. Gato ");
            System.out.print("\tingrese el tipo: ");
            opAnimal = entradaScanner.nextByte();
            entradaScanner.nextLine();
            switch(opAnimal){
                case 1:
                System.out.println(" \n\t\t Información  de "+ nombreAnimal);
                System.out.print("Precio: ");
                precioAnimal=entradaScanner.nextDouble();
                entradaScanner.nextLine();
                System.out.print("Origen: ");
                origenAnimal= entradaScanner.nextLine();
                System.out.print("Color: ");
                colorAnimal=entradaScanner.nextLine();
                System.out.print("Edad: ");
                edadAnimal=entradaScanner.nextByte();
                entradaScanner.nextLine();
                animalPerro perro1= new animalPerro(colorAnimal, edadAnimal, precioAnimal, origenAnimal, nombreAnimal);
                break;
                case 2: //precio,origen,nombre,raza,cantidad de dientes
                System.out.println(" \n\t\t Información  de "+ nombreAnimal);
                System.out.print("Precio: ");
                precioAnimal=entradaScanner.nextDouble();
                entradaScanner.nextLine();
                System.out.print("Origen: ");
                origenAnimal= entradaScanner.nextLine();
                System.out.print("Raza: ");
                razaAnimal=entradaScanner.nextLine();
                System.out.print("Cantidad de dientes: ");
                cantidadDientesAnimal=entradaScanner.nextByte();
                animalGato gato1=new animalGato(precioAnimal, origenAnimal, nombreAnimal, razaAnimal, cantidadDientesAnimal);
                entradaScanner.nextLine();
                
                break;
            }
        }
        private byte opAnimal,edadAnimal;
        private String nombreAnimal,colorAnimal,origenAnimal,razaAnimal;
        private Double precioAnimal;
        private short cantidadDientesAnimal;
    }
    private Scanner entradaScanner = new Scanner(System.in);
    private byte opcionMenuPrincipal = 0;
}
