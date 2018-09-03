import java.io.*;
import java.sql.*;

class Test{

  void show() throws SQLException,FileNotFoundException{

  }

  void rethrow() throws SQLException,FileNotFoundException{

    try{
      show();

    }catch(SQLException e){
      System.out.println(e);

      throw(e);
    }
  }

  public static void main(String[] args) throws IOException,SQLException{
    Test t = new Test();
    t.rethrow();
  }
}
