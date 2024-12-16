import java.util.Scanner;

class Account {
    String acc_name, acc_no, acc_type;
    double balance;

    Account(String name, String no, String acc, double bal) {
        this.acc_name = name;
        this.acc_no = no;
        this.acc_type = acc;
        this.balance = bal;
    }

    void deposit(double amt) {
        balance += amt;
        System.out.println("Deposit = " + amt);
    }

    void withdraw(double amt) {
        if (amt > balance) {
            System.out.println("Insufficient Balance");
        } else {
            balance -= amt;
            System.out.println("Withdrawal Amount = " + amt);
        }
    }

    void checkBalance() {
        System.out.println("Available Balance = " + balance);
    }
}

class CurAcct extends Account {
    CurAcct(String name, String no, double bal) {
        super(name, no, "Current Account", bal);
    }

    void minBalance() {
        if (balance < 5000) {
            System.out.println("Min Balance in Current Account should be 5000. Service charge of 100 will be charged.");
            this.balance -= 100.0;
        }
    }

    void cheque(double amt) {
        balance -= amt;
        System.out.println("Cheque Amount = " + amt);
    }
}

class SavAcct extends Account {
    SavAcct(String name, String no, double bal) {
        super(name, no, "Saving Account", bal);
    }

    void computeInterest(int years) {
        double initialBalance = balance;
        double interest = balance * 5 / 100.0 * years;
        initialBalance += interest;
        System.out.println("Interest earned on savings for " + years + " years is " + interest);
        System.out.println("Balance after " + years + " years will be " + initialBalance);
    }
}

public class Lab5 {
    public static void main(String[] args) {
        CurAcct currentAccount = new CurAcct("John Doe", "CA123", 10000);
        SavAcct savingAccount = new SavAcct("Jane Doe", "SA456", 15000);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter:\n1. To deposit in Current Account\n2. To withdraw from Current Account\n3. To check balance in Current Account\n4. To deposit in Saving Account\n5. To withdraw from Saving Account\n6. To check balance in Saving Account\n7. To compute interest in Saving Account\n0. To exit");
        
        int option;
        do {
            System.out.print("\nChoose an option: ");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double currentDeposit = sc.nextDouble();
                    currentAccount.deposit(currentDeposit);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double currentWithdraw = sc.nextDouble();
                    currentAccount.withdraw(currentWithdraw);
                    break;
                case 3:
                    currentAccount.checkBalance();
                    break;
                case 4:
                    System.out.print("Enter amount to deposit: ");
                    double savingDeposit = sc.nextDouble();
                    savingAccount.deposit(savingDeposit);
                    break;
                case 5:
                    System.out.print("Enter amount to withdraw: ");
                    double savingWithdraw = sc.nextDouble();
                    savingAccount.withdraw(savingWithdraw);
                    break;
                case 6:
                    savingAccount.checkBalance();
                    break;
                case 7:
                    System.out.print("Enter number of years to compute interest: ");
                    int years = sc.nextInt();
                    savingAccount.computeInterest(years);
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid input");
            }
        } while (option != 0);
    }
}