package com.iteso.calendar;

@SuppressWarnings("ALL")
public class Date {
    private int day;
    private int month;
    private int year;
    private String monthName;
    private int format;

    /**
     * Contructor that requires nothing.
     */
    public Date() {
        this(1, 1, 2017, 0);

    }

    /**
     * Constructor for date, month and year
     * @param dd integer day
     * @param mm integer month
     * @param yy integer year
     */
    public Date(int dd, int mm, int yy) {
        this(dd, mm, yy, 0);
    }

    /**
     * Constructor for date, month, year and format.
     * @param dd integer day
     * @param mm integer month
     * @param yy integer year
     * @param format integer format
     */
    public Date(int dd, int mm, int yy, int format) {
        setMonth(mm);
        setDay(dd);
        setYear(yy);
        setFormat(format);
    }

    /**
     * Getter for month attribute.
     * @return integer month.
     */
    public int getMonth() {
        return this.month;
    }

    /**
     * Setter for month attribute and month name attribute.
     * @param month
     */
    public void setMonth(int month) {
        this.month = (month <= 12 && month >= 1) ? month : 0;
        this.monthName = getMonthName();
    }

    /**
     * Getter for year.
     * @return year as integer.
     */
    public int getYear() {
        return this.year;
    }

    /**
     * Setter for year.
     * @param year year as integer.
     */
    public void setYear(int year) {
        this.year = (year <= 3000 && year >= 1900) ? year : 2017;
    }

    /**
     * Getter for day.
     * @return day as integer.
     */
    public int getDay() {
        return this.day;
    }

    /**
     * Setter for day.
     * @param day day as integer.
     */
    public void setDay(int day) {
        if (getMonth() == 2) {
            this.day = (day >= 1 && day <= 28) ? day : 1;
        } else if (isIntElementPresent(getMonth(), new int[] {4, 6, 9, 11})) {
            this.day = (day >= 1 && day <= 30) ? day : 1;
        } else {
            this.day = (day >= 1 && day <= 31) ? day : 1;
        }
    }

    /**
     * Given an array of integer elements return true if element is on the list.
     * @param element integer value
     * @param elements array of integers
     * @return boolean
     */
    private boolean isIntElementPresent(int element, int[] elements) {
        for (int i :  elements)
            if (i == element)
                return true;
        return false;
    }

    /**
     * Given an array of string elements return true if eleent is on the list.
     * @param element a string
     * @param elements an array of strings.
     * @return boolean
     */
    private boolean isStringElementPresent(String element, String[] elements) {
        for (String i : elements)
            if (element.equals(i))
                return true;
        return false;
    }

    /**
     * Getter for month name.
     * @return String representing the month's name.
     */
    public String getMonthName() {
        String[] months = new String[] {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
                "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        return months[getMonth()-1];
    }

    /**
     * Format getter.
     * @return format as integer.
     */
    public int getFormat() {
        return this.format;
    }

    /**
     * Format setter.
     * @param format format as integer.
     */
    public void setFormat(int format) {
        this.format = (2 >= format && 0 <= format) ? format : 0;
    }

    /**
     * String representation of this class according given some formatting.
     * @return String.
     */
    @Override
    public String toString() {

        if (getFormat() == 0)
            return String.format("%02d", getDay()) + "/" + String.format("%02d", getMonth()) +
                    "/" + Integer.toString(getYear()).substring(2,4);
        if (getFormat() == 1)
            return getDay() + "-" + getMonthName().substring(0, 3) + "-" + getYear();
        if (getFormat() == 2)
            return getDay() + " de " + getMonthName() + " de " + getYear();
        return "Date{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                ", monthName='" + monthName + '\'' +
                ", format=" + format +
                '}';
    }

    /**
     * Determine if onother object equals this one.
     * @param o Another object.
     * @return Boolean.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Date)) return false;

        Date date = (Date) o;

        if (getDay() != date.getDay()) return false;
        if (getMonth() != date.getMonth()) return false;
        if (getYear() != date.getYear()) return false;

        return true;
    }

    /**
     * Create a clone of this object with the relevant characteristics.
     * @return Date instance.
     */
    public Date clone() {
        return new Date(getDay(), getMonth(), getYear(), getFormat());
    }

    /**
     * Return the next date object (natural date).
     * @return Date instance.
     */
    public Date next() {
        if (getMonth() == 2) {
            if (getDay() == 28)
                return new Date(1, getMonth()+1, getYear(), getFormat());
            return new Date(getDay() + 1, getMonth(), getYear(), getFormat());
        } else if (isIntElementPresent(getMonth(), new int[] {4, 6, 9, 11})) {
            if (getDay() == 30)
                return new Date(1, getMonth()+1, getYear(), getFormat());
            return new Date(getDay()+1, getMonth(), getYear(), getFormat());
        } else {
            if (getDay() == 31) {
                if (getMonth() == 12)
                    return new Date(1, 1, getYear()+1);
                return new Date(1, getMonth()+1, getYear(), getFormat());
            } else {
                return new Date(getDay()+1, getMonth(), getYear(), getFormat());
            }
        }
    }
}
