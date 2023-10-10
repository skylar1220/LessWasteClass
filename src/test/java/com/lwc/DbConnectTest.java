package com.lwc;

import java.sql.Connection;
import java.sql.DriverManager;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DbConnectTest {
    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }

    @Test
    public void test() {
        try (Connection conn = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/lessWasteClass?useUnicode=true&serverTimezone=Asia/Seoul",
            "lessWasteClass",
            "lessWasteClass")) {
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
