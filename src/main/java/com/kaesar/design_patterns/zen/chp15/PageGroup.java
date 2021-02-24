package com.kaesar.design_patterns.zen.chp15;

/**
 * 美工组
 */
public class PageGroup extends Group {

    // 客户要求美工组过去和他们谈
    @Override
    public void find() {
        System.out.println("找到美工组...");
    }

    // 客户要求增加一个页面
    @Override
    public void add() {
        System.out.println("客户要求增加一个页面...");
    }

    // 客户要求删除一个页面
    @Override
    public void delete() {
        System.out.println("客户要求删除一个页面...");
    }

    // 客户要求修改一个页面
    @Override
    public void change() {
        System.out.println("客户要求修改一个页面...");
    }

    // 客户要求给出页面变更计划
    @Override
    public void plan() {
        System.out.println("客户要求页面变更计划...");
    }
}
