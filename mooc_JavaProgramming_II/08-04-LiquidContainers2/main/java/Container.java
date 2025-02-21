
public class Container {

    public int total;
    public int max;
    public int min;

    public Container() {
        this.total = 0;
        this.max = 100;
        this.min = 0;
    }

    public int contains() {
        return this.total;
    }

    public void add(int value) {
        if (value < 0) {
            value = 0;
        }
        if (this.total + value <= this.max) {
            this.total += value;
        } else {
            this.total = 100;
        }
    }

    public void remove(int value) {
        if (value < 0) {
            value = 0;
        }
        if (this.total - value < min) {
            this.total = 0;
        } else {
            this.total -= value;
        }
    }

    public int getTotal() {
        return this.total;
    }

    public String toString() {
        return this.total + "/100";
    }
}
