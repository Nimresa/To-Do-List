import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.YES_NO_CANCEL_OPTION;


public class Main {
    public static void main(String[] args) {
        ArrayList<String> pending = new ArrayList<String>();
        ArrayList<String> done = new ArrayList<String>();

        pending.add("get some sleep");
        pending.add("go to hell");
        pending.add("eat breakfast");


        showTasks(pending);

        int firstChoice=firstOption();

        while (firstChoice != 4) {

            firstChoice=firstOption();

            if (firstChoice == 0) {
                addTask(pending);
            }
            if (firstChoice == 1) {
                moveToDone(pending, done);
            }
            if (firstChoice == 2) {
            }
            if (firstChoice == 3) {
                showTasks(done);

            }
        }
    }

    static int firstOption(){
        String[] responses = {"Add task","Check out task","Delete task","Show already done tasks","Quit To do list"};
        int answer = JOptionPane.showOptionDialog(null,
                "Type of interaction:", "interaction",
                YES_NO_CANCEL_OPTION, YES_NO_CANCEL_OPTION,
                null, responses, 0);
        return answer;
    }

    public static void addTask(ArrayList arr){
        String task = JOptionPane.showInputDialog ("Enter new task: ");
        arr.add(task);
        System.out.println("Task added successfully");
        showTasks(arr);
    }

    public static void showTasks (ArrayList<String> arr){
        if (arr.isEmpty())
        {
            System.out.println("No tasks");
        }
            System.out.println (arr);
        }

    public static String moveToDone (ArrayList<String> pending, ArrayList<String> done ){

        return "Task is done";
    }




}
