import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;

public class Main {

    ArrayList<Napoje> napuj = new ArrayList<>();
    public static void main(String[] args) {


        napuj.add(new Woda("Staropolanka","bez","True","2l"));
        napuj.add(new Cola("CocaCola","limonkowy","1,5l"));
        napuj.add(new Kawa("czarna","kombo","zwykly","kubek"));

        public void sortowanie(){
            napuj.sort(new Comparator<Napoje>() {
                @Override
                public int compare(Napoje o1, Napoje o2) {
                    return o1.getClass().getName().compareTo(o2.getClass().getName());
                }
            });
        }

        public static void programowanie(){
            KochajacyProgramowac kochajacyProgramowac = new KochajacyProgramowac() {
                @Override
                public void programuj() {
                    System.out.println("kocham programowac");
                }
            };
            System.out.println(kochajacyProgramowanie.programuj());
        }

        //zad 8
        String input = "czesc";
        Function<String, Integer> lambda1 = s -> s.length();
        int wynik1 = lambda1.apply(input);
        System.out.println("Dlugosc to: " + wynik1);

        //zad9
        IntConsumer lambda2 = ocena -> System.out.println("dostanę ocenę:" + ocena);
        lambda2.accept(5);

        //zad10
        IntBinaryOperator mnozenie = (a, b) -> a * b;
        int iloczyn = mnozenie.applyAsInt(7, 4);
        System.out.println("Iloczyn: " + iloczyn);


    }
}