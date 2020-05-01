public class Main {
    public static void main(String[] args) {

        int balance = 2_000_000_000;
        int refillTransfer = 500_000_000;
        balance += refillTransfer;

        System.out.println("Текущий баланс счёта: " + balance);
    }
}
