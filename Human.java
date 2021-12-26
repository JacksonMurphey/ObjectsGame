public class Human {
    
    protected String name;
    protected int strength;
    protected int stealth;
    protected int intelligence;
    protected int health;
    protected static int numberOfHumans = 0;

    public Human(){
        this.name = "The unnamed Human";
        this.strength = 3;
        this.stealth = 3;
        this.intelligence = 3;
        this.health = 100;
        // numberOfHumans++;
    }

    public Human(String name){
        this.name = name;
        this.strength = 3;
        this.stealth = 3;
        this.intelligence = 3;
        this.health = 100;
        numberOfHumans++;
    }

    public void attack(Human input){
        input.health -= this.strength;
        // System.out.printf("You attacked %s. %s loses %d health. ", input, input, this.strength );
        System.out.println(this.name + " attacked " + input.name + ". " + input.name + " now has " + input.health + " health left.");
        // return input.health;

    }

    public void displayHealth(){
        System.out.println("\nCurrent health level: " + this.health);
        // return this.health;
    }

    public static int getCharacterCount(){
        if(numberOfHumans <= 1){System.out.println("There is 1 human created");}
        else{System.out.println("There are " + numberOfHumans + " characters created");}
        return numberOfHumans;
    }
    

}
