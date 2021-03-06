package com.kaesar.designpattern.zen.chp15;

/**
 * 具体的Command类
 */
public class ConcreteCommand2 extends AbstractCommand {
    //对哪个Receiver类进行命令处理
    private Receiver receiver;

    public ConcreteCommand2(Receiver _receiver) {
        this.receiver = _receiver;
    }

    // 必须实现的一个命令
    @Override
    public void execute() {
        // 业务处理
        this.receiver.doSomething();
    }
}
