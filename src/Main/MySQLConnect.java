package Main;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class MySQLConnect {
    private String pwd;
    private String username;
    private String database;
    private Statement stmt;
    private Connection con;
    
    public MySQLConnect(String pwd, String username, String database) {
        this.pwd = pwd;
        this.username = username;
        this.database = database;        
        try{
            Class.forName("java.sql.Driver");
            this.con = DriverManager.getConnection("jdbc:mysql://localhost/"+ this.database +"",this.username,this.pwd);
            //this.con = DriverManager.getConnection("jdbc:mysql:///substi","root","root");
            this.stmt = this.con.createStatement();
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
    }
    
    public void update(String query){
        //System.out.println(query);
        try {
            this.stmt.executeUpdate(query);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e);
        }
    }
    
    public void insert(String table, String values){
        try {
            this.stmt.executeUpdate("INSERT INTO " + table + " VALUES(" + values + ");");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e);
        }
    }
    //car
    public ResultSet query(String query){
        //System.out.println(query);
        ResultSet rs = null;
        try {
            Statement stmt1 = this.con.createStatement();
            rs = stmt1.executeQuery(query);            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e);
        }
        return rs;
    }
    
    public Statement getStatement(){
        Statement stmt1 = null;
        try {
            stmt1 = this.con.createStatement();
        } catch (SQLException ex) {            
        }
        return stmt1;
    }
    
    public void save(String path){
        try {
            String string = "";
            
            //Creates DATABASE AND USES IT
            //StringBuilder sb = new StringBuilder("DROP DATABASE "+this.database+";CREATE DATABASE "+this.database+";USE "+this.database+";");
            StringBuilder sb = new StringBuilder();
            //CREATE ALL THE TABLES
            ResultSet rsTbls = this.query("SHOW TABLES;");
            while(rsTbls.next()){
                String tableName = rsTbls.getString("Tables_in_"+this.database);
                //CREATE TABLE talbe(id int(11) not null PRIMARY KEY auto_increment);
                ResultSet rsTbl = this.query("DESC "+tableName+";");
                string = "CREATE TABLE "+tableName+"(";
                while(rsTbl.next()){
                    string += rsTbl.getString("Field") + " " + rsTbl.getString("Type") + ",";                    
                }
                string = string.substring(0, string.length()-1) + ");";
                sb.append(string);
            }
            
            //INSERT THE RECORDS
            
            this.write(path,sb.toString());
        } catch (SQLException ex) {
            Logger.getLogger(MySQLConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void load(String filePath){
        
    }
    
    private void write(String path, String text){
        FileWriter fstream = null;
        try {
            fstream = new FileWriter("out.sql");
            BufferedWriter out = new BufferedWriter(fstream);
            out.write(text);
            out.close();
            fstream.close();
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
    
    public void read(){
        
    }
}
