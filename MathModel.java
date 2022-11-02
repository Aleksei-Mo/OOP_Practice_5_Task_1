

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

   public static void main(String[] args) {
        MathModel Model = new MathModel();
        
        Model.setFirst(1);
        Model.setSecond(1);
        if (Model.getSum() != 2) {
            throw new AssertionError("Incorrect test result");
        }

        Model.setFirst(10);
        Model.setSecond(5);
        if (Model.getDivide() != 2) {
            throw new AssertionError("Incorrect test result");
        }
       
        Model.setFirst(15);
        Model.setSecond(13);
        if (Model.getSub() != 2) {
            throw new AssertionError("Incorrect test result");
        }

        Model.setFirst(3);
        Model.setSecond(3);
        if (Model.getMultiply() != 9) {
            throw new AssertionError("Incorrect test result");
        }
    }
}
