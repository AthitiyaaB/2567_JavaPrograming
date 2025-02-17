import java.util.*;

public class MovieDemo {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Input movie id   : ");
		String movieId = scan.nextLine();

		System.out.print("Input movie name : ");
		String movieName = scan.nextLine();

		System.out.println();

		System.out.print("Input director name : ");
		String directorName = scan.nextLine();

		System.out.print("Input Director e-mail: ");
		String directorEmail = scan.nextLine();

		System.out.print("Input director gender : ");
		char gender = scan.next().charAt(0);
		while (gender != 'M' && gender != 'm' && gender != 'F' && gender != 'f') {
			System.out.print("Input director gender, again: ");
			gender = scan.next().charAt(0);
		}

		System.out.println();

		Director director = new Director(directorName, directorEmail, gender);

		System.out.print("Input movie theater no.  : ");

		int theaterNo = scan.nextInt();
		while (theaterNo < 1 || theaterNo > 15) {
			System.out.print("Please input 1 - 15 only : ");
			theaterNo = scan.nextInt();
		}

		Theater theater = new Theater(movieId, movieName, director, theaterNo);

		System.out.println();
		System.out.println(theater.toString());

		scan.close();
	}

}