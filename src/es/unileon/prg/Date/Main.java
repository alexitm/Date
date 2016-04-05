package es.unileon.prg.Date;

public class Main {

public static void main(String[] args) {
		
		Date fecha1 = new Date (29,4,2015);
		Date fecha2 = new Date (29,2,2016);
		
		System.out.println(fecha1);
		System.out.println("El nombre del mes es: " +fecha1.monthName(fecha1.get_month()));
		System.out.println("El anio es bisiesto: " +fecha1.isLeapYear());
		System.out.println("El dia es correcto: " +fecha1.dayRight());
		System.out.println("La estacion de fecha1 es: " +fecha1.season(fecha1));
		System.out.println("Quedan " +fecha1.remainingMonths(fecha1)+ " meses para terminar el anio");
		System.out.println("Quedan " +fecha1.remainingDays(fecha1)+ " dias para terminar el mes");
		System.out.println(fecha1.monthsSameNumberDays(fecha1)+ " meses con el mismo numero de dias");
		System.out.println("_____________________________________");
		System.out.println(fecha2);		
		System.out.println("El nombre del mes es: " +fecha2.monthName(fecha2.get_month()));
		System.out.println("El anio es bisiesto: " +fecha2.isLeapYear());
		System.out.println("El dia es correcto: " +fecha2.dayRight());
		System.out.println("La estacion de fecha1 es: " +fecha2.season(fecha2));
		System.out.println("Quedan " +fecha2.remainingMonths(fecha2)+ " meses para terminar el anio");
		System.out.println("Quedan " +fecha2.remainingDays(fecha2)+ " dias para terminar el mes");
		System.out.println(fecha2.monthsSameNumberDays(fecha2)+ " meses con el mismo numero de dias");
		System.out.println("_____________________________________________________");
		System.out.println("El dia de fecha1 y fecha2 son iguales: " +fecha1.isSameDay(fecha2));
		System.out.println("El mes de fecha1 y fecha2 son iguales: " +fecha1.isSameMonth(fecha2));
		System.out.println("El anio de fecha1 y fecha2 son iguales: " +fecha1.isSameYear(fecha2));
		System.out.println("El dia, mes y anio de fecha1 y fecha2 son iguales: " +fecha1.isSame(fecha2));
	}

}
