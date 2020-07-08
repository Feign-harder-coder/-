package org.skh.springboot.bean;

public class LowMaxAndMin {
    private String year_a;
    private String name;
    private String half_year;

    public LowMaxAndMin(String year_a, String name, String half_year) {
        this.year_a = year_a;
        this.name = name;
        this.half_year = half_year;
    }

    public String getYear_a() {
        return year_a;
    }

    public void setYear_a(String year_a) {
        this.year_a = year_a;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHalf_year() {
        return half_year;
    }

    public void setHalf_year(String half_year) {
        this.half_year = half_year;
    }

    @Override
    public String toString() {
        return "LowMaxAndMin{" +
                "year_a='" + year_a + '\'' +
                ", name='" + name + '\'' +
                ", half_year='" + half_year + '\'' +
                '}';
    }
}
