# springboot_crud_log
springboot,crud,aop,log


用户信息功能操作：
  用户表：（主键ID、姓名、手机号、身份证号、省份、城市、邮箱、备注、状态、创建时间）
1、完成用户表的增删改查功能。

2、对单条数据进行（增删改查）时，需要日志进行记录（列表全部查询功能无需作日志记录）。
   2.1日志记录功能：
     日志记录表：(主键ID、操作人IP地址、操作请求的URL、操作动作描述、操作类和方法名、操作传参数据、操作时间、备注、）

     示例删除数据：  1，10.0.5.201，4-spring-jdbc/user/del,用户管理-删除,com.wk...deleteById,1,当前日期、备注）
     示例查询数据：  2，10.0.5.201，4-spring-jdbc/user/get,用户管理-查询,com.wk...selectById,1,当前日期、备注）
     示例添加数据：  3，10.0.5.201，4-spring-jdbc/user/add,用户管理-添加,com.wk...insert,对象.toString,当前日期，备注）
     
     备注：
        request.getRemoteAddr();  请求的IP地址
	request.get...Url/   请求的访问URL
	操作传参： 如果有参数，直接把所有传的参数用字符串拼接方式存进来。如果没有参数直接给个：无。

3、完成日志表的查询功能	
