import java.sql.Array;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
      String array[]={"Мама", "Мыла", "Раму"};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                for (int k = 0; k < array.length; k++) {
                    System.out.print(array[k]);
                    System.out.print(array[j]);
                    System.out.println(array[i]);

                }
            }
        }

        }
    }

