import java.util.Scanner;

class one{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter employee name,age,region,state,city and gender");
        String name = scan.nextLine();
        int age= Integer.parseInt(scan.nextLine());
        
        String region = scan.nextLine();
        String state = scan.nextLine();
        String city = scan.nextLine();
        String mnc = scan.next();
        char gender = scan.next().charAt(0);
        System.out.println("details are"+" "+"name:"+name+" "+"age:"+age+" "+"gender:"+gender+" "+"region:"+region+" "+"state:"+state+" "+"city:"+city+" "+"company:"+mnc);
        if(gender == 'F'){
		System.out.println("The gender is FEMALE");
        }
		else{
            System.out.println("The gender is MALE");

        }
        if (state.equalsIgnoreCase("Andhra Pradesh") || state.equalsIgnoreCase("Karnataka")
              || state.equalsIgnoreCase("Kerala") || state.equalsIgnoreCase("Tamil Nadu")
              || state.equalsIgnoreCase("Telangana")) {
            System.out.println("The Employee is from the southern states of India; Preferable work location is in " + state);
              

            // check for top MNC Companies Using switch case:
            switch (mnc.toLowerCase()) {
                case "facebook":
                case "google":
                case "microsoft":
                case "samsung":
                case "ibm":
                case "apple":
                  System.out.println("The employee is working in Top MNC Companies");
                  break;
                default:
                  break;
            }

    }
}
}