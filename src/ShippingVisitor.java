
public interface ShippingVisitor {
	public void visit(Book book);
	public void visit(CD cd);
	public void visit(DVD dvd);
}
