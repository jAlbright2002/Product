package ie.atu.labexam1;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name="warehouse", url="http://localhost:8081/")
public interface ProductClient {

    @PostMapping("/warehouse")
    Warehouse getData(Warehouse warehouse);

}
