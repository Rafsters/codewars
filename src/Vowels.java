public class Vowels {
    public static void main(String[] args) {
        getCount("aabbzzooui");
    }

    public static int getCount(String str) {
        int vowelsCount = 0;
        char[] vowels = {'a','e','i','o','u'};
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < vowels.length; j++) {
                if(str.toLowerCase().charAt(i) == vowels[j]){
                    vowelsCount++;
                }
            }
        }
        System.out.println(vowelsCount);
        return vowelsCount;
    }

}