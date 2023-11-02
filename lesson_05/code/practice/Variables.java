package practice;

public class Variables {
    public static void main(String[] args) {

        int a = 50; // naturalnie - eto zelie i poloschitelnie
        int b = 50;
        int res = 0;

        if ( a == b ) {
            res = (a + b) * 5;
        }
        if ( a != b ) {
            res = (a - b) * 5;
        }

        System.out.println(res);

    }
}

