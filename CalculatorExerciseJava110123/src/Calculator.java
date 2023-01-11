public class Calculator{
    public double add(double a,double b){
        return a + b;
    }
    public double subtract(double a, double b){
        return a-b;
    }
    public double multiply(double a,double b){
        return a*b;
    }
    public double divide(double a,double b){
        return a/b;
    }
    public double module(double a,double b){
        return a % b;
    }
    public double power(double a,double b){
        return Math.pow(a,b);
    }
    public double root(double a, double b) {
        return Math.pow(a,1/b);
    }
    public double logarithm(double a, double b) {
        return Math.log(a) / Math.log(b);
    }
}
