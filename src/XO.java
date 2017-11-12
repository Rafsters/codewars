public class XO {
    public static void main(String[] args) {

    }
    public static boolean getXO(String str){
        boolean sameAmount = false;
        char[] xoArray = str.toUpperCase().toCharArray();
        int x = 0;
        int o = 0;
        for (int i = 0; i < xoArray.length; i++) {
            if(xoArray[i] == 'X'){
                x++;
            } else if (xoArray[i] == 'O'){
                o++;
            }
        }
        if(x == o){
            sameAmount = true;
        }
        return sameAmount;
    }
}
