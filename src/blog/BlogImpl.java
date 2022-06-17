package blog;

import java.text.DateFormat;
import java.util.Locale;

public class BlogImpl implements Blog{
	private Articolo[] articoli;

	public BlogImpl() {}
	
	public BlogImpl(Articolo[] articoli) {
		setArticoli(articoli);
	}

	public Articolo[] getArticoli() {
		return articoli;
	}

	public void setArticoli(Articolo[] articoli) {
		this.articoli = articoli;
		for(int i=0; i<articoli.length; i++) {
			articoli[i].setId(i+1);
			//per ogni elemento dell'array di articoli
			//assegno all'elemento corrente un id crescente
		}
	}

	@Override
	public String stampaArticoloPerId(int id) {
		String msg = "Non esiste alcun articolo con questo id";
		//inizializzo una stringa con un messaggio di default
		boolean trovato = false;
		//inizializzo una variabile booleana a false
		if(articoli != null) {
			//se l'array di articoli non è vuoto
			DateFormat df = DateFormat.getDateInstance(DateFormat.LONG, Locale.ITALY);
			//credo una variabile DateFormat che mi consente di formattare la data secondo alcuni parametri
			for(int i=0; i<articoli.length && !trovato; i++) {
				//ciclo ogni elemento dell'array articoli finchè o finisce l'array o viene
				//trovato l'elemento con l'id che passo in input al metodo
				if(articoli[i].getId() == id) {
					//controllo se l'id dell'elemento corrente è uguale all'id passato in input
					msg = "\n***************\n" +
							"Articolo con id " + id +
							"\n\nTitolo: " + articoli[i].getTitolo() +
							"\nData inserimento: " + df.format(articoli[i].getData()) +
							"\nCategoria: " + articoli[i].getCategoria() +
							"\nTesto: " + articoli[i].getTesto() +
							"\nAutore: " + articoli[i].getAutore() +
							"\nTags: " + articoli[i].getTags(); 
					//costruisco la stringa che andrò a ritornare
							
					if(articoli[i] instanceof ArticoloFantasy) {
						msg += "\nDescrizione: " + ((ArticoloFantasy)articoli[i]).getDescrizione();
					} else if(articoli[i] instanceof ArticoloNoir) {
						msg += "\nDescrizione: " + ((ArticoloNoir)articoli[i]).getDescrizione();
					} else {
						msg += "\n";
					}
					trovato = true;
					//se l'articolo corrente è un oggetto di tipo ArticoloFantasy oppure Articolo Noir
					//aggiungo "descrizione" alla stringa, attributo esclusivo di ArticoloFantasy e Noir
				}
			}
		}
		return msg;
	}

	@Override
	public String stampaArticoli() {
		//stessa logica del metodo sopra
		//qui però non faccio la ricerca dell'elemento per id
		//ma stampo tutti gli elementi dell'array
		String msg = "Non esiste alcun articolo con questo id";
		if(articoli != null) {
			msg = "";
			DateFormat df = DateFormat.getDateInstance(DateFormat.LONG, Locale.ITALY);
			for(int i=0; i<articoli.length; i++) {
				msg += "\n***************\n" +
						"Articolo con id " + articoli[i].getId() +
						"\n\nTitolo: " + articoli[i].getTitolo() +
						"\nData inserimento: " + df.format(articoli[i].getData()) +
						"\nCategoria: " + articoli[i].getCategoria() +
						"\nTesto: " + articoli[i].getTesto() +
						"\nAutore: " + articoli[i].getAutore() +
						"\nTags: " + articoli[i].getTags();
						
				if(articoli[i] instanceof ArticoloFantasy) {
					msg += "\nDescrizione: " + ((ArticoloFantasy)articoli[i]).getDescrizione() +"\n***************\n";
				} else if(articoli[i] instanceof ArticoloNoir) {
					msg += "\nDescrizione: " + ((ArticoloNoir)articoli[i]).getDescrizione() +"\n***************\n";
				} else {
					msg += "\n";
				}
			}
		}
		return msg;
	}

}
