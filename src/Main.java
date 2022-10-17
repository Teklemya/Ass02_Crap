import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random diceRoll = new Random();
        String playAgain = "";

        int dice1 = diceRoll.nextInt(6) + 1;
        int dice2 = diceRoll.nextInt(6) + 1;
        int diceSum = dice1 + dice2;
        int point = 0;
        boolean done = false;
        boolean later = false;


        do {
            dice1 = diceRoll.nextInt(6) + 1;
            dice2 = diceRoll.nextInt(6) + 1;
            System.out.println("Dice 1: " + dice1 + ".");
            System.out.println("Dice 2: " + dice2 + ".");
            diceSum = dice1 + dice2;

            if (diceSum == 2 || diceSum == 3 || diceSum == 12) {
                System.out.println("The sum of the two dice is " + diceSum);
                System.out.println("You have crapped out. ");

                System.out.print("Would you like to play again? [Y/N]: ");
                playAgain = in.nextLine();
                if (playAgain.equalsIgnoreCase("N")) {
                    done = true;
                } else if (playAgain.equalsIgnoreCase("Y")) {
                    done = false;
                }
            } else if (diceSum == 7 || diceSum == 11) {
                System.out.println(" The sum of the two dice was " + diceSum);
                System.out.println(" You have won.");

                System.out.print("Would you like to play again? [Y/N]: ");
                playAgain = in.nextLine();
                if (playAgain.equalsIgnoreCase("N")) {
                    done = true;
                } else if (playAgain.equalsIgnoreCase("Y")) {
                    done = false;
                }
            } else {
                point = diceSum;
                System.out.println("You should try to get point " + point );
                do {
                    System.out.print("Would you like to roll again? [Y/N]: ");
                    playAgain = in.nextLine();
                    if (playAgain.equalsIgnoreCase("N")) {
                        done = true;
                    } else if (playAgain.equalsIgnoreCase("Y")) {
                        done = false;
                        do {
                            dice1 = diceRoll.nextInt(6) + 1;
                            dice2 = diceRoll.nextInt(6) + 1;
                            System.out.println("Dice 1: " + dice1 + ".");
                            System.out.println("Dice 2: " + dice2 + ".");
                            diceSum = dice1 + dice2;
                            if (diceSum == 7) {

                                System.out.println("The sum of the two dice is " + diceSum);
                                System.out.println(" You have crapped out. ");

                                System.out.print("Would you like to play again? [Y/N]: ");
                                playAgain = in.nextLine();
                                if (playAgain.equalsIgnoreCase("N")) {
                                    done = true;
                                    later = true;
                                } else if (playAgain.equalsIgnoreCase("Y")) {
                                    done = false;
                                    later = true;
                                }


                            } else if (diceSum == point) {
                                System.out.println("You have won.");

                                System.out.print("Would you like to play again? [Y/N]: ");
                                playAgain = in.nextLine();
                                if (playAgain.equalsIgnoreCase("N")) {
                                    done = true;
                                    later = true;
                                } else if (playAgain.equalsIgnoreCase("Y")) {
                                    done = false;
                                    later = true;
                                }
                            } else {
                                System.out.println("You haven't won or lost ");
                                System.out.print("Would you like to roll again? [Y/N]: ");
                                playAgain = in.nextLine();
                                if (playAgain.equalsIgnoreCase("N")) {
                                    done = true;
                                    later = true;
                                } else if (playAgain.equalsIgnoreCase("Y")) {
                                    done = false;

                                    later = false;
                                }


                            }
                        } while (!later);
                    }
                } while (!done);
            }
        }while (!done);
    }
}