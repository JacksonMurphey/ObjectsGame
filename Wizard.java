public class Wizard extends Human {
    private static int numberOfWizards = 0;

    public Wizard(String name){
        this.name = name;
        this.intelligence = 8;
        this.health = 50;
        numberOfHumans++;
        numberOfWizards++;
        
    }

    public void heal(Human input){
        input.health += this.intelligence;
        if(this.name == input.name){ //This is a bad if check. need to find another way to do this. 
            System.out.println(this.name + " casted healing on themselves. " + this.name + " now has " + this.health);
        } else{System.out.println(this.name + " healed " + input.name + " by " + this.intelligence + ". " + input.name + " now has " + input.health + " health.");}
    } 

    public void fireball(Human input){
        input.health = input.health - (this.intelligence * 3);
        System.out.println(this.name + " casts a firebal. They burned " + input.name + ". " + input.name + " now has " + input.health + " health.");
    }   

    public static int getWizardCount(){
        if(numberOfWizards <= 1){System.out.println("There is 1 wizard created");}
        else{System.out.println("There are " + numberOfWizards + " wizard characters created");}
        return numberOfWizards;    }
}
