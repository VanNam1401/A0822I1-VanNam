package viettuts.string;

import com.sun.javaws.IconUtil;

import java.util.StringTokenizer;

public class StringTokenizerViettuts {
    public static void main(String[] args) {
        StringTokenizer str = new StringTokenizer("Hello I'm Kienroro");
        System.out.println("Tong token: "+str.countTokens());
        while (str.hasMoreTokens()){
            System.out.println(str.nextToken());
        }
        StringTokenizer newStr = new StringTokenizer("Hello-Toi-La-Nguyen-Tran-Kien","-,",false);
        System.out.println("Tong token: "+newStr.countTokens());
        while(newStr.hasMoreTokens()){
            System.out.println(newStr.nextToken());
        }
    }
}
