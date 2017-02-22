package aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.util.StopWatch;


/**
 * Created by Illya on 21.02.17.
 */
public class ExecutTimer {



    public void timer(ProceedingJoinPoint joinPoint){

        try{

            StopWatch t = new StopWatch();

            t.start();

            joinPoint.proceed();

            t.stop();

            System.out.println("Executing time: "+t.getLastTaskTimeMillis()+" ms");
        }catch (Throwable e){
            System.out.println("crash of method executing");
        }

    }

}
