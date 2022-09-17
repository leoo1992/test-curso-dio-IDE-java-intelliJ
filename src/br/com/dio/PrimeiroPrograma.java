package br.com.dio;
import model.Gato;
import model.Livro;

public class PrimeiroPrograma {
    public static void main(String[] args) {
/*      int a=5;
        int b=3;
        System.out.println("Hello World!" + (a+b));*/
        Gato gato = new Gato("Leo", "Cinza", "30" );
        System.out.println(gato);

        Livro livro = new Livro("Dota 2", "300");
        System.out.println(livro);

    }
}