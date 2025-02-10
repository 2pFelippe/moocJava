
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public Money plus(Money addition) {

        Money newMoney = new Money(this.euros + addition.euros, this.cents + addition.cents);

        return newMoney;
    }

    public boolean lessThan(Money compared) {
        if (this.euros < compared.euros) {
            return true;
        }
        if (this.euros == compared.euros && this.cents < compared.cents) {
            return true;
        }

        return false;
    }

    public Money minus(Money decreaser) {
        int totalCentsThis = this.euros * 100 + this.cents; // Converter `this` para centavos
        int totalCentsDecreaser = decreaser.euros * 100 + decreaser.cents; // Converter `decreaser` para centavos

        // Garantir que o resultado nunca será negativo
        if (totalCentsThis < totalCentsDecreaser) {
            return new Money(0, 0); // Retornar 0.00e para valores negativos
        }

        int totalCentsResult = totalCentsThis - totalCentsDecreaser; // Subtração total em centavos

        // Converter o resultado de volta para euros e centavos
        int newEuros = totalCentsResult / 100;
        int newCents = totalCentsResult % 100;

        return new Money(newEuros, newCents); // Criar novo objeto com os valores calculados
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
