import java.util.Scanner;

public class index {
    
    public static void main(String[] args) {
        // String str="hello";
        // // str="";
        // String[] arr={"helllo","c"};
        // char a='a';
        // char[] charArr={'a','b','c'};
        // System.out.println(str);
        // System.out.println(arr);
        // for (String string : arr) {
        //     System.out.println(string);
        // }

        // Scanner sc=new Scanner(System.in);
        // // String ab=sc.next();
        // // String bc=sc.nextLine();
        // // System.out.println(ab);
        // // System.out.println(bc);
        // String f="nitin";
        // for (int i = 0; i < (f.length())/2; i++) {
        //     char ch= f.charAt(i);
        //     if(ch==f.charAt(f.length()-i-1)){
        //         System.out.println(ch);
        //     }
        // }

        String path="wneenesennn";
        int x=0,y=0;
        for (int i = 0; i < path.length(); i++) {
            char val=path.charAt(i);
            System.out.println(val);
            switch (val) {
                case 'n':
                    y++;
                    break;
                case 's':
                    y--;
                    break;
                case 'w':
                    x--;
                    break;
                case 'e':
                    x++;
                    break;
                default:
                    break;
            }
        }
        System.out.println(x+ " "+y);
        System.out.println(Math.sqrt((x*x)+(y*y)));

    }
}