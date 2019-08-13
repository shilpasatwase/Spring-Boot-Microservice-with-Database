package ae.network.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringBootEurekaServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootEurekaServiceApplication.class, args);
    }
}
