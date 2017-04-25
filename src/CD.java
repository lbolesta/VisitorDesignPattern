
public class CD implements ShippingVisitable {

	private double price; 
	private double weight; 
	
	public CD(double price, double weight){
		this.price = price; 
		this.weight = weight; 
	}
	
	@Override
	public void accept(ShippingVisitor sv) {
		sv.visit(this);	
	}
	
	public double getPrice(){
		return price;
	}
	
	public double getWeight(){
		return weight; 
	}
}
