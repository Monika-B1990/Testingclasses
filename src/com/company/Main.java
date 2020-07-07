public class Main {
    public static void main(String[] args) {
        int yearNow = 2020;
        int birthYear = 2003;
        int monthNow = 7;
        int monthBirth = 2;
        // > 18
        if (yearNow - birthYear >= 18 && 
                monthNow - monthBirth >= 0) {
            System.out.println("Here you go");
        } else {
            // < 18
            if (yearNow - birthYear < 18 &&
                    monthNow - monthBirth < 0) {
                System.out.println("Too young");


            }
        }
    }
}

