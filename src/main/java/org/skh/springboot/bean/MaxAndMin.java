package org.skh.springboot.bean;

public class MaxAndMin {
    private String id ;
    private String name ;
    private String cp;
    private String maxtime ;
    private String mintime ;
    private String maxp ;
    private String minp;

    public MaxAndMin(String id, String name, String cp, String maxtime, String mintime, String maxp, String minp) {
        this.id = id;
        this.name = name;
        this.cp = cp;
        this.maxtime = maxtime;
        this.mintime = mintime;
        this.maxp = maxp;
        this.minp = minp;
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

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getMaxtime() {
        return maxtime;
    }

    public void setMaxtime(String maxtime) {
        this.maxtime = maxtime;
    }

    public String getMintime() {
        return mintime;
    }

    public void setMintime(String mintime) {
        this.mintime = mintime;
    }

    public String getMaxp() {
        return maxp;
    }

    public void setMaxp(String maxp) {
        this.maxp = maxp;
    }

    public String getMinp() {
        return minp;
    }

    public void setMinp(String minp) {
        this.minp = minp;
    }

    @Override
    public String toString() {
        return "MaxAndMin{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", cp='" + cp + '\'' +
                ", maxtime='" + maxtime + '\'' +
                ", mintime='" + mintime + '\'' +
                ", maxp='" + maxp + '\'' +
                ", minp='" + minp + '\'' +
                '}';
    }
}
