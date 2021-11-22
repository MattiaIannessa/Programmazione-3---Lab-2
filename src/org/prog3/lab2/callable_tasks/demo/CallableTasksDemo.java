package org.prog3.lab2.callable_tasks.demo;

import org.prog3.lab2.callable_tasks.model.Matrix;
import org.prog3.lab2.callable_tasks.tasks.Task;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.*;

/* Main: creation of the thread pool, the tasks and execution of the tasks. Collect results and calculate maximum result.
 */
public class CallableTasksDemo {
    public static void main(String[]args){

        Scanner in = new Scanner(System.in);

        // Creation of the matrix with measures taken from user input
        System.out.println("Insert measures of the matrix you want to create: ");
        System.out.print("rows > ");
        int rows = in.nextInt();
        System.out.print("\ncolumns > ");
        int cols = in.nextInt();
        Matrix matrix = null;

        try{
            matrix = new Matrix(rows,cols);
        }catch(Exception e){
            e.printStackTrace();
        }

        matrix.print();

        // Creation of a pool of 10 threads
        ExecutorService exec = Executors.newFixedThreadPool(10);

        // Creation and execution of the tasks (one for each matrix row)
        ArrayList<FutureTask<Integer>> tasks = new ArrayList<>();
        for(int i=0;i<rows;i++){
            FutureTask<Integer> t = new FutureTask<>(new Task(i,matrix));
            tasks.add(t);
            exec.execute(t);
        }

        // Collection of results and maximum result calculation
        int max = -1;
        try {
            for (FutureTask<Integer> task : tasks) {
                if (task.get() > max)
                    max = task.get();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("\nMax value is: " + max);

        // thread pool shutdown
        exec.shutdown();
    }
}
