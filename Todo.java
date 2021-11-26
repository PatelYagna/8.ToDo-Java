//Libraries that were imported to help simplify the program.
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner; 
//Main class
public class Todo 
{
    public static void main(String[] args) 
    {
        Scanner kc = new Scanner(System.in);
        List<String> todo = new LinkedList<>(); // sets todo as a linked list

        while (true)
        {
            System.out.println("\nPick a number:\n1. Add\n2. Remove \n3. Show List "); //select what to do 
            int td = kc.nextInt();
            if (td == 1) // block of code for adding a task.
            {
                System.out.print("\nWhat would you like to add?  ");
                String adding = kc.next();
                if (todo.contains(adding))
                {
                    System.out.println("\nItem already exists in ToDo list");
                    System.out.println(todo);
                }
                else
                {
                    todo.add(adding);
                    System.out.println(todo);
                }
            }
            else if (td == 2) //block of code for removing a task.
            {
                System.out.print("\nWhat would you like to remove? ");
                String removing = kc.next();

                if(todo.contains(removing))
                {
                    todo.remove(removing);
                    System.out.println(todo);
                }
                else 
                {
                    System.out.println("\nNot In ToDo List.");
                    System.out.println(todo);
                }
            }
            else //block of code for showing the tasks
            {
                for (String s: todo)
                {
                    System.out.println(s);
                }
            }
        }
    }
}