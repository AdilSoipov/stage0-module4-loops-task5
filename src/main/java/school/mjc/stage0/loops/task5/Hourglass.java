package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
	    
        for ( int i = 0; i < height - 1; i++ )
        {
            for ( int j = 0; j < i; j++ )
            {
                System.out.print( " " );
            }
            for ( int k = height - i; k > 0; k-- )
            {
                System.out.print( "8 " );
            }
            System.out.println();
        }
        for ( int i = 0; i < height; i++ )
        {
            for ( int j = height - i; j > 1; j-- )
            {
                System.out.print( "" );
            }
            for ( int k = 0; k < i + 1; k++ )
            {
                System.out.print( "8 " );
            }
            System.out.println();
        }


    }
}
