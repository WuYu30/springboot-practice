package wy.springboot01.domain;

import org.springframework.stereotype.Component;
import wy.springboot01.Interface.CalAPI;
@Component
public class CalMachine implements CalAPI {

    @Override
    public int add(int num1, int num2) {
        //System.out.println("add方法的结果是" + (num1 + num2));
        return num1 + num2;
    }

    @Override
    public int sub(int num1, int num2) {
        //System.out.println("sub方法的结果是" + (num1 - num2));
        return num1 - num2;
    }

    @Override
    public int mul(int num1, int num2) {
        //System.out.println("sub方法的结果是" + (num1 - num2));
        return num1 * num2;
    }

    @Override
    public int div(int num1, int num2) {
        //System.out.println("div方法的结果是" + (num1 / num2));
        return num1 / num2;
    }
}
