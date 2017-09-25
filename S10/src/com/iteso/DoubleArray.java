package com.iteso;

public class DoubleArray {
    private int id;
    private double value;

    public DoubleArray(int id, double value) {
        this.id = id;
        this.value = value;
    }

    @Override
    public String toString() {
        return "DoubleArray{" +
                "id=" + id +
                ", value=" + value +
                '}';
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValue() {
        return this.value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("id " + getId());
        super.finalize();
    }
}
