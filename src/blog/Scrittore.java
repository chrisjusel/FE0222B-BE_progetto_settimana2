package blog;

import java.util.Date;

public interface Scrittore {
	public Articolo scriviArticolo(String titolo, String categoria, String testo, Tags tags);
	public Articolo scriviArticolo(Articolo articolo);
}
