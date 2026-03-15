package lr2.Task7;

public class BankAccount implements BankOperations {
    private String accountNumber;
    private String ownerName;
    private double balance;

    public BankAccount(String accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Счет пополнен на " + amount);
        } else {
            System.out.println("Сумма пополнения должна быть больше 0");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Сумма снятия должна быть больше 0");
        } else if (amount > balance) {
            System.out.println("Недостаточно средств на счете");
        } else {
            balance -= amount;
            System.out.println("Со счета снято " + amount);
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }
}
