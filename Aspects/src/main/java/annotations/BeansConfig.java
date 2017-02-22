package annotations;

import aspect.ExecutTimer2;
import domain.BubbleSort;
import domain.MergeSort;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by Illya on 22.02.17.
 */

@Configuration
@EnableAspectJAutoProxy
public class BeansConfig {

    int n = 10000;

    @Bean
    public MergeSort  merge(){
        return new MergeSort(n);
    }

    @Bean
    public BubbleSort bubble(){
        return new BubbleSort(n);
    }

    @Bean
    public ExecutTimer2 timer(){
        return new ExecutTimer2();
    }
}
