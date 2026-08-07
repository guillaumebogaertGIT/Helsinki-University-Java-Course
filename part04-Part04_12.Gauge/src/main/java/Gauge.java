public class Gauge {
    private int value = 0;

    public Gauge() {

    }

    public void increase(){
        if (this.value < 5) {
            value++ ;
        }

    }
    public void decrease(){
        if (this.value > 0){
            value-- ;
        }
        

    }
    public int value(){
        return value;

    }
    public boolean full(){
        if (value == 5) {
            return true;
        } else {
            return false;
        }

    }



}
