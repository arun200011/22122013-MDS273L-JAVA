import java.util.Arrays;
import java.util.Scanner;

public class LAB5 {

    static char encode(){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter String input : ");

        String inp = scan.nextLine();

        char [] arr = new char[50];
        
        for (int i = 0; i < inp.length(); i++) {
            char inp1 = Character.toUpperCase(inp.charAt(i));
            arr[i] = inp1;
        }

        char [] XX = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        char [] YY = {'X','Y','Z','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W'};

        for (int j = 0; j < arr.length; j++) {
            for (int k = 0; k < XX.length; k++) {
                char y = XX[k];
                if(arr[j] == y){
                    System.out.print(YY[k]);
                }
                else{
                    continue;
                }
            }
            if(arr[j] == ' '){
                System.out.print(" ");
            }
        }
        return 0;
            
        }
        
        static char decode(){

            Scanner scan = new Scanner(System.in);
            System.out.println("Enter String input : ");
    
            String inp0 = scan.nextLine();
    
            char [] arr0 = new char[50];
            
            for (int i = 0; i < inp0.length(); i++) {
                char inp01 = Character.toUpperCase(inp0.charAt(i));
                arr0[i] = inp01;
            }
    
            char [] XX0 = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
            char [] YY0 = {'X','Y','Z','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W'};
    
            for (int j = 0; j < arr0.length; j++) {
                for (int k = 0; k < XX0.length; k++) {
                    char y0 = YY0[k];
                    if(arr0[j] == y0){
                        System.out.print(XX0[k]);
                    }else{
                        continue;
                    }
                }
                
            }
        return ';';

    }



    /**
     * @param args
     */
    public static void main(String[] args){
        
        boolean exitt = true;

        do{

            System.out.println("Enter your choice");
            System.out.println("*********MENU***************8");
            System.out.println("****1. encode text******");
            System.out.println("****2. deocde texte*****");
            System.out.println("****3.exit**************");
            Scanner scan = new Scanner(System.in);
            int enter = scan.nextInt();

            switch(enter){
                case 1 :
                encode();
                break;

                case 2:
                decode();
                break;

                case 3:
                exitt = false;
            }
            
        }while(exitt);
    }
    
}
