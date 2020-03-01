package com.xebia.robotClientApp.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Robot {

    private Long robotId;

    private Integer batteryRemaining;

    private Integer inputWeight;

    private Long barCode;

}
