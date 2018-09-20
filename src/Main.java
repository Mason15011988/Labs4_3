public class Main {
    public static void main(String[] args) {
         Computer[] computers = new Computer[5];

         computers[0] = new Computer("Intel 1" , 512, 200, 6);
         computers[1] = new Computer("Intel 2" , 1536, 1000, 6);
         computers[2] = new Computer("Intel 3" , 1024, 1000, 6);
         computers[3] = new Computer("Intel 4" , 3072, 3000, 6);
         computers[4] = new Computer("Intel 5" , 2048, 750, 6);

        Computer max = computers[0];
        Computer min = computers[0];

         for (int i = 0 ;i < computers.length; i++){
             if (computers[i].getRam() >= max.getRam() ){
                 max = computers[i];
             }
             if (computers[i].getHdd() <= min.getHdd() ){
                 max = computers[i];
             }
         }

        System.out.println("Комп с самой большой оперативкой:");
        //computers[indexMax].out();
        System.out.println(max.getProc());
        System.out.println("Комп с самым маленьким жестким диском:");
        //computers[indexMin].out();
        System.out.println(min.getProc());



    }
}
