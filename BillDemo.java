import java.util.*;
class Product{
	private String name;
	private int unitPrice;
	
	Product(String name,int price){
		this.name=name;
		this.unitPrice=price;
	}
	public String getName(){
		return name;
	}
	public int getUnitPrice(){
		return unitPrice;
	}
	public void setUnitPrice(int newPrice){
		this.unitPrice=newPrice;
	}
}


class BillEntry{
	Product p;
	int quantity;
	
	BillEntry(Product p,int qty){
	
		this.p=p;
		this.quantity=qty;
	}	
	void printBillEntry(){
		System.out.println("Name "+p.getName()+", Unit Price: "+p.getUnitPrice()+",	Quantity : "+quantity+", Total Price :"+p.getUnitPrice()*quantity);
	}
	
}

class Bill{
	
	List<BillEntry> billEntries=new ArrayList<>();
	
	void addEntry(BillEntry be){
		billEntries.add(be);
	}
	
	void printBill(){
		for(BillEntry e:billEntries){
			System.out.println("Product name :"+e.p.getName()+" x"+e.quantity+" = "+e.quantity*e.p.getUnitPrice());
		}
	}
}


class BillDemo{
	static void print(String s){
		System.out.println(s);
	}
	static void printProductDetail(Product p){
		print("Name "+p.getName()+" ,Unit Price"+p.getUnitPrice());
	}
	public static void main(String []args){
		print("Welcome to Demo shop");
		print("Entering Products");
		
		Product milk= new Product("Diamond",140);
		
		Product bread=new Product("Prima",160);
		
		BillEntry be1=new BillEntry(milk,10);
		BillEntry be2=new BillEntry(bread,12);
		
		Bill b=new Bill();
		b.addEntry(be1);
		b.addEntry(be2);
		b.addEntry(new BillEntry(new Product("Newdale",80),4));
		
		b.printBill();
		
	}
	
}