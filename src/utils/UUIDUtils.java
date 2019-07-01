package utils;

import java.util.UUID;

public class UUIDUtils {
	// 生成一个32位的字符串(唯一的)
	public static String getUUID(){
		return UUID.randomUUID().toString().replaceAll("-", "");
	}
}
