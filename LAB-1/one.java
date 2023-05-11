import java.util.Scanner;

public class lab1 {
   public static void main(String[] args) {
      Scanner bella = new Scanner(System.in); // Here Creating New class bella 
      String name, gender, state, company;
      int age;                               // define the data type String and integer 

      System.out.print("Enter employee name: "); // Taking user input as a employee name
      name = bella.nextLine();
      System.out.print("Enter employee age: ");
      age = bella.nextInt();                 // Taking employee age 
      bella.nextLine();
      System.out.print("Enter employee gender (m/f): ");
      gender = bella.nextLine();    // Taking employee gender type like male or female
      System.out.print("Enter employee state: ");
      state = bella.nextLine();
      System.out.print("Enter employee company: ");
      company = bella.nextLine();

      System.out.println("\nEmployee Details: "); 
      System.out.println("Name: " + name);
      System.out.println("Age: " + age);
      System.out.println("Gender: " + (gender.equals("m") ? "MALE" : "FEMALE"));
      System.out.println("State: " + state);
      System.out.println("Company: " + company);

      
// South states name Andhra Pradesh, Karnataka, Kerala, Tamil Nadu, and Telangana
      if (state.equals("Andhra Pradesh") || state.equals("Karnataka") || state.equals("Kerala") || 
          state.equals("Tamil Nadu") || state.equals("Telangana")) {
         System.out.print("The Employee is from the southern states of India; Preferable work location is in " + state);
      }

      //all north staes name Jammu & Kashmir, Himachal Pradesh, Punjab, Uttarakhand, Haryana, Delhi, Rajasthan and Uttar Pradesh and UT Chandigarh
      if (state.equals("Jammu & Kashmir") || state.equals("Himachal Pradesh") || state.equals("Delhi") || 
          state.equals("Punjab") || state.equals("Uttarakhand") || state.equals("Haryana") || state.equals(" Uttar Pradesh") || state.equals("UT Chandigarh")) {
         System.out.print("The Employee is from the north states of India; Preferable work location is in " + state);
      }

      // central States name Chhattisgarh and Madhya Pradesh.
      if (state.equals("Chhattisgarh") || state.equals("Madhya Pradesh")){
         System.out.print("The Employee is from the central states of India; Preferable work location is in " + state);
      }

     //  East states name Arunachal Pradesh, Assam, Manipur, Meghalaya, Mizoram, Sikkim and Tripura

     if (state.equals("Arunachal Pradesh") || state.equals("Assam") || state.equals("Manipur") || 
     state.equals("Meghalaya") || state.equals("Mizoram") || state.equals("Sikkim and Tripura")) {
    System.out.print("The Employee is from the east  states of India; Preferable work location is in " + state);
 }
 // west states name Goa, Gujarat, and Maharashtra along with the Union territory of Dadra and Nagar Haveli and Daman and Diu
 if (state.equals("Goa") || state.equals("Gujarat") || state.equals("Maharashtra") || 
 state.equals("Dadra") || state.equals("Nagar Haveli") || state.equals("Daman") || state.equals("Diu")) {
System.out.print("The Employee is from the west state of India; Preferable work location is in " + state);
}




      if (company.equals("Facebook") || company.equals("Google") || company.equals("Microsoft") || 
          company.equals("Samsung") || company.equals("IBM") || company.equals("Apple")) {
         System.out.println("The employee is working in Top MNC Companies");
      }
   }
}
