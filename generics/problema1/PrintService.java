package generics.problema1;

import java.util.List;
import java.util.ArrayList;

public class PrintService<T> {

    private List<T> list = new ArrayList<>();

    public void addValue(T value){
        list.add(value);
    }

    public T fisrt() {
        if(list.isEmpty()){
            throw new IllegalStateException("List is empty");
        }
        return list.get(0);
    }

    public void print(){
        System.out.print("[" + fisrt());
        for(int i = 1; i < list.size(); i++){
            System.out.print(", " + list.get(i));
        }
        System.out.print("]");
        System.out.println();
    }
}

