package us.vicentini.udemy.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
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

    @Before("allGetters() && allCircleMethods()")
    public void wildCardAdvice() {
        log.info("Advice run. Using wildcard (1)");
    }

    @Before("allGetters()")
    public void secondAdviceWithPointcut() {
        log.info("Advice run. Using wildcard (2)");
    }

    @Before("allCircleMethods()")
    public void allCircleMethodsBefore() {
        log.info("Before Circle Method");
    }


    @After("allCircleMethods() && allSetters()")
    public void circleSetterAfter() {
        log.info("!!! After circle setter !!! ");
    }

    @AfterReturning("allCircleMethods() && allSetters()")
    public void circleSetterAfterReturning() {
        log.info("!!! After circle setter executes successfully !!! ");
    }

    @AfterThrowing(pointcut = "allCircleMethods()", throwing = "ex")
    public void afterThrowing(RuntimeException ex) {
        log.warn("Exception has been thrown: " + ex.getMessage());
    }

    @AfterReturning(pointcut = "args(name)", returning = "returning")
    public void afterReturning(String name, String returning) {
        log.info("After returning with argument: " + name + ", returning: " + returning);
    }

    @Around("allGetters() && allCircleMethods()")
    public Object myAroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
        try {
            log.info("+ Before Around Advice");
            Object retVal = joinPoint.proceed();
            log.info("+ After Around Advice");
            return retVal;
        } catch (Throwable throwable) {
            log.info("+ After Throwing Around Advice");
            throw throwable;
        } finally {
            log.info("+ After Finally Around Advice");
        }
    }


    @Pointcut("execution(public * get*())")
    public void allGetters() {
    }

    @Pointcut("execution(public * set*(*))")
    public void allSetters() {
    }

    @Pointcut("within(us.vicentini.udemy.shape.Circle)")
    public void allCircleMethods() {
    }

}
