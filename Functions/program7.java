//Java method to check whether a string is a valid password.

class Func 
{

    static String validatingPassword(String s) {
        int cap = 0, smLetter = 0, digit = 0;

        int len = 0;

        for (int i = 0; i < s.length(); i++) {

            len++;

            char c = s.charAt(i);

            if (c > 46 && c < 58) {
                digit++;
            }

            if (c > 64 && c < 91) {
                cap++;
            }

            if (c > 96 && c < 123) {
                smLetter++;
            }

        }
        String result = "";
        if (cap < 2) {
            result += "Password should contain at least  two capital letters.";
        }

        if (digit < 2) {
            result += "\nPassword should contain at least 1 digit ...";
        }

        if (len < 8) {
            result += "\nPassword should be minimum 8 characters";
        }

        if (cap >= 2 && digit >= 2 && len >= 8) {
           result+="Password is valid...";
        }

        else{
            result+="\nPassword is not valid...";
        }

        return result;
    }

    public static void main(String[] args) {
        String s = "HHellolodev45";

        System.out.println(validatingPassword(s));

    }

}