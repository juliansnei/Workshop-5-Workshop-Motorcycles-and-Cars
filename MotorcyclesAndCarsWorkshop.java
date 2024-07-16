import java.util.Scanner;
public class MotorcyclesAndCarsWorkshop {
	public static void main(String[] arg) {
		Scanner entry = new Scanner(System.in);
		int maxEmployees, option;
		boolean flagOut = false, isCorrect;
		System.out.print("Ingrese la cantidad máxima del taller: ");
		maxEmployees = entry.nextInt();
		String[][][] workshop = new String[maxEmployees][2][5];
		System.out.print("Ingrese el número de trabajos a registrar: ");
		int worksQuantity = entry.nextInt();
		if(worksQuantity <= maxEmployees) {
			for(int i = 0; i < worksQuantity; i++) {
				for(int j = 0; j < 2; j++) {
					if(j == 0) {
						System.out.print("Ingrese el nombre del empleado: ");
						workshop[i][j][0] = entry.nextLine();
						if(i == 0) {
							entry.nextLine();
						}
					} else {
						for(int k = 0; k < 5; k++) {
							switch(k) {
								case 0:
									isCorrect = true;
									do {
										System.out.print("Ingrese el tipo de vehículo(Moto/Carro): ");
										workshop[i][j][k] = entry.nextLine();
										if(workshop[i][j][k].equalsIgnoreCase("Moto") == false && workshop[i][j][k].equalsIgnoreCase("Carro") == false ) {
											System.out.println("Ingresaste una opción incorrecta solo se puede moto o carro. " + workshop[i][j][k] + workshop[i][j][k].equalsIgnoreCase("Moto"));
											isCorrect = false;
										}
									} while(isCorrect == false);
									break;
								case 1:
									System.out.print("Ingrese la marca: ");
									workshop[i][j][k] = entry.nextLine();
									break;
								case 2:
									System.out.print("Ingrese el modelo: ");
									workshop[i][j][k] = entry.nextLine();
									break;
								case 3:
									System.out.print("Ingrese el año: ");
									workshop[i][j][k] = entry.nextLine();
									break;
								case 4:
									isCorrect = true;
									do {
										System.out.print("Ingrese el estado(Pendiente, En reparacion, Reparado): ");
										workshop[i][j][k] = entry.nextLine();
										if(workshop[i][j][k].equalsIgnoreCase("pendiente") == false && workshop[i][j][k].equalsIgnoreCase("en reparacion") == false && workshop[i][j][k].equalsIgnoreCase("reparado") == false) {
											System.out.println("Lo siento, pero solo se puede modificar el estado del carro a los valores: 'en reparacion', 'pendiente', o 'reparado'");
											isCorrect = false;
										} else {
											isCorrect = true;
										}
									} while(isCorrect == false);
									break;
							}
						}
					}
					System.out.println();
					
				}
				
			}
			do {
				System.out.println("Ingrese la opción que quieras realizar:\n teclea 1 si quieres mostrar todos los vehículos en el taller, \n teclea 2 si quieres Contar y mostrar los vehículos por cada estado,\n teclea 3 si quieres buscar un vehículo por su marca y modelo,\n teclea 4 si quieres actualizar el estado de un vehículo,\n teclea 5 si quieres salir.");
				option = entry.nextInt();
				entry.nextLine();
				switch(option) {
					case 1:
						System.out.println("Agenda de trabajos: ");
						System.out.println("|   Tipo    |  Marca   |  Modelo   |  Año   |  Estado      |");
						System.out.println("| --------- | -------- | --------- | ------ | ------------ |");
						System.out.println();
						for(int i = 0; i < worksQuantity; i++) {
							for(int j = 0; j < 5; j++) {
								if(j < 4) {
								   System.out.print("|  " + workshop[i][1][j] + "     ");
								} else {
								   System.out.print("|  " + workshop[i][1][j] + " |");
								}
										
							}
							System.out.println();
						}
						break;
					case 2:
						int count1 = 0 ,count2 = 0,count3 = 0;
						for(int i = 0; i < worksQuantity; i++) {
							 if(workshop[i][1][4].equalsIgnoreCase("en reparacion") == true){
								 count1++;
							 } else if(workshop[i][1][4].equalsIgnoreCase("reparado") == true){
								 count2++;
							 } else if(workshop[i][1][4].equalsIgnoreCase("pendiente") == true){
								 count3++;
							 }
						}
						System.out.println("Cantidad de carros por estado");
						System.out.println("En reparación: " + count1);
						System.out.println("Reparado: " + count2);
						System.out.println("Pendiente: " + count3);
						break;
					case 3:
						String marca, modelo;
						boolean isFound = false;
						int counter = 0;
						System.out.print("Por favor, ingresa la marca: ");
						marca = entry.nextLine();						
						System.out.println("Por favor, ingresa el modelo: ");
						modelo = entry.nextLine();
						for(int i = 0; i < worksQuantity; i++) {
							if(workshop[i][1][1].equalsIgnoreCase(marca) == true && workshop[i][1][2].equalsIgnoreCase(modelo) == true) {
								isFound = true;
								counter++;
								if(counter == 1) {
									System.out.println("El vehículo ha sido hallado: ");
									System.out.println("|    Tipo     |   Marca   |   Modelo   |   Año   |  Estado      |");
									System.out.println("| ----------- | --------- | ---------- | ------- | ------------ |");
									System.out.println();
								}
								for(int j = 0; j < 5; j++) {
									if(j < 4) {
									   System.out.print("|  " + workshop[i][1][j] + "   ");
									} else {
									   System.out.print("|  " + workshop[i][1][j] + " |");
									}
											
								}
								System.out.println();
							} 
						} 
						if(isFound == false) {
							System.out.print("Ese vehículo no esta registrado en el taller");
						}
						System.out.println();
						break;
					case 4:
						String nuevoEstado;
						System.out.println("Por favor, ingresa la marca del vehículo al que quieres modificar su estado: ");
						marca = entry.nextLine();
						System.out.println("Por favor, ingresa el modelo del vehículo al que quieres modificar su estado: ");
						modelo = entry.nextLine();
						for(int i = 0; i < worksQuantity; i++) {
							if(workshop[i][1][1].equalsIgnoreCase(marca) == true && workshop[i][1][2].equalsIgnoreCase(modelo) == true) {
								isCorrect = true;
								do {
									System.out.println("Ingresa el nuevo estado que quieras modificar(Pendiente, Reparado, En reparación):");
									nuevoEstado = entry.nextLine();
									if(nuevoEstado.equalsIgnoreCase("pendiente") == false && nuevoEstado.equalsIgnoreCase("reparado") == false && nuevoEstado.equalsIgnoreCase("en reparacion") == false) {
										System.out.println("Lo sentimos pero solo se puede ingresar pendiente, reparado o en reparación como estados del vehículo.\n");
										isCorrect = false;
									} else {
										workshop[i][1][4] = nuevoEstado;
										System.out.println("El estado del vehículo se ha modificado exitosamente\n");
									}	
								} while(isCorrect == false);
							}
						}
						break;
					case 5:
						System.out.print("Gracias por utilizar la app de taller y motos.");
						flagOut = true;
						break;
				}
			} while(flagOut == false);
			entry.close();
		} else {
			System.out.print("Lo sentimos pero la cantidad de trabajos ingresados excede la capacidad del taller");
		}
		
	}
}
