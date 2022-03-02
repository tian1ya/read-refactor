package org.demo.spring5.chapt02.jdbcs;

public class JdbcFuncs {
    public void update(Student student) {
        String sql = "UPDATE t_student SET name=?, age=? where id=?";
        JdbcTemplate.update(sql, new Object[]{student.name, student.age, student.id});
    }
    public void delete(Integer id) {
        String sql = "DELETE FROM t_student where id=?";
        JdbcTemplate.update(sql, id);
    }

    public void save(Student student) {
        String sql = "INSERT INTO t_student(name, age) VALUES(?,?)";
        JdbcTemplate.update(sql, new Object[]{student.name, student.age});
    }
}
