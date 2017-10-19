package com.iteso.calendar;

import java.time.LocalDate;

public class Date {

	private int    day = 1, month = 1, year = 2017;
	private String monthName = "Enero";
	private int    format = 0;
	
	public Date() {
		LocalDate localDate = LocalDate.now();
		setYear(localDate.getYear());
		setMonth(localDate.getMonthValue());
		setDay(localDate.getDayOfMonth());
	}

	public Date(int day, int month, int year) {
		setYear(year);
		setMonth(month);
		setDay(day);
	}

	public Date(int day, int month, int year, int format) {
		this(day, month, year);
		setFormat(format);
	}

	public int getDay() {
		return this.day;
	}

	public void setDay(int day) {
		if(day < 1 || day > 31) return;
		if(day > 28 &&  month == 2) return;
		if(day > 30 && (month == 4 || month == 6 || month == 9 || month == 11)) return;
		this.day = day;
	}

	public int getMonth() {
		return this.month;
	}

	public void setMonth(int month) {
		if(this.month >= 1 && this.month <= 12)  {
			this.month = month;
			switch(this.month) {
				case  1: this.monthName = "Enero"; 		break; 
				case  2: this.monthName = "Febrero"; 	break;
				case  3: this.monthName = "Marzo"; 		break;
				case  4: this.monthName = "Abril"; 		break;
				case  5: this.monthName = "Mayo"; 		break;
				case  6: this.monthName = "Junio";      break;
				case  7: this.monthName = "Julio";      break;
				case  8: this.monthName = "Agosto";     break;
				case  9: this.monthName = "Septiembre"; break;
				case 10: this.monthName = "Octubre";    break;
				case 11: this.monthName = "Noviembre";  break;
				default: this.monthName = "Diciembre";
			}
		}
	}

	public int getYear() {
		return this.year;
	}

	public void setYear(int year) {
		if(year >= 1900 && year <= 3000) this.year = year;
	}

	public int getFormat() {
		return this.format;
	}
	
	public void setFormat(int format) {
		if(format >= 0 && format <= 2) this.format = format;
	}
	
	public String getMonthName() {
		return this.monthName;
	}
	
	public String toString() {
		switch(this.format) {
			case 0  : return String.format("%02d/%02d/%02d", this.day, this.month,                     this.year % 100);
			case 1  : return String.format("%d-%s-%d",       this.day, this.monthName.substring(0, 3), this.year);
			default : return String.format("%d de %s de %d", this.day, this.monthName.toLowerCase(),   this.year);
		}
	}
	
	public boolean equals(Object o) {
		if(!(o instanceof Date)) return false;
		Date d = (Date) o;
		return this.day == d.day && this.month == d.month && this.year == d.year;
	}

	public Date clone() {
		return new Date(this.day, this.month, this.year, this.format);
	}
	
	public void next() {
		int dd = this.day;
		int mm = this.month;
		int yy = this.year;
		dd ++;
		if(dd > 28 &&  month == 2 ||
		   dd > 30 && (month == 4 || month == 6 || month == 9 || month == 11) ||
		   dd > 31) {
			dd = 1;
			mm ++;
			if(mm > 12) {
				mm = 1;
				yy ++;
			}
		}
		setDay(dd);
		setMonth(mm);
		setYear(yy);
	}
	
}
