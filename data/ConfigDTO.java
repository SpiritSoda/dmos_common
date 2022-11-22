package com.dmos.dmos_common.data;

import lombok.Data;
import lombok.ToString;


@Data
@ToString
public class ConfigDTO {
    private int id;
    private int interval;
    private String ip;
}
