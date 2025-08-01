package programmer.zaman.now.generic.application;

import programmer.zaman.now.generic.MyData;

public class WildcardApp {
    public static void main(String[] args) {

        print(new MyData<Integer>(100));
        print(new MyData<String>("Hari"));
        print(new MyData<MultipleConstraitApp.Manager>(new MultipleConstraitApp.Manager()));
    }

    public static void print(MyData<?> myData){
        System.out.println(myData.getData());
    }
}
