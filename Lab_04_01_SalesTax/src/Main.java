public class Main {

    public static void main(String[] args)
    {
	int purchasePrice = 25;
    double salesTaxRate = .05;
    double salesTax = 0;

    salesTax = purchasePrice * salesTaxRate;
        System.out.println("the initial price of the item is " + purchasePrice + " and the sales tax rate computed is  " + salesTax);
    }
}
