
import java.util.Arrays;


public class TenMinWalk {

    public static void main(String args[]) {
        char[] directionList = { 'w','e','w','e','w','e','w','e','w','e','w','e' };
        System.out.print(isValid(directionList));
    }

    public static boolean isValid(char[] walk) {
        // Insert brilliant code here

        if (walk.length != 10) { return false;};
        int [] currentPos = {0,0};
        int remainingStep = walk.length;
        for (int x = 0; x < walk.length ; x++) {
            currentPos = updatePos(currentPos, walk[x]);
            remainingStep -- ;
            if (Arrays.stream(currentPos).sum() > remainingStep ) { return false;};
        }
        int [] targetPos = {0,0};
        if (Arrays.equals(currentPos, targetPos)){return true;}
        else {return false;}
        
    }

    public static int[] updatePos(int[] currentPos, char direction) {
        if (direction == 'n') {
            currentPos[1]++;
        } else if (direction == 's') {
            currentPos[1]--;
        } else if (direction == 'e') {
            currentPos[0]++;
        } else if (direction == 'w') {
            currentPos[0]--;
        }
        System.out.println(Arrays.toString(currentPos));
        return currentPos;
    }
}