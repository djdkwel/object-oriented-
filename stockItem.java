
import java.util.*;
import java.io.*;
import javax.swing.JOptionPane;

public class stockItem implements Serializable{
    String productName;
    String productType;
    String productId;
    int price;
    int tax;
    int stockCount;
    static int numOfStock;
    static Scanner userInput = new Scanner(System.in);
    
    public stockItem(String productName, String productType, String productId, int stockCount,
			int price, int tax) {
		super();
		this.productName = productName;
		this.productType = productType;
		this.productId = productId;
		this.stockCount = stockCount;
		this.price = price;
		this.tax = tax;
		stockCount++;
	}
    


public void setProductName(String productName) {
		this.productName = productName;
	}



	public void setProductType(String productType) {
		this.productType = productType;
	}



	public void setProductId(String productId) {
		this.productId = productId;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	public void setTax(int tax) {
		this.tax = tax;
	}



	public void setStockCount(int stockCount) {
		this.stockCount = stockCount;
	}



	public static void setNumOfStock(int numOfStock) {
		stockItem.numOfStock = numOfStock;
	}



	public static void setUserInput(Scanner userInput) {
		stockItem.userInput = userInput;
	}



public String getProductName() {
		return this.productName;
	}




	public String getProductType() {
		return this.productType;
	}




	public String getProductId() {
		return productId;
	}




	public int getPrice() {
		return price;
	}




	public int getTax() {
		return tax;
	}




	public int getStockCount() {
		return stockCount;
	}

public String toString()
{
	return String.format("ProductName:%s, ProductType:%s,ProductId%s,Price:%s,Tax:%s,StockCount:%s",productName,productType,productId,price,tax,stockCount );
}

public static void main(String[] args){
    String productName;
    String productType;
    String productId;
    int price;
    int tax;
    int stockCount;
    int count = 0;
    
    
    ArrayList<stockItem> stocks = new ArrayList<stockItem>(5);
    stockItem item2 = new stockItem("chicken","meat","meat001",44,200,22);
    stockItem item3 = new stockItem("pork","meat","meat002",23,500,12);
    stockItem item4 = new stockItem("Apple Juice","beverage","bev002",90,100,4);
	stocks.add(item2);
	stocks.add(item3);
	stocks.add(item4);
	
	//System.out.println("Enter 1 to add stock item;enter 2 to change quantity; 3 View Stock Items; Enter 4 to exist");
    //String option = userInput.nextLine();
	String option = JOptionPane.showInputDiaglog("Enter 1 to add stock item;enter 2 to change quantity; 3 View Stock Items; Enter 4 to exist");
    int result = Integer.parseInt(option);

    switch(result) {
    //Add an item
    case 1:
    
	System.out.println("Enter ProductName: ");
	productName = userInput.nextLine();
	
	System.out.println("Enter Product Type: ");
	productType = userInput.nextLine();
	
	System.out.println("Enter Product ID: ");
	productId = userInput.nextLine();
	
	System.out.println("Enter Stock Amount: ");
	stockCount = userInput.nextInt();
	
	System.out.println("Enter Price: ");
	price = userInput.nextInt();
	
	System.out.println("Enter Tax: ");
	tax = userInput.nextInt();
	stockItem item = new stockItem(productName,productType,productId,stockCount,price,tax);
	
	stocks.add(item);
	System.out.println("Item has been added");
	break;
    	
   
	//Updates Stock Value
    case 2: 

    	System.out.println("Enter Product Type: ");
    	String product = userInput.nextLine();
    	
    	System.out.println("Enter New Amount: ");
    	int newAmount = userInput.nextInt();
  

    	for (int cnt =0; cnt< stocks.size(); cnt ++){
    		if(stocks.get(cnt).getProductName().equals(product)){
    		stocks.get(cnt).setStockCount(newAmount);
    		System.out.println("Item Updated, New Amount:"+stocks.get(cnt).getStockCount());

    		break;
    		}
    		
    	else {
    			System.out.println("Item not found");
    	}
    	}
    		
    	//View Stock items
    	case 3:
    	for (int cnt =0; cnt< stocks.size(); cnt ++){
    		System.out.println(stocks.get(cnt).toString());
    		System.out.println(" ");
    		}
    	break;

    	
		
}
	/*System.out.println("Enter 1 to add stock item;enter 2 to change quantity; 3 View Stock Items; Enter 4 to exist");
    option = userInput.nextLine();
    result = Integer.parseInt(option);
    if(result==4){
    	System.out.println("Task completed");*/
    }
    
}








