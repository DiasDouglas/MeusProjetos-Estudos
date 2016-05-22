package br.ufrpe.negocio.beans;

public class Percurso {
	private String location;
	private String url;
	
	public Percurso(String location, String url){
		this.location = location;
		this.url = url;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	public boolean equals(Percurso b){
		boolean retorno = false;
		if(b != null){
			retorno = (this.location.equals(b.location) &&
					this.url.equals(b.url));
		}
		return retorno;
	}

	public String toSring(){
		return "Local: " + getLocation();
	}
}
