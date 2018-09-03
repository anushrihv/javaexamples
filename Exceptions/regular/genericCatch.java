import java.sql.*;
import java.io.*;

class Test{

  void show() throws SQLException{

  }

  void test() throws SQLException,IOException{
    try{
      show();
    }catch(SQLException e){

      e.printStackTrace();
      throw(e);
    }
  }

  public static void main(String[] args) throws SQLException,IOException{
    Test t = new Test();
    t.test();
  }
}
