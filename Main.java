public class Main{
    public static void main(String[] args) {
        
        //instantiating the Television
      Television TV = new Television("2024-08-01", "SON-12345");
        // Call methods from the Television object
        System.out.println("Television Details:");
        System.out.println("Production Date: " + TV.getProductionDate());
        System.out.println("Serial Order Number: " + TV.getSON());
      TV.turnOn();
      TV.increaseVolume();
      TV.changeChannel(5);
      TV.setInputSource("USB");
      TV.browseInternet("https://facebook.com");
      System.out.println("______________________\n\n");
      
      
      // Instantiatiing the Admin class 
      Admin Administrative = new Admin("ATH/2023/0042", "08123456789", "ajayiopeyemi@ATH.com", "Ajayi Opeyemi", 
      "25/11/1993", 2);
      System.out.println("ADMINISTRATIVE TEAM \n" + Administrative);
      System.out.println("______________________\n\n ");
      
      //instantiating the Finance
      Finance Finance = new Finance("Joseph John", 
      "25/11/1993", 2, "taxation account", "ICAN");
      System.out.println("FINANCE TEAM \n " + Finance);
      System.out.println("______________________\n\n ");
      
      //instantiating the Agent
      Agent Agent = new Agent("Majekodunmi AyoOluwa", "21/04/1987", 10, "Lagos Nigeria", "5 years", "level 4", "AGENT7890");
      System.out.println("AGENT INFORMATION PAGE: \n" + Agent);
      System.out.println("______________________\n\n");
      
      
      // Instantiatiing the Customer class 
     Customer customer = new Customer("Ajay Opeyemi", "Lagos Nigeria", "08123456789", "P-1001", "ORD-20241110-001", "Pay on Delivery");
    System.out.println("CUSTOMER PAGE \n" + customer);
    System.out.println("______________________\n\n ");
    }
}
