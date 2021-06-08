/*
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
*/

public class OperatorTest extends Fraction{

    //Variables to use
    public String FractionA = "1/4";
    public String FractionB = "1/2";
    public String FractionC = "2_1/4";
    public String FractionD = "1_1/4";
    public String NegativeA = "1/0";
    public String NegativeB = "ABC";
    public String HarcodeResultsAdd = "3/4";
    public String HarcodeResultsSubtract = "1";
    public String HarcodeResultsMultiply = "1/4";
    public String HarcodeResultsDivide = "2";
    public Fraction Operator = new Fraction();
    //public Fraction Input = new Fraction();
    public Fraction Results = new Fraction();

    //Setup for testing
    //@Before

    //Testing methods
    //@Test
    public void ValidateAdd(){
        //Results=Operator.add(FractionA, FractionB);
        //org.junit.Assert.assertEquals(Results, HarcodeResultsAdd);
    }
    //@Test
    public void ValidateSubtract(){
        //Results=Operator.add(FractionC, FractionD);
        //org.junit.Assert.assertEquals(Results, HarcodeResultsSubtract);
    }
    //@Test
    public void ValidateMultiply(){
        //Results=Operator.add(FractionB, FractionA);
        //org.junit.Assert.assertEquals(Results, HarcodeResultsMultiply);
    }
    //@Test
    public void ValidateDivide(){
        //Results=Operator.add(FractionB, FractionA);
        //org.junit.Assert.assertEquals(Results, HarcodeResultsDivide);
    }

    //@Test
    public void ValidateNegative(){
        //Results=Operator.add(NegativeA, NegativeB);
        //org.junit.Assert.assertEquals(Results, HarcodeResultsAdd);
    }


    //Closing methods
    //After

}
