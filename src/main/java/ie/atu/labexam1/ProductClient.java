package ie.atu.labexam1;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name="", url="http://localhost:8081/")
public interface ProductClient {

    @PostMapping("/warehouse")
    Object getData();

}
