package be.vdab.parkingconsumer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.support.converter.JsonMessageConverter;

@Configuration
public class ParkingConfig {
@Bean
    JsonMessageConverter converter(){
    return new JsonMessageConverter();
}
}
