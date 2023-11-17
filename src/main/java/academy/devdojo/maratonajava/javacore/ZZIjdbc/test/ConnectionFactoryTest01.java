package academy.devdojo.maratonajava.javacore.ZZIjdbc.test;

import academy.devdojo.maratonajava.javacore.ZZIjdbc.model.Producer;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.service.ProducerService;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class ConnectionFactoryTest01 {
    public static void main(String[] args) {
        final Producer producer = Producer.builder().name("TEST").build();
        final Producer producerToUpdate = Producer.builder().id(6).name("Testing").build();
      //  ProducerService.save(producer);
      //  ProducerService.delete(1);
        ProducerService.update(producerToUpdate);

    }
}
