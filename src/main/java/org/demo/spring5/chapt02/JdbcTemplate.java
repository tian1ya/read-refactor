package org.demo.spring5.chapt02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class JdbcTemplate {
    public static void update(String sql, Object... params) {
        Connection conn = null;
        Statement st = null;
        try {
            conn = JdbcUtil.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            for (int i = 1; i <= params.length; i++) {
                ps.setObject(1, params[i-1]);
            }
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JdbcUtil.close(null, st, conn);
        }
    }

}
