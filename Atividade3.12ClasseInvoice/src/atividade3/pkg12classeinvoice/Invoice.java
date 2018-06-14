package atividade3.pkg12classeinvoice;

public class Invoice {
    private String number;
    private String description;
    private int amount;//Quantidade
    private double price;

    public Invoice(String number, String description, int amount, double price) {
        this.number = number;
        this.description = description;
        
        if (this.amount < 0)        
            this.amount = 0; 
        else 
            this.amount = amount;
        if (this.price < 0) 
            this.price = 0.0;
        else 
            this.price = price;
        
    }
    
    //multiplica a quantidade pelo preço por item
    public double getInvoiceAmount(){//Quantidade da fatura
        double result;
        result = getAmount()*getPrice();
        return result;
    }
    
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    
    
}
