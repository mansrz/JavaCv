/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

/**
 *
 * @author lonewolf
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.management.Query;


public class MyQuery {
    private Connection con;
       private static final String DRIVER = "com.mysql.jdbc.Driver";
       private static final String DBMS = "mysql";
       private static final String HOST = "127.0.0.1";
       private static final String PORT = "3306";
       private static final String DATABASE = "javacv";
       private static final String USER = "root";
       private static final String PASSWORD = "lonewolf";
    public Connection getConnection(){
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:" + DBMS + "://" + HOST + ":" + PORT + "/" + DATABASE, USER, PASSWORD);
        } catch (SQLException ex) {
            Logger.getLogger(Query.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
    
    public ArrayList<Product2> BindTable(){
        
        ArrayList<Product2> list = new ArrayList<Product2>();
        Connection cox = getConnection();
        Statement st;
        ResultSet rs;
   
        try {
            st = cox.createStatement();
            rs = st.executeQuery("SELECT images FROM javacv.jimages");

            Product2 p;
            while(rs.next()){
            p = new Product2(rs.getBytes("images"));
            //rs.getString("ID_PRO"),
            //rs.getString("PRO_NAME"),
            //rs.getInt("QTE_IN_STOCK"),
            //rs.getString("PRICE"),

            //rs.getInt("ID_CAT")

            list.add(p);
        }

        } catch (SQLException ex) {
             //Logger.getLogger(MyQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
   }




    
}
