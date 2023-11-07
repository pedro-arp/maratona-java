package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.test;


import academy.devdojo.maratonajava.javacore.ZZGconcorrencia.model.Members;
import academy.devdojo.maratonajava.javacore.ZZGconcorrencia.service.EmailDeliveryLockService;

import javax.swing.*;

public class EmailDeliveryLockTest01 {
    public static void main(String[] args) {
        Members members = new Members();
        Thread jiraya = new Thread(new EmailDeliveryLockService(members), "Jiraya");
        Thread kakashi = new Thread(new EmailDeliveryLockService(members), "Kakashi");

        jiraya.start();
        kakashi.start();

        while (true) {
            String email = JOptionPane.showInputDialog("Entre com seu email");
            if (email == null || email.isEmpty()) {
                members.close();
                break;
            }
            members.addMemberEmail(email);
        }
    }
}
