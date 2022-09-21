
import java.util.*;
public class main {

    //List of stings containing rows of numbers
    static String[] first = {"1", "3", "5", "7", "9", "11", "13", "15", "17", "19", "21", "23", "25", "27", "29", "31", "33", "35", "37", "39", "41", "43", "45", "47", "49", "51", "53", "55", "57", "59", "61", "63"};
    static String[] second = {"2", "3", "6", "7", "10", "11", "14", "15", "18", "19", "22", "23", "26", "27", "30", "31", "34", "35", "38", "39", "42", "43", "46", "47", "50", "51", "54", "55", "58", "59", "62", "63"};
    static String[] third = {"4", "5", "6", "7", "12", "13", "14", "15", "20", "21", "22", "23", "28", "29", "30", "31", "36", "37", "38", "39", "44", "45", "46", "47", "52", "53", "54", "55", "60", "61", "62", "63"};
    static String[] fourth = {"8", "9", "10", "11", "12", "13", "14", "15", "24", "25", "26", "27", "28", "29", "30", "31", "40", "41", "42", "43", "44", "45", "46", "47", "56", "57", "58", "59", "60", "61", "62", "63"};
    static String[] fifth = {"16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63"};
    static String[] sixth = {"32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63"};

    //New list that stores values of 1 and 0
    static List<Integer> count = new ArrayList<>();

    public static void main(String[] args) {
        //  Storing the values of the static arrys in a Arraylist
        ArrayList<String[]> list = new ArrayList<>();
        list.add(first);
        list.add(second);
        list.add(third);
        list.add(fourth);
        list.add(fifth);
        list.add(sixth);
        //asking the user to pick a number
        System.out.println("Pick a number between 1 and 63, mentally");

        //Loop through 6 times
        for (int i = 0; i < 6; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Is your number in this list? [Y/N] ");
            System.out.println(Arrays.toString(list.get(i)));
            String check = sc.next();
            //If the user says yes, add 1 to the count list
            if (check.equals("Y")) {
                count.add(1);
            } else {
                //If the user says no, add 0 to the count list
                count.add(0);
            }
        }
        //get the number in the x postion of the count list, and multiply it by 2 to the power of x
        int x = (int) (count.get(0) * Math.pow(2, 0) + count.get(1) * Math.pow(2, 1) + count.get(2) * Math.pow(2, 2) + count.get(3) * Math.pow(2, 3) + count.get(4) * Math.pow(2, 4) + count.get(5) * Math.pow(2, 5));
        //Print the number
        System.out.println(x);
    }
}

