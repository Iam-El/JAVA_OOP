class Product{  // if you say public class then it should be defined in its own file
	// attributes of the class
	String name;
	int itemNo;
	int price;
	
	Product(String name,int itemNo,int price){
		System.out.println("constructore created");
		this.name=name;
		this.itemNo=itemNo;
		this.price=price;
		
		
	}
	
	// method in a class
	void product_print() {
		System.out.println("Paper is printed");
	}
	
	
}
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// create a instance of a class
		Product myObj=new Product("printing paper",1,2);
		System.out.println(myObj.name);  // access the properties -> attributes of the class
		myObj.product_print();
		
		

	}

}
