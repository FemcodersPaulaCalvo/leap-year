public class NewYear {
    public static boolean isLeap(int year) {
        if (year % 4 == 0 ) {
            if ( year % 100 == 0) {
                if ( year % 400 == 0) {
                    return true;
                }
                return false;
            }
            return true;
        }

        return false;
    }
}
