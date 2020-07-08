package org.skh.springboot.bean;

public class SingleSocket {
    private String date;
    private double open ;
    private double close;
    private double maxp ;
    private double minp;

    public SingleSocket(String date, double open, double close, double maxp, double minp) {
        this.date = date;
        this.open = open;
        this.close = close;
        this.maxp = maxp;
        this.minp = minp;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getOpen() {
        return open;
    }

    public void setOpen(double open) {
        this.open = open;
    }

    public double getClose() {
        return close;
    }

    public void setClose(double close) {
        this.close = close;
    }

    public double getMaxp() {
        return maxp;
    }

    public void setMaxp(double maxp) {
        this.maxp = maxp;
    }

    public double getMinp() {
        return minp;
    }

    public void setMinp(double minp) {
        this.minp = minp;
    }

    @Override
    public String toString() {
        return "SingleSocket{" +
                "date='" + date + '\'' +
                ", open=" + open +
                ", close=" + close +
                ", maxp=" + maxp +
                ", minp=" + minp +
                '}';
    }
}
