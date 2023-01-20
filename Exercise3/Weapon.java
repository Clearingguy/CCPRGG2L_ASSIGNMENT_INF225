public class Weapon {
    String wname, wrarity;
    int wdamage ;

    void AddDamage(int AddDamage){
        int newdamage = this.wdamage + AddDamage;

        
            System.out.println("Damage increased from "+wdamage+" to "+ newdamage+"!");
            this.wdamage = newdamage;
            
    
    }
    public String showNR(){
        return this.wname+": "+this.wrarity;
        
    }
    
    
    public void wname() {
        System.out.println("\"My Weapon's name is  " + wname);
    }
    public void wrarity() {
        System.out.println("It's rarity is " + wrarity+ "\" \n");
    }
    public void wdamage() {
        System.out.println("It has a damage of " + wdamage);
    }
public void attack() {
    System.out.println("\n\"I am now attacking!\"\n");
    
}}
