package com.kaesar.jvm_zzm.chp3;

/**
 * 新生代 Minor GC
 * -XX:SurvivorRatio=8 表示新生代中 Eden 区与一个 Survivor 区的空间比例是 8 : 1
 */
public class MinorGC {
    private static final int _1MB = 1024 * 1024;

    /**
     * VM参数： -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8
     */
    public static void testAllocation() {
        byte[] allocation1, allocation2, allocation3, allocation4;
        allocation1 = new byte[2 * _1MB];
        allocation2 = new byte[2 * _1MB];
        allocation3 = new byte[2 * _1MB];
        allocation4 = new byte[4 * _1MB]; // 出现一次 Minor GC
    }

    public static void main(String[] args) {
        testAllocation();
    }
}