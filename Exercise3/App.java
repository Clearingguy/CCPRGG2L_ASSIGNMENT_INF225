public class App {
    public static void main(String[] args) {

        System.out.println("\n______________________\n");
        Character knight = new Character();

        knight.strength = 10;
        knight.agility = 5;
        knight.intelligence = 0;
        knight.name = "SilverAsh";
        knight.sayMyName();
        knight.sayMystrength();
        knight.sayMyagility();
        knight.sayMyintelligence();

        Weapon longsword = new Weapon();
        longsword.wname = "Rusty Longsword";
        longsword.wdamage = 5;
        longsword.wrarity = "Common";
        longsword.wname();
        longsword.wdamage();
        longsword.wrarity();
        longsword.attack();
        longsword.AddDamage(5);
        System.out.print("\n"+longsword.showNR()+"\n______________________");

        Character mage = new Character();

        mage.strength = 0;
        mage.agility = 5;
        mage.intelligence = 10;
        mage.name = "Eyjafjalla";
        mage.sayMyName();
        mage.sayMystrength();
        mage.sayMyagility();
        mage.sayMyintelligence();

        Weapon staff = new Weapon();
        staff.wname = "Old Staff";
        staff.wdamage = 8;
        staff.wrarity = "Uncommon";
        staff.wname();
        staff.wdamage();
        staff.wrarity();
        staff.attack();
        staff.AddDamage(5);
        System.out.print("\n"+staff.showNR()+"\n______________________");

        Character thief = new Character();

        thief.strength = 5;
        thief.agility = 10;
        thief.intelligence = 0;
        thief.name = "Cantabile";
        thief.sayMyName();
        thief.sayMystrength();
        thief.sayMyagility();
        thief.sayMyintelligence();
    

        Weapon blade = new Weapon();
        blade.wname = "Sharpened Blade";
        blade.wdamage = 10;
        blade.wrarity = "Rare";
        blade.wname();
        blade.wdamage();
        blade.wrarity();
        blade.attack();
        blade.AddDamage(5);
        System.out.print("\n"+blade.showNR()+"\n______________________");
    }

}
