package blog;

import java.util.Date;

public class Autore implements Scrittore{
	private int id;
	private String nome;
	private String cognome;
	
	public Autore(int id, String nome, String cognome) {
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome; 
	}

	public String getCognome() {
		return cognome;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	@Override
	public Articolo scriviArticolo(String titolo, String categoria, String testo,Tags tags) {
		Articolo newArticolo = new Articolo(0, titolo, categoria, testo, this, tags);
		//creo un nuovo oggetto di tipo articolo con id 0 (l'id viene assegnato dalla classe BlogImpl);
		//e come autore gli passo la corrente istanza dell'Autore
		return newArticolo;
	}
	
	@Override
	public Articolo scriviArticolo(Articolo articolo) {
		//overload del metodo superiore, prende in input tutto l'articolo
		articolo.setAutore(this);
		//setta l'autore con la corrente istanza dell'autore
		return articolo;
	}
	
	@Override
	public String toString() {
		return nome + " " + cognome;
	}


	
}
