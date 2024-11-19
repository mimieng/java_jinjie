package Genericity01;

import java.util.ArrayList;

//泛型类
public class MyArraylist<E> {
    private ArrayList List=new ArrayList();
    public boolean add(E e){

        return List.add(e);
    }
    public boolean remove(E e){
        return List.remove(e);
    }
    public String toString(){
        return List.toString();
    }

}
