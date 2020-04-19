import java.io.IOException;

public class UnitTests {
    public static void main(String[] args){
        multiplyTest(5);
        divideTest(5);
        calculateTest();

    }

    public static void multiplyTest(int y){
        MiniCalculator tester = new MiniCalculator();
        try {
            tester.multiply(y);
        }
        catch(Exception ex){
            System.out.println("ERROR: multiply() FAILED: " + ex);
            return;
        }
        if(tester.total != y){
            System.out.println("Starting multiplication failed, incorrect result.");
        } else {
            System.out.println("Starting multiplication successful");
        }
        tester.multiply(6);
        if(tester.total != (y*6)){
            System.out.println("Second round multiplication failed, incorrect result");
        } else{
            System.out.println("Second round multiplication successful.");
        }
    }

    public static void divideTest(int y){
        MiniCalculator tester = new MiniCalculator();
        try{
            tester.divide(1);
        } catch(Exception ex){
            System.out.println("ERROR: divide() FAILED: " + ex);
            return;
        }
        try{
            tester.divide(0);
        } catch(ArithmeticException ex){
            System.out.println("divide() incorrectly handles division by 0: " + ex);
        }
        tester.multiply(y);
        tester.multiply(y);
        tester.divide(y);
        if(tester.total != y){
            System.out.println("first round division failed, incorrect result");
        } else{
            System.out.println("first round division successful");
        }
        tester.total = 10;
        tester.divide(3);
        if(tester.total != 3){
            System.out.println("second round division failed, incorrect result");
        }else{
            System.out.println("second round division successful");
        }
    }

    public static void calculateTest(){
        MiniCalculator tester = new MiniCalculator();
        try{
            tester.calculate();
        }catch(Exception ex){
            System.out.println("ERROR: calculate FAILED:" + ex);
            return;
        }
        if(tester.calculate() != 1){
            System.out.println("calculate() returns incorrect default value, failure");
        } else {
            System.out.println("calculate() returns correct default value, success");
        }
        tester.multiply(5);
        if(tester.calculate() != 5){
            System.out.println("calculate() returns incorrect value after operation, failure");
        } else {
            System.out.println("calculate() returns correct value after operation, success");
        }
    }
}
