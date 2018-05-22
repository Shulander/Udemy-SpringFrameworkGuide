package us.vicentini.udemy.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Slf4j
@Aspect
public class LoggingAspect {

    @Before("execution(public String us.vicentini.udemy.shape.Circle.getName())")
    public void loggingAspect() {
        log.info("Advice run. Get Method Called");
    }

    @Before("allGetters()")
    public void wildCardAdvice() {
        log.info("Advice run. Using wildcard (1)");
    }

    @Before("allGetters()")
    public void secondAdviceWithPointcut() {
        log.info("Advice run. Using wildcard (2)");
    }

    @Pointcut("execution(public * get*())")
    public void allGetters(){}
}
