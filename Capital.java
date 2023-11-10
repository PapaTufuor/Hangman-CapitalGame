import java.util.*;


public class Capital{
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);

        //Creating two arrays, one for the countries and one for the capitals with each country and its capital in matching indices
        String[] countries ={"United States","China","India","Brazil","Pakistan","Nigeria","Bangladesh","Russia","Mexico","Japan",
            "Indonesia",
            "Egypt",
            "Ethiopia",
            "Philippines",
            "Vietnam",
            "DR Congo",
            "Turkey",
            "Iran",
            "Germany",
            "Thailand",
            "United Kingdom",
            "France",
            "Italy",
            "South Africa",
            "Myanmar",
            "South Korea",
            "Colombia",
            "Spain",
            "Ukraine",
            "Tanzania",
            "Argentina",
            "Kenya",
            "Poland",
            "Algeria",
            "Canada",
            "Uganda",
            "Morocco",
            "Iraq",
            "Sudan",
            "Malaysia",
            "Uzbekistan",
            "Saudi Arabia",
            "Peru",
            "Nepal",
            "Venezuela",
            "Ghana",
            "Yemen",
            "Afghanistan",
            "Mozambique",
            "Cameroon",
            "Côte d'Ivoire",
            "Madagascar",
            "Australia",
            "North Korea",
            "Taiwan",
            "Niger",
            "Sri Lanka",
            "Romania",
            "Malawi",
            "Mali",
            "Bulgaria",
            "Syria",
            "Cambodia",
            "Senegal"};
        String[] capitals={"Washington, D.C.",
        "Beijing",
        "New Delhi",
        "Brasília",
        "Islamabad",
        "Abuja",
        "Dhaka",
        "Moscow",
        "Mexico City",
        "Tokyo",
        "Jakarta",
        "Cairo",
        "Addis Ababa",
        "Manila",
        "Hanoi",
        "Kinshasa",
        "Ankara",
        "Tehran",
        "Berlin",
        "Bangkok",
        "London",
        "Paris",
        "Rome",
        "Pretoria",
        "Naypyidaw",
        "Seoul",
        "Bogotá",
        "Madrid",
        "Kyiv",
        "Dodoma",
        "Buenos Aires",
        "Nairobi",
        "Warsaw",
        "Algiers",
        "Ottawa",
        "Kampala",
        "Rabat",
        "Baghdad",
        "Khartoum",
        "Kuala Lumpur",
        "Tashkent",
        "Riyadh",
        "Lima",
        "Kathmandu",
        "Caracas",
        "Accra",
        "Sana'a",
        "Kabul",
        "Maputo",
        "Yaoundé",
        "Yamoussoukro",
        "Antananarivo",
        "Canberra",
        "Pyongyang",
        "Taipei",
        "Niamey",
        "Colombo",
        "Bucharest",
        "Lilongwe",
        "Bamako",
        "Sofia",
        "Damascus",
        "Phnom Penh",
        "Dakar"};

        //Initializing variables for number of questions and correct answers
        int Questions=20;
        int correctAnswers=0;


        //Creating a Random object to generate random indices
        Random random = new Random();

        for(int i=0; i<Questions; i++){

            //Generate random index to select country and its capital
            int randomIndex=random.nextInt(countries.length);
            String country = countries[randomIndex];
            String capital=capitals[randomIndex];

            
            System.out.println("Question " + (i+1) + " What is the capital of" + country +"?");
            String userAnswer= scanner.nextLine().trim().toLowerCase();

            //Check user answer and provide feedback depending on whether answer is correct
            if(userAnswer.equals(capital.toLowerCase())) { //if answer is correct
                correctAnswers++;
                System.out.println("Correct!\n");
            } else{//if answer is wrong
                System.out.println("Incorrect. The correct answer is" + capital +".\n");

            }
        }
        
        scanner.close();
        //Display the final score
        System.out.println("You got " + correctAnswers + "out of " + Questions + " correct.");

    }
    
}