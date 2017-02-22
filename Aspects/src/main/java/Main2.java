import annotations.BeansConfig;
import domain.Algorithm;
import domain.BubbleSort;
import domain.MergeSort;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Illya on 22.02.17.
 */
public class Main2 {

    public static void main(String[] args){



        ApplicationContext context = new AnnotationConfigApplicationContext(BeansConfig.class);


        System.out.println("Annotations");

        Algorithm f1 = (Algorithm) context.getBean("bubble");
        Algorithm f2 = (Algorithm) context.getBean("merge");


        f1.prepare();
        f2.prepare();

        System.out.println("Bubble sort:");

        f1.execute();

        System.out.println("Merge sort:");
        f2.execute();


    }

}
