//import java.util.ArrayList;

public class Cart {

	static Book bookItem = new Book(8.25, 2.20);
	static CD cdItem = new CD (7.45, 0.50);
	static DVD dvdItem = new DVD (15.50, 1.00);
	
	public static void main(String[] args){
	
		ShippingVisitable[] items =  new ShippingVisitable[]{bookItem, cdItem, dvdItem};
		double printTotal = calculatePostage(items);
		
		System.out.println("Total cost for shipping: " + printTotal);
	}		
	
	 public static double calculatePostage(ShippingVisitable[] items) {
		    //create a visitor
		 	PostCostVisitor visitor = new PostCostVisitor();
		    //iterate through all items
		    for(ShippingVisitable item: items) {
		      item.accept(visitor);
		    }
		    double postage = visitor.getTotalCost();
		    return postage;
		  }
	
	
	
	
	
	/*ArrayList<ShippingVisitable> items = new ArrayList<ShippingVisitable>();
	
	items.add(bookItem);
	items.add(cdItem);
	items.add(dvdItem);
	
	 public double calculatePostage(ArrayList<ShippingVisitable> items) {
		    //create a visitor
		 	PostCostVisitor visitor = new PostCostVisitor();
		    //iterate through all items
		    for(ShippingVisitable item: items) {
		      item.accept(visitor);
		    }
		    double postage = visitor.getTotalCost();
		    return postage;
		  }
	
	 public static void main(String[] args){
			double total = calculatePostage(items);
			
		}*/
}
