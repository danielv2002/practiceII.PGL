package practica2PGL;
class venta {
    private int orderN;
    private int cantidad;
    private double price;
    private int orderLine;
    private int sales;
    private String dateOrder;
    private String status;
    private int id;
    private int month;
    private int year;
    private String productL;
    private String msrp;
    private int productC;
    private String cName;
    private int phone;
    private String adL;
    private String adL2;
    private String city;
    private String state;
    private int postal;
    private String country;
    private String territory;
    private String lastN;

    private String firstN;
    private String deals;

    public int getOrderN() {
        return orderN;
    }

    public void setOrderN(int orderN) {
        this.orderN = orderN;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getOrderLine() {
        return orderLine;
    }

    public void setOrderLine(int orderLine) {
        this.orderLine = orderLine;
    }

    public int getSales() {
        return sales;
    }

    public void setSales(int sales) {
        this.sales = sales;
    }

    public String getDateOrder() {
        return dateOrder;
    }

    public void setDateOrder(String dateOrder) {
        this.dateOrder = dateOrder;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getProductL() {
        return productL;
    }

    public void setProductL(String productL) {
        this.productL = productL;
    }

    public String getMsrp() {
        return msrp;
    }

    public void setMsrp(String msrp) {
        this.msrp = msrp;
    }

    public int getProductC() {
        return productC;
    }

    public void setProductC(int productC) {
        this.productC = productC;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getAdL() {
        return adL;
    }

    public void setAdL(String adL) {
        this.adL = adL;
    }

    public String getAdL2() {
        return adL2;
    }

    public void setAdL2(String adL2) {
        this.adL2 = adL2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getPostal() {
        return postal;
    }

    public void setPostal(int postal) {
        this.postal = postal;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getTerritory() {
        return territory;
    }

    public void setTerritory(String territory) {
        this.territory = territory;
    }

    public String getLastN() {
        return lastN;
    }

    public void setLastN(String lastN) {
        this.lastN = lastN;
    }

    public String getFirstN() {
        return firstN;
    }

    public void setFirstN(String firstN) {
        this.firstN = firstN;
    }

    public String getDeals() {
        return deals;
    }

    public void setDeals(String deals) {
        this.deals = deals;
    }

    public venta(int orderN, int cantidad, double price, int orderLine, int sales, String dateOrder, String status, int id, int month, int year, String productL, String msrp, int productC, String cName, int phone, String adL, String adL2, String city, String state, int postal, String country, String territory, String lastN, String firstN, String deals) {
        this.orderN = orderN;
        this.cantidad = cantidad;
        this.price = price;
        this.orderLine = orderLine;
        this.sales = sales;
        this.dateOrder = dateOrder;
        this.status = status;
        this.id = id;
        this.month = month;
        this.year = year;
        this.productL = productL;
        this.msrp = msrp;
        this.productC = productC;
        this.cName = cName;
        this.phone = phone;
        this.adL = adL;
        this.adL2 = adL2;
        this.city = city;
        this.state = state;
        this.postal = postal;
        this.country = country;
        this.territory = territory;
        this.lastN = lastN;
        this.firstN = firstN;
        this.deals = deals;
    }

}
