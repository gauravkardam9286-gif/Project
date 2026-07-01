package bit_manipulation;

import java.util.*;
public class attend {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int attendandce = 0;
        while(true){
            System.out.println("\n===== Attendance System =====");
            System.out.println("1. Mark Student Present");
            System.out.println("2. Mark Student Absent");
            System.out.println("3. Check Attendance");
            System.out.println("4. Exit");
            System.out.print("Enter Choice: ");

            int choice = sc.nextInt();

            switch(choice){

                // set bit
                case 1:
                    System.out.print("Enter Student Postiton: ");
                    int presentPos = sc.nextInt();
                    attendandce = attendandce | (1 << presentPos);
                    System.out.println("Student Marked Present");
                    break;

                    // Clear bit
                    case 2:
                        System.out.println("Enter Student Position: ");
                        int absentPos = sc.nextInt();
                        attendandce = attendandce & (~(1<< absentPos));
                        System.out.println("Student Marked Absent");
                        break;

                        // Get bit
                        case 3:
                            System.out.println("\nAttendance Status: ");
                            for(int i = 0; i<8; i++){
                                if((attendandce & (1 << i)) != 0){
                                    System.out.println("Student "+(i+1) + " = Present");

                                }else{
                                    System.out.println("Student " + (i+1) + " = Absent");

                                }
                            }
                            break;
                            case 4:
                                System.out.println("System closed");
                                sc.close();
                                return;

                            default: 
                                System.out.println("Invalid Choice");
            }
        }
    }
}
