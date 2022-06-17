package blog;

import java.util.Date;

public class ArticoloNoir extends Articolo {

	private String descrizione;

	public ArticoloNoir(int id, String titolo, String testo, Tags tags) {
		super(id, titolo, "Articolo Noir", testo, null, tags);
		this.setDescrizione("Articolo che parla dell'ambiente underground cittadino");
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

}
