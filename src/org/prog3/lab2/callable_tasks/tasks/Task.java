package org.prog3.lab2.callable_tasks.tasks;

import org.prog3.lab2.callable_tasks.model.Matrix;

import java.util.concurrent.Callable;

/* Definition of single task.
 * Each task calculate the maximum value in a row of matrix.
 */
public class Task implements Callable<Integer> {

    /* The task has to calculate the max value of this row (int the Matrix)
     */
    private final int row;
    Matrix matrix;

    public Task(int row, Matrix matrix) {
        this.row = row;
        this.matrix = matrix;
    }

    @Override
    public Integer call() throws Exception {
        return matrix.getRowMax(row);
    }
}
