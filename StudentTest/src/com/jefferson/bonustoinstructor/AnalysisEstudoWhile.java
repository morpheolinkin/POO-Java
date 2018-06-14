package com.jefferson.bonustoinstructor;
/**
 * <h1>Considere a seguinte declaração do problema:</h1>
 * <p>Uma faculdade oferece um curso que prepara os candidatos a obter licença estadual para corretores de imóveis. 
 * No ano passado, dez alunos que concluíram esse curso prestaram o exame. A universidade quer saber como
 * foi o desempenho dos seus alunos nesse exame. Você foi contratado para escrever um programa que resuma os 
 * resultados. Para tanto, você recebeu uma lista desses 10 alunos. Ao lado de cada nome é escrito 1 se o aluno passou 
 * no exame ou 2 se o aluno foi reprovado.</p> 
 * <h3>Seu programa deve analisar os resultados do exame assim:</h3>
 * <ul>
 *      <li>1. Dê entrada a cada resultado do teste (isto é, um 1 ou um 2). Exiba a mensagem “Inserir resultado” na tela 
 *          toda vez que o programa solicitar o resultado de outro teste.</li> 
 *      <li>2. Conte o número de cada tipo de resultado.</li>  
 *      <li>3. Exiba um resumo dos resultados do teste indicando o número de alunos aprovados e reprovados.</li>  
 *      <li>4. Se mais de oito estudantes forem aprovados no exame, imprima “Bonus to instructor!”.</li>  
 * </ul>
 */

//Dois modos de receber dados do usuário
import java.util.Scanner;
import javax.swing.JOptionPane;

public class AnalysisEstudoWhile {
    public static void main (String[] args){
        
        Scanner input = new Scanner(System.in);
        
        int approved = 0;
        int disApproved = 0;
        int NumberOfStudents = 1;
        int valor = 0;
        
        while (NumberOfStudents <= 10){
            //System.out.print("Insert result of exame, 1 for approved; 2 for disapproved: ");
            int result = Integer.parseInt(JOptionPane.showInputDialog("Insert result of exame, 1 for approved; 2 for disapproved: "));
            //int result = input.nextInt();
            
            
            if (result == 1)
                approved++;
            else if (result == 2) 
                disApproved++;
            else {
                //System.out.println("Invalid result");
                JOptionPane.showMessageDialog(null ,"Invalid result");
                //System.out.print("Insert result of exame, 1 for approved; 2 for disapproved: ");
                //result = input.nextInt();
                result = Integer.parseInt(JOptionPane.showInputDialog("Insert result of exame, 1 for approved; 2 for disapproved: "));
                continue;
            }
            
            NumberOfStudents++;
        }
        
        //System.out.printf("\nThe number of approvals is %d and the number of failures is %d%n", approved, disApproved);
        JOptionPane.showMessageDialog(null ,"The number of approvals is " + approved);
        JOptionPane.showMessageDialog(null ,"The number of failures is " + disApproved);
        
        if (approved > 8)
            //System.out.println("Bonus to instructor!!");
            JOptionPane.showMessageDialog(null ,"Bonus to instructor");
        
        
        
        
        
    }
}
