package academy.devdojo.maratonajava.javacore.ZZIjdbc.test;

import academy.devdojo.maratonajava.javacore.ZZIjdbc.model.Producer;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.service.ProducerService;
import lombok.extern.log4j.Log4j2;

import java.util.List;

@Log4j2
public class ConnectionFactoryTest01 {
    public static void main(String[] args) {
        final Producer producer = Producer.builder().name("TEST").build();
        final Producer producerToUpdate = Producer.builder().id(6).name("testing").build();
      //  ProducerService.save(producer);
      //  ProducerService.delete(1);
      //  ProducerService.update(producerToUpdate);
      //  final List<Producer> producers = ProducerService.findAll();
      //  final List<Producer> producers = ProducerService.findByName("Tes");
      //  log.info("Producers found'{}'", producers);
      //  ProducerService.showProducerMetaData();
      //  ProducerService.showDriverMetaData();
      //  ProducerService.showTypeScrollWorking();
      //  final List<Producer> producers = ProducerService.findByNameAndUpdateToUpperCase("Testing");
      //  final List<Producer> producers = ProducerService.findByNameAndInsertWhenNotFound("A-1 pictures");
      //  log.info("Producers found'{}'", producers);
      //  ProducerService.findByNameAndDelete("A-1 pictures");
      //  final List<Producer> producers = ProducerService.fingByNamePreparedStatemant("i");
      //  log.info("Producers found'{}'", producers);
      //   ProducerService.updatePreparedStatement(producerToUpdate);
        final List<Producer> producers = ProducerService.findByNameCallableStatemant("i");
        log.info("Producers found'{}'", producers);

    }
}
