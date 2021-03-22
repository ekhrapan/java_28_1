package academy.belhard;

public class Main {

    public static void main(String[] args) {
//        int tolya = 12;
//        int vasya = 8;
//
//        if (tolya > vasya && tolya > 3) {
//            System.out.println("У Толи больше яблок");
//        } else if (tolya == vasya) {
//            System.out.println("Яблок поровну");
//        } else {
//            System.out.println("У Васи больше яблок");
//        }

//        for (int i = 0; i != 11; i += 2) {
//            System.out.println(i);
//        }

        int num = 20;
        int res = 0;

        do {
            res += num;
            num++;
        } while (num <= 10);

        System.out.println(res);


    }
}
