package programmer.zaman.now.generic.application;

import programmer.zaman.now.generic.Util.ArrayHelper;

public class ArrayHelperApp {
    public static void main(String[] args) {

        String[] names = {"Hari" , "Narwanto"};
        Integer[] numbers = {1,2,3,4,5,6};

        System.out.println(
                ArrayHelper.<String>count(names)
        );

        System.out.println(
                ArrayHelper.count(numbers)
        );
    }
}
