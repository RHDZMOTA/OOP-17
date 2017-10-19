package com.iteso.calendar;

import java.time.LocalTime;

public class DateTime extends Date{
	private int seconds, minutes, hours;

	public int getSeconds() {
		return seconds;
	}

	public void setSeconds(int seconds) {
		this.seconds = seconds >= 0 && seconds <= 59 ? seconds : 0;
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes >= 0 && minutes <= 59 ? minutes : 0;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours >= 0 && hours <= 23 ? hours : 0;
	}
	
	public DateTime(int hh, int mi, int ss, int dd, int mm, int yy) {
		super(dd, mm, yy);
		setHours(hh);
		setMinutes(mi);
		setSeconds(ss);
	}
	
	public DateTime(int hh, int mi, int ss) {
		super();
		setHours(hh);
		setMinutes(mi);
		setSeconds(ss);
	}
	
	public DateTime() {
		super();
		setCurrentTime();
	}
	
	public DateTime(Date d) {
		super(d.getDay(), d.getMonth(), d.getYear());
		setCurrentTime();
	}
	
	private void setCurrentTime() {
		LocalTime localTime = LocalTime.now();
		setHours(localTime.getHour());
		setMinutes(localTime.getMinute());
		setSeconds(localTime.getSecond());
	}
	
	@Override
	public boolean equals(Object o) {
		if(!(o instanceof DateTime)) return false;
		DateTime d = (DateTime) o;
		return super.equals(o) && 
			   this.getHours() == d.getHours() && 
			   this.getMinutes() == d.getMinutes() &&
			   this.getSeconds() == d.getSeconds();
	}
	
	@Override
	public String toString() {
		switch(getFormat()) {
			case 1: 
			case 2:
				if(getHours() < 12)
					return String.format("[%02d:%02d:%02d AM] ", (getHours() == 0 ? 12 : getHours()), getMinutes(), getSeconds()) +  super.toString();
				else
					return String.format("[%02d:%02d:%02d PM] ", (getHours() == 12 ? 12 : getHours()- 12 ), getMinutes(), getSeconds()) +  super.toString();
			default: 
				return String.format("[%2d:%02d:%02d] ", getHours(), getMinutes(),getSeconds()) +  super.toString();	
		}
		
	}
	
	@Override
	public void next() {
		int ss = this.seconds;
		int mi = this.minutes;
		int hh = this.hours;
		ss ++;
		if(ss > 59) {
			ss = 0;
			mi ++;
			if(mi > 59) {
				mi = 0;
				hh++;
				if(hh > 23) {
					hh = 0;
					super.next();
				}
			}
		}
		setSeconds(ss);
		setMinutes(mi);
		setHours(hh);
	}
	
	public DateTime clone() {
		return new DateTime(this.getHours(), this.getMinutes(), this.getSeconds(), 
				this.getDay(), this.getMonth(), this.getYear());
	}
	
	public Date toDate() {
		return new Date(getDay(), getMonth(), getYear());
	}
	
}





