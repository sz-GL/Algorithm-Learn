package com.example.tonggongcraft;

import org.neo4j.driver.Driver;
import org.neo4j.driver.Session;
import org.neo4j.driver.Result;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

@RestController
public class FileUploadController {

    // Spring Boot自动注入Neo4j驱动
    private final Driver neo4jDriver;

    public FileUploadController(Driver neo4jDriver) {
        this.neo4jDriver = neo4jDriver;
    }

    // 文件上传接口
    @PostMapping("/upload")
    public String uploadTaskFile(@RequestParam("file") MultipartFile file) {
        // 1. 校验文件
        if (file.isEmpty()) {
            return "❌ 错误：请选择要上传的任务书文件！";
        }

        String fileName = file.getOriginalFilename();
        System.out.println("✅ 已上传任务书：" + fileName);

        try {
            // 2. 读取文件内容（支持.txt，后续可扩展Word/PDF）
            String fileContent = new String(file.getBytes(), StandardCharsets.UTF_8);
            System.out.println("📄 任务书内容：\n" + fileContent);

            // 3. 连接Neo4j，查询铜管工艺规则
            try (Session session = neo4jDriver.session()) {
                // 示例Cypher：查询所有工艺步骤（后续可根据任务书参数动态查询）
                Result result = session.run("MATCH (p:Process) RETURN p.name AS processName, p.step AS step, p.param AS param ORDER BY p.step");

                // 4. 拼接工艺卡内容
                StringBuilder processCard = new StringBuilder();
                processCard.append("📋 铜管生产工艺卡\n");
                processCard.append("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━\n");
                processCard.append("任务书文件：").append(fileName).append("\n\n");
                processCard.append("🔧 工艺步骤：\n");

                // 遍历查询结果，生成工艺卡
                while (result.hasNext()) {
                    var record = result.next();
                    processCard.append(record.get("step").asInt())
                            .append(". ")
                            .append(record.get("processName").asString())
                            .append(" | 参数：")
                            .append(record.get("param").asString())
                            .append("\n");
                }

                processCard.append("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━\n");
                processCard.append("✅ 工艺卡自动生成完成！");

                return processCard.toString();
            }

        } catch (IOException e) {
            return "❌ 文件读取失败：" + e.getMessage();
        } catch (Exception e) {
            return "❌ 工艺卡生成失败：" + e.getMessage();
        }
    }
}