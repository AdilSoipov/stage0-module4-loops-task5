package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {

    if(sideLength % 2 != 0){
        for(int line = 0;line < sideLength;line++){
            for(int col = 0;col < sideLength;col++){
                if(line == sideLength / 2 || col == sideLength / 2) System.out.print("8");
                else System.out.print(" ");
            }
            System.out.println("");
        }}

    }
}
