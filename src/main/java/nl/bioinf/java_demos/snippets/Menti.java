package nl.bioinf.java_demos.snippets;

public class Menti {
    public static void main(String[] args) {
        q1();
//        q2();
//        q3();
    }

    static void q1(){
        OUTER:
        for (int i = 0; i < 5; i++) {
            INNER:
            for (int j = 0; j < 5; j++) {
                System.out.println("Hi"); //i=1, j=0
                if (i % 2 == 1) continue OUTER;
                else break INNER;
            }
        }
    }

    static void q2() {
        for (int i = 0; ; i++) {
            if (i % 2 == 1) break;
            else i++;
        }
    }

    static void q3() {
        switcher(1);
    }
    static void switcher(int number) {
        switch (number) {
            case 1:
                System.out.print("a " + number); number = 3;
            case 2:
                System.out.print(" b " + number); break;
            case 3:
                System.out.print(" c" + number);
            default:
                System.out.println("other");
        }
    }
}
