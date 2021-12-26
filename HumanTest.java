public class HumanTest {
    
    public static void main(String[] args) {
        
        Human mark = new Human("Mark");
        Human tom = new Human("Tom");
        Wizard wiz = new Wizard("Wiz");
        Wizard tricky = new Wizard("Tricky");
        Ninja ninja = new Ninja("Ninja");

        mark.attack(tom);
        

        // tom.displayHealth();
        // mark.displayHealth();

        
        wiz.heal(wiz);
        wiz.heal(tom);
        wiz.heal(ninja);

        Human.getCharacterCount();
        Wizard.getWizardCount();
        Ninja.getNinjaCount();

        wiz.fireball(tom);
        wiz.attack(tom);
        ninja.steal(tom);
        ninja.runAway();

    }
}
