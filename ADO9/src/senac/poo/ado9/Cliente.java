package senac.poo.ado9;
import java.io.*;
/**
 *
 * @author roger.fgalmeida
 */
public class Cliente {
    public static void main(String[] args){
        
        Placa placa1 = new Placa(123,"SP","Amarelo");
        Placa placa2  = new Placa(627,"RJ","Branco");
        Placa placa3 = new Placa(827,"SP","Branco");
        
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
            escrita.close();
            saida = new FileInputStream("placa.ser");
            leitura = new ObjectInputStream(saida);
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
