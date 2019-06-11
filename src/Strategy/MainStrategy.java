package Strategy;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MainStrategy {

    public static void main(String[] args) {

        String val[] = new String[10];

        val[7] = "81";
        System.out.println(Arrays.toString(val));

        MyArray<String> stringMyArray = new MyArray<>();
        IntStream.range(0, 3).forEach( i -> {
            stringMyArray.setElement("ousmane-" + i);
        });
        stringMyArray.setDisplayFormat(new MathFormat<>());
        stringMyArray.display();
        stringMyArray.setDisplayFormat(new StandardFormat<>());
        stringMyArray.display();
    }
}
