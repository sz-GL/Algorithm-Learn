package com.example.tonggongcraft;

import org.neo4j.driver.Driver;
import org.neo4j.driver.Session;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Neo4jTestController {

    // Spring Boot自动注入Neo4j驱动，无需手动写连接代码
    private final Driver neo4jDriver;

    public Neo4jTestController(Driver neo4jDriver) {
        this.neo4jDriver = neo4jDriver;
    }

    // 测试接口：访问 http://localhost:8080/testNeo4j 验证连接
    @GetMapping("/testNeo4j")
    public String testNeo4jConnection() {
        try (Session session = neo4jDriver.session()) {
            // 执行简单Cypher查询，验证连接
            String result = session.run("RETURN '✅ Spring Boot 成功连接Neo4j！' AS message")
                    .single()
                    .get("message")
                    .asString();
            return result + "\n🎉 铜管工艺卡系统数据库连接正常！";
        } catch (Exception e) {
            return "❌ 连接失败：" + e.getMessage();
        }
    }
}
