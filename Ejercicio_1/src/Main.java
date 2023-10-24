import vehiculo.Auto;
import vehiculo.Moto;
import vehiculo.Vehiculo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Crear Concesionario que vende vehiculos (Autos, Motos) y se puedan listar
        // modificar y eliminar vehiculos, el numero de vehiculo no se puede repetir
        Scanner scanner = new Scanner(System.in);
        List<Vehiculo> vehiculo = new ArrayList<Vehiculo>();
        int opcion;
        do {
            System.out.println("\nMenú del Concesionario");
            System.out.println("1. Listar vehículos");
            System.out.println("2. Agregar vehículo");
            System.out.println("3. Editar vehículo");
            System.out.println("4. Eliminar vehiculo");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    listarInventario(vehiculo);

                    break;
                case 2:
                    agregarVehiculo(vehiculo);

                    break;
                case 3:
                    editarVehiculo(vehiculo);
                    break;
                case 4:
                    eliminarVehiculo(vehiculo);
                    break;


            }

            break;


        }
        while (opcion != 5);

    }

    private static void listarInventario(List<Vehiculo> vehiculo) {
        if (vehiculo.isEmpty()) {
            System.out.println("El vehiculo está vacío.");
        } else {
            int contador = 0;
            for (Vehiculo vehiculos : vehiculo) {
                System.out.print("Id: " + contador + " - ");
                System.out.print(vehiculo.toString());
                if (vehiculo instanceof Auto) {
                    Auto carro = (Auto) vehiculo;
                    System.out.println(" - transmision: " + carro.getTransmision());
                    System.out.println(" - transmision: " + carro.getEjes());

                } else if (vehiculo instanceof Moto) {
                    Moto moto = (Moto) vehiculo;
                    System.out.println(" - Radiador?: " + moto.isRadiador());
                }
                contador++;
            }
        }
    }

    private static void agregarVehiculo(List<Vehiculo> vehiculo) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione el tipo de vehículo a agregar:");
        System.out.println("1. Auto");
        System.out.println("2. Moto");
        System.out.print("Seleccione una opción: ");
        int opcion = scanner.nextInt();

        if (opcion == 1) {
            // Agregar un carro
            System.out.print("Marca del carro: ");
            String marca = scanner.next();
            System.out.print("Modelo del carro: ");
            String modelo = scanner.next();
            System.out.print("Cilindraje del carro: ");
            int cilindraje = scanner.nextInt();
            System.out.print("cantidad de ejes del carro: ");
            int ejes = scanner.nextInt();
            System.out.print("Tipo de transmisión del carro: ");
            String transmision = scanner.next();
            Auto carro = new Auto(marca, modelo, cilindraje,ejes,transmision);
            vehiculo.add(carro);
            System.out.println("Auto agregado al vehiculo.");
        } else if (opcion == 2) {
            // Agregar una moto
            System.out.print("Marca de la moto: ");
            String marca = scanner.next();
            System.out.print("Modelo de la moto: ");
            String modelo = scanner.next();
            System.out.print("Cilindraje de la moto: ");
            int cilindraje = scanner.nextInt();
            System.out.print("Tipo de moto: ");
            boolean radiador = scanner.nextBoolean();
            Moto moto = new Moto(marca, modelo, cilindraje,radiador);
            vehiculo.add(moto);
            System.out.println("Moto agregada al vehiculo.");
        } else {
            System.out.println("Opción no válida. No se agregó ningún vehículo.");
        }
    }

    private static void editarVehiculo(List<Vehiculo> vehiculo) {
        if (vehiculo.isEmpty()) {
            System.out.println("El vehiculo está vacío. No hay vehículos para editar.");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el índice del vehículo a editar: ");
        int indice = scanner.nextInt();

        if (indice < 0 || indice >= vehiculo.size()) {
            System.out.println("Índice fuera de rango. No se editó ningún vehículo.");
            return;
        }

        Vehiculo vehiculos = vehiculo.get(indice);

        if (vehiculo instanceof Auto) {
            Auto carro = (Auto) vehiculo;
            System.out.print("Nueva marca del carro: ");
            String nuevaMarca = scanner.next();
            System.out.print("Nuevo modelo del carro: ");
            String nuevoModelo = scanner.next();
            System.out.print("Nuevo cilindraje del carro: ");
            int nuevoCilindraje = scanner.nextInt();
            System.out.print("Nuevo número de puertas: ");
            int nuevosejes = scanner.nextInt();
            carro.setMarca(nuevaMarca);
            carro.setModelo(nuevoModelo);
            carro.setCilindraje(nuevoCilindraje);
            carro.setEjes(nuevosejes);
            System.out.println("Auto editado correctamente.");
        } else if (vehiculo instanceof Moto) {
            Moto moto = (Moto) vehiculos;
            System.out.print("Nueva marca de la moto: ");
            String nuevaMarca = scanner.next();
            System.out.print("Nuevo modelo de la moto: ");
            String nuevoModelo = scanner.next();
            System.out.print("Nuevo cilindraje de la moto: ");
            int nuevoCilindraje = scanner.nextInt();
            System.out.print("Nuevo radiador: ");
            boolean nuevoradiador = scanner.nextBoolean();
            moto.setMarca(nuevaMarca);
            moto.setModelo(nuevoModelo);
            moto.setCilindraje(nuevoCilindraje);
            moto.setRadiador(nuevoradiador);
            System.out.println("Moto editada correctamente.");
        }
    }

    private static void eliminarVehiculo(List<Vehiculo> vehiculo) {
        if (vehiculo.isEmpty()) {
            System.out.println("El inventario está vacío. No hay vehículos para eliminar.");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el índice del vehículo a eliminar: ");
        int indice = scanner.nextInt();

        if (indice < 0 || indice >= vehiculo.size()) {
            System.out.println("Índice fuera de rango. No se eliminó ningún vehículo.");
            return;
        }

        Vehiculo vehiculos = vehiculo.get(indice);

        System.out.println("¿Está seguro de que desea eliminar el siguiente vehículo?");
        System.out.println(vehiculo.toString());
        System.out.print("Presione 1 para confirmar la eliminación, o cualquier otra tecla para cancelar: ");
        int elimina = scanner.nextInt();

        if (elimina == 1) {
            vehiculo.remove(indice);
            System.out.println("Vehículo eliminado del inventario.");
        } else {
            System.out.println("Eliminación cancelada.");
        }
    }
}
