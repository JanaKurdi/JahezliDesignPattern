package jahezli.app;

import java.util.ArrayList;

public class FactoryPatternDemo {

    public static void main(String[] args) {
        Table VIPTable = TableFactory.getTable("VIPTable");
        System.out.println(VIPTable.TableType());

        Table NormalTable = TableFactory.getTable("NormalTable");
        System.out.println(NormalTable.TableType());
        
    }
}