package org.skh.springboot.bean;

public class DownSocket {

    private String id ;
    private String name ;
    private String cprice ;
    private String zf ;
    private int downday ;

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

    public String getCprice() {
        return cprice;
    }

    public void setCprice(String cprice) {
        this.cprice = cprice;
    }

    public String getZf() {
        return zf;
    }

    public void setZf(String zf) {
        this.zf = zf;
    }

    public int getDownday() {
        return downday;
    }

    public void setDownday(int downday) {
        this.downday = downday;
    }

    @Override
    public String toString() {
        return "DownSocket{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", cprice='" + cprice + '\'' +
                ", zf='" + zf + '\'' +
                ", downday=" + downday +
                '}';
    }
}
