package com.snsoft.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 * @copyright ：神农大学生软件创新中心 版权所有 © 2016
 * 
 * @author 慎伟康
 * 
 * @version 1.0
 * 
 * @date 2016年11月4日 下午10:04:35
 * 
 * @Description TODO
 *    时间帮助类，时间转换的方法
 */
public final class DateUtils {

	/**
	 * 时间格式转换为字符串
	 * @param date    
	 *             需要转换的时间类型参数
	 * @return
	 * @Description TODO
	 */
	public static String dateToString(Date date){
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return df.format(date);
	}
	
	
}
