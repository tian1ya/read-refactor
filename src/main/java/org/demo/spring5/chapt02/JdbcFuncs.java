package org.demo.spring5.chapt02;

import java.sql.*;

public class JdbcFuncs {
    public void update(Student student) {
        String sql = "UPDATE t_student SET name=?, age=? where id=?";
        Connection conn = null;
        Statement st = null;
        try {
            conn = JdbcUtil.getConnection();

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setObject(1, student.id);
            ps.setObject(2, student.name);
            ps.setObject(3, student.age);
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JdbcUtil.close(null, st, conn);
        }
    }
    public void delete(Integer id) {
        String sql = "DELETE FROM t_student where id=?";
        Connection conn = null;
        Statement st = null;
        try {
            conn = JdbcUtil.getConnection();

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setObject(1, id);
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JdbcUtil.close(null, st, conn);
        }
    }

    public void save(Student student) {
        String sql = "INSERT INTO t_student(name, age) VALUES(?,?)";
        Connection conn = null;
        Statement st = null;
        try {
            conn = JdbcUtil.getConnection();

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setObject(1, student.age);
            ps.setObject(2, student.name);
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JdbcUtil.close(null, st, conn);
        }
    }
}
