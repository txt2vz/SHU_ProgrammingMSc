import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class StreamTest {

    public static void main (String[] args){

        System.out.println("om");

        List<String> myList =
                Arrays.asList("a1", "a2", "b1", "c2", "c1");

        myList
                .stream()
                .filter(s -> s.startsWith("c"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);

        IntStream.range(1, 4)
                .forEach(System.out::println);

        new StreamTest();
    }

    StreamTest(){
        System.out.println("tat");
        System.out.println(h2());
    }

    String h2(){
        return "sat";
    }
}
