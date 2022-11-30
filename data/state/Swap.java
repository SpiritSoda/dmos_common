package com.dmos.dmos_common.data.state;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Swap {
    private double percent;
    private double used;
    private double total;
}
