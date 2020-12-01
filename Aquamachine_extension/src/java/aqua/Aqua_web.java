/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aqua;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author admin
 */
@WebService(serviceName = "Aqua_web")
public class Aqua_web {

    
    @WebMethod(operationName = "insertOffer")
    public void insertOffer(@WebParam(name = "id") int id, @WebParam(name = "description") String description, @WebParam(name = "price") String price) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/aquamachine","root","");
            PreparedStatement ps=c.prepareStatement("insert into aquaoffer values (?,?,?)");
            ps.setInt(1, id);
            ps.setString(2, description);
            ps.setString(3, price);
            ps.executeUpdate();
            c.commit();
        }
        catch(Exception e){}
    }
      
    /**
     * Web service operation
     */
    @WebMethod(operationName = "searchOffer")
    public List searchOffer(@WebParam(name = "id") int id) {
        List l = new ArrayList();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/aquamachine","root","");
            PreparedStatement ps=c.prepareStatement("select * from aquaoffer where id=?");
            ps.setInt(1, id);
            ResultSet rs=ps.executeQuery();
            if(rs.next())
            {
               l.add( "Description: "+rs.getString(2)+",   price: " + rs.getString(3));
                return l;
            }
            else
                l.add("Enter valid id!");
                return l;
        }
        catch(Exception e){       
         l.add(e.toString());
         return l;
        }
    }
    
    @WebMethod(operationName = "deleteOffer")
    public void deleteOffer(@WebParam(name = "id") int id) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/aquamachine","root","");
            PreparedStatement ps=c.prepareStatement("delete from aquaoffer where id=?");
            ps.setInt(1, id);
            ps.executeUpdate();
            c.commit();
        }
        catch(Exception e){}
    }
        
    @WebMethod(operationName = "updateOffer")
    public void updateOffer(@WebParam(name = "id") int id, @WebParam(name = "description") String description, @WebParam(name = "price") String price) {
        //TODO write your implementation code here:
        try{
             Class.forName ("com.mysql.jdbc.Driver"); 
            Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/aquamachine","root","");
            PreparedStatement ps=c.prepareStatement("update aquaoffer set description=?, price=? where id=?");
            ps.setString(1,description);
            ps.setString(2,price);
            ps.setInt(3,id);
            ps.executeUpdate();
            c.commit();
        }
        catch(Exception e){}
    }  
}
