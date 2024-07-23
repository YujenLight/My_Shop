package app;

public class Main {
    public static void main(String[] args) {

        String productName1 = "smartphone";
        int quantity1 = 50;
        double price1 = 243.07;
        int days1 = 5;

        String productName2 = "laptop";
        int quantity2 = 25;
        double price2 = 419.47;
        int days2 = 7;

        double totalSales1 = quantity1 * price1;
        double dailySales1 = totalSales1 / days1;

        double totalSales2 = quantity2 * price2;
        double dailySales2 = totalSales2 / days2;


        System.out.printf("Product No 1: %s,\ntotal sales for %d days is EUR %.2f,\nsales by day is EUR %.2f.%n",
                productName1, days1, totalSales1, dailySales1);


        System.out.printf("Product No 2: %s,\ntotal sales for %d days is EUR %.2f,\nsales by day is EUR %.2f.%n",
                productName2, days2, totalSales2, dailySales2);
    }
}
