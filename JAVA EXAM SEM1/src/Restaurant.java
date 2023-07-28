public class Restaurant {
    private String menuItems;
    private double prices;
    private double ratings;

    public Restaurant(String menuItems, double prices, double ratings) {
        this.menuItems = menuItems;
        this.prices = prices;
        this.ratings = ratings;
    }

    public String getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(String menuItems) {
        this.menuItems = menuItems;
    }

    public double getPrices() {
        return prices;
    }

    public void setPrices(double prices) {
        this.prices = prices;
    }

    public double getRatings() {
        return ratings;
    }

    public void setRatings(double ratings) {
        this.ratings = ratings;
    }
}
