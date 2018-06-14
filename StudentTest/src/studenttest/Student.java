package studenttest;
public class Student {
   private String name;
   private double average;

    public Student(String name, double average) {
        this.name = name;
        
        //Valida que o valor da média é maior que 0 e menor que 100
        //caso contrário amrmazena o valor padrão da média da variável, (0.0)
        if (average > 0.0)
            if (average <= 100.0)
                this.average = average;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double StudentAverage) {
        //Valida que o valor da média é maior que 0 e menor que 100
        //caso contrário amrmazena o valor atual média da variável de instância
        if (StudentAverage > 0.0)
            if (StudentAverage <= 100.0)
                this.average = average;
    }
    
    //Determina e retorna a letra da nota
    public String getLetterGrade(){
        String letterGrade = "";//Inicializado como uma String vazia
        
        if (this.average >= 90.0)
            letterGrade = "A";
        else if (this.average >= 80.0)
            letterGrade = "B";
        else if (this.average >= 70.0)
            letterGrade = "C";
        else if (this.average >= 60.0)
            letterGrade = "D";
        else
            letterGrade = "F";
        
        return letterGrade;
    }
}//Fim da classe Student
