import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class meanFile{

	public static void main(String args[]) throws FileNotFoundException{

		File inputFile = new File("C:\\Users\\akash\\Documents\\JAVA\\quiz_numbers.txt");

		Scanner input = new Scanner(inputFile);

		double sum = 0, counter = 0;

		while(input.hasNext()){
			int num = input.nextInt();
			sum += (double) num;
			counter++;
		}

		double mean = (sum/counter);
		System.out.println(mean+" "+counter);
	}

}