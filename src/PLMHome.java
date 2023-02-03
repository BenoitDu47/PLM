import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class PLMHome {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		List<HashMap<String, String>> mesAvions = Arrays.asList(
				creerAvion("A380", "PLM_AIRBUSIN_DEFINITTION", "Passenger"),
				creerAvion("A330", "PLM_AIRBUSIN_SERVICE", "Passenger"));

		for (HashMap<String, String> monAvion : mesAvions) {
			System.out.println(" id = " + monAvion.get("id") + "\n phase = " + monAvion.get("phase"));
		}

		
	}

	private static HashMap<String, String> creerAvion(String id, String program, String phase) {

		HashMap<String, String> airplane = new HashMap<String, String>();

		airplane.put("id", id);
		airplane.put("program", program);
		airplane.put("phase", phase);
		return airplane;
	}

}
