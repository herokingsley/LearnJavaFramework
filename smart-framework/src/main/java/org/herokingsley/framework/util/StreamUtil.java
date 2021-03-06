package org.herokingsley.framework.util;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URLDecoder;
import java.net.URLEncoder;


/**
 * 流操作工具类
 *
 * @author Administrator
 * @date 2016/12/1
 */
public final class StreamUtil {

    private static final Logger LOGGER = LoggerFactory.getLogger(CodecUtil.class);

    public static String getString(InputStream is){
        StringBuilder sb = new StringBuilder();
        try{
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));
            String line;
            while((line = reader.readLine()) != null){
                sb.append(line);
            }
        }catch (Exception e){
            LOGGER.error("get string failure", e);
            throw new RuntimeException(e);
        }
        return sb.toString();
    }
}
