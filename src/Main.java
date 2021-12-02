public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        double bmi = service.calculate(85, 1.86);
        System.out.println(bmi);
        double bmi1 = service.calculate(99, 1.70);
        System.out.println(bmi1);
        double bmi2 = service.calculate(77, 1.95);
        System.out.println(bmi2);
        double bmi3 = service.calculate(67, 1.80);
        System.out.println(bmi3);
        double bmi4 = service.calculate(79, 1.86);
        System.out.println(bmi4);
    }
}
