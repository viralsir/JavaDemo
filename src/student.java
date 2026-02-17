/*
        level 0:  add pass / fail logic --> done
       level 1: add search by roll no option in main menu
       level 2: add view only pass student  and view only fail student  --> done
       level 3: update student subject mark : ( ask div , rollno ,subject )--> done
       level 4: add Starndard option--> done

 */




import java.util.Scanner;

public class student {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String subject[] = {"phy", "chem", "maths"};
        int student_div_count[] = {0, 0, 0, 0};
        int roll_no[][][] = new int[12][4][50];
        String name[][][] = new String[12][4][50];
        int student_marks[][][][] = new int[12][4][50][3];
        String isContinue = "yes";
        int div_option = 0;
        int option = 0;
        boolean isPass = true;
        int passcount = 0;
        int failcount = 0;
        int std_option;
        String student_pass[] = new String[50];
        String student_fail[] = new String[50];

        do {
            System.out.println("XYZ school");
            System.out.println("1--> Entry");
            System.out.println("2--> View");
            System.out.println("3--> update marks");
            System.out.println("4--> exit");

            System.out.print("Enter your choice: ");
            option = sc.nextInt();


            do {

                System.out.println("select your standard");
                System.out.println("0--> exit");
                System.out.println("1--> 1st ");
                System.out.println("2--> 2nd");
                System.out.println("3--> 3rd");
                System.out.println("4--> 4th");
                System.out.println("5--> 5th");
                System.out.println("6--> 6th");
                System.out.println("7--> 7th");
                System.out.println("8--> 8th");
                System.out.println("9--> 9th");
                System.out.println("10--> 10th");
                System.out.println("11--> 11th");
                System.out.println("12--> 12th");

                System.out.print("Enter the standard: ");
                std_option = sc.nextInt();


                switch (option) {
                    case 1:
                        do {
                            System.out.println("select the section: ");
                            System.out.println("1--> A");
                            System.out.println("2--> B");
                            System.out.println("3--> C");
                            System.out.println("4--> D");

                            System.out.print("Enter your choice in section: ");
                            div_option = sc.nextInt();

                            System.out.println("Enter Roll No:");
                            roll_no[std_option][div_option][student_div_count[div_option]] = sc.nextInt();

                            System.out.println("Enter Name :");
                            name[std_option][div_option][student_div_count[div_option]] = sc.next();

                            for (int subject_marks=0;subject_marks<subject.length;subject_marks++) {
                                do {
                                    System.out.print("Enter "+subject[subject_marks]+" between(0-100): ");
                                    student_marks[std_option][div_option][student_div_count[div_option]][subject_marks] = sc.nextInt();

                                } while (student_marks[std_option][div_option][student_div_count[div_option]][subject_marks] < 0 || student_marks[std_option][div_option][student_div_count[div_option]][subject_marks] > 100);
                            }
                            System.out.print("Add another student {y/n}: ");
                            isContinue = sc.next();

                        } while (isContinue.equals("y") || isContinue.equals("Y"));
                        break;

                    case 2:
                        System.out.println("select a division for viewing : ");
                        System.out.println("1-->division A");
                        System.out.println("2-->division B");
                        System.out.println("3-->division C");
                        System.out.println("4-->division D");

                        System.out.println("enter your choice: ");
                        div_option = sc.nextInt();

                        for (int start = 0; start < student_div_count[div_option]; start++) {
                            System.out.println("Roll No.: " + roll_no[div_option][start]);
                            System.out.println("Name: " + name[div_option][start]);

                            for (int subject_index = 0; subject_index < 5; subject_index++) {
                                System.out.println(subject[subject_index] + " : " + student_marks[div_option][start][subject_index]);
                            }
                            for (int s = 0; s < 4; s++) {
                                if (student_marks[std_option][div_option][start][s] < 35) {
                                    System.out.println("You failed in " + subject[s]);
                                    isPass = false;
                                } else {
                                    System.out.println("you passed");
                                    isPass = true;
                                    int total = 0;
                                    total = total + student_marks[std_option][div_option][start][s];

                                }
                                if (isPass) {
                                    student_pass[passcount] = name[std_option][div_option][start];
                                    passcount++;
                                    System.out.println("Result: PASS");
                                } else {
                                    student_fail[failcount] = name[std_option][div_option][start];
                                    failcount++;
                                    System.out.println("Result: FAIL");
                                }

                            }
                        }

                        break;


                    case 3:
                        System.out.println("select a division for viewing : ");
                        System.out.println("1-->division A");
                        System.out.println("2-->division B");
                        System.out.println("3-->division C");
                        System.out.println("4-->division D");

                        System.out.println("enter your choice: ");
                        div_option = sc.nextInt();

                        System.out.print("Enter Roll No: ");
                        int search_Roll = sc.nextInt();

                        int studentindex = -01;

                        for (int i = 0; i < student_div_count[div_option]; i++) {
                            if (roll_no[std_option][div_option][i] == search_Roll) {
                                studentindex = i;
                                break;
                            }
                        }

                        if (studentindex == -1) {
                            System.out.println("Student not found!");
                            break;
                        }
                        System.out.println("Select Subject:");
                        System.out.println("1--> phy");
                        System.out.println("2--> chem");
                        System.out.println("3--> maths");

                        int subjectChoice = sc.nextInt();
                        int newmarks;

                        do {
                            System.out.print("Enter new marks (0-100): ");
                            newmarks = sc.nextInt();
                        } while (newmarks < 0 || newmarks > 100);

                        student_marks[std_option][div_option][studentindex][subjectChoice] = newmarks;

                        System.out.println("Marks updated successfully!");
                        break;


                    case 4:
                        System.out.println("You exited");
                        break;
                    default:
                        System.out.println("Wrong input");
                        break;


                }


            } while (option != 3);
        } while (std_option != 0);
    }
}

