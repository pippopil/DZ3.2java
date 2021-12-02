public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
/*
int bodyMass = 99;
int inch = 186;
int bmi = bodyMass / ((inch*2)/100);
*/
int bmi = service.calculate(85,186);
        System.out.println(bmi);
    }
}
