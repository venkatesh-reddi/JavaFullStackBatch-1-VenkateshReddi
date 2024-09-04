  class Customer{
    String name;
  
   Customer(String name) {
     // fill code
	this.name = name;
   }

  void displayCustomerName() {
   //fill code to display customer name
	System.out.println(name);
  }
 public static void main(String args[]) {
  { Customer c=new Customer("VerizonUSer");
     //call function to display customer name
c.displayCustomerName();
}
}
}