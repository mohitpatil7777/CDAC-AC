import java.util.Scanner;
 class Rectangle{
	private int length;
	private int breadth;
		
	Rectangle(int length , int breadth){
		this.length = length;
		this.breadth = breadth;
	}
	
	public void display() {
		System.out.println("Length : "  + length + "\t Breadth : " + breadth + "\tArea : " + (length*breadth));
	}
}

 public class RectangleInfo{
	 public static void main(String[] args) {
		 System.out.println("Enter the length and breadth of Rectangle 1:");
		 Scanner sc = new Scanner(System.in);
		 int length = sc.nextInt();
		 int breadth = sc.nextInt();
		 Rectangle rObj1 = new Rectangle(length , breadth);
		 
		 System.out.println("Enter the length and breadth of Rectangle 1:");
		 length = sc.nextInt();
		 breadth = sc.nextInt();
		 Rectangle rObj2 = new Rectangle(length , breadth);
		 
		 rObj1.display();
		 rObj2.display();
		 sc.close();
	 }
 }