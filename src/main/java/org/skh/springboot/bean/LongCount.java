package org.skh.springboot.bean;

public class LongCount {
    private String id;
    private String name;
    private double week_a;
    private double month_b;
    private double half_year;
    private double year_a;

    public LongCount(String id, String name, double week_a, double month_b, double half_year, double year_a) {
        this.id = id;
        this.name = name;
        this.week_a = week_a;
        this.month_b = month_b;
        this.half_year = half_year;
        this.year_a = year_a;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeek_a() {
        return week_a;
    }

    public void setWeek_a(double week_a) {
        this.week_a = week_a;
    }

    public double getMonth_b() {
        return month_b;
    }

    public void setMonth_b(double month_b) {
        this.month_b = month_b;
    }

    public double getHalf_year() {
        return half_year;
    }

    public void setHalf_year(double half_year) {
        this.half_year = half_year;
    }

    public double getYear_a() {
        return year_a;
    }

    public void setYear_a(double year_a) {
        this.year_a = year_a;
    }

    @Override
    public String toString() {
        return "LongCount{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", week_a=" + week_a +
                ", month_b=" + month_b +
                ", half_year=" + half_year +
                ", year_a=" + year_a +
                '}';
    }
}
