import java.util.Scanner;

import blog.Articolo;
import blog.ArticoloFantasy;
import blog.ArticoloNoir;
import blog.Autore;
import blog.BlogImpl;
import blog.Tags;

public class MainClass {

	public static void main(String[] args) {
		Autore autore = new Autore(1, "Gigi", "D'alessio");
		Autore autore1 = new Autore(2, "Mario", "Rossi");
		
		Articolo articolo1 = autore.scriviArticolo("Napoli, citta' di arte e cultura",
				"Arte", "Napoli e' definita una delle citta' piu' belle del mondo, "
						+ "scropriamo perche' attraverso un viaggio per le zone piu'"
						+ "caratteristiche della citta'", new Tags(new String[] {"Arte", "Cultura", "Bellezza"}));
		
		Articolo articolo2 = autore.scriviArticolo("Cras ultricies ligula sed magna dictum porta.",
				"Arte", "Vivamus magna justo, lacinia eget consectetur sed, convallis at tellus. "
						+ "Curabitur non nulla sit amet nisl tempus convallis quis ac lectus.", new Tags(new String[] {"Scienza", "Chimica"}));
		
		Articolo articolo3 = new ArticoloFantasy(0, "Lorem ipsum dolor sit amet, consectetur adipiscing elit.",
				"Lorem ipsum dolor sit amet, consectetur adipiscing elit. "
						+ "Nulla porttitor accumsan tincidunt.", new Tags(new String[] {"Politica", "Wow", "Bellissimo"}));
		
		Articolo articolo4 = new ArticoloNoir(0, "Pellentesque in ipsum id orci porta dapibus.",
				"Quisque velit nisi, pretium ut lacinia in, elementum id enim. "
						+ "Vestibulum ac diam sit amet quam vehicula elementum sed sit amet dui.", new Tags(new String[] {"ciccio1", "ciao", "wewe"}));
		
		autore1.scriviArticolo(articolo3);
		autore1.scriviArticolo(articolo4);

		Articolo[] articoli = {articolo1, articolo2, articolo3, articolo4};
		
		BlogImpl blog = new BlogImpl(articoli);
		
		
		System.out.println("Ci sono " + blog.getArticoli().length + " Articoli");
		
		
		
		Scanner scanner = new Scanner(System.in);
		if(blog.getArticoli().length != 0) {
			//se l'array di articoli nel blog non è vuoto
			
			int input = -1;
			//setto una variabile input ad un valore di default
			do {
				System.out.println("Inserisci la scelta\n[0] Stampa tutti gli articoli"
						+ "\n[1] Stampa l'articolo corrispondente ad un id\n[2] Termina Esecuzione");
				input = Integer.parseInt(scanner.nextLine());
				//prendo la scelta dell'utente e la metto nella variabile input
				if(input == 0) {
					//se input è 0
					System.out.println(blog.stampaArticoli());
					//stampo tutti gli articoli
				} else if(input == 1) {
					//se input è 1
					System.out.println("Inserisci l'id dell'articolo che vuoi stampare");
					int id = Integer.parseInt(scanner.nextLine());
					//prendo l'id dell'articolo che l'utente vuole stampare
					do {
						if(!idEsiste(id, blog)) {
							//se non esiste nessun articolo con quell'id
							System.out.println("Non esiste nessun articolo con questo id");
							break;
							//stampo un messaggio di errore ed interrompo il ciclo
						} else {
							System.out.println(blog.stampaArticoloPerId(id));
							//altrimenti se esiste un articolo con quell'id lo stampo
						}
					} while (!idEsiste(id, blog));
					
				}
			}while(input != 0 && input != 1 && input != 2);
		} else {
			System.out.println("Non ci sono articoli nel blog");
			//se l'array è vuoto stampo un messaggio di errore
		}
	}

	//ricerca lineare per controllare se un articolo è presente nel blog
	static boolean idEsiste(int id, BlogImpl blog) {
		boolean trovato = false;
		for(int i=0; i<blog.getArticoli().length && !trovato; i++) {
			if(blog.getArticoli()[i].getId() == id) {
				trovato = true;
			}
		}
		return trovato;
	}
}
