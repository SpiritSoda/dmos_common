package com.dmos.dmos_common.data;

import lombok.Data;

import java.util.List;

@Data
public class ServerReportDTO {
    // 报告节点
    private int id;
    // 子节点
    private List<Integer> child;
}
