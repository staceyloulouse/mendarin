import java.io.File;
import java.util.Scanner;

public class Contributions {
	static ContributorStack listing = new ContributorStack();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {

            Scanner input = new Scanner(System.in);

            File file = new File("contributors.csv");

            input = new Scanner(file);

            while (input.hasNextLine()) {
                String line = input.nextLine();
                String[] contrib = line.split(",");
                //parse line to get contributor data
                	String name = contrib[0];
                	String city = contrib[1];
                	String country = contrib[2];
                	String phone = contrib[3];
                	double contribution = Double.parseDouble(contrib[4]);
                	int id = Integer.parseInt(contrib[5]);
                	Contributor giver = new Contributor(name, city, country, phone, contribution, id);
            		listing.push(giver);
            }
            input.close();
		}  
        catch (Exception ex) {
            ex.printStackTrace();
        }
		//pop the last contributor added
		listing.pop();
    }
		
		
	

}
