public class BmiService {
    public double calculate(int bodyMass, double inch) {

        double bmi;
        bmi = bodyMass/(inch*inch);
        return bmi;
    }


}
