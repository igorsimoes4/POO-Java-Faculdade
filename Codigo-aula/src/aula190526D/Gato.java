package aula190526D;

public class Gato extends Animal{
    public Gato(String nome){
        super(nome);
    }

    @Override
    public void emitirSom(){
        System.out.println("Miau Miau");
    }

}
