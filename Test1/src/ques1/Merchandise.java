package ques1;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

class MyComparator implements Comparator<Merchandise>{
	@Override
	public int compare(Merchandise o1, Merchandise o2) {

		return Double.compare(o2.getUnitPrice(), o1.getUnitPrice());
	}
}
class SortAsPerName implements Comparator<Merchandise> {
@Override
public int compare(Merchandise o1,Merchandise o2) {
return ((o1.getItemCode()).compareTo(o2.getItemCode())) ;
}
}
public class Merchandise {
	private String itemCode;
	private int quantity;
	private double unitPrice;




	public Merchandise(String itemCode, int quantity, double unitPrice) {
		super();
		this.itemCode = itemCode;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
	}



	public String getItemCode() {
		return itemCode;
	}



	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}



	public int getQuantity() {
		return quantity;
	}



	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}



	public double getUnitPrice() {
		return unitPrice;
	}



	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Merchandise [itemCode=").append(itemCode).append(", quantity=").append(quantity)
		.append(", unitPrice=").append(unitPrice).append("]");
		return builder.toString();
	}

	

}
