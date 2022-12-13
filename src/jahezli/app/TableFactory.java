package jahezli.app;
/**
 *
 * @author ghaidaa
 */
public class TableFactory {

    static Table getTable(String TableType){
        if(TableType.equals("VIPTable")){
            return new VIPTable();
        }
        if(TableType.equals("NormalTable")){
            return new NormalTable();
        }return null;
    }
}

