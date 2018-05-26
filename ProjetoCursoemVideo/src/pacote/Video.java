package pacote;

public class Video implements AcoesVideo{

	private String titulo;
	private int avaliacao;
	private int views;
	private int curtidas;
	private boolean reproduzindo;
	
	public Video(String titulo) {
		this.titulo = titulo;
		this.avaliacao = 0;
		this.views = 0;
		this.curtidas = 0;
		this.reproduzindo = false;
	}
	
	@Override
	public void play() {
		
	}

	@Override
	public void pause() {
		
	}

	@Override
	public void like() {
		
	}

	public String getTitulo() {
		return titulo;
	}

	public int getAvaliacao() {
		return avaliacao;
	}

	public int getViews() {
		return views;
	}

	public int getCurtidas() {
		return curtidas;
	}

	public boolean isReproduzindo() {
		return reproduzindo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setAvaliacao(int avaliacao) {
		this.avaliacao = avaliacao;
	}

	public void setViews(int views) {
		this.views = views;
	}

	public void setCurtidas(int curtidas) {
		this.curtidas = curtidas;
	}

	public void setReproduzindo(boolean reproduzindo) {
		this.reproduzindo = reproduzindo;
	}

}
