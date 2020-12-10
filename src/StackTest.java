import java.util.Scanner;

public class StackTest {
    public static void main(String[] args) {
        Stack<Aluno> primeiro = new ObjectStack<>();


        primeiro.push(new Aluno(1, "Mauricio", 21));
        primeiro.push(new Aluno(2, "João", 22));
        primeiro.push(new Aluno(3, "Lucas", 23));



        try {
            System.out.println(primeiro.pop());
            System.out.println(primeiro.pop());
            System.out.println(primeiro.pop());
            
            

            /*
            ERRO QUE ACONTECE QUANDO A FILA ESTA VAZIA
            */
            System.out.println(primeiro.pop());
        } catch (IndexOutOfBoundsException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("Termino do processo.");
    }
}