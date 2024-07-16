# Taller de Motos y Carros
Crea un programa que gestione trabajos de un taller que
repara motos y carros. En este caso, utilizaremos un array
tridimensional para organizar la información.
## Criterios de aceptación:
### ➔ Definir la estructura de datos:
◆ Utiliza un array tridimensional [maxEmployees][2][4],
donde:
● maxEmployees: número total de empleados del
taller.
● La primera dimensión representa el nombre del
trabajador que está asignado a ese trabajo.
● La segunda dimensión representa si el vehículo es
una moto (0) o un carro (1).
● La tercera dimensión representa los detalles del
vehículo:
○ 0: Marca
○ 1: Modelo
○ 2: Año
○ 3: Estado (Pendiente, En reparación, Reparado)

### El programa debe:
➔ Pedir la cantidad de empleados dentro taller y el número de
trabajos a registrar, asegurándose de que no supere la
capacidad máxima.
➔ Solicitar la información para cada vehículo y almacenar los datos
en el array tridimensional.
➔ Mostrar todos los vehículos en una tabla, indicando su tipo,
marca, modelo, año, estado y cantidad.
➔ Contar y mostrar cuántos vehículos hay en cada estado (Por
reparar, Reparado, Vendido).
➔ Permitir buscar un vehículo por su marca y modelo, mostrando
su información.
➔ Permitir actualizar el estado de un vehículo específico.

### Consideraciones:
● Utiliza arrays de String para almacenar el tipo, marca, modelo,
año y estado de los vehículos.
● Usa ciclos for/while y condicionales if para iterar y procesar
la información.
● Asegúrate de que la búsqueda sea insensible a mayúsculas y
minúsculas.
● Utiliza métodos de String para manejar y formatear la salida.

## Ejemplo de salida esperada:
Ingrese la capacidad máxima del taller: 5
Ingrese el número de trabajos a registrar: 1

Ingrese el nombre del empleado: “Antony”
Ingrese el tipo de vehículo (Moto/Carro) 1: “Moto”
Ingrese la marca: Yamaha
Ingrese el modelo: MT-09
Ingrese el año: 2020
Ingrese el estado: Pendiente

Agenda de trabajos:
| Tipo | Marca | Modelo | Año | Estado |
|--------|---------|---------|-----|-------------|
| Moto | Yamaha | MT-09 | 2020| Pendiente |
| Carro | Toyota | Corolla | 2019| Reparado |
