# 自动事务控制
Ctrl模块在请求结束时，会自动提交事务并关闭连接，如果执行过程发生异常，则自动回滚并关闭连接。