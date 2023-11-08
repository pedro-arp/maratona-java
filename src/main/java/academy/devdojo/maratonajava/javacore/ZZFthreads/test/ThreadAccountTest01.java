package academy.devdojo.maratonajava.javacore.ZZFthreads.test;

import academy.devdojo.maratonajava.javacore.ZZFthreads.model.Account;

public class ThreadAccountTest01 implements Runnable {
    private final Account account = new Account();

    public static void main(String[] args) {
        ThreadAccountTest01 threadAccountTest01 = new ThreadAccountTest01();
        Thread t1 = new Thread(threadAccountTest01, "Hestia");
        Thread t2 = new Thread(threadAccountTest01, "Bell Cranel");
        t1.start();
        t2.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            withdrawal();
            if (account.getBalance() < 0) {
                System.out.println("Error");
            }
        }
    }

    private void withdrawal() {
        System.out.println(getThreadName() + " ### fora do synchronized");
        synchronized (account) {
            System.out.println(getThreadName() + "*** dentro do synchronized");
            if (account.getBalance() >= 10) {
                System.out.println(getThreadName() + " Esta indo sacar dinheiro");
                account.withdrawal(10);
                System.out.println(getThreadName() + " completou o saque, valor atual da conta " + account.getBalance());
            } else {
                System.out.println("Sem dinheiro para " + getThreadName() + " efetuar o saque");
            }
        }
    }

    private String getThreadName() {
        return Thread.currentThread().getName();
    }
}
