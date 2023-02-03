import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
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
 * 
 *@see type
 *
 */
public class ProjetPLM {

/**
 * 
 * @param 
 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		HashMap<Integer, ArrayList<String>> airplanePart = new HashMap<Integer, ArrayList<String>>();

		airplanePart.put(1, new ArrayList<String>(Arrays.asList("A320", "PLM_AIRBUSIN_SERVICE", "Passenger")));
		airplanePart.put(2, new ArrayList<String>(Arrays.asList("A300", "PLM_AIRBUSIN_SERVICE", "Passenger")));
		airplanePart.put(3, new ArrayList<String>(Arrays.asList("A400M", "PLM_AIRBUSIN_DEFINITTION", "Cargo")));
		airplanePart.put(4, new ArrayList<String>(Arrays.asList("A330NEO", "PLM_AIRBUSIN_SERVICE", "Passenger")));
		airplanePart.put(5, new ArrayList<String>(Arrays.asList("A380", "PLM_AIRBUSIN_SERVICE", "Passenger")));

		System.out.println(
				"Bienvenue dans l'application de gestion du cycle de vie d'avions AIRBUS\nFaites votre choix dans le menu, saisissez le chiffre correspondant :\n\n1 : Afficher tous les avions\n2 : Afficher tous les avions contenant un mot clé dans le programme\n3 : Afficher ou suprimer une pièce pour un avion donné\n4 : Afficher un avion avec les infos détaillées de chaque pièces\n5 : quitter l'application");

		String choice = scan.nextLine();
		System.out.println(choice);
		int choice1 = Integer.parseInt(choice);

		switch (choice1) {
		case 1:

			for (Integer i : airplanePart.keySet()) {
				System.out.println(i + " = " + airplanePart.get(i));
			}

			break;
		case 2:

			System.out.println("Merci de renseigner un mot clé d'un avion. \nExemple: A300");

			String choiceAirplane = scan.nextLine();

			for (List<String> i : airplanePart.values()) {

				int index = i.get(0).indexOf(choiceAirplane.toUpperCase());

//				if (aircraftSearch(index) == false) {
//					System.out.println("L'avion n'existe pas.");
//					
//				} else {
//					System.out.println("L'avion se trouve à l'index : " + i.get(0));
//					
//				}

				if (aircraftSearch(index) == true) {
					System.out.println("L'avion se trouve à l'index : " + i.get(0));
				}

			}
			System.out.println("L'avion n'existe pas.");

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
