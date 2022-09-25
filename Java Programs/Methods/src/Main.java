public class Main {
    public static void main(String[] args) {

        int position = calculateHighScorePosition(1500);
        displayHighScorePosition("Anil",position);

        position = calculateHighScorePosition(900);
        displayHighScorePosition("Raghu",position);

        position = calculateHighScorePosition(400);
        displayHighScorePosition("Meera",position);

        position = calculateHighScorePosition(50);
        displayHighScorePosition("Karthik",position);



    }
        public static  void displayHighScorePosition(String name,int position){
            System.out.println(name + " managed to get into position " + position + " on high score table " );

        }
        public static int calculateHighScorePosition(int Score){

        if (Score >= 1000){
            return 1;
        } else if (Score>=500) {
            return 2;
        } else if (Score>=100) {
            return 3;
        }
        return 4;
        }



        public static int toMilesPerHour(double KilometerPerHour) {
            long KilometerPH = Math.round(KilometerPerHour);
            if (KilometerPH >= 0) {
                double milePerHour = KilometerPH * 1.609;
                System.out.println(KilometerPerHour + "km/h =" + milePerHour + "mi/h");

            }
            return -1;

        }






        

}




