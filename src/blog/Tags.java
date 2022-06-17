package blog;

public class Tags {
	private String[] tags;

	
	public Tags(String[] tags) {
		super();
		this.tags = tags;
	}

	public String[] getTags() {
		return tags;
	}

	public void setTags(String[] tags) {
		this.tags = tags;
	}
	
	@Override
	public String toString() {
		String s = "";
		for(int i=0; i<tags.length; i++) {
			s += tags[i]+", ";
		}
		return s;
		//per ogni elemento dell'array tags concateno l'elemento corrente ed un separatore
	}
}
