import java.util.Arrays;
public class TwoToOne {
    public static void main(String[] args) {
        longest("aretheyhere", "yestheyarehere");
    }

    public static String longest(String s1, String s2){

        char[] s1Array =  s1.toCharArray();
        char[] s2Array =  s2.toCharArray();
        char[] sArrayUnical = new char[s1Array.length + s2Array.length];

        for (int i = 0; i < sArrayUnical.length; i++) {
            if(i >= s1Array.length){
                sArrayUnical[i] = s2Array[i - s1Array.length];
            }else {
                sArrayUnical[i] = s1Array[i];
            }
        }
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