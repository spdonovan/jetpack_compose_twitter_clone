package com.training.fordpass;

public class Divider extends CalculateBase {
    @Override
    public void calculate() {
        double value = getLeftVal() / getRightVal();
        setResult(value);
    }
}
