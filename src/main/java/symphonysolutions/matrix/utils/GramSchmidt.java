package symphonysolutions.matrix.utils;

import java.util.ArrayList;

public class GramSchmidt {

 /*   public static Number[][] useGramSchmidt(Number[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {

        }
    }
*/
    private static ArrayList< double[] > gramSchmidt(ArrayList< double[] > array)
    {
        ArrayList< double[] > finalArray= new ArrayList<>();
        //I set the first vector because it never changes, it's always the first vector of the array receive divided between it's length
        finalArray.add(multiplyScalarPerVector(1/(calculateVectorLength(array.get(0))), array.get(0)));
        //This last line is the one that modifies EVERYTHING in array and it shouldn't

        for(int i=1; i<array .size(); i++)
        {
            double[] newVector= substractVectors(array .get(i), proyection(finalArray.get(i-1),array .get(i)));
            for(int e=i-1;e>0;e--)
            {
                newVector= substractVectors(newVector, proyection(finalArray.get(e-1),array .get(i)));
            }
            newVector= multiplyScalarPerVector(1/(calculateVectorLength(newVector)), newVector);
            finalArray.add(newVector);
        }
        return finalArray;
    }

    //Obtain the (Uk-1*Vk)*Uk-1
    private static double[] proyection(double[] array1, double[] array2)
    {
        double dotProductResult= dotProduct(array1,array2);
        double[] finalVector= multiplyScalarPerVector(dotProductResult, array1);
        return finalVector;
    }

    //To do Uk-1*Vk
    private static double dotProduct(double[] vector1, double[] vector2)
    {
        double result = 0;
        for(int i=0; i<vector1.length; i++)
        {
            result +=vector1[i]*vector2[i];
        }
        return result ;
    }

    private static double[] multiplyScalarPerVector(double scalar, double[] vector)
    {
        double[] newVector = new double[vector.length];
        for(int i=0; i<vector.length; i++)
        {
            newVector[i] = scalar*vector[i];
        }
        return newVector;
    }

    private static double[] substractVectors(double[] vector1, double[] vector2)
    {
        double[] finalVector= new double[vector1.length];
        for(int i=0; i<vector1.length; i++)
        {
            finalVector[i] = vector1[i] - vector2[i];
        }
        return finalVector;
    }

    //Calculate the euclidean distance
    private static double calculateVectorLength(double[] vector)
    {
        double result = 0;
        for(int i=0; i<vector.length; i++)
        {
            result +=Math.pow(vector[i], 2);
        }
        return Math.sqrt(result );
    }
}
