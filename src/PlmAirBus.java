import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class PlmAirBus {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		LinkedHashMap<String, String> A320 = a320();
		ArrayList<String> airplanePartA320 = airplanePartA320();

		LinkedHashMap<String, String> A300 = a300();
		ArrayList<String> airplanePartA300 = airplanePartA300();

		LinkedHashMap<String, String> A400M = a400M();
		ArrayList<String> airplanePartA400M = airplanePartA400M();

		LinkedHashMap<String, String> A330NEO = a330NEO();
		ArrayList<String> airplanePartA330NEO = airplanePartA330NEO();

		LinkedHashMap<String, String> A380 = a380();
		ArrayList<String> airplanePartA380 = airplanePartA380();

//		System.out.println("Pour le " + A320.values());
//		System.out.println("Pour le " + A320.get("programme"));
//		System.out.println("Pour le " + airplanePartA320);

		System.out.println(
				"Bienvenue dans l'application de gestion du cycle de vie d'avions AIRBUS\nFaites votre choix dans le menu, saisissez le chiffre correspondant :\n\n1 : Afficher tous les avions\n2 : Afficher tous les avions contenant un mot clé dans le programme\n3 : Afficher ou suprimer une pièce pour un avion donné\n4 : Afficher un avion avec les infos détaillées de chaque pièces\n5 : quitter l'application");

	
		String choice = scan.nextLine();
		System.out.println(choice);
		int choice1 = Integer.parseInt(choice);
		
		switch (choice1) {
		case 1:
			System.out.println("Liste d'avions: \n1= " + A320.values() + "\n2= " + A300.values() + "\n3= "
					+ A400M.values() + "\n4= " + A330NEO.values() + "\n5= " + A380.values() + "\n");
			break;
		case 2:

			System.out.println("Merci de renseigner un mot clé d'un avion. \nExemple: A300");

			String choiceAirplane = scan.nextLine();

			String pA320 = A320.get("programme");
			String pA300 = A300.get("programme");
			String pAA330NEO = A330NEO.get("programme");
			String pA400M = A400M.get("programme");
			String pA380 = A380.get("programme");

			int index = pA320.indexOf(choiceAirplane.toUpperCase());

			if (index == -1) {
				System.out.println("L'avion n'existe pas.");
			} else {
				System.out.println("L'avion se trouve à l'index : " + A320.get("programme"));
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

		// System.out.println(airplanePartA320);

	}

	private static ArrayList<String> airplanePartA320() {
		ArrayList<String> airplanePartA320 = new ArrayList<String>();
		airplanePartA320.add("Nose");
		airplanePartA320.add("Fuselage");
		airplanePartA320.add("Wing");
		airplanePartA320.add("Aileron");
		airplanePartA320.add("Cabin");
		return airplanePartA320;
	}

	private static ArrayList<String> airplanePartA300() {
		ArrayList<String> airplanePartA300 = new ArrayList<String>();
		airplanePartA300.add("Nose");
		airplanePartA300.add("Fuselage");
		airplanePartA300.add("Wing");
		airplanePartA300.add("Aileron");
		airplanePartA300.add("Cabin");
		return airplanePartA300;
	}

	private static ArrayList<String> airplanePartA400M() {
		ArrayList<String> airplanePartA400M = new ArrayList<String>();
		airplanePartA400M.add("Nose");
		airplanePartA400M.add("Fuselage");
		airplanePartA400M.add("Wing");
		airplanePartA400M.add("Aileron");
		airplanePartA400M.add("Cabin");
		return airplanePartA400M;
	}

	private static ArrayList<String> airplanePartA330NEO() {
		ArrayList<String> airplanePartA330NEO = new ArrayList<String>();
		airplanePartA330NEO.add("Nose");
		airplanePartA330NEO.add("Fuselage");
		airplanePartA330NEO.add("Wing");
		airplanePartA330NEO.add("Aileron");
		airplanePartA330NEO.add("Cabin");
		return airplanePartA330NEO;
	}

	private static ArrayList<String> airplanePartA380() {
		ArrayList<String> airplanePartA380 = new ArrayList<String>();
		airplanePartA380.add("Nose");
		airplanePartA380.add("Fuselage");
		airplanePartA380.add("Wing");
		airplanePartA380.add("Aileron");
		airplanePartA380.add("Cabin");
		return airplanePartA380;
	}

	private static LinkedHashMap<String, String> a320() {
		LinkedHashMap<String, String> A320 = new LinkedHashMap<String, String>();
		A320.put("programme", "A320");
		A320.put("status", "PLM_AIRBUSIN_SERVICE");
		A320.put("type", "Passenger");
		return A320;
	}

	private static LinkedHashMap<String, String> a300() {
		LinkedHashMap<String, String> A300 = new LinkedHashMap<String, String>();
		A300.put("programme", "A300");
		A300.put("status", "PLM_AIRBUSIN_SERVICE");
		A300.put("type", "Passenger");
		return A300;
	}

	private static LinkedHashMap<String, String> a400M() {
		LinkedHashMap<String, String> A400M = new LinkedHashMap<String, String>();
		A400M.put("programme", "A400M");
		A400M.put("status", "PLM_AIRBUSIN_DEFINITTION");
		A400M.put("type", "Cargo");
		return A400M;
	}

	private static LinkedHashMap<String, String> a330NEO() {
		LinkedHashMap<String, String> A330NEO = new LinkedHashMap<String, String>();
		A330NEO.put("programme", "A330neo");
		A330NEO.put("status", "PLM_AIRBUSIN_SERVICE");
		A330NEO.put("type", "Passenger");
		return A330NEO;
	}

	private static LinkedHashMap<String, String> a380() {
		LinkedHashMap<String, String> A380 = new LinkedHashMap<String, String>();
		A380.put("programme", "A380");
		A380.put("status", "PLM_AIRBUSIN_SERVICE");
		A380.put("type", "Passenger");
		return A380;
	}

}
