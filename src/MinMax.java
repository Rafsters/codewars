class MinMax {
    public static void main(String[] args) {
        minMax(new int[] {2,2,222});
    }
    public static int[] minMax(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }else if(arr[i] < min){
                min = arr[i];
            }
        }
        int[] minMaxArray = {min, max};
        System.out.println(min + " " + max);
        return minMaxArray;
    }
}