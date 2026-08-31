public class PaymentTerminal {

    private double money;
    private int affordableMeals;
    private int heartyMeals;

    public PaymentTerminal() {
        this.money = 1000;
    }

    // CASH PAYMENT
    public double eatAffordably(double payment) {
        if (payment >= 2.50) {
            this.money += 2.50;
            this.affordableMeals++;
            return payment - 2.50;
        }

        return payment;
    }

    // CASH PAYMENT
    public double eatHeartily(double payment) {
        if (payment >= 4.30) {
            this.money += 4.30;
            this.heartyMeals++;
            return payment - 4.30;
        }

        return payment;
    }

    // CARD PAYMENT
    public boolean eatAffordably(PaymentCard card) {
        if (card.takeMoney(2.50)) {
            this.affordableMeals++;
            return true;
        }

        return false;
    }

    // CARD PAYMENT
    public boolean eatHeartily(PaymentCard card) {
        if (card.takeMoney(4.30)) {
            this.heartyMeals++;
            return true;
        }

        return false;
    }
    public void addMoneyToCard(PaymentCard card, double sum) {
        if (sum > 0){
        card.addMoney(sum);
        this.money += sum;
        }

    }

    @Override
    public String toString() {
        return "money: " + money
                + ", number of sold affordable meals: " + affordableMeals
                + ", number of sold hearty meals: " + heartyMeals;
    }
}
