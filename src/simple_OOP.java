class Product{  // if you say public class then it should be defined in its own file
	// attributes of the class
	private String name; // private variable cannot be accessed directly . you need to have getter and setter .try accessing you will get an error.
	int itemNo;
	int price;
	
	Product(String name,int itemNo,int price){
		System.out.println("constructore created");
		this.name=name;
		this.itemNo=itemNo;
		this.price=price;
		
		
	}
	
	void set_name(String name) {
		this.name=name;
		
	}
	
	String get_name() {
		return this.name;
	}
	
	// method in a class
	void product_print() {
		System.out.println("Name"+name+".");
		System.out.println("Price"+price+"");
		System.out.println("Item Number"+itemNo+"");
	}
	
	
}

class Mobile extends Product{

	Mobile(String name, int itemNo, int price) { // add a autogenerated constructor from parent
		super(name, itemNo, price);
		// TODO Auto-generated constructor stub
	}
	

	
	
}
public class simple_OOP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// create a instance of a class
		Product myObj=new Product("printing paper",1,2);
//		System.out.println(myObj.name);  // access the properties -> attributes of the class
		myObj.set_name("printing paper");
		
		myObj.product_print();
		
		

	}

}
