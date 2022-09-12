import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
          //Arrays
        Cat[] cats = new Cat[4];

        cats[0] = new Cat("Томас");
        cats[1] = new Cat("Васька");
        cats[2] = new Cat("Черныш");
        cats[3] = new Cat("Котяра");


        //cats[1] = null;

        System.out.println(Arrays.toString(cats));

        //ArrayList
        ArrayList<Cat> catsList = new ArrayList();
        for (Cat cat : cats){
            catsList.add(cat);

        }
        catsList.add(new Cat("Кошара"));

        catsList.remove(1);


        Cat cat = catsList.get(0);

        System.out.println(cat);

        System.out.println(catsList.indexOf(cat));

        catsList.add(2, cat);

        catsList.set(2, new Cat("Меня сюда вставили"));

        catsList.removeAll(Arrays.asList(cat, catsList.get(3)));





        System.out.println(catsList.toString());

        System.out.println(catsList.size());

         //LinkedList

        String str1 = new String("Hello World !");
        String str2 = new String("My name is Vasia");
        String str3 = new String("I love JAVA !");


        LinkedList<String> stBio = new LinkedList<>();
        stBio.add(str1);
        stBio.add(str2);
        stBio.add(str3);


        System.out.println(stBio);


        stBio.remove(1);


        System.out.println(stBio);


        //LinkedList on practice

        LinkedList<Car> cars = new LinkedList<>();
        Car lamborgini = new Car("Lamborgini Countage");
        Car ferrari = new Car("Ferrari Spider F1");
        Car buggati = new Car("Buggati Veyron");


        cars.addAll(Arrays.asList(lamborgini, ferrari, buggati));

        System.out.println(cars);

        cars.addFirst(new Car("Lotus Elise"));
        cars.addLast(new Car("Marusia GT"));


        System.out.println(cars);


        System.out.println(cars.pollFirst());
        System.out.println(cars);







    }
}