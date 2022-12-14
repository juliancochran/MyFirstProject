public class StringStuff {
    public static boolean isPalindrome(String phrase)   {
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        String[] brokenUp = phrase.split(" ");
        String newOne = String.join("", brokenUp).toLowerCase();
        String stripped = "";
        //newOne.replaceAll("[^a-zA-Z ]", "");
        //System.out.println(newOne);
        String toTest = "";
        for(int i = 0; i < newOne.length(); i++)    {
            if(alpha.contains(""+newOne.charAt(i))) {
                toTest = newOne.charAt(i) + toTest;
                stripped += newOne.charAt(i);
            }
        }
        return stripped.equals(toTest);
        //return variable == variable[::-1];
    }

    public static void main(String[] args) {
        String phrase = "NURSES!!! RUN!!!";
        System.out.println(isPalindrome(phrase));
        /*String s1 = "Imhotep";  // 14 bytes
        String s2 = s1;
        s1 = "Wyatt";           // 10 bytes
        String s3 = new String(s1);     // copy constructor
        char[] letters = {'h', 'e', 'l', 'l', 'o'};
        String s4 = new String(letters);
        System.out.println(s4);
        String s5 = new String("Ani why are you late to class?");
        System.out.println(s5);

        // Strings are immutable --> ??
        // You can't change character values within a string

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);*/
    }
}
