

public class Presenter {

    private final MathModel model;

    private final View view;

    public Presenter(MathModel model, View view) {
        this.model = model;
        this.view = view;
    }

    public void execute() {
        model.setFirst(view.getValueInt("Enter the first number: "));
        String exp = view.getValueStr("Enter expration type (+; -; *; /): ");
        model.setSecond(view.getValueInt("Enter the second number: "));
        switch (exp) {
            case  ("+"):
                view.print("Sum is " + model.getSum());
                break;
            case  ("-"):
                view.print("Substration is " + model.getSub());
                break;
            case  ("*"):
                view.print("Multiplication is " + model.getMultiply());
                break;
            case  ("/"):
                view.print("Division is " + model.getDivide());
                break;
        }
    }

   /* private static class MockView implements View {

        private int count = 0;

        @Override
        public int getValue(String message) {
            count++;
            return 1;
        }

       /* @Override
        public void print(String message) {
            if (!message.equals("Sum is 2")) {
                throw new AssertionError("Incorrect sum");
            }
        }

        public int getCount() {
            return count;
        }
    }

    public static void main(String[] args) {
        SumModel sumModel = new SumModel();
        MockView mockView = new MockView();
        Presenter presenter = new Presenter(sumModel, mockView);

        presenter.execute();
        if (mockView.getCount() != 2) {
            throw new AssertionError("Incorrect call of getValue()");
        }
    }*/
}
