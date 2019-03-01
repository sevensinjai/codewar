public class CountingSheep {

    public static void main(String args[]) {
        Boolean[] directionList = { true, true, true, false, true, true, true, true, true, false, true, false, true,
                false, false, true, true, true, true, true, false, false, true, true };

        int noOfSheep = countSheeps(directionList);

        System.out.print(noOfSheep);
    }

    public static int countSheeps(Boolean[] arrayOfSheeps) {
        // TODO May the force be with you

        int counter = 0;
        for (int x = 0; x < arrayOfSheeps.length; x++) {
            if (arrayOfSheeps[x] == null) {
                continue;
            }
            ;
            if (arrayOfSheeps[x] == true) {
                counter++;
            }
        }
        return counter;
    }
}