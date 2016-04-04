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
	public void isSameYear (int _year){
		if (get_year() == _year){
			
		}
	}
		
	public void isSameMonth (){
		
	}
		
	public void isSameDay (){
		
	}
		
	public void isSame (){
		
	}
	
	
	//Metodo que comprueba si el anio es bisiesto
	public boolean isLeapYear (){
		boolean bisiesto = false;
		
		if ((get_year() % 4 == 0) && ((get_year() % 100 != 0) || (get_year() % 400 == 0))) {
			bisiesto = true;
		}
		return bisiesto;
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
	
	public String toString() {
		StringBuffer salida = new StringBuffer();
		
		salida.append("Dia: "+_day+", ");
		salida.append("mes: "+_month+" ");
		salida.append("anio: "+_year);
		
		return salida.toString();
	}
	
	
	public static void main(String[] args) {
		
		Date fecha1 = new Date (29,2,2016);
		//Date fecha2 = new Date (29,2,2016);
		
		System.out.println(fecha1);
		System.out.println("El nombre del mes es: " +fecha1.monthName(fecha1.get_month()));
		System.out.println("El anio es bisiesto: " +fecha1.isLeapYear());
		System.out.println("El mes es correcto: " +fecha1.dayRight());

	}

}
