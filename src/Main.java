public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        int bmi = service.calculate(85, 186);
        System.out.println(bmi);
        int bmi1 = service.calculate(99, 170);
        System.out.println(bmi1);
        int bmi2 = service.calculate(77, 195);
        System.out.println(bmi2);
        int bmi3 = service.calculate(67, 180);
        System.out.println(bmi3);
        int bmi4 = service.calculate(79, 186);
        System.out.println(bmi4);
    }
}
