package ie.atu.labexam1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class LabExam1Application {

    public static void main(String[] args) {
        SpringApplication.run(LabExam1Application.class, args);
    }

}
