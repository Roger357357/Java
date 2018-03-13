package senac.poo.ado5;

public class ProgramaZoologico {

	public static void main(String[] args) {
		
		// Zoologico 
		Zoologico zoologico = new Zoologico();
		zoologico.som();
		// Cachorro
		Cachorro cachorro = new Cachorro();
		Jaula jcachorro = new Jaula(cachorro);
		jcachorro.som();
		// Coruja
		Coruja coruja = new Coruja();
		Jaula jcoruja = new Jaula(coruja);
		jcoruja.som();
		// Elefante
		Elefante elefante = new Elefante();
		Jaula jelefante = new Jaula(elefante);
		jelefante.som();
		// Gato
		Gato gato = new Gato();
		Jaula jgato = new Jaula(gato);
		jgato.som();
		// Leão
		Leao leao = new Leao();
		Jaula jleao = new Jaula(leao);
		jleao.som();
		// Macaco
		Macaco macaco = new Macaco();
		Jaula jmacaco = new Jaula(macaco);
		jmacaco.som();
		// Ovelha
		Ovelha ovelha = new Ovelha();
		Jaula jovelha = new Jaula(ovelha);
		jovelha.som();
		// Papagaio
		Papagaio papagaio = new Papagaio();
		Jaula jpapagaio = new Jaula(papagaio);
		jpapagaio.som();
		// Porco
		Porco porco = new Porco();
		Jaula jporco = new Jaula(porco);
		jporco.som();
		// Tigre
		Tigre tigre = new Tigre();
		Jaula jtigre = new Jaula(tigre);
		jtigre.som();
	}

}
