public class BmiService {
    public int calculate(int bodyMass, int inch) {

        int bmi = bodyMass / ((inch*inch)/100/100);
        return bmi;
    }


}
