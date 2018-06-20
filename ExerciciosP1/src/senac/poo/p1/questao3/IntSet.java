package senac.poo.p1.questao3;

public interface IntSet {
    
    void insert(int x);         //adiciona um elemento ao conjunto
    void insertAll(int[] v);    //adiciona vários elementos ao conjunto
    void remove(int x);         //remove um elemento co conjunto
    boolean isIn(int x);        //testa se x pertence ao conjunto
    int size();                 //retorna a cardinalidade do conjunto
    void forAll(Visitor v);     //visita todos os elementos do conjunto
    
}
