

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        MathModel Model = new MathModel();
        View view = new ViewImpl(scn, System.out);
        Presenter presenter = new Presenter(Model, view);
        presenter.execute();
    }
}
