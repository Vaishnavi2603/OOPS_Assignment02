package Encapsulation_Inheritance;

public class BookDetails {

	public static void main(String[] args) {
		
		Book b = new Book(3452,"The Alchemist","Paulo Coelho",450);  
		b.DisplayBook();
		
		
		EngineeringBook eb = new EngineeringBook(10238,"Principles of Power System","V.K Mehta",960);
		eb.setCategory("Electrical Engineering");
		  
		eb.DisplayBook();
		System.out.println(eb.getCategory());

	}

}
