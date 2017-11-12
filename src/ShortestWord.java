public class ShortestWord {
    public static void main(String[] args) {
        findShortest("Addddd abc aa wuwuw www");

    }

    public static int findShortest(String s) {
        int min = 0;
        String[] a = s.split(" ");
        min = a[0].length();
        for (int i = 1; i < a.length; i++) {
            if (a[i].length() < min) {
                min = a[i].length();
            }
        }
        System.out.println(min);
        return min;
    }
}
