package blog;

import java.util.Date;

public class ArticoloFantasy extends Articolo {
	
	private String descrizione;
	
	public ArticoloFantasy(int id, String titolo, String testo, Tags tags) {
		super(id, titolo, "Articolo fantasy", testo, null, tags);
		this.setDescrizione("Articolo che parla di fate e dragoni");
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
}
