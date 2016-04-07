package es.unileon.prg.Date;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Date {

	//Declaracion de las variables del constructor Date
	private int _year;
		
	private int _month;
		
	private int _day;
	
	
	//Declaracion constructor Date con enteros
	public Date (int day, int month, int year) throws DateException{

		_day = day;
		_month = month;
		_year = year;
	
		if (_day < 1){
			throw new DateException("Introduzca un dia entre 1 y 30, introdujo: " +_month);
		}
		if (_month < 1 || _month > 12){
			throw new DateException("Introduzca un mes entre 1 y 12, introdujo: " +_month);
		}
	}
	
	
	//Declaracion getters y setters de los atributos de las clase Date
	public int get_year() {
		return _year;
	}

	public void set_year(int _year) {
		this._year = _year;
	}

	public int get_month() {
		return _month;
	}

	public void set_month(int _month) {
		this._month = _month;
	}

	public int get_day() {
		return _day;
	}

	public void set_day(int _day) {
		this._day = _day;
	}
		

	//Comparacion de los atributos de la clase Date
	boolean isSameYear (Date anio){
		boolean anioIgual = false;
		if (this._year == anio.get_year()){
			anioIgual = true;			
		}
		return anioIgual;
	}
		
	boolean isSameMonth (Date mes){
		boolean mesIgual = false;
		if (this._month == mes.get_month()){
			mesIgual = true;			
		}
		return mesIgual;
	}
		
	boolean isSameDay (Date dia){
		boolean diaIgual = false;
		if (this._day == dia.get_day()){
			diaIgual = true;			
		}
		return diaIgual;
	}
		
	boolean isSame (Date fecha){
		boolean fechaIgual = false;
		if (this._day == fecha.get_day() && this._month == fecha.get_month() && this._year == fecha.get_year()){
			fechaIgual = true;			
		}
		return fechaIgual;
	}
	
	
	//Metodo que comprueba si el anio es bisiesto
	public boolean isLeapYear (){
		boolean bisiesto = false;
		
		if ((get_year() % 4 == 0) && ((get_year() % 100 != 0) || (get_year() % 400 == 0))) {
			bisiesto = true;
		}
		return bisiesto;
	}
	
	
	//Metodo que devuelve el nombre del mes, en funcion del numero de mes pasado
	public String monthName (int _month) {
		
		String nombreMes = "";
		
		switch (_month) {
			case 1: nombreMes = "Enero"; 
			break;
			case 2: nombreMes = "Febrero"; 
			break;
			case 3: nombreMes = "Marzo"; 
			break;
			case 4: nombreMes = "Abril"; 
			break;
			case 5: nombreMes = "Mayo"; 
			break;
			case 6: nombreMes = "Junio"; 
			break;
			case 7: nombreMes = "Julio"; 
			break;
			case 8: nombreMes = "Agosto"; 
			break;
			case 9: nombreMes = "Septiembre"; 
			break;
			case 10: nombreMes = "Octubre"; 
			break;
			case 11: nombreMes = "Noviembre"; 
			break;
			case 12: nombreMes = "Diciembre"; 
			break;
			default: nombreMes = "Mes invalido";
			break;
		
		}
		return nombreMes;
	}
	
	//Metodo que comprueba si el dia introducido es correcto
	public boolean dayRight (){
		boolean correcto = false;
			
		switch (_month){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12: if (get_day() >= 1 && get_day() <= 31){
				correcto = true;
			}
			else {
				correcto = false;
			}
			break;
			case 4:
			case 6:
			case 9:
			case 11: if (get_day() >= 1 && get_day() <= 30){
				correcto = true;
			}
			else {
				correcto = false;
			}
			break;
			
			case 2: if (get_year() % 4 == 0){
				if (get_day() >= 1 && get_day() <= 29){
					correcto = true;
				}
			}
			else if (get_day() >= 1 && get_day() <= 28){
				correcto = true;
			}
			else{
				correcto = false;
			}
			break;
			
		}
			
		return correcto;
			
	}
	
	//Metodo que devuelve la estacion del anio
	public String season (Date fecha) {
		String estacion = "";
		
		switch (_month){
			case 1: estacion = "Invierno"; 
			break;
			case 2: estacion = "Invierno"; 
			break;
			case 3: estacion = "Primavera";
				if (_day < 21){
					estacion = "Invierno"; 
				}
			break;
			case 4: estacion = "Primavera"; 
			break;
			case 5: estacion = "Primavera"; 
			break;
			case 6: estacion = "Verano"; 
				if (_day < 21){
					estacion = "Primavera"; 
				}
			break;
			case 7: estacion = "Verano"; 
			break;
			case 8: estacion = "Verano"; 
			break;
			case 9: estacion = "Otonio";
				if (_day < 23){
					estacion = "Verano"; 
				}
			break;
			case 10: estacion = "Otonio"; 
			break;
			case 11: estacion = "Otonio"; 
			break;
			case 12: estacion = "Invierno";
				if (_day < 21){
					estacion = "Otonio"; 
				}
			break;
			default: estacion = "Mes invalido";
			break; 
		}
		
		return estacion;
	}
	
	
	//Metodo que devuelve los meses que quedan para que finalice el anio
	public String remainingMonths (Date fecha){
		int i, j;
		String mes = "", nombreMes = "";
		
		if (_month == 12){
			mes = "0";
		}
		for (i = _month+1; i<=12; i++){
			nombreMes = fecha.monthName(i);
			mes = mes.concat(nombreMes) + " ";
		}
		return mes;
	}
	
	
	//Metodo que devuelve los dias que quedan para que finalice el mes
	public int remainingDays (Date fecha){
		int i, cont = 0;
		int mes = 0;
		
		switch (_month){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12: mes = 31;
			break;
			case 4:
			case 6:
			case 9:
			case 11: mes = 30;
			break;
			case 2: if (_year % 4 == 0){
						mes = 29;
					}
					else {
						mes = 28;
					}
			break;
					
		}
 
		for (i = _day; i<mes; i++){
			cont ++;
		}
		if (_day > mes){
			System.out.println("Dia no valido para este mes");
		}
		return cont;
	}
	
		
	//Metodo que devuelve los meses con el mismo numero de dias que el mes de la fecha
	public int monthsSameNumberDays (Date fecha){
		
		int cont = 0;
		
		switch (_month){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12: cont = 7;
			break;
			case 4:
			case 6:
			case 9:
			case 11: cont = 4;
			break;
			case 2:
			break;
				
		}
		
	return cont;
	}
	
	
	//Metodo que devuelve el numero de dias desde la fecha hasta el inicio de ese anio
	public int daysSinceDate (Date fecha) {
		int mes = 0, cont = 0;
		
		for (int i=_month; i>=1; i--){
			
			switch (i){
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12: mes = 31;
				break;
				case 4:
				case 6:
				case 9:
				case 11: mes = 30;
				break;
				case 2: mes = 28;
				break;
					
			}
			cont = cont + mes;
		}
		return cont;
	}
	
	
	//Metodo que calcula un dia aleatorio entre 1 y 31
	public int randomDay(){
		
		int day = (int) (Math.random()*31+1);
		return day;
	}
	
	
	//Metodo que calcula un mes aleatorio entre 1 y 12
	public int randomMonth(){
		
		int month = (int) (Math.random()*12+1);
		return month;
	}
	
	
	//Metodo que cuenta el numero de veces necesarias para acertar el dia y el mes de una fecha
	public int countSameDate (Date fecha){
		int cont = 0;
		
		while (_day != randomDay() || _month != randomMonth()){
			cont++;
		}		
		
		return cont;
	}
	
	
	//Metodo que cuenta el numero de veces necesarias para acertar el dia y el mes de una fecha
	public int countSameDate2 (Date fecha){
		int cont = 0;
		do {
			cont++;
		}
		while (_day != randomDay() || _month != randomMonth());	
		
		return cont;
	}
		
		
	//Metodo que devuelve el dia de la semana del mes correspondiente 
	public int dayNumberName(Date fecha){
		GregorianCalendar cal = new GregorianCalendar();
		
		return cal.get(Calendar.DAY_OF_WEEK);		
	}
	
	public String dayName (Date fecha){
		String nombreDia = "";
		
		switch (dayNumberName(fecha)){
			case 1: nombreDia = "Domingo";
			break;
			case 2: nombreDia = "Lunes";
			break;
			case 3: nombreDia = "Martes";
			break;
			case 4: nombreDia = "Miercoles";
			break;
			case 5: nombreDia = "Jueves";
			break;
			case 6: nombreDia = "Viernes";
			break;
			case 7: nombreDia = "Sabado";
			break;
		}
		return nombreDia;
	}
		
	//Metodo que imprime la fecha pasada como objeto
	public String toString() {
		StringBuffer salida = new StringBuffer();
		
		salida.append("Dia: "+_day+", ");
		salida.append("mes: "+_month+" ");
		salida.append("anio: "+_year);
		
		return salida.toString();
	}

}
