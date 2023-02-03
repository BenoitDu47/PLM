
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Description
 *
 * @author Benoit THOURY
 * 
 */

public class AircraftManagement {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String tabAircraft[][] = {

				{ "1= [", "A320 ", "PLM_AIRBUSIN_SERVICE ", "Passenger ]" },
				{ "2= [", "A300 ", "PLM_AIRBUSIN_SERVICE ", "Passenger ]" },
				{ "3= [", "A400M ", "PLM_AIRBUSIN_DEFINITTION ", "Cargo ]" },
				{ "4= [", "A330NEO ", "PLM_AIRBUSIN_SERVICE ", "Passenger ]" },
				{ "5= [", "A380 ", "PLM_AIRBUSIN_SERVICE ", "Passenger ]" } };

		System.out.println(
				"Bienvenue dans l'application de gestion du cycle de vie d'avions AIRBUS\nFaites votre choix dans le menu, saisissez le chiffre correspondant :\n\n1 : Afficher tous les avions\n2 : Afficher tous les avions contenant un mot clé dans le programme\n3 : Afficher ou suprimer une pièce pour un avion donné\n4 : Afficher un avion avec les infos détaillées de chaque pièces\n5 : quitter l'application");

		String choice = scan.nextLine();
		System.out.println(choice);
		int choice1 = Integer.parseInt(choice);


		
		switch (choice1) {
		case 1:
			for (int y = 0; y < tabAircraft.length; ++y) {
				for (int x = 0; x < tabAircraft[y].length; ++x) {
					System.out.print("[" + tabAircraft[y][x] + "]");
				}
				System.out.println();
			}
			break;
		case 2:
			System.out.println("Merci de renseigner un mot clé d'un avion. \nExemple: A300");

			String Aircraft = scan.nextLine();
			
			System.out.println(Aircraft);
			Aircraft = Aircraft.replaceAll("\\s", "").toUpperCase();
			Aircraft = Aircraft + " ";

			for (int y = 0; y < tabAircraft.length; ++y) {

				String tabIdAircraft = tabAircraft[y][1];

				if (tabIdAircraft.equalsIgnoreCase(Aircraft) == true) {
					System.out.print("[ " + tabAircraft[y][1] + tabAircraft[y][2] + tabAircraft[y][3]);

				}

			}
			break;
		default:
			System.out.println("Choix incorrect");
			break;
		}

	}

}
