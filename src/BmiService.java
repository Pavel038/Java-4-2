public class BmiService {
    public double calculate(double height, double weight) {
        double result;
       {
            double BMI = weight / (height * height);
            result = BMI;
        }
        return result;
    }
}