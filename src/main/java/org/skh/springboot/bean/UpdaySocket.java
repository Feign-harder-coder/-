package org.skh.springboot.bean;

public class UpdaySocket {
    private String id ;
    private String name ;
    private String cprice ;
    private String zf ;
    private int upday ;

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

    public int getUpday() {
        return upday;
    }

    public void setUpday(int upday) {
        this.upday = upday;
    }

    @Override
    public String toString() {
        return "UpdaySocket{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", cprice='" + cprice + '\'' +
                ", zf='" + zf + '\'' +
                ", upday=" + upday +
                '}';
    }

    public UpdaySocket(String id, String name, String cprice, String zf, int upday) {
        this.id = id;
        this.name = name;
        this.cprice = cprice;
        this.zf = zf;
        this.upday = upday;
    }
}
