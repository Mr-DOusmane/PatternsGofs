package Strategy;

import java.util.List;

public class StandardFormat<T> implements ArrayDisplayFormat<T>{

    @Override
    public void printData(List<T> elements) {
        String result = "";
        result += "[";
        for (T elem : elements){
            result += elem.toString() + ", ";
        }
        result = result.substring(0, result.length() - 2);
        result += "]";
        System.out.println(result);
    }
}
