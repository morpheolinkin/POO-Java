package mediamaisrefinada;
/**
 * Desenvolva um programa para tirar a média da classe que processe
 * as notas de acordo com um número arbitrário 
 * de alunos toda vez que é executado.
 */

// Resolvendo o problema da média da classe usando a repetição controlada por sentinela.
import java.util.Scanner;

public class AverageRefinate {
    public static void main(String[] args) {
        // cria Scanner para obter entrada a partir da janela de comando
        Scanner input = new Scanner(System.in);
        
        // fase de inicialização
        int total = 0;// incializa a soma das notas
        int counter = 0;// inicializa o nº de notas inseridas até agora
        
        // fase de processamento
        // solicita entrada e lê a nota do usuário
        System.out.print("Enter the first note or -1 to exit: ");
        int grade = input.nextInt();
        
        // faz um loop até ler o valor de sentinela inserido pelo usuário
        while (grade !=-1){
            total = total + grade;// adiciona grade a total
            counter++;// incrementa counter
            
            // solicita entrada e lê a próxima nota fornecida pelo usuário
            System.out.print("Enter the first note or -1 to exit: ");
            grade = input.nextInt();
        }
        
        // fase de término
        // se usuário inseriu pelo menos uma nota.
        if (grade != 0){
            // usa número com ponto decimal para calcular média das notas
            double media = (double) total / counter;
            
            // exibe o total e a média (com dois dígitos de precisão)
            System.out.printf("%nTotal of the %d grades entered is %d%n", counter, total);
            System.out.printf("Class average is %.2f%n", media);
            
        }else // nenhuma nota foi inserida, assim gera a saída da mensagem apropriada
            System.out.println("No grades were entered");
        
    }
}// fim da classe AverageRefinate
