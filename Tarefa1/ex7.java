import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        ArrayList<String> lines = new ArrayList<String>();
        // boolean f = false;
        while (lines.size() < 128) {
            String str = sc.nextLine();
            lines.add(str);
            // for (String s : str.split(" ")) {
            //     System.out.println(s);
            //     if (s.equals("fim")){
            //         f = true;
            //         break;
            //     }
            // }
            // if (f){
            //     break;
            // }
            if (str.endsWith("fim")){
                break;
            }

        }
        Collections.reverse(lines);
        for (String line : lines) {
            System.out.println(line);
        }

        sc.close();
    }
}
