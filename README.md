# template
模板，复用

## web1
基本的web项目
没用框架，只是对JDBC的**获取连接、关闭资源及处理结果集**进行简单封装（JDBCUtils.java）
还有几个常用的工具类
* JsonUtils.java  解析Json、封装Json
* HttpUtils.java  发送post、get请求来测试Servlet
* UUIDUtils.java  获取不带‘-’的UUID及获取多个UUID
* DateUtils.java  时间工具类，将系统时间转化为‘yyyy-MM-dd HH:mm:ss’形式的字符串，以后再有其他需求再添加方法
