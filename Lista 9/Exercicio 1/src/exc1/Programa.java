package exc1;
import java.io.*;

public class Programa {

	public static void main(String[] args) {
		try {
			FileReader entrada = new FileReader("entrada.txt");
			BufferedReader buffreader = new BufferedReader(entrada);
			String linha = buffreader.readLine();
			
			FileWriter saida = new FileWriter("saida.txt");
			BufferedWriter buffwriter = new BufferedWriter(saida);
			while(linha!=null) {
				buffwriter.write(linha + "\r" 	 + "\n");
				//System.out.println(linha);
				linha = buffreader.readLine();
			}
			buffwriter.flush();
			entrada.close();
			saida.close();
			
			
			System.out.println("Arquivo gravado com sucesso");	
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
