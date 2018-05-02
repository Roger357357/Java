package senac.poo.ado9;
import java.io.*;
import java.util.Random;
/**
 *
 * @author roger.fgalmeida
 */
public class Cliente {
    public static void main(String[] args){
        
    	Random aleatorio = new Random();
        int rand1 = aleatorio.nextInt(9999);
        int rand2 = aleatorio.nextInt(9999);
        int rand3 = aleatorio.nextInt(9999);
        int rand4 = aleatorio.nextInt(9999);
        int rand5 = aleatorio.nextInt(9999);
        
        Placa placa1 = new Placa(rand1,"SP","Amarelo");
        Placa placa2  = new Placa(rand2,"RJ","Branco");
        Placa placa3 = new Placa(rand3,"SP","Branco");
        Placa placa4 = new Placa(rand4,"MG","Vermelho");
        Placa placa5 = new Placa(rand5,"GO","Azul");
        
        FileOutputStream entrada;
        FileInputStream saida;
        ObjectInputStream leitura = null;
        
        int i=0;
        
        try{
            entrada = new FileOutputStream("placa.ser");
            ObjectOutputStream escrita = new ObjectOutputStream(entrada);  
            escrita.writeObject(placa1);
            escrita.writeObject(placa2);
            escrita.writeObject(placa3);
            escrita.writeObject(placa4);
            escrita.writeObject(placa5);
            escrita.close();
            saida = new FileInputStream("placa.ser");
            leitura = new ObjectInputStream(saida);
            placa1.observacao();
            while(true){
                placa1 = (Placa) leitura.readObject();
                System.out.println(placa1);
                i++;
            }
            
        }catch(EOFException e){
            System.out.println("\nO arquivo acabou.");
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        System.out.println("Foram lidos "+i+" placas.");
        
    }
}
