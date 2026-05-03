package Strings;

 public static String convert(String s, int numRows) {        if (numRows == 1 || s.length() <= numRows) {
            return s;
        }
        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        int index = 0;
        int n = s.length();

        while (index < n) {
            // Move down
            for (int i = 0; i < numRows && index < n; i++) {
                rows[i].append(s.charAt(index++));
            }
            for (int i = numRows - 2; i > 0 && index < n; i--) {
                rows[i].append(s.charAt(index++));
            }
        }
        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        int numRows = 3;

        System.out.println(convert(s, numRows));
    } public static String convert(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows) {
            return s;
        }
        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        int index = 0;
        int n = s.length();

        while (index < n) {
            for (int i = 0; i < numRows && index < n; i++) {
                rows[i].append(s.charAt(index++));
            }

            for (int i = numRows - 2; i > 0 && index < n; i--) {
                rows[i].append(s.charAt(index++));
            }
        }

        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        int numRows = 3;

        System.out.println(convert(s, numRows));
    }
