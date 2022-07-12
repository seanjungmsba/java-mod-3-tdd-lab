package src.main.java;

public class FizzBuzzArray {
    public String[] fizzBuzzString(String[] strarr) {

        if (strarr.length == 0) {
            return null;
        }

        String[] newStrArr = new String[strarr.length];

        for (int i = 0; i < strarr.length; i++) {
            if (strarr[i].startsWith("f") && strarr[i].endsWith("b")) {
                newStrArr[i] = "FizzBuzz";
            } else if (strarr[i].startsWith("f")) {
                newStrArr[i] = "Fizz";
            } else if (strarr[i].endsWith("b")) {
                newStrArr[i] = "Buzz";
            } else {
                newStrArr[i] = "";
            }
        }
        return newStrArr;

    }

}