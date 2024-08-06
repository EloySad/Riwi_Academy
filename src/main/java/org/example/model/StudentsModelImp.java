package org.example.model;

import org.example.entitiy.StudentsEntity;
import org.example.persistence.Imodel.IModelStudents;
import org.example.persistence.connectionDB.ConfigDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentsModelImp implements IModelStudents {

    @Override
    public StudentsEntity create(StudentsEntity request) {
        Connection connection = ConfigDB.conect();

        String querySql = "INSERT INTO student(document_id,name,last_name,email,fk_courses,status) values(?,?,?,?,?,?);";

        StudentsEntity students = new StudentsEntity();

        try {
            PreparedStatement ps = connection.prepareStatement(querySql);

            ps.setInt(1,request.getDocument_id());
            ps.setString(2,request.getName());
            ps.setString(3,request.getLast_name());
            ps.setString(4,request.getEmail());
            ps.setInt(5,request.getFk_courses());
            ps.setString(6,request.getStatus());

        }catch (SQLException e){
            throw new RuntimeException(e.getMessage());
        }finally {
            ConfigDB.close();
        }

        return students;
    }


    @Override
    public boolean update(StudentsEntity request) {

        Connection connection = ConfigDB.conect();
        String query = "UPDATE coder SET document_id = ?, name = ?, last_name = ?, email = ?, fk_courses = ?, status = ?;";

        try {

            PreparedStatement ps = connection.prepareStatement(query);

            ps.setInt(1,request.getDocument_id());
            ps.setString(2,request.getName());
            ps.setString(3,request.getLast_name());
            ps.setString(4,request.getEmail());
            ps.setInt(5,request.getFk_courses());
            ps.setString(6,request.getStatus());

            ps.execute();
            return true;

        }catch (Exception e){
            System.out.println("Could not update the student");
        }finally {
            ConfigDB.close();
        }
        return false;
    }

    @Override
    public List<StudentsEntity> read() {
        List<StudentsEntity> students = new ArrayList<>();
        PreparedStatement ps;
        ResultSet rs;
        Connection con = ConfigDB.conect();
        String query = "SELECT * FROM students";


        try {
            ps = con.prepareStatement(query);

            rs = ps.executeQuery();

            while (rs.next()){
                StudentsEntity student = null;
                student = new StudentsEntity(rs.getInt("id"),
                        rs.getString("status"),
                        rs.getInt("document_id"),
                        rs.getString("name"),
                        rs.getString("last_name"),
                        rs.getString("email"),
                        rs.getInt("fk_courses"));
                students.add(student);
            }
        }catch (Exception e){
            System.out.println("No se pudieron treaer los coder");
        }finally {
            ConfigDB.close();
        }
        return students;
    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public boolean delete(StudentsEntity id) {
        return false;
    }

}
