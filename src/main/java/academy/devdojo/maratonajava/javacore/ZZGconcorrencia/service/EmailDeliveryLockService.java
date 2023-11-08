package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.service;


import academy.devdojo.maratonajava.javacore.ZZGconcorrencia.model.Members;

public class EmailDeliveryLockService implements Runnable {
    private final Members members;

    public EmailDeliveryLockService(Members members) {
        this.members = members;
    }

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " starting to deliver emails...");
        while (members.isOpen() || members.pendingEmails() > 0) {
            try {
                String email = members.retrieveEmail();
                if (email == null) continue;
                System.out.println(threadName + " Enviando email para " + email);
                Thread.sleep(2000);
                System.out.println(threadName + " enviou email com sucesso para " + email);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Todos os email foram enviados com sucesso");
    }
}
