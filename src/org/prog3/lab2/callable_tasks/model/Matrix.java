package org.prog3.lab2.callable_tasks.model;

import java.util.Random;

/* Class containing the matrix on which calculate the maximum
 */
public class Matrix {

    private final Integer[][] matrix;

    /* Constructor. Generate a matrix filled with random values
     */
    public Matrix(int rows, int cols) throws Exception{
        if(rows<1 || cols<1)
            throw new Exception("Error in params in Matrix constructor");

        matrix = new Integer[rows][cols];

        Random rnd = new Random();
        for(int i=0;i<rows;i++)
            for(int j=0;j<cols;j++){
                matrix[i][j] = rnd.nextInt(100);
            }
    }

    /* Method that returns max value in a row passed by parameter
     */
    public Integer getRowMax(int row) throws Exception{
        if(matrix == null)
            throw new Exception("The matrix has not been initialized");

        int max = matrix[row][0];
        for(int i=0;i<matrix[row].length;i++)
            if(matrix[row][i] > max)
                max = matrix[row][i];

        return max;
    }

    /* Prints matrix
     */
    public void print(){
        for (Integer[] integers : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(integers[j]+"|");
            }
            System.out.println();
        }
    }
}
