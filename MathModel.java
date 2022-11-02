

public class MathModel {

    private int first;

    private int second;

    //private String expration;

    public void setFirst(int first) {
        this.first = first;
    }

    public void setSecond(int second) {
        this.second = second;
    }

   /* public void setExpration(String exp) {
        this.expration = exp;
    }*/

    public int getSum() {
        return first + second;
    }

    public int getMultiply() {
        return first * second;
    }

    public int getDivide() {
        return first / second;
    }

    public int getSub() {
        return first - second;
    }

   /* public static void main(String[] args) {
        MathModel sumModel = new MathModel();

        sumModel.setFirst(1);
        sumModel.setSecond(1);
        if (sumModel.getSum() != 2) {
            throw new AssertionError("Incorrect test result");
        }

        sumModel.setFirst(1);
        sumModel.setSecond(2);
        if (sumModel.getSum() != 3) {
            throw new AssertionError("Incorrect test result");
        }

        sumModel.setFirst(2);
        sumModel.setSecond(3);
        if (sumModel.getSum() != 5) {
            throw new AssertionError("Incorrect test result");
        }
    }*/
}
