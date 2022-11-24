package com.dmos.dmos_common.data.state;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CPU {
    private double percent;
    private double used;
    private double total;
}
