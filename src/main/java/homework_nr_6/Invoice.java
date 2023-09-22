package homework_nr_6;

public class Invoice {
    public static void main(String[] args) {
        Invoice inv = new Invoice("Lenovo", "Notebook", 5, 500.5);
        inv.displayDeviceInfo();
        double totalAmount = inv.getAmount();
    }

    String deviceModel;
    String describeOfProduct;
    int countOfProductPurchased;
    double priceOfProduct;

    public Invoice(String deviceModel, String describeOfProduct, int countOfProductPurchased, double priceOfProduct) {
        this.deviceModel = deviceModel;
        this.describeOfProduct = describeOfProduct;
        this.countOfProductPurchased = countOfProductPurchased;
        this.priceOfProduct = priceOfProduct;

    }

    public String getDeviceModel() {
        return deviceModel;
    }

    public void setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;

    }

    public String getDescribeOfProduct() {
        return describeOfProduct;
    }

    public void setDescribeOfProduct(String describeOfProduct) {
        this.describeOfProduct = describeOfProduct;

    }

    public int getCountOfProductPurchased() {
        return countOfProductPurchased;
    }

    public void setCountOfProductPurchased(int countOfProductPurchased) {
        this.countOfProductPurchased = countOfProductPurchased;

    }

    public double getPriceOfProduct() {
        return priceOfProduct;
    }

    public void setPriceOfProduct(double priceOfProduct) {
        this.priceOfProduct = priceOfProduct;

    }

    public double getAmount() {

        if (priceOfProduct <= 0) {
            priceOfProduct = 0;
        }
        if (countOfProductPurchased <= 0) {
            countOfProductPurchased = 0;
        }
        double invoiceSumm = priceOfProduct * countOfProductPurchased;
        System.out.println("Count of product purchased is: " + countOfProductPurchased + "\n" + "Price of product is: " + priceOfProduct + "\n" + "Total amount: " + invoiceSumm);
        return invoiceSumm;
    }

    public void displayDeviceInfo() {
        System.out.println("Device model is: " + deviceModel + "\n" + "Describe of product: " + describeOfProduct);
    }
}

