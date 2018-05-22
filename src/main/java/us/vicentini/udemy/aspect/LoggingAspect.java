package us.vicentini.udemy.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Slf4j
@Aspect
public class LoggingAspect {

    @Before("execution(public String getName())")
    public void loggingAspect() {
        log.info("Advice run. Get Method Called");
    }
}
