import domain.Algorithm;
import domain.SortAlgorithm;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Illya on 22.02.17.
 */
public class Main {

    public static void main(String[] args){

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        System.out.println("Xml");

        Algorithm f1 = (Algorithm)  context.getBean("bubble");
        Algorithm f2 = (Algorithm)  context.getBean("merge");


        f1.prepare();
        f2.prepare();

        System.out.println("Bubble sort:");

        f1.execute();

        System.out.println("Merge sort:");
        f2.execute();


    }

}
