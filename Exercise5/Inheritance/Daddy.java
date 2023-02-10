package Inheritance;

public class Daddy {

        protected String surname = "Gabion";

    /**
     * @return
     */
    public String getSurname() {

        return this.surname;
    }
        public void showLove() {
            System.out.println("I love my "+surname+" family.");
        
    }

}
