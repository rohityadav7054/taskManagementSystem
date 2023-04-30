package taskModule;


import java.util.ArrayList;
import java.util.Scanner;


public class module01 {
	
	private static ArrayList<String> tasks = new ArrayList<String>();
	 static public Scanner sc = new Scanner(System.in);
	 
	 
	 
	public static void main(String [] args) {
		menu();
		
	}
	
	public static void menu() {
	
	//menu for landing page
		

	
	  while(true) {
		  System.out.println("\n\n=================================================\n");
		  System.out.print("\t\t TASK MANAGEMENT SYSTEM  \n");
		  System.out.print("\t\t***  MAIN MENU   ***\n\n");
		  System.out.println("   1 . Insert new task ");
		  System.out.println("   2 . View task ");
		  System.out.println("   3 . update task ");
		  System.out.println("   4 . Delete task ");
		  System.out.println("   0 . exit  ");
		  System.out.print("\n  Enter your choice ...  ");
		 
		  
		  int choice = sc.nextInt();
		 
		  
		  
		  
		  switch(choice) {
		  case 0: {System.exit(0);
		  }
		  
		  case 1:{insertTask();
		  break;
		  }
		  
		  case 2:{viewTask();
		  break;
		  }
			
		  case 3:{updateTask();
		  break;}
		  
		  case 4: {deleteTask();
		  break;
		  }
		  
		  default:{System.out.println("\n \t wrong choice "); 
		 System.exit(0);}
		 		  }
	  }

}
	
	//for Insertion
	static void insertTask() {
		System.out.flush();
		System.out.println("\n\n=================================================\n");
		System.out.print("\t\t TASK MANAGEMENT SYSTEM  \n\n");
		System.out.print("\t\t ***   INSERT MENU   ***\n");
        System.out.println("Enter task: ");
        sc.nextLine();
        String task = sc.nextLine();
        tasks.add(task);
        System.out.println("Task added ... \n \n");
        System.out.println("PRESS ANY KEY  ... \n \n");
        sc.nextLine();
        
        /*while(true) {
  		  System.out.println("   1 . Insert new task ");
  		  System.out.print("\n  2 . go back to menu ");
  		  System.out.print("\n  0 . exit \n");
  		  System.out.print("enter your choice .. ");
  		 
  		  
  		  int choice = sc.nextInt();
  		 
  		  
  		  
  		  
  		  switch(choice) {
  		  case 0: {System.exit(0);}
  		  
  		  case 1: {insertTask();
  		  break;
  		  }
  		  
  		  case 2: {menu();
  		  break;
  		  }
  		  
  		  }
  		  }*/   
        
	}	
	
	// for view 
	static void viewTask() {
		System.out.flush();
		 System.out.println("\n\n=================================================\n");
		 System.out.print("\t\t TASK MANAGEMENT SYSTEM  \n\n");
		 System.out.print("\t\t ***   VIEW MENU   ***\n");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));}
       
        System.out.println("\nPRESS ANY KEY  ... \n \n");
        sc.nextLine();
        sc.nextLine();
	}
	
	//for delete
	static void deleteTask() {
		System.out.flush();
		System.out.println("\n\n=================================================\n");
		System.out.print("\t\t TASK MANAGEMENT SYSTEM  \n\n");
		System.out.print("\t\t ***   DELETE MENU   ***\n");
        System.out.print("Enter task number to delete: ");
        int index = sc.nextInt();
        sc.nextLine();
        
        if (index >= 1 && index <= tasks.size()) {
            tasks.remove(index - 1);
            System.out.println("Task deleted");
        } else {
            System.out.println("Invalid task number");
        }
        System.out.println("PRESS ANY KEY  ... \n \n");
        sc.nextLine();
	}
	
	//for update
	static void updateTask() {
		System.out.flush();
		System.out.println("\n\n=================================================\n");
		 System.out.print("\t\t TASK MANAGEMENT SYSTEM  \n\n");
		 System.out.print("\t\t ***   UPDATE MENU   ***\n");
        System.out.println("Enter task number to update: ");
        int index = sc.nextInt();
        sc.nextLine();
        
        if (index >= 1 && index <= tasks.size()) {
            System.out.print("Enter new task: ");
            String task = sc.nextLine();
            tasks.set(index - 1, task);
            System.out.println("Task updated");
        } else {
            System.out.println("Invalid task number");
        }
        System.out.println("PRESS ANY KEY  ... \n \n");
        sc.nextLine();
	}
	
}
