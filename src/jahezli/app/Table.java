package jahezli.app;

public class Table {
    int tableNo;
    String placeName;
    int chair;
    
   public Table(){
    
} 
       public Table(int tableNo, String placeName,int chair) {
        
        this.tableNo = tableNo;
        this.placeName = placeName;
        this.chair = chair;
        
    }

    public int getTableNo() {
        return tableNo;
    }

    public void setTableNo(int tableNo) {
        this.tableNo = tableNo;
    }

    public int getChair() {
        return chair;
    }

    public void setChair(int chair) {
        this.chair = chair;
    }
   
        public String toString() {
        return "Place name is " + placeName + " Table Number is " 
                + tableNo + "The Table Has " + chair + " Chairs";
    }
}