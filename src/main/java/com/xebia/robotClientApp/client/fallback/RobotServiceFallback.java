package com.xebia.robotClientApp.client.fallback;

import com.xebia.robotClientApp.client.RobotServiceClient;
import com.xebia.robotClientApp.domain.Robot;
import com.xebia.robotClientApp.domain.RobotResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

@Component
public class RobotServiceFallback implements RobotServiceClient {

    public static final String message = "Service Not Available";

    @Override
    public ResponseEntity<RobotResponse> walkingService(@RequestBody Robot robot) {
        return fallBackService("Walking");
    }

    @Override
    public ResponseEntity<RobotResponse> liftWeight(@RequestBody Robot robot) {
        return fallBackService("Weight Lifting");
    }

    @Override
    public ResponseEntity<RobotResponse> displayPrice(@RequestBody Robot robot) {
        return fallBackService("Scanning");
    }

    private ResponseEntity<RobotResponse> fallBackService(String serviceName) {
        RobotResponse response = new RobotResponse();
        response.setExceptionMessage(serviceName + "\t"+ message);
        return ResponseEntity.ok(response);
    }


}
