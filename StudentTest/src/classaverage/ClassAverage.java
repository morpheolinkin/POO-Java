package classaverage;

import java.util.Scanner;

public class ClassAverage {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        //Variável para armazenar as notas
        int total = 0;// inicializa a soma das notas inseridas pelo usuário
        //Variável para servir como contador
        int gradeCounter = 1;// inicializa nº da nota a ser inserido em seguida
        
        // fase de processamento utiliza repetição controlada por contador
        while (gradeCounter <= 10){// faz o loop 10 vezes
            System.out.print("Enter grade: ");// prompt
            
            int grade = input.nextInt();//Insere a proxima nota
            
            total = total + grade;//Adiciona grade ao total
            gradeCounter += 1;//Incrementa o contador em 1
        }
        
        //Fase de término
        int average = total / 10;// divisão de inteiros produz um resultado inteiro
        /**
        *O cálculo da média realizado pelo método main produz um resultado inteiro. A saída do programa indica que a soma dos valores
        *das notas na execução de <strong>exemplo</strong> é 846, que, quando dividido por 10, deve produzir o número de ponto flutuante 84,6. Entretanto,
        *o resultado do cálculo total / 10 (linha 26 da Figura 4.8) é o inteiro 84, porque total e 10 são ambos inteiros. Dividir dois inteiros
        *resulta em divisão de inteiro — qualquer parte fracionária do cálculo é truncada (isto é, perdida).
        */
        
        
        //Exibe o total e média das notas
        System.out.printf("%nTotal of all 10 grades is %d%n", total);
        System.out.printf("Class average is %d%n", average);
        
        
    }
}
