public class Calculator {
//instance variables
    private double num1;
    private double num2;

    //constructor
    public Calculator () {
        this.num1=num1;
        this.num2=num2;
    }

    //multiply method
    public double multiply(double num1, double num2) {
        return num1*num2;
    }

    //divide method
    public double division(double num1, double num2) {
        return num1/num2;
    }

    //addition method
    public double addition(double num1, double num2) {
        return num1+num2;
    }

    //subtraction method
    public double subtraction(double num1, double num2) {
        return num1-num2;
    }

    //mod method
    public double mod(double num1, double num2) {
        return num1%num2;
    }

    //powerOf method
    public double power (double num1, double num2){
        return Math.pow(num1, num2);
    }

}
