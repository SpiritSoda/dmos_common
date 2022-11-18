package com.dmos.dmos_common.data;

import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@ToString
public class ReportDTO {
    // 报告节点
    private int id;
    // 子节点 潜在的多层可扩展性？
    private List<Integer> childs;
    // 内存
    private double mem;
    // CPU
    private double cpu;
    // 硬盘
    private double disk;
    // 温度
    private double temperature;
    // 操作系统
    private String OS;
}
