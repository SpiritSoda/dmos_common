package com.dmos.dmos_common.util;

import com.dmos.dmos_common.config.DMOSConfig;
import com.google.gson.reflect.TypeToken;
import lombok.extern.slf4j.Slf4j;

import java.io.*;

@Slf4j
public class ConfigUtil {
    public static <T extends DMOSConfig> T load(String fileName, Class<T> type){
        String path = System.getProperty("user.dir");
        File file = new File(path + "/" + fileName);
        log.info("Loading config from path: {}", file.getPath());
        try{
            if(!file.exists()){
                log.error("Config file {} not exists, creating template", file.getPath());
                DMOSConfig config = new DMOSConfig();

                save(config, fileName);
                return null;
            }
            InputStream in = new FileInputStream(file);
            BufferedReader reader = new BufferedReader(new InputStreamReader(in));
            String line;
            StringBuffer buffer = new StringBuffer();
            line = reader.readLine(); // 读取第一行
            while (line != null) { // 如果 line 为空说明读完了
                buffer.append(line); // 将读到的内容添加到 buffer 中
                line = reader.readLine(); // 读取下一行
            }
            String json = buffer.toString();
//            log.info(json);
            T config = ParseUtil.decode(json, type);
            return config;
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
    public static <T> void save(T dmosConfig, String fileName){
        String path = System.getProperty("user.dir");
        File file = new File(path + "/" + fileName);
        String json = ParseUtil.encode(dmosConfig, true);
        try{
            FileWriter writer = new FileWriter(file);
            writer.write(json);
            writer.flush();
            writer.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
