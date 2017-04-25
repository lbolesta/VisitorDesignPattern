
public class PostCostVisitor implements ShippingVisitor {

	private double totalCost; 
	
	@Override
	public void visit(Book book) {
		if(book.getPrice() < 10.0){
			totalCost += book.getWeight() * 2; 
		}
		
	}

	@Override
	public void visit(CD cd) {
		if(cd.getPrice() < 9.99){
			totalCost += cd.getWeight() * 2 + 2; 
		}
		
	}

	@Override
	public void visit(DVD dvd) {
		if(dvd.getPrice() <= 5.50){
			totalCost += dvd.getWeight() + 10; 
		}
	
	}
	
	public double getTotalCost(){
		return totalCost; 
	}
	
}
