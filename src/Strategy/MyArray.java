package Strategy;

import java.util.ArrayList;
import java.util.List;

public class MyArray<T> {

    private List<T> elements;
    private ArrayDisplayFormat<T> adf;

    public MyArray(){
        this.elements = new ArrayList<>();
    }

    public void setElement(T elem){
        this.elements.add(elem);
    }

    public T getElement(int pos){
        return this.elements.get(pos);
    }

    public void setDisplayFormat(ArrayDisplayFormat<T> adf){
        this.adf = adf;
    }

    public void display(){
        adf.printData(elements);
    }
}
