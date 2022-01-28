import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // ex1();
        // ex2();
        // ex3();
        // ex4();
        // ex5();
        ex6();
    }

    public static void ex1() {
        System.out.println("-----10.1-----");
        
        Scanner sc = new Scanner(System.in);

        System.out.print("input msg:");
        String msg = sc.next();

        System.out.println("文字列の最後の文字は" + msg.charAt(msg.length() - 1));

    }

    public static void ex2(){
        System.out.println("-----10.2-----");

        Scanner sc = new Scanner(System.in);

        System.out.print("input msg:");
        String msg = sc.next();

        System.out.print("input number:");
        int num = sc.nextInt();

        if(num >= 0 && num < msg.length()) {
              System.out.println("文字列から指定したNumber目の文字は" + msg.charAt(num));
        } else {
              System.out.println("入力値は0以上、文字数未満にしてください");
        }
    }

    public static void ex3() {
        System.out.println("-----10.3-----");

        Scanner sc = new Scanner(System.in);

        System.out.print("input msg:");
        String msg = sc.next();

        System.out.print("input number:");
        int loopNum = sc.nextInt();

        String msg2 = "";

        if(loopNum >= 0) {
            for(int i = 0; i < loopNum; i++) {
                System.out.println(i + "回目のループ");
                msg2 = msg2 + msg;
                System.out.println(msg2);
            }
        } else {
              System.out.println("入力値は0以上にしてください");
        }

        System.out.println(msg2);
    }

    public static void ex4() {
        System.out.println("-----10.4-----");
        
        Scanner sc = new Scanner(System.in);

        // keyboard input
        System.out.print("input msg:");
        String msg = sc.next();

        // buffer 確保
        StringBuffer sb = new StringBuffer(msg);
        
        // rev に反転した文字を代入
        String rev = sb.reverse().toString();

        // 入力した文字と反転した文字を出力
		System.out.println( msg + rev);
    }

    public static void ex5() {
        System.out.println("-----10.5-----");

        Scanner sc = new Scanner(System.in);

        //検証対象の文字
        System.out.print("input msg:");
        char msg = sc.next().charAt(0);

        //検証結果
        boolean result = true;

        //文字についてCharacter.isDigitメソッドで判定する
        if(Character.isDigit(msg)) {
            System.out.println(msg + "は数字である => " + result);
        }else{
            result = false;
            System.out.println(msg + "は数字である => " + result);
        }
    }
    public static void ex6() {
        System.out.println("-----10.6-----");

        Scanner sc = new Scanner(System.in);

        //検証対象の文字
        System.out.print("input msg:");
        char msg = sc.next().charAt(0);

        //文字についてCharacter.isDigitメソッドで判定する
        if(Character.isUpperCase(msg)) {
            System.out.println(msg + "は大文字である");
        }else{
            System.out.println(msg + "は小文字である");
        }
    }
}