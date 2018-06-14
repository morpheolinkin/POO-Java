
package atividade3.pkg13classeemployee;

import javax.swing.JOptionPane;

public class Atividade313ClasseEmployee {

    public static void main(String[] args) {
       Employee s1 = new Employee();
       Employee s2 = new Employee();
       
       /* 
       String name = JOptionPane.showInputDialog("Informe seu nome: ");
       String sobreNome = JOptionPane.showInputDialog("Informe seu sobrenome: ");
        
        double salAnual = Double.parseDouble(JOptionPane.showInputDialog("Informe o salario anual: "));
        
        System.out.printf("O senhor %s %s tem um salário anual no valor de %.2f%n", name, sobreNome, salAnual);
        */
       
       
       //OBJETO FUNCIONÁRIO 01
       s1.setName(JOptionPane.showInputDialog("Informe nome do funcionário 01").toUpperCase());
       s1.setSubName(JOptionPane.showInputDialog("Informe o sobrenome do funcionário 01").toUpperCase());
       s1.setSalary(Double.parseDouble(JOptionPane.showInputDialog("Informe o salario anual do funcionário 01: ")));
       
       //OBJETO FUNCIONÁRIO 02
       s2.setName(JOptionPane.showInputDialog("Informe nome do funcionário 02").toUpperCase());
       s2.setSubName(JOptionPane.showInputDialog("Informe o sobrenome do funcionário 02").toUpperCase());
       s2.setSalary(Double.parseDouble(JOptionPane.showInputDialog("Informe o salario anual do funcionário 02: ")));
       
        //EXIBIÇÃO DO OBJETO FUNCIONÁRIO 01
       System.out.printf("O funcionário 01, senhor %s %s tem um salário anual no valor de %.2f%n%n", s1.getName(), s1.getSubName(), s1.getSalary());
       //Almento de 10%
       s1.setSalary(s1.getSalary() + (s1.getSalary()* 0.1) );
       System.out.printf("Com um almento de 10 por cento no valor do salario anual"
               + " o funcionário 01, senhor %s %s ficou com um montante de %.2f%n%n",s1.getName(), s1.getSubName(), s1.getSalary());
       
       //EXIBIÇÃO DO OBJETO FUNCIONÁRIO 02
       System.out.printf("O funcionário 01, senhor %s %s tem um salário anual no valor de %.2f%n%n",s2.getName(), s2.getSubName(), s2.getSalary());
       //Almento de 10%
       s2.setSalary(s2.getSalary() + (s2.getSalary()* 0.1) );
       System.out.printf("Com um almento de 10 por cento no valor do salario anual"
               + " o funcionário 01, senhor %s %s ficou com um montante de %.2f%n%n",s2.getName(), s2.getSubName(), s2.getSalary());
    }
    
}
