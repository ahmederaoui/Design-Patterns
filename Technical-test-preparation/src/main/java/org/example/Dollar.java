package org.example;

public class Dollar {
    public int amount;

    public Dollar(int amount) {
        this.amount=amount;
    }

    public void times(int i) {
        this.amount*=i;
    }
    public boolean equals(Object o){
        return amount==((Dollar)o).amount;
    }
}
