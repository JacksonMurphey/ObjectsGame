public class Samurai extends Human {
    private static int numberOfSamurais = 0;

    public Samurai(String name){
        this.name = name;
        this.health = 200;
        numberOfSamurais++;
    }

    public void deathBlow(Human input){
        input.health = 0;
        this.health = (this.health/2);
    }

    public void meditate(){
        this.health += (this.health / 2);
    }


    public static int getSamuriaCount(){
        if(numberOfSamurais <= 1){System.out.println("There is 1 Samuria created");}
        else{System.out.println("There are " + numberOfSamurais + " Samuria characters created");}
        return numberOfSamurais;    }
}
