public abstract class Calculator implements Multiply, Divide {
    protected int total;

    public Calculator(){
        total = 1;
    }

    public void multiply(int y){
        total = total*y;
    }

    public void divide(int y) {
        if(y != 0){
            total = total / y;
        }
    }

    public abstract int calculate();
}
