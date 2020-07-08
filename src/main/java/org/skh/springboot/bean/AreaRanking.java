package org.skh.springboot.bean;

public class AreaRanking {
  private String industry ;
  private int total ;
  private int up ;
  private int down ;
  private String avgprice ;
  private String zhangfu ;
  private String cjl ;
  private String cjj ;
  private String maxc2 ;
  private String acurrent;
  private String zf ;
  private String minc2 ;
  private String icurrent ;
  private String minzf ;

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getUp() {
        return up;
    }

    public void setUp(int up) {
        this.up = up;
    }

    public int getDown() {
        return down;
    }

    public void setDown(int down) {
        this.down = down;
    }

    public String getAvgprice() {
        return avgprice;
    }

    public void setAvgprice(String avgprice) {
        this.avgprice = avgprice;
    }

    public String getZhangfu() {
        return zhangfu;
    }

    public void setZhangfu(String zhangfu) {
        this.zhangfu = zhangfu;
    }

    public String getCjl() {
        return cjl;
    }

    public void setCjl(String cjl) {
        this.cjl = cjl;
    }

    public String getCjj() {
        return cjj;
    }

    public void setCjj(String cjj) {
        this.cjj = cjj;
    }

    public String getMaxc2() {
        return maxc2;
    }

    public void setMaxc2(String maxc2) {
        this.maxc2 = maxc2;
    }

    public String getAcurrent() {
        return acurrent;
    }

    public void setAcurrent(String acurrent) {
        this.acurrent = acurrent;
    }

    public String getZf() {
        return zf;
    }

    public void setZf(String zf) {
        this.zf = zf;
    }

    public String getMinc2() {
        return minc2;
    }

    public void setMinc2(String minc2) {
        this.minc2 = minc2;
    }

    public String getIcurrent() {
        return icurrent;
    }

    public void setIcurrent(String icurrent) {
        this.icurrent = icurrent;
    }

    public String getMinzf() {
        return minzf;
    }

    public void setMinzf(String minzf) {
        this.minzf = minzf;
    }

    @Override
    public String toString() {
        return "AreaRanking{" +
                "industry='" + industry + '\'' +
                ", total=" + total +
                ", up=" + up +
                ", down=" + down +
                ", avgprice='" + avgprice + '\'' +
                ", zhangfu='" + zhangfu + '\'' +
                ", cjl='" + cjl + '\'' +
                ", cjj='" + cjj + '\'' +
                ", maxc2='" + maxc2 + '\'' +
                ", acurrent='" + acurrent + '\'' +
                ", zf='" + zf + '\'' +
                ", minc2='" + minc2 + '\'' +
                ", icurrent='" + icurrent + '\'' +
                ", minzf='" + minzf + '\'' +
                '}';
    }
}
