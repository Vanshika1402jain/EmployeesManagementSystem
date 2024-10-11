/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empmngsys.dao;

import empmngsys.dbutil.DBConnection;
import empmngsys.pojo.Employee;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Jain's
 */
public class EmpDAO {
    public static boolean addEmployee(Employee e)throws SQLException{
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("Insert into employees values(?,?,?)");
        ps.setInt(1, e.getEmpNo());
        ps.setString(2, e.getEmpName());
        ps.setDouble(3, e.getEmpSal());
        
        int result=ps.executeUpdate();
        return result==1;
    }
    public static Employee findEmployeeById(int empno)throws SQLException{
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("Select * from employees where empno=?");
        ps.setInt(1, empno);
        ResultSet rs=ps.executeQuery();
        Employee e=null;
        if(rs.next()){
            e=new Employee();
            e.setEmpNo(rs.getInt(1));
            e.setEmpName(rs.getString(2));
            e.setEmpSal(rs.getDouble(3));
        }
        return e;
    }
    public static ArrayList<Employee> getAllEmployees()throws SQLException{
        Connection conn=DBConnection.getConnection();
        Statement st=conn.createStatement();
        ResultSet rs=st.executeQuery("Select * from employees");
        ArrayList<Employee>list=new ArrayList<>();
        while(rs.next()){
            Employee  e=new Employee();
            e.setEmpNo(rs.getInt(1));
            e.setEmpName(rs.getString(2));
            e.setEmpSal(rs.getDouble(3));
            list.add(e);
        }
        return list;
    }
    public static boolean updateEmployee(Employee e)throws SQLException{
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("Update employees set ename=?,sal=? where empno=?");
        ps.setString(1, e.getEmpName());
        ps.setDouble(2, e.getEmpSal());
        ps.setInt(3, e.getEmpNo());
        
        int result=ps.executeUpdate();
        return result==1;
        
    }
    public static boolean deleteEmployee(int empno)throws SQLException{
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("Delete from employees where empno=?");
        ps.setInt(1, empno);
        
        int result=ps.executeUpdate();
        return result==1;
    }
}
