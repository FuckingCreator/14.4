import java.util.ArrayList;
import java.util.Scanner;

public class Demo {

	public static <M> void main(String[] args) {
		System.out.println("Enter five marks:");
		Scanner key = new Scanner(System.in);
		M one = (M) key.next();
		M two = (M)key.next();
		M three =(M) key.next();
		M four =(M) key.next();
		M five = (M)key.next();
		
		ArrayList<M> First = new ArrayList<M>(5);
		First.add(one);
		First.add(two);
		First.add(three);
		First.add(four);
		First.add(five);
		Marks FirstMarks = new Marks(First);
		System.out.println(FirstMarks.toString());
		System.out.println("Average:"+	FirstMarks.getAverage(FirstMarks.getDouble()));
	}

}
