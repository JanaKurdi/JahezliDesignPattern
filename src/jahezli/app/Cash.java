package jahezli.app;

public class Cash extends paymentMethod{
    int change;
    double totalPricee;
   
    public Cash(){
}
    public Cash(int change){
        super();
        this.change = change;
    }

    public int getChange() {
        return change;
    }

    public void setChange(int change) {
        this.change = change;
    }
    @Override
    public String toString() {
        return "The Total Amount is: " + cost;
    }
}
