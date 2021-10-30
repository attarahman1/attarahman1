/*
 *  CS312 Assignment 2.
 *  On my honor, <Atta Rahman>, this programming assignment is my own work.
 *
 *  A program to print out the UT Tower in ASCII art form.
 *
 *  Name: Atta Rahman
 *  email address: attarahman@utexas.edu
 *  UTEID: aar4867
 *  Section 5 digit ID: 52570
 *  Grader name: Zuriel
 *  Number of slip days used on this assignment: 0
 */

public class Tower
{
    public static final int SIZE = 3;
    public static final int HORIZONTAL_TOP = SIZE * 2 - 1;
    public static final int SPACES_TOP = SIZE * 4 + 2;
    public static final int SPACES_MIDDLE = SIZE * 4;
    
    public static void main(String[] args) 
    {
    	hashtag();
    	lines();
    	hashtag();
    	windows();
    	topBase();
    	bottomBase();
    }
    
    //Prints out the amount of hashtags for one line with the correct
    //ratio to the SIZE variable, correct amount of spaces in front, and creates
    // a new line beneath it.
    public static void hashtag() 
{
		for(int numOfSpaces=0; numOfSpaces<SPACES_TOP; numOfSpaces++) {
			System.out.print(" ");
		}

    	for(int hashtagsOnOneLine=0; hashtagsOnOneLine<HORIZONTAL_TOP; hashtagsOnOneLine++) {
    		System.out.print("#");
    	}
    	System.out.println();

    }
    
    //This method prints out the correct total amount of lines when compared to the SIZE
    // variable, correct amount of spaces in front, and creates a new line underneath.
    public static void lines()
    {
    	final int LINES_OF_BARS = SIZE * 2 - 2;
    	for(int numOfLines=0; numOfLines<LINES_OF_BARS; numOfLines++){
    		for(int numOfSpaces=0; numOfSpaces<SPACES_TOP; numOfSpaces++){
    			System.out.print(" ");
    		}
    		for(int barsOnOneLine=0; barsOnOneLine<HORIZONTAL_TOP; barsOnOneLine++){
    			System.out.print("|");
    		}
    		System.out.println();
    	}
    }

    //Prints out the correct amount of tildes in one line in proportion to SIZE
    // with correct spaces in front.
    public static void tilde()
{
    	final int TILDE_AMOUNT = SIZE * 2 + 3;
		for(int numOfSpaces=0; numOfSpaces<SPACES_MIDDLE; numOfSpaces++){
			System.out.print(" ");
		}
    	for(int tildeCounter=0; tildeCounter<TILDE_AMOUNT; tildeCounter++){
    		System.out.print("~");
    	}
    	System.out.println();
    }
    
    //Prints out the full array of windows & tilde rows for the middle part of the tower.
    //The windows are directly proportional to SIZE so no variable was needed.
    public static void windows()
{
    	tilde();
    	final int ROW_OF_WINDOWS = SIZE * SIZE;
    	for(int windowRows = 0; windowRows<ROW_OF_WINDOWS; windowRows++){
    		for(int numOfSpaces=0; numOfSpaces<SPACES_MIDDLE; numOfSpaces++){
    			System.out.print(" ");
    		}
    		System.out.print("|-");
    		for(int windows=0; windows<SIZE; windows++){
    			System.out.print("O-");
    		}
    		System.out.println("|");
    		tilde();
    	}
    }
    
    //Initializes the constants to count the number of windows and rows in the base
    //Then makes a for loop to print out the spaces and /"'\ pattern for the top portion of the base
    public static void topBase()
{
    	final int TOP_BASE_ROWS = SIZE/2 + 1;
    	
    	for(int row=TOP_BASE_ROWS; row>0; row--){
    		final int SPACING = row*3-3;
    		final int QUOTATION_PATTERN = SIZE*5 - SPACING;
    		for(int spacingLines=0; spacingLines<SPACING; spacingLines++){
    			System.out.print(" ");
    		}
    		System.out.print("/");
    		for(int i=0; i<QUOTATION_PATTERN; i++){
    			System.out.print("\"'");
    		}
    		System.out.println("\"\\");
    	}
    }
    
    //initializes the number of windows per row in the base. Uses nested for loops
    //to print out the "O" the correct amount of times.
    public static void bottomBase()
{
    	final int BASE_WINDOWS = SIZE * 5;
    	
    	for(int rows = 0; rows<SIZE; rows++){
    		System.out.print("/\"");
        		for(int windows=0; windows<BASE_WINDOWS; windows++){
        			System.out.print("O\"");
        		}
        		System.out.println("\\");
    	}
    }
}