package org.skh.springboot.bean;

public class NowadaySocket {
    private String id;
    private String name;
    private String shoupan;
    private String max;
    private String min;
    private String open;
    private String close;
    private String zde;
    private String zdf;
    private String hsl;
    private String cjl;
    private String cjje;
    private String total;
    private String ltprice;
    private double a;

    public NowadaySocket(String id, String name, String shoupan, String max, String min, String open, String close, String zde, String zdf, String hsl, String cjl, String cjje, String total, String ltprice, double a) {
        this.id = id;
        this.name = name;
        this.shoupan = shoupan;
        this.max = max;
        this.min = min;
        this.open = open;
        this.close = close;
        this.zde = zde;
        this.zdf = zdf;
        this.hsl = hsl;
        this.cjl = cjl;
        this.cjje = cjje;
        this.total = total;
        this.ltprice = ltprice;
        this.a = a;
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

    public String getShoupan() {
        return shoupan;
    }

    public void setShoupan(String shoupan) {
        this.shoupan = shoupan;
    }

    public String getMax() {
        return max;
    }

    public void setMax(String max) {
        this.max = max;
    }

    public String getMin() {
        return min;
    }

    public void setMin(String min) {
        this.min = min;
    }

    public String getOpen() {
        return open;
    }

    public void setOpen(String open) {
        this.open = open;
    }

    public String getClose() {
        return close;
    }

    public void setClose(String close) {
        this.close = close;
    }

    public String getZde() {
        return zde;
    }

    public void setZde(String zde) {
        this.zde = zde;
    }

    public String getZdf() {
        return zdf;
    }

    public void setZdf(String zdf) {
        this.zdf = zdf;
    }

    public String getHsl() {
        return hsl;
    }

    public void setHsl(String hsl) {
        this.hsl = hsl;
    }

    public String getCjl() {
        return cjl;
    }

    public void setCjl(String cjl) {
        this.cjl = cjl;
    }

    public String getCjje() {
        return cjje;
    }

    public void setCjje(String cjje) {
        this.cjje = cjje;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getLtprice() {
        return ltprice;
    }

    public void setLtprice(String ltprice) {
        this.ltprice = ltprice;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "NowadaySocket{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", shoupan='" + shoupan + '\'' +
                ", max='" + max + '\'' +
                ", min='" + min + '\'' +
                ", open='" + open + '\'' +
                ", close='" + close + '\'' +
                ", zde='" + zde + '\'' +
                ", zdf='" + zdf + '\'' +
                ", hsl='" + hsl + '\'' +
                ", cjl='" + cjl + '\'' +
                ", cjje='" + cjje + '\'' +
                ", total='" + total + '\'' +
                ", ltprice='" + ltprice + '\'' +
                ", a=" + a +
                '}';
    }
}

