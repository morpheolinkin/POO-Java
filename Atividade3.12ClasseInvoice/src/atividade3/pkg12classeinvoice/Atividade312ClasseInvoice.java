package atividade3.pkg12classeinvoice;
public class Atividade312ClasseInvoice {
    public static void main(String[] args) {
        Invoice [] fatura = new Invoice[3];
        
                
        fatura [0] = new Invoice("01", "Gasolina", 5, 35.70);
        
        fatura[1] = new Invoice ("02", "Mercado", 2, 350.70);
        
        System.out.println("Valor da fatura 1 é de: " + fatura[0].getInvoiceAmount());
        System.out.println("Valor da fatura 2 é de: " + fatura[1].getInvoiceAmount());
        
        
    }
    
}
