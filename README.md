Abstracción

¿Qué se solicita finalmente?
Se solicita un programa que gestione y tenga ciertas funcionalidades propias de una estación de peaje.


¿Qué información es relevante?
		Estación Peaje
nombre
departamento que está ubicada
un valor numérico del total recaudado
		Vehículo
placa
número de peajes pagos
capacidad de carga (SOLO camiones)
		Persona
nombre
apellidos
nro documento de identidad
fecha de nacimiento
lista de vehículos asignados (SOLO conductores)
salario mensual (SOLO recaudadores)

¿Cómo se agrupa la información relevante?
se agrupa en clases y subclases dependiendo de qué es lo que requiere cada una, también se añadiran ENUMS y se aplicará el concepto de herencia. 
¿Que funcionalidades se solicitan finalmente?
 Asignar un vehículo a una persona, permitiendo que una persona tenga múltiples vehículos de diferentes tipos.
Imprimir en pantalla un listado de los vehículos que llegaron al peaje, el tipo de vehículo, el cálculo detallado de cada peaje y el total acumulado.
Se requiere implementar un método en Vehiculo que retorne una cadena descriptiva con la información del vehículo, incluyendo tipo, placa y detalles particulares como cilindraje o número de ejes y capacidad de carga. Esta descripción se usará para generar reportes de control.
Consultar el total de dinero pagado en peajes por cada vehículo que una persona tiene asignado, detallando el cálculo realizado.
Devolver una lista de vehículos de un conductor que coincidan con un tipo específico ("Carro", "Moto", "Camion").
Calcular el valor del peaje de un vehículo X, actualiza el valor total recaudado y guarda el registro del paso del vehículo.
Busca un recaudador por nombre completo (nombre + apellidos) ignorando mayúsculas y espacios adicionales.
La gerencia requiere identificar los conductores que tienen al menos un camión con capacidad de carga mayor a 10 toneladas. Se debe implementar un método que devuelva una lista con estos conductores, permitiendo tomar decisiones sobre tarifas o restricciones de circulación para vehículos de alto tonelaje.
	También se añaden los métodos CRUD y también los métodos Getters y Setters.
