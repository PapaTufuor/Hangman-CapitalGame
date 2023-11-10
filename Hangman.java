import java.util.*;

public class Hangman{
    public static void main(String [] args){

        Scanner scanner= new Scanner(System.in);
        Random random =new Random();

         //populate the words array with words for the hangman game
        String[] words={"mirror","bright","loud", "island", "lion","zebra"};


        //flag to control whether user plays the game again
       
        boolean playAgain = true;


        while(playAgain){
            
            //Selecting random word from the array
            String wordToGuess = words[random.nextInt(words.length)];

            //Created StringBuilder to represent progress of the guessed word
            StringBuilder guessedWord = new StringBuilder(wordToGuess.length());
            

            //initialize guessedWord with asterisks
            for(int i=0; i<wordToGuess.length(); i++) {
                guessedWord.append('*');
            }
            

            //initialized variables to keep count of the number of misses and number of tries left
            int misses= 0;
            int maxMisses=5;
            boolean wordGuessed=false;


            while(!wordGuessed && misses<maxMisses){
                System.out.println("Guess a letter: ");
                char guess = scanner.next().charAt(0);

                boolean correctGuess = false;

                //update guessedWord based on whether or not user input is correct
                for(int i=0; i<wordToGuess.length(); i++){
                    if(wordToGuess.charAt(i) ==guess) {
                        guessedWord.setCharAt(i, guess);
                        correctGuess=true;
                    }
                }

                if(!correctGuess){
                    misses++;
                    System.out.println("Incorrect. You have " + (maxMisses-misses) + "tries left.");
                }

                System.out.println("Current progress: " + guessedWord);

                if(guessedWord.toString().equals(wordToGuess)) {
                    wordGuessed= true;
                }
            }



            //Display game outcome and missed letters
            if(wordGuessed){
                System.out.println("Congratulations! You got the word" + wordToGuess);
            } else{
                System.out.println("Sorry, you didn't get the word. The word was" + wordToGuess);
            }


            System.out.println("Number of errors:" + misses);

            System.out.println("Do you want to play again?");
            String playAgainInput= scanner.next();
            playAgain = playAgainInput.equalsIgnoreCase("yes");
        }

        scanner.close();

        System.out.println("Thanks for playing");

    
    

    



    }
}