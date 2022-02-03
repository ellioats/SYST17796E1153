// Elliot Currie
// Date: 2/3/22
// Purpose: A class that generates a random array of numbers which represent various temperatures, these are then averaged in the calcAvg() method


public class Main {

    public static void main (String[] args){

        int _max = 50;
        int _min = -50;


        int[] temps = new int[14];
        for (int i = 0; i < 14; i++) {
            temps[i] = (int) (Math.random() * (_max - _min)+ _min);
            System.out.println(temps[i]);
        }

        System.out.println("Average value: "+calcAvg(temps));
        System.out.println("Maximum value: " + calcMax(temps));

    }

    private static int calcAvg(int[] temps) {
        int avgSum = 0;

        for (int i = 0; i < temps.length; i++) {
            avgSum += temps[i];
        }

        return (avgSum / temps.length);

    }


    private static int calcMax(int[] temps) {

        int maxTemp = 0;
        for (int i : temps) {
            if (i > maxTemp) {
                maxTemp = i;
            }
        }

        return maxTemp;

    }

}