package edu.kis.powp.command;

public class ComplexCommandStore {
    private SetPositionCommand set;
    private OperateToCommand op;

    public ComplexCommandStore(SetPositionCommand set) {
        this.set = set;
    }

    public ComplexCommandStore(OperateToCommand op) {
        this.op = op;
    }

    public SetPositionCommand getSet() {
        return set;
    }

    public OperateToCommand getOp() {
        return op;
    }
}
