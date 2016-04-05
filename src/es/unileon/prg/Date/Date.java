package es.unileon.prg.Date;

public class Date {

	//Declaracion de las variables del constructor Date
	private int _year;
		
	private int _month;
		
	private int _day;

	
	//Declaracion del consructor Date
	public Date (int day, int month, int year) {
			
		_year = year;
		_month = month;
		_day = day;
		
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
		if (_year == anio.get_year()){
			anioIgual = true;			
		}
		return anioIgual;
	}
		
	boolean isSameMonth (Date mes){
		boolean mesIgual = false;
		if (_month == mes.get_month()){
			mesIgual = true;			
		}
		return mesIgual;
	}
		
	boolean isSameDay (Date dia){
		boolean diaIgual = false;
		if (_day == dia.get_day()){
			diaIgual = true;			
		}
		return diaIgual;
	}
		
	boolean isSame (Date fecha){
		boolean fechaIgual = false;
		if (_day == fecha.get_day() && _month == fecha.get_month() && _year == fecha.get_year()){
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
			
		if (get_month() == 2 && isLeapYear() == true && get_day() >= 1 && get_day() <= 29 ){
			correcto = true;
		}
		
		if ((get_month() == 1 || get_month() == 3 || get_month() == 5 || get_month() == 7 
				|| get_month() == 8 || get_month() == 10 || get_month() == 12) 
				&& get_day() >= 1 && get_day() <= 31){
				
			correcto = true;
		}
			
		if ((get_month() == 4 || get_month() == 6 || get_month() == 9 
				|| get_month() == 11) && get_day() >= 1 && get_day() <= 30){
			
			correcto = true;
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
	public int remainingMonths (Date fecha){
		int i, cont = 0;
		for (i = _month; i<12; i++){
			cont ++;
		}
		return cont;
	}
	
	
	//Metodo que devuelve los dias que quedan para que finalice el mes
	public int remainingDays (Date fecha){
		int i, cont = 0;
		int mes = 0;
		
		switch (_month){
			case 1: mes = 31;
			break;
			case 2: if (_year % 4 == 0){
						mes = 29;
					}
					else {
						mes = 28;
					}
			break;
			case 3: mes = 31;
			break;
			case 4: mes = 30;
			break;
			case 5: mes = 31;
			break;
			case 6: mes = 30;
			break;
			case 7: mes = 31;
			break;
			case 8: mes = 31;
			break;
			case 9: mes = 30;
			break;
			case 10: mes = 31;
			break;
			case 11: mes = 30;
			break;
			case 12: mes = 31;
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
		
		int mes = 0, cont = 0;
		

		switch (_month){
			case 1: mes = 31;
			break;
			case 2: if (_year % 4 == 0){
						mes = 29;
					}
					else {
						mes = 28;
					}
			break;
			case 3: mes = 31;
			break;
			case 4: mes = 30;
			break;
			case 5: mes = 31;
			break;
			case 6: mes = 30;
			break;
			case 7: mes = 31;
			break;
			case 8: mes = 31;
			break;
			case 9: mes = 30;
			break;
			case 10: mes = 31;
			break;
			case 11: mes = 30;
			break;
			case 12: mes = 31;
			break;	
		}

		if (mes == 31){
			cont = 7;
		}
		else if (mes == 30){
			cont = 4;
		}
		
	return cont;
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
