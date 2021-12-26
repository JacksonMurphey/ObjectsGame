public class Ninja extends Human {
    private static int numberOfNinjas = 0;

    public Ninja(String name){
        this.name = name;
        this.stealth = 10;
        numberOfHumans++;
        numberOfNinjas++;
    }

    public void steal(Human input){
        input.health -= this.stealth;
        System.out.println(this.name + " sneaks up on " + input.name + " and steals a little heatlh. " + input.name + " now has " + input.health + " health left." );
    }

    public void runAway(){
        this.health -= 10;
        System.out.println(this.name + " throws a smoke bomb, and disappears. They lose 10 health. Their current health: " + this.health );
    }


    public static int getNinjaCount(){
        if(numberOfNinjas <= 1){System.out.println("There is 1 ninja created");}
        else{System.out.println("There are " + numberOfNinjas + " ninja characters created");}
        return numberOfNinjas;
    }
}
