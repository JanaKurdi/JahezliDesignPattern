package jahezli.app;
/**
 *
 * @author ghaidaa
 */
public class NormalTable implements Table {

    @Override
    public String TableType() 
         {
             System.out.println("Table type is normal");
        return null;
         }

    @Override
    public void Table(int tableNo, String placeName, int chair) {
    }

    @Override
    public int getTableNo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setTableNo(int tableNo) {
    }

    @Override
    public int getChair() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int setChair() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
