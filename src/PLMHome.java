import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 * This is a class allowing the life cycle management of aircraft Airbus. An
 * aircraft is characterized by its unique identifier, its program (A320, A400M,
 * A380, A300…), its current phase (performance study, design, definition,
 * construction, in service, closed), wire type (Freight, passenger transport,
 * military, business aircraft…
 * 
 * @author ThouryB
 * @since 03/02/2023
 *
 */
public class PLMHome {
	
	/**
	 * 
	 * 
	 * @param User choce
	 */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		List<HashMap<String, String>> mesAvions = Arrays.asList(
				creerAvion("A330", "PLM_AIRBUSIN_SERVICE", "Passenger"),
				creerAvion("A400M", "PLM_AIRBUSIN_DEFINITTION", "Cargo"),
				creerAvion("A330NEO", "PLM_AIRBUSIN_SERVICE", "Passenger"),
				creerAvion("A300", "PLM_AIRBUSIN_SERVICE", "Passenger]"),
				creerAvion("A380", "PLM_AIRBUSIN_SERVICE", "Passenger"));

		System.out.println(
				"Bienvenue dans l'application de gestion du cycle de vie d'avions AIRBUS\nFaites votre choix dans le menu, saisissez le chiffre correspondant :\n\n1 : Afficher tous les avions\n2 : Afficher tous les avions contenant un mot clé dans le programme\n3 : Afficher ou suprimer une pièce pour un avion donné\n4 : Afficher un avion avec les infos détaillées de chaque pièces\n5 : quitter l'application");

		String choice = scanner.nextLine();
		System.out.println(choice);
		int choice1 = Integer.parseInt(choice);
		int count = 1;
		
		
		switch (choice1) {
		case 1:

			
			for (HashMap<String, String> monAvion : mesAvions) {
				System.out.println(count + "= [" + monAvion.get("id") + " - " + monAvion.get("program") + " - "
						+ monAvion.get("phase") + "]");
				count++;
			}

			break;
		case 2:

			System.out.println("Merci de renseigner un mot clé d'un avion. \nExemple: A300");

			String choiceAirplane = scanner.nextLine();
			
			for (HashMap<String, String> monAvion : mesAvions) {
				
				int index = monAvion.get("id").indexOf(choiceAirplane.toUpperCase());
				
				if( index == 1 ) {
					System.out.println(count + "= [" + monAvion.get("id") + " - " + monAvion.get("program") + " - "
							+ monAvion.get("phase") + "]");
				}		
				count++;
			}
		

			break;
		case 3:

			break;
		case 4:

			break;
		case 5:
		default:
			System.out.println("Choix incorrect");
			break;
		}

	}

	/**
	 * 
	 * @param id      aircraft identity
	 * @param program aircraft program
	 * @param phase   aircraft phase
	 * @return HashMap list of keys: id, program, phase
	 */
	private static HashMap<String, String> creerAvion(String id, String program, String phase) {

		HashMap<String, String> airplane = new HashMap<String, String>();

		airplane.put("id", id);
		airplane.put("program", program);
		airplane.put("phase", phase);
		return airplane;
	}

	/**
	 * 
	 * @param
	 * @return false or true
	 */
	private static boolean aircraftSearch(int index) {
		boolean faut;
		if (index == -1) {
			faut = false;
			return faut;
		} else {
			faut = true;
			return faut;
		}
	}

}
