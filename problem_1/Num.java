package problem_1;

public class Num {

    private double value;
    private int count;

    public Num(double value) {
        this.value = value;
        this.count = 1;
    }

    public void increaseCount(){
        count++;
    }

    public double getValue() {
        return value;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "{" + value + ", " + count + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        Num num = (Num) obj;

        return this.value == num.getValue();
    }
}
