package com.yunqing.common.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @ClassName: StreamUtil 
 * @Description: 流处理
 * @author: ASUS
 * @date: 2020年3月30日 上午8:51:12
 */
public class StreamUtil {
	
	public static List<String> readFile2List(String fileName) throws IOException{
		File file = new File(fileName);//根据路径去创建文件
		InputStream in = new FileInputStream(file);//根据文件创建InputStream
		return readFile2List(in);
	}
	
	/**
	 * 
	 * @Title: readFile2List 
	 * @Description: 读取文件到list集合
	 * @param file
	 * @return
	 * @return: List<String>
	 * @throws IOException 
	 */
	public static List<String> readFile2List(File file) throws IOException{
		InputStream in = new FileInputStream(file);
		
		
		return readFile2List(in);
		
	}
	/**
	 * 
	 * @Title: readFile2List 
	 * @Description: 读取文件到list集合
	 * @param in
	 * @return
	 * @return: List<String>
	 * @throws IOException 
	 */
	public static List<String> readFile2List(InputStream in) throws IOException {
		List<String> list = new ArrayList<String>();
		//读取一行 字节缓存流
		BufferedReader bf=new BufferedReader(new InputStreamReader(in));
		String str;
		while((str=bf.readLine())!=null) {
			list.add(str);
		}
		return list;
		
	}
	
	
}
