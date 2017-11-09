import java.util.Arrays;
public class TwoToOne {
    public static void main(String[] args) {
        longest("aretheyhere", "yestheyarehere");
    }

    public static String longest(String s1, String s2){
        String s = s1 + s2;
        char[] sArrayUnical = s.toCharArray();
        Arrays.sort(sArrayUnical);

        StringBuilder text = new StringBuilder();
        text.append(sArrayUnical[0]);

        for (int i = 1; i < sArrayUnical.length; i++) {
            if(sArrayUnical[i] != sArrayUnical[i-1]){
                text.append(sArrayUnical[i]);
            }
        }
        String textFinal = text.toString();
        System.out.println(textFinal);
        return textFinal;
    }
}