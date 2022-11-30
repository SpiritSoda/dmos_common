package com.dmos.dmos_common.data;

import com.dmos.dmos_common.data.state.CPU;
import com.dmos.dmos_common.data.state.Ram;
import com.dmos.dmos_common.data.state.Storage;
import com.dmos.dmos_common.data.state.Swap;
import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@ToString
public class ClientReportDTO {
    // 报告节点
    private int id;
    // 内存
    private Ram ram;
    // CPU
    private CPU cpu;
    // 硬盘
    private Storage storage;
    // 交换空间
    private Swap swap;

    private long timestamp;
}
