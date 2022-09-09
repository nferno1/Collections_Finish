import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        Cat[] cats = new Cat[4];

        cats[0] = new Cat("Томас");
        cats[1] = new Cat("Васька");
        cats[2] = new Cat("Черныш");
        cats[3] = new Cat("Котяра");


        //cats[1] = null;

        System.out.println(Arrays.toString(cats));


        ArrayList<Cat> catsList = new ArrayList();
        for (Cat cat : cats){
            catsList.add(cat);

        }
        catsList.add(new Cat("Кошара"));



        System.out.println(catsList.toString());



    }
}