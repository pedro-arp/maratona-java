package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.test;

import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TransferQueue;


public class LinkedTransferQueueTest01 {
    public static void main(String[] args) throws InterruptedException {
        // ConcurrentLinkedQueue, SynchronousQueue, LinkedBlockingQueue
        TransferQueue<Object> tq = new LinkedTransferQueue<>();
        System.out.println(tq.add("Pedro"));
        System.out.println(tq.offer("Pedro", 10, TimeUnit.SECONDS));
        tq.put("Augusto");
        if (tq.hasWaitingConsumer()) {
            tq.transfer("Augusto");
        }
        System.out.println(tq.tryTransfer("Augusto"));
        System.out.println(tq.tryTransfer("Augusto",5,TimeUnit.SECONDS));
        System.out.println(tq.element());
        System.out.println(tq.peek());
        System.out.println(tq.poll());
        System.out.println(tq.take());
        System.out.println(tq.remove());
    }
}
