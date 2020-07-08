package org.skh.springboot.bean;

public class Predict_New {
    private String for1 ;
    private String for2 ;
    private String for3 ;

    public Predict_New(String for1, String for2, String for3) {
        this.for1 = for1;
        this.for2 = for2;
        this.for3 = for3;
    }

    public String getFor1() {
        return for1;
    }

    public void setFor1(String for1) {
        this.for1 = for1;
    }

    public String getFor2() {
        return for2;
    }

    public void setFor2(String for2) {
        this.for2 = for2;
    }

    public String getFor3() {
        return for3;
    }

    public void setFor3(String for3) {
        this.for3 = for3;
    }

    @Override
    public String toString() {
        return "Predict_New{" +
                "for1='" + for1 + '\'' +
                ", for2='" + for2 + '\'' +
                ", for3='" + for3 + '\'' +
                '}';
    }
}
