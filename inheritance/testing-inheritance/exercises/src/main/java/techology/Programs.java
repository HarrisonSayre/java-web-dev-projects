package techology;

public class Programs {
    public static void main(String[] args) {
        Computer myPC = new Computer("FILLER", 10, "FILLER2");
        System.out.println(myPC.atLeasEightGigs());

        Laptop myLaptop = new Laptop("FILLER3", 4, "FILLER4");
        System.out.println(myLaptop.atLeasEightGigs());

        myLaptop.setId(12);
        System.out.println(myLaptop.getId());

    }
}
