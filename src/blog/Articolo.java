package blog;

import java.util.Date;

public class Articolo {
	private int id;
	private String titolo;
	private Date data;
	private String categoria;
	private String testo;
	private Autore autore;
	private Tags tags;
	
	public Articolo() {}
	
	public Articolo(int id, String titolo, String categoria, String testo, Autore autore, Tags tags) {
		this.id = id;
		this.titolo = titolo;
		this.data = new Date();
		this.categoria = categoria;
		this.testo = testo;
		this.autore = autore;
		this.tags = tags;
	}

	public int getId() {
		return id;
	}

	public String getTitolo() {
		return titolo;
	}

	public Date getData() {
		return data;
	}

	public String getCategoria() {
		return categoria;
	}

	public String getTesto() {
		return testo;
	}

	public Autore getAutore() {
		return autore;
	}

	public Tags getTags() {
		return tags;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public void setTesto(String testo) {
		this.testo = testo;
	}

	public void setAutore(Autore autore) {
		this.autore = autore;
	}

	public void setTags(Tags tags) {
		this.tags = tags;
	}
	
	
	
	
}
