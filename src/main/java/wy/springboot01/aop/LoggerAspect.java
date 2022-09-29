package wy.springboot01.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect  //声明它是一个切面对象
public class LoggerAspect {
    //在Callculator中所有方法（*）执行之前都去执行beforecal
    @Before("execution(public int wy.springboot01.domain.CalMachine.*(..))")
    public void beforecal(JoinPoint joinPoint) {
        //获取方法名
        String name = joinPoint.getSignature().getName();
        //getArgs获取参数
        System.out.println(name + "方法的参数是" + Arrays.toString(joinPoint.getArgs()));
    }
    //在Callculator中所有方法（*）执行之后都去执行aftercal，且返回值映射到result
    @AfterReturning(value = "execution(public int wy.springboot01.domain.CalMachine.*(..))", returning = "result")
    public void aftercal(JoinPoint joinPoint, Object result){
        //获取方法名
        String name = joinPoint.getSignature().getName();
        //getArgs获取参数
        System.out.println(name + "方法的结果是" + result);
    }

}
