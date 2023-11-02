
import java.util.Scanner;

class FocalLength {

	public static int focal_length(int R , char Mirror) {
		  // write the code logic here
		  int f = R / 2; // calculate the focal length using the formula
		  if (Mirror == ')') { // if the mirror is concave
		    f = -f-1; // make the focal length negative
		  }
		  return f; // return the focal length
		}

      public static void main(String[] args) {

          Scanner scanner = new Scanner(System.in);
          int R = scanner.nextInt();
          char Mirror = scanner.next().charAt(0);

         System.out.println(focal_length(R,Mirror));

        }
     
}

