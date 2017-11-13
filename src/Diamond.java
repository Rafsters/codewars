class Diamond {
    public static void main(String[] args) {
        print(23);
    }

    public static String print(int n) {
        StringBuilder diamond = new StringBuilder();
        int x = 1;
        int w = n;
        if (n % 2 != 0 && Integer.valueOf(n) != null) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < (w - 1) / 2; j++) {
                    diamond.append(" ");
                }
                for (int k = 0; k < n - (n - x); k++) {
                    diamond.append("*");
                }
                diamond.append("\n");
                if (i >= ((n - 1) / 2)) {
                    w += 2;
                } else {
                    w -= 2;
                }
                if (i >= ((n - 1) / 2)) {
                    x -= 2;
                } else {
                    x += 2;
                }
            }
            System.out.println(diamond.toString());

            return diamond.toString();

        } else {
            return null;
        }

    }
}