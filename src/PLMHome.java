import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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

		List<HashMap<String, String>> mesAvions = Arrays.asList(creerAvion("A330", "PLM_AIRBUSIN_SERVICE", "Passenger"),
				creerAvion("A400M", "PLM_AIRBUSIN_DEFINITTION", "Cargo"),
				creerAvion("A330NEO", "PLM_AIRBUSIN_SERVICE", "Passenger"),
				creerAvion("A300", "PLM_AIRBUSIN_SERVICE", "Passenger"),
				creerAvion("A380", "PLM_AIRBUSIN_SERVICE", "Passenger"));
		
	//	Avion toto = new Avion("A380", "PLM_AIRBUSIN_SERVICE", "Passenger", null);

		do {
			System.out.println("Bienvenue dans l'application de gestion du cycle de vie d'avions AIRBUS\n"
					+ "Faites votre choix dans le menu, saisissez le chiffre correspondant :\n\n"
					+ "1 : Afficher tous les avions\n"
					+ "2 : Afficher tous les avions contenant un mot clé dans le programme\n"
					+ "3 : Afficher ou suprimer une pièce pour un avion donné\n"
					+ "4 : Afficher un avion avec les infos détaillées de chaque pièces\n"
					+ "5 : Quitter l'application");
			String valeurLue = scanner.next();

			if (isNumber(valeurLue)) {
				int choix = Integer.parseInt(valeurLue);

				switch (choix) {
				case 1:
					int compt = 1;
					for (HashMap<String, String> monAvion : mesAvions) {
						System.out.println(compt + "= [ " + monAvion.get("id") + " " + monAvion.get("program") + " " + monAvion.get("phase") + " ]");
						compt++;
					}
					break;
				case 2:
					System.out.println("Veuillez saisir un nom d'avion: ");
					valeurLue = scanner.next();
					boolean isAvion = false;
					compt = 1;
					System.out.println("toto");
					for (HashMap<String, String> monAvion : mesAvions) {
						if (monAvion.get("id").contains(valeurLue)) {
							isAvion = true;
							System.out.println(compt + "= [ " + monAvion.get("id") + " "
									+ monAvion.get("program") + " " + monAvion.get("phase")  + " ]");
							compt++;
						}
					}
					if (!isAvion) {
						System.out.println("La valeur saisie n'est pas un avion.");
					}
					break;
				case 3:

					break;
				case 4:

					break;
				case 5:

					break;
				default:
					System.out.println("Option inexistante.");
					break;
				}
			} else {
				System.out.println("Ce n'est pas un nombre.");
			}
		} while (onContinue());
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

	private static boolean isNumber(String monString) {
		char[] monCharArray = monString.toCharArray();
		for (char monChar : monCharArray) {
			if (Character.isDigit(monChar) == false) {
				return false;
			}
		}
		return true;
	}

	private static boolean onContinue() {
		Scanner scanner = new Scanner(System.in);
		char valeurLue = ' ';
		do {
			System.out.println("Voulez-vous réessayer ? (O/N)");
			valeurLue = scanner.next().charAt(0);
		} while (valeurLue != 'O' && valeurLue != 'N');
		return valeurLue == 'O';
	}

}
