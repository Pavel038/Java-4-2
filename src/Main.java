public class Main {
    public static void main(String[] args){
        BmiService service = new BmiService();
            double height = 1.45; // рост
            double weight = 80;       //Вес
            double BMI = service.calculate(height, weight);
        System.out.printf("%.2f", BMI);


    }
}