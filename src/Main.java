
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listA = new ArrayList<>();
        ArrayList<String> listB = new ArrayList<>();
        ArrayList<String> listC = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            listA.add(scanner.nextLine());
        }
        System.out.println(listA);
        for (int i = 0; i < 5; i++) {
            listB.add(scanner.nextLine());
        }
        System.out.println(listB);
        Collections.reverse(listB);
        Integer x = 0;
        while (listC.size()<listA.size()+listB.size()){
            listC.add(listA.get(x) );
            listC.add(listB.get(x) );
            x++;
        }
        listC.add(listA.get(0));
        listC.add(listB.get(1));
        System.out.println(listC);
        Collections.sort(listC, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length()-o2.length() ;
            }
        });
        System.out.println(listC);
    }
}