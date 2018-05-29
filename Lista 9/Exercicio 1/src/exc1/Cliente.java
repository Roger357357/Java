package exc1;

import java.io.*;

public class Cliente{

	public static String Reader(String caminho) {
		try {
		FileReader entrada = new FileReader("entrada.txt");
		BufferedReader buffreader = new BufferedReader(entrada);
		String linha = buffreader.readLine();
		
		while(linha != null) {
			linha = buffreader.readLine();
		}
		entrada.close();
		return linha;
		}catch(FileNotFoundException e) {
			e.printStackTrace();
			return e.getMessage();
		}catch(IOException e) {
			e.printStackTrace();
			return e.getMessage();
		}
		
	}
	
	public static boolean Writer(String caminho, String conteudo) {
		try {
		FileWriter saida = new FileWriter(caminho);
		BufferedWriter buffwriter = new BufferedWriter(saida);
		buffwriter.write(conteudo);
		saida.close();
		return true;
		}catch(FileNotFoundException e) {
			e.printStackTrace();
			return false;
		}catch(IOException e) {
			e.printStackTrace();
			return false;
		}
		
	}
	
}
