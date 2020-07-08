package org.skh.springboot.bean;

public class MapArea {

      public String provinceName ;//省份名称
      public int shopCount; //公司总数
      public int totalPrice; // 下跌公司
      public int orderCount; // 上涨公司
      public String cityKey; // 领涨公司
      public String onlineCount ; //领跌公司
      public String provinceKey ; //涨幅

    public MapArea(String provinceName, int shopCount, int totalPrice, int orderCount, String cityKey, String onlineCount, String provinceKey) {
        this.provinceName = provinceName;
        this.shopCount = shopCount;
        this.totalPrice = totalPrice;
        this.orderCount = orderCount;
        this.cityKey = cityKey;
        this.onlineCount = onlineCount;
        this.provinceKey = provinceKey;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getShopCount() {
        return shopCount;
    }

    public void setShopCount(int shopCount) {
        this.shopCount = shopCount;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getOrderCount() {
        return orderCount;
    }

    public void setOrderCount(int orderCount) {
        this.orderCount = orderCount;
    }

    public String getCityKey() {
        return cityKey;
    }

    public void setCityKey(String cityKey) {
        this.cityKey = cityKey;
    }

    public String getOnlineCount() {
        return onlineCount;
    }

    public void setOnlineCount(String onlineCount) {
        this.onlineCount = onlineCount;
    }

    public String getProvinceKey() {
        return provinceKey;
    }

    public void setProvinceKey(String provinceKey) {
        this.provinceKey = provinceKey;
    }

    @Override
    public String toString() {
        return "MapArea{" +
                "provinceName='" + provinceName + '\'' +
                ", shopCount=" + shopCount +
                ", totalPrice=" + totalPrice +
                ", orderCount=" + orderCount +
                ", cityKey='" + cityKey + '\'' +
                ", onlineCount='" + onlineCount + '\'' +
                ", provinceKey='" + provinceKey + '\'' +
                '}';
    }
}
