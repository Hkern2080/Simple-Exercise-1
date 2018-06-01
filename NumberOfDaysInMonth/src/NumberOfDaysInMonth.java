public class NumberOfDaysInMonth {

    public static void main(String[] args) {
        System.out.println(isLeapYear(2000));
        System.out.println(getDaysInMonth(1, 2020));
        System.out.println(getDaysInMonth(2, 2020));
        System.out.println(getDaysInMonth(2, 2018));
        System.out.println(getDaysInMonth(-1, 2020));
        System.out.println(getDaysInMonth(1, -2020));
    }

    public static boolean isLeapYear(int year) {

        if (year < 1 || year > 9999) {
            return false;
        } else if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            return true;
        } else {
            return false;
        }
    }

    public static int getDaysInMonth(int month, int year) {

        int daysInMonth;
        if ((month < 1 || month > 12) || (year < 1 || year > 9999)) {
            daysInMonth = -1;
        } else {
            switch (month) {
                case 1:
                    daysInMonth = 31;
                    break;
                case 2:
                    if (isLeapYear(year) == true) {
                        daysInMonth = 29;
                    } else {
                        daysInMonth = 28;
                    }
                    break;
                case 3:
                    daysInMonth = 31;
                    break;
                case 4:
                    daysInMonth = 30;
                    break;
                case 5:
                    daysInMonth = 31;
                    break;
                case 6:
                    daysInMonth = 30;
                    break;
                case 7:
                    daysInMonth = 31;
                    break;
                case 8:
                    daysInMonth = 31;
                    break;
                case 9:
                    daysInMonth = 30;
                    break;
                case 10:
                    daysInMonth = 31;
                    break;
                case 11:
                    daysInMonth = 30;
                    break;
                case 12:
                    daysInMonth = 31;
                    break;
                default:
                    daysInMonth = -1;
            }
        }

        return daysInMonth;
    }
}
