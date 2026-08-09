import java.util.Scanner;
public class alcantarillado_urbano {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] ubicaciones = new String[10];
        String[] tipos = new String[10];
        double[] diametros = new double[10];
        double[] profundidades = new double[10];
        String[] estados = new String[10];
        String[] fechasInspeccion = new String[10];
        String[] observaciones = new String[10];
        int total = 0;
        int opcion;
        //---------------------------------------------//
        //--|menu_principal_de_alcantarillado_urbano|--//
        //---------------------------------------------//
        do {
            System.out.println("menu principal de alcantarillado urbano");
            System.out.println("1) Registrar alcantarillado");
            System.out.println("2) Editar alcantarillado");
            System.out.println("3) Listar alcantarillados");
            System.out.println("4) Buscar alcantarillado");
            System.out.println("5) Eliminar alcantarillado");
            System.out.println("6) Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = entrada.nextInt();
            entrada.nextLine();
            switch (opcion) {
                //------------------------------//
                //--|registrar_alcantarillado|--//
                //------------------------------//
                case 1:
                    int id = total + 1;
                    System.out.println("registro del alcantarillado");
                    System.out.println("id del alcantarillado a registrar: " + id);
                    System.out.print("ubicacion: ");
                    ubicaciones[total] = entrada.nextLine();
                    System.out.print("tipo de alcantarillado: ");
                    tipos[total] = entrada.nextLine();
                    System.out.print("diametro de la tuberia en cm: ");
                    diametros[total] = entrada.nextDouble();
                    System.out.print("profundidad en metros: ");
                    profundidades[total] = entrada.nextDouble();
                    entrada.nextLine();
                    System.out.print("estado de la instalacion: ");
                    estados[total] = entrada.nextLine();
                    System.out.print("fecha de inspeccion: ");
                    fechasInspeccion[total] = entrada.nextLine();
                    System.out.print("observaciones: ");
                    observaciones[total] = entrada.nextLine();
                    System.out.println("Alcantarillado registrado correctamente.");
                    total++;
                    break;
                //---------------------------//
                //--|editar_alcantarillado|--//
                //---------------------------//
                case 2:
                    if (total == 0) {
                        System.out.println("No existen alcantarillados registrados.");
                        break;
                    }
                    System.out.println("Datos de los alcantarillados");
                    for (int i = 0; i < total; i++) {
                        System.out.println("ID: " + (i + 1) + " | Ubicacion: " + ubicaciones[i] + " | Tipo: " + tipos[i] + " | Diametro: " + diametros[i] + " cm | Profundidad: " + profundidades[i] + " m | Estado: " + estados[i] + " | Inspeccion: " + fechasInspeccion[i] + " | Observaciones: " + observaciones[i]);
                    }
                    System.out.print("Ingrese el ID del alcantarillado: ");
                    int idBuscar = entrada.nextInt();
                    entrada.nextLine();
                    if (idBuscar >= 1 && idBuscar <= total) {
                        int posicion = idBuscar - 1;
                        System.out.println("Editar el dato del alcantarillado");
                        System.out.print("Nueva ubicacion: ");
                        ubicaciones[posicion] = entrada.nextLine();
                        System.out.print("Nuevo tipo de alcantarillado: ");
                        tipos[posicion] = entrada.nextLine();
                        System.out.print("Nuevo diametro en cm: ");
                        diametros[posicion] = entrada.nextDouble();
                        System.out.print("Nueva profundidad en metros: ");
                        profundidades[posicion] = entrada.nextDouble();
                        entrada.nextLine();
                        System.out.print("Nuevo estado: ");
                        estados[posicion] = entrada.nextLine();
                        System.out.print("Nueva fecha de inspeccion: ");
                        fechasInspeccion[posicion] = entrada.nextLine();
                        System.out.print("Nuevas observaciones: ");
                        observaciones[posicion] = entrada.nextLine();
                        System.out.println("Alcantarillado actualizado correctamente.");
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //----------------------------//
                //--|listar_alcantarillados|--//
                //----------------------------//
                case 3:
                    if (total == 0) {
                        System.out.println("No existen alcantarillados registrados.");
                    } else {
                        System.out.println("Lista de alcantarillados");
                        for (int i = 0; i < total; i++) {
                            System.out.println("ID: " + (i + 1) + " | Ubicacion: " + ubicaciones[i] + " | Tipo: " + tipos[i] + " | Diametro: " + diametros[i] + " cm | Profundidad: " + profundidades[i] + " m | Estado: " + estados[i] + " | Inspeccion: " + fechasInspeccion[i] + " | Observaciones: " + observaciones[i]);
                        }
                    }
                    break;
                //---------------------------//
                //--|buscar_alcantarillado|--//
                //---------------------------//
                case 4:
                    if (total == 0) {
                        System.out.println("No existen alcantarillados registrados.");
                        break;
                    }
                    System.out.println("busqueda de alcantarillado");
                    System.out.print("ingresa la id para buscar alcantarillado: ");
                    int idBusqueda = entrada.nextInt();
                    entrada.nextLine();
                    if (idBusqueda >= 1 && idBusqueda <= total) {
                        int posicion = idBusqueda - 1;
                        System.out.println("Datos del alcantarillado encontrado:");
                        System.out.println("ID: " + idBusqueda + " | Ubicacion: " + ubicaciones[posicion] + " | Tipo: " + tipos[posicion] + " | Diametro: " + diametros[posicion] + " cm | Profundidad: " + profundidades[posicion] + " m | Estado: " + estados[posicion] + " | Inspeccion: " + fechasInspeccion[posicion] + " | Observaciones: " + observaciones[posicion]);
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //-----------------------------//
                //--|eliminar_alcantarillado|--//
                //-----------------------------//
                case 5:
                    if (total == 0) {
                        System.out.println("No existen alcantarillados registrados.");
                        break;
                    }
                    System.out.println("Datos de los alcantarillados");
                    for (int i = 0; i < total; i++) {
                        System.out.println("ID: " + (i + 1) + " | Ubicacion: " + ubicaciones[i] + " | Tipo: " + tipos[i] + " | Diametro: " + diametros[i] + " cm | Profundidad: " + profundidades[i] + " m | Estado: " + estados[i] + " | Inspeccion: " + fechasInspeccion[i] + " | Observaciones: " + observaciones[i]);
                    }
                    System.out.print("Ingrese el ID del alcantarillado a eliminar: ");
                    int idEliminar = entrada.nextInt();
                    entrada.nextLine();
                    if (idEliminar >= 1 && idEliminar <= total) {
                        int posicion = idEliminar - 1;
                        for (int i = posicion; i < total - 1; i++) {
                            ubicaciones[i] = ubicaciones[i + 1];
                            tipos[i] = tipos[i + 1];
                            diametros[i] = diametros[i + 1];
                            profundidades[i] = profundidades[i + 1];
                            estados[i] = estados[i + 1];
                            fechasInspeccion[i] = fechasInspeccion[i + 1];
                            observaciones[i] = observaciones[i + 1];
                        }
                        total--;
                        System.out.println("Alcantarillado eliminado correctamente.");
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //------------------------------//
                //--|salir_del_menu_principal|--//
                //------------------------------//
                case 6:
                    System.out.println("Gracias por utilizar Alcantarillado Urbano.");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        } while (opcion != 6);
        entrada.close();
    }
}