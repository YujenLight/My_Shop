package app;

public class Main {
    public static void main(String[] args) {
        String productName = "smartphone";
        int quantity = 50;
        double price = 243.07;
        int days = 5;

        double totalSales = quantity * price;
        double dailySales = totalSales / days;

        System.out.printf("Product No 1: %s,\ntotal sales for %d days is EUR %.2f,\nsales by day is EUR %.2f.%n",
                productName, days, totalSales, dailySales);

        productName = "laptop";
        quantity = 25;
        price = 419.47;
        days = 7;

        totalSales = quantity * price;
        dailySales = totalSales / days;

        System.out.printf("Product No 2: %s,\ntotal sales for %d days is EUR %.2f,\nsales by day is EUR %.2f.%n",
                productName, days, totalSales, dailySales);
    }
}
