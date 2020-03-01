package com.xebia.robotClientApp.client;

import com.xebia.robotClientApp.domain.Robot;
import com.xebia.robotClientApp.domain.RobotResponse;
import com.xebia.robotClientApp.client.fallback.RobotServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(value="robotService", fallback = RobotServiceFallback.class)
public interface RobotServiceClient {

    @PostMapping(path="/walk", consumes = "application/json", produces = "application/json")
    public ResponseEntity<RobotResponse> walkingService(@RequestBody Robot robot);

    @PostMapping(path="/liftWeight", consumes = "application/json", produces = "application/json")
    public ResponseEntity<RobotResponse> liftWeight(@RequestBody Robot robot);


    @PostMapping(path="/scan", consumes = "application/json", produces = "application/json")
    public ResponseEntity<RobotResponse> displayPrice(@RequestBody Robot robot) ;
}
