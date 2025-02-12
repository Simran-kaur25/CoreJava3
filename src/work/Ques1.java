package work;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class Ques1 {
    public static void main(String[] args) {
        List<Float> list1= new ArrayList<>();
        list1.add(10.3f);
        list1.add(2.6f);
        list1.add(1.3f);
        list1.add(10.13f);
        list1.add(100.3f);

        Iterator<Float> iterator = list1.iterator();
        float sum=0;

        while(iterator.hasNext()){
            sum+=iterator.next();
        }

        System.out.println("Sum of floating point Numbers are : " + sum );

    }
}
