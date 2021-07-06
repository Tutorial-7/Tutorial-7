public class Player{

    String Name;

    int age;

    String type;

    int Statistics;

    double battingaverage;

    int scores;

    int overs=7;

}

    public void battingaverage(double average) {

        battingaverage= scores/overs;

    }

    public void getPlayerDetails(String Name, int age){

        System.out.println("Player's name is: "+Name);

        System.out.println(("Player's age is "+age));

    }

    public void getBestPerformance(int statistics){

        System.out.println("Best Performance: "+statistics);

    }

    public void getPlayerType(String type){

        System.out.println("Player's type: "+type);

    }
}


