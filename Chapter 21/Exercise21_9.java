import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercise21_9 {


	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String[][] stateCapital = {
				{"Alabama", "Montgomery"},
				{"Alaska", "Juneau"},
				{"Arizona", "Phoenix"},
				{"Arkansas", "Little Rock"},
				{"California", "Sacramento"},
				{"Colorado", "Denver"},
				{"Connecticut", "Hartford"},
				{"Delaware", "Dover"},
				{"Florida", "Tallahassee"},
				{"Georgia", "Atlanta"},
				{"Hawaii", "Honolulu"},
				{"Idaho", "Boise"},
				{"Illinois", "Springfield"},
				{"Indiana", "Indianapolis"},
				{"Iowa", "Des Moines"},
				{"Kansas", "Topeka"},
				{"Kentucky", "Frankfort"},
				{"Louisiana", "Baton Rouge"},
				{"Maine", "Augusta"},
				{"Maryland", "Annapolis"},
				{"Massachusettes", "Boston"},
				{"Michigan", "Lansing"},
				{"Minnesota", "Saint Paul"},
				{"Mississippi", "Jackson"},
				{"Missouri", "Jefferson City"},
				{"Montana", "Helena"},
				{"Nebraska", "Lincoln"},
				{"Nevada", "Carson City"},
				{"New Hampshire", "Concord"},
				{"New Jersey", "Trenton"},
				{"New York", "Albany"},
				{"New Mexico", "Santa Fe"},
				{"North Carolina", "Raleigh"},
				{"North Dakota", "Bismarck"},
				{"Ohio", "Columbus"},
				{"Oklahoma", "Oklahoma City"},
				{"Oregon", "Salem"},
				{"Pennsylvania", "Harrisburg"},
				{"Rhode Island", "Providence"},
				{"South Carolina", "Columbia"},
				{"South Dakota", "Pierre"},
				{"Tennessee", "Nashville"},
				{"Texas", "Austin"},
				{"Utah", "Salt Lake City"},
				{"Vermont", "Montpelier"},
				{"Virginia", "Richmond"},
				{"Washington", "Olympia"},
				{"West Virginia", "Charleston"},
				{"Wisconsin", "Madison"},
				{"Wyoming", "Cheyenne"}
		};

		Map<String, String> mapstatesandcapitals = new HashMap<>();


		for (int i = 0; i < stateCapital.length; i++) {
			// Prompt the user with a question
			System.out.print("Enter in a State:");
			String state = input.nextLine().trim().equalsIgnoreCase();
System.out.println("");

		}
	}
}