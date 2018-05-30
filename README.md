# Lab-A4
This repository contains the Product program and the Car program.

The class Product has methods and properties to track its sale.
The class Product should have the following attributes:
  companyName – static variable is a String that defines the name of the company. When you run the program note how one of the Product      objects changes companyName and that change is seen by all other Product objects created in the driver.
  name – name of the product is a String
  cost – wholesale cost to the retailer is a double
  unitPrice – selling price of a unit before any discount is a double
  discount – percent discount is a double
  unitSalePrice – selling price of a unit after discount is a double
  quantitySold – number of units sold is an integer
  
The class Product has 3 overridden constructors
  Default constructor that sets name to an empty string (“”) and all numeric fields to 0
  A constructor that has 5 parameters in the given order – name, cost, price before discount, percent discount, quantity sold. This     constructor must initialize all the attributes of the product. The unitSalePrice must be calculated by calling the calculateSalePrice method
  A constructor that has 4 parameters in the given order – name, cost, price before discount, quantity sold. This constructor will be used to set up a product that is not on sale and hence discount must be set to 0. The unitSalePrice will be the same as the unitPrice. All other attributes are set to their passed values.
  
The class Product has a private method calculateSalePrice that calculates the sale price after applying the discount. This method is called in the constructor and whenever the discount rate is changed (in the setDiscount method).

The class Product also has several accessor and modifier methods to return and set the values of the fields.

In addition to the accessor and modifier methods, the class has two methods to calculate the profit:
  unitProfit – returns the profit on the sale of a unit of the item
  totalProfit – returns the profit earned on the sale of all the units (specified in the quantity sold) of the item
  
  
The class Car has methods and properties to track its miles per gallon. Specifically, it has the properties of an odometer and the amount of gallons it has consumed since its last trip to the gas station. 

The Car class contains:
A constructor Car takes one parameter and initializes the start odometer.

A method called fillUp takes two parameters - current odometer reading and the gallons of fuel used and assigns these to their respective class attributes.

A method resetMPG takes no parameters and resets the properties of the class. The gallons consumed is set back to 0. The start odometer takes the value of the current odometer.
  
