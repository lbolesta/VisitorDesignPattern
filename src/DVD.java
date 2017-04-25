
public class DVD implements ShippingVisitable {
	
	private double price;
	private double weight;
	
	public DVD(double price, double weight){
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
