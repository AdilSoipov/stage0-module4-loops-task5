package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
  
    int dimension = (height * 2) - 1, space = 0, stars = height - 1, printed = 0;

    for(int i=0; i<dimension; i++) {
        int actual = space;
        for (int j=dimension; j > 0; j--) {
            if(actual > 0) {
                System.out.print(" ");
                actual--;
            }
            else {
                System.out.print("8");
                if(stars==printed) {
                    actual = space;
                    printed = 0;
                } else {
                    actual = 1;
                    printed++;
                }
            }
        }
        if(i <= height-2) { 
            space++;
            stars--;
        }
        else { 
            space--;
            stars++;
        }
        System.out.println();
            //System.out.print("8");
    }

    }
}
