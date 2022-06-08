package GoogleKickStart.TwoOTwoTwo;


import java.util.*;

// https://codingcompetitions.withgoogle.com/kickstart/round/00000000008cb4d1/0000000000b20f15
public class NewPassword {
    public static void main(String[] args) {

        //System.out.println('Z' - 0);
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();

        for (int i = 0; i < testcases; i++) {
            int l = sc.nextInt();
            String pass = sc.nextLine();
            solution(l, pass);
        }
       // solution(5, "12345");

    }

    static void solution(int l, String pass) {
        String res = "";
        int allowedL = 7;
        Character[] specialChars = {'#', '@', '*', '&'};
        Boolean containsUpper = false;
        Boolean containsSmaller = false;
        Boolean containsSpecial = false;
        Boolean containsNum = false;
        Boolean enoughLength = false;


        res = pass;

        while (containsUpper != true && containsNum != true && containsSmaller != true && containsSpecial != true && enoughLength != true) {
            for (int i = 97; i <= 122; i++) {
                String str = String.valueOf((char)i);
                if(pass.contains(str)) {
                    containsSmaller = true;
                    break;
                }
            }
            if(!containsSmaller) {
                res += 'a';
            }
            //
            for (int i = 65; i <= 90; i++) {
                String str = String.valueOf((char)i);
                if(pass.contains(str)) {
                    containsUpper = true;
                    break;
                }
            }
            if(!containsUpper) {
                res += 'A';
            }
            //
            for (int i = 0; i < 4; i++) {
                if(pass.contains(String.valueOf(specialChars[i]))) {
                    containsSpecial = true;
                    break;
                }
            }
            if(!containsSpecial) {
                res += specialChars[0];
            }
            //
            for (int i = 0; i < 9; i++) {
                if(pass.contains(String.valueOf(i))) {
                    containsNum = true;
                    break;
                }
            }
            if(!containsNum) {
                res += '1';
            }
            //
            int charNeeds = allowedL - res.length();
            if(!enoughLength) {
                for (int i = 0; i < charNeeds; i++) {
                    res += '1';
                }
            }
        }


        System.out.println(res);
    }
}