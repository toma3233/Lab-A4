/**
 * 
 * Tom Abraham
 * Period  #1
 *
 */
public class Product {//Initializes all the instance variables
	static String companyName;
	String name;
	double cost;
	double unitPrice;
	double discount;
	double unitSalePrice;
	int quantitySold;

	/**
	 * Default constructor sets all numeric values to 0 and strings to empty strings
	 */
	public Product() {
	}

	/**
	 * Constructor to initialize all the fields and calculate the sale price
	 * after discount
	 * 
	 * @param pName - product name
	 * @param pCost - product cost
	 * @param price - product sale price before discount
	 * @param pDiscount - percent discount
	 */
	public Product(String pName, double pCost, double price, double pDiscount, int qty) {
		name = pName;
		cost = pCost;
		unitPrice = price;
		discount = pDiscount;
		quantitySold = qty;
	  calculateSalePrice();
	}

	public Product(String pName, double pCost, double price, int qty) {
		name = pName;
		cost = pCost;
		unitPrice = price;
		quantitySold = qty;
		unitSalePrice = unitPrice;//Your code goes here
	}

	/**
	 * Calculates the sale price after applying the discount
	 * 
	 * @return sale price after discount
	 */
	private double calculateSalePrice() {
		unitSalePrice = unitPrice - (unitPrice * (discount/100));
		return unitSalePrice;
	}

	/**
	 * Modifies the name of the product
	 * 
	 * @param name - new product name
	 */
	public void setName(String pName) {
		this.name = pName;
	}

	/**
	 * Modifies the cost of the product
	 * 
	 * @param pCost - new product cost
	 */
	public void setCost(double pCost) {
		this.cost = pCost;
	}

	/**
	 * Modifies the sale price before discount
	 * 
	 * @param price - new sale price before discount
	 */
	public void setPrice(double price) {
		this.unitPrice = price
	}

	/**
	 * Modifies the discount rate and recalculates the sale price after applying
	 * the new discount
	 * 
	 * @param pDiscount - new percent discount
	 */
	public void setDiscount(double pDiscount) {
		this.discount = pDiscount;
		calculateSalePrice();
	}

	/**
	 * Modifies the quantity sold
	 * 
	 * @param qty - new quantity sold
	 */
	public void setQuantitySold(int qty) {
		this.quantitySold = qty;
	}
	/**
	 * Sets the name of the company
	 * 
	 * @param cName
	 *            - name of the company
	 */
	public void setCompany(String cName) {
		this.companyName = cName;
	}
	/**
	 * Gets the product name
	 * 
	 * @return name of product
	 */
	public String getName() {
		return name;
	}

	/**
	 * Gets the cost of the product
	 * 
	 * @return cost of product
	 */
	public double getCost() {
		return cost;
	}

	/**
	 * Gets the price of the product before discount
	 * 
	 * @return sale price before discount
	 */
	public double getPrice() {
		return unitPrice;
	}

	/**
	 * Gets the discount rate
	 * 
	 * @return percent discount
	 */
	public double getDiscount() {
		return discount;
	}

	/**
	 * Gets the price after discount
	 * 
	 * @return price after discount
	 */
	public double getSalePrice() {
		return unitSalePrice;//Your code goes here
	}

	/**
	 * Gets the quantity sold
	 * 
	 * @return quantity sold
	 */
	public int getQuantitySold() {
		return quantitySold;//Your code goes here
	}
	/**
	 * Returns the name of the company
	 * 
	 * @return name of the company
	 */
	public String getCompanyName() {
		return companyName;
	}
	/**
	 * Returns the profit earned on the product
	 * 
	 * @return difference between salePrice and cost
	 */
	private double unitProfit() {
		return (unitSalePrice - cost);
	}

	/**
	 * Returns the profit earned on the given quantity of the product
	 * 
	 * @param qty
	 *            - number of units sold
	 * @return profit earned on the number of units sold
	 */
	public double totalProfit() {
		return (unitSalePrice * quantitySold) - (cost * quantitySold);
	}

	/**
	 * Method to return the product information as a string
	 */
	public String toString() {
		String s;
		s = companyName + "\n";
		s += "------------------------------------------------------\n";
		s += String.format("%s: \nCost           = $%8.2f\n", name, getCost());
		s += String.format("Price          = $%8.2f\n", getPrice());
		s += String.format("Discount       = %8.2f%s", getDiscount(), "%\n");
		s += String.format("Sale Price     = $%8.2f\n", getSalePrice());
		s += String.format("Quantity Sold  = $%8d\n", getQuantitySold());
		s += String.format("Profit/unit    = $%8.2f\n", unitProfit());
		s += String.format("Total Profit   = $%8.2f\n", totalProfit());
		return s;
	}
}
