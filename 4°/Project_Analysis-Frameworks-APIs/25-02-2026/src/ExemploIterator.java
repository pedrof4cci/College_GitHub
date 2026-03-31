import java.util.LinkedList;
import java.util.Iterator;

public class ExemploIterator {
    public static void main(String[] args) {
        LinkedList<String> linguagens = new LinkedList<>();
        linguagens.add("Java");
        linguagens.add("Python");
        linguagens.add("C++");

        // Obtendo o iterator da coleção
        Iterator<String> it = linguagens.iterator();

        // Percorrendo a coleção
        while (it.hasNext()) {
            String linguagem = it.next();
            System.out.println("Linguagem: " + linguagem);

            // Exemplo de remoção segura
            if (linguagem.equals("C++")) {
                it.remove();
            }
        }
    }
}