public class DataType {
    public static void main(String[] args) {
        System.out.println(DataType.gd(20));
        System.out.println(DataType.gd(702));
        System.out.println(DataType.gd(0));
    }
    public static String gd(int code) {
        if (isDate(code)) {
            return "DATE";
        } else if (isNumeric(code)) {
            return "NUMERIC";
        } else {
            return "STRING";
        }
    }

    private static boolean isDate(int code) {
        int[] codFechas = {702, 1082, 1083, 1114, 1184, 1266, 12403};
        for (int FechaSi : codFechas) {
            if (code == FechaSi) {
                return true;
            }
        }
        return false;
    }

    private static boolean isNumeric(int code) {
        int[] codNumeros = {20, 21, 23, 24, 26, 700, 701, 790, 1700, 2202, 2203, 2204, 2205, 2206, 3734, 3769, 12396};
        for (int codigoNumerico : codNumeros) {
            if (code == codigoNumerico) {
                return true;
            }
        }
        return false;
    }
}
