package atividade3.pkg13classeemployee;
public class Employee {
    String name;
    String subName;
    double salary;
    
    //CONSTRUTOR
    public Employee() {
        this.name = "";
        this.subName = "";
        if (this.salary < 0)
            System.out.println("Valor negativo não permitodo!");
        else
            this.salary = 0.0;
    }

    
    
    //MÉTODOS ESPECIAIS (SETERS E GETERS)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubName() {
        return subName;
    }

    public void setSubName(String subName) {
        this.subName = subName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    
    
    
}
