package aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.util.StopWatch;

/**
 * Created by Illya on 22.02.17.
 */

@Aspect
public class ExecutTimer2 {

    @Pointcut("execution(* domain.Algorithm.execute())")
    public void execute(){};

    @Around("execute()")
    public Object timer(ProceedingJoinPoint joinPoint){
        Object res = null;
        try{

            StopWatch t = new StopWatch();

            t.start();

            res = joinPoint.proceed();

            t.stop();

            System.out.println("Executing time: "+t.getLastTaskTimeMillis()+" ms");
        }catch (Throwable e){
            System.out.println("crash of method executing");
        }

        return res;
    }
}
