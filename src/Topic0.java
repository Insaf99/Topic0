/*You have to make a Farm, with a Farmer and a Hen House with 40 Hens,
70% of Heans lay Red Eggs and 30% Heans lay White Eggs, each Hen will lay 2 eggs per day.
Your Farmer have to recolect them inside an Egg's Carton, each Egg's Carton (6 x 5)
has a capacity for 30 eggs and it will be classified them by color.
Egg's Cartons Console representation in 1 day. e.g. (O): white eggs (D): red eggs (G): empty
 */

class farmer{
    void collecteggs(int value ){
        String carton[] []=new String[6][5]; //create the array
        String color="";
        if (value==56){color="(D)";}
        if (value==24){color="(O)";}
        while (value>0){    // check that I have no eggs for recollect
           for(int i=0;i<15;i++){  // separate the cartons
               System.out.print("="); }
           System.out.println(" ");

           for(int i=0;i<=carton.length-1;i++){
               for(int j=0;j<=carton[i].length-1;j++){
                   if (value==0){ System.out.print("(G)"); }
                   else{
                       System.out.print(color);
                       value-=1; } }
           System.out.println(" "); } } } }

class HenHouse{
    int hens;
    void makeEggs(int value){
        hens=value; //40 hens loaded
    }
}

public class Topic0{
    public static void main(String[] args){
        System.out.println("Welcome to the farm!");

        HenHouse hen = new HenHouse(); // instance of class
        hen.makeEggs(40); // number of hens i have
        farmer Farmer = new farmer();

        Farmer.collecteggs(56);
        Farmer.collecteggs(24);
    }
  }