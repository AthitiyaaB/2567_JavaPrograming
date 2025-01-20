public class TestRectangle {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		//System.out.println(r1.toString());
		System.out.println(r1);
		
		Rectangle r2 = new Rectangle(1.2f,3.4f);
		System.out.println(r2);
		System.out.println();
		
		r1.setLength(5.6f);
		r1.setLength(7.8f);
		System.out.println(r1);
		System.out.println("Lengh is " + r1.getLength());
		System.out.println("Witdth is " + r1.getWidth());
		System.out.println();
		
		System.out.printf("Area is %.2f%n", r1.getArea());
		System.out.printf("Perimeter is: %.2f", r1.getPerimeter());
	}

}
