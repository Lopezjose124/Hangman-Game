package wordguesser;

public class StickFigure
{

    public StickFigure(int wrongGuesses)
    {

        switch (wrongGuesses)
        {
            case 1:
            {
                drawHead();

                break;
            }

            case 2:
            {
                drawBody();

                break;

            }

            case 3:
            {
                drawLeftLeg();

                break;
            }

            case 4:
            {
                drawRightLeg();

                break;
            }

            case 5:
            {
                drawRightArm();

                break;
            }

            case 6:
            {
                drawLeftArm();

                break;
            }

        }//end switch statement 
    }

    private void drawHead()
    {
        System.out.println(" ------|     ");
        System.out.println(" |     _     ");
        System.out.println(" |    / \\   ");
        System.out.println(" |    \\_/   ");
        System.out.println(" |           ");
        System.out.println(" |           ");
        System.out.println(" |           ");
        System.out.println("_|_______    ");


    }

    private void drawBody()
    {
        System.out.println(" ------|     ");
        System.out.println(" |     _     ");
        System.out.println(" |    / \\   ");
        System.out.println(" |    \\_/   ");
        System.out.println(" |     |     ");
        System.out.println(" |     |     ");
        System.out.println(" |           ");
        System.out.println("_|_______    ");
    }

    private void drawLeftLeg()
    {
         System.out.println(" ------|     ");
        System.out.println(" |     _     ");
        System.out.println(" |    / \\   ");
        System.out.println(" |    \\_/   ");
        System.out.println(" |     |     ");
        System.out.println(" |     |     ");
        System.out.println(" |    /      ");
        System.out.println(" |   |       ");
        System.out.println("_|_______    ");

    }

    private void drawRightLeg()
    {
        System.out.println(" ------|     ");
        System.out.println(" |     _     ");
        System.out.println(" |    / \\   ");
        System.out.println(" |    \\_/   ");
        System.out.println(" |     |     ");
        System.out.println(" |     |     ");
        System.out.println(" |    / \\   ");
        System.out.println(" |   |   |   ");
        System.out.println("_|_______    ");

    }

    private void drawRightArm()
    {
        System.out.println(" ------|     ");
        System.out.println(" |     _     ");
        System.out.println(" |    / \\   ");
        System.out.println(" |    \\_/   ");
        System.out.println(" |     |\\   ");
        System.out.println(" |     | |   ");
        System.out.println(" |    / \\   ");
        System.out.println(" |   |   |   ");
        System.out.println("_|_______    ");

    }

    private void drawLeftArm()
    {
        System.out.println(" ------|     ");
        System.out.println(" |     _     ");
        System.out.println(" |    / \\   ");
        System.out.println(" |    \\_/   ");
        System.out.println(" |    /|\\   ");
        System.out.println(" |   | | |   ");
        System.out.println(" |    / \\   ");
        System.out.println(" |   |   |   ");
        System.out.println("_|_______    ");

    }

}//end class