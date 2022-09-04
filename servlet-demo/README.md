#### 传统servet应用
1. Servlet组件
    1. servlet 参考`DemoServlet` `ServletBootStrap`
        * 实现
          1. 追加@WebServlet 注解
          2. 继承`HttpServlet`
        * URL 映射
          * 在@WebServlet 追加属性 `urlPartten` 
        * 注册
          * 方式1. 使用@ServletComponetScan的方式进行扫描 参考 `ServletBootStrap`
    2. listener
    3. filter
2. servlet 注册
    1. servlet注解
        1. @ServletComponentScan
            1. @WebServlet
            2. @WebFilter
            3. @WebListener
    2. Spring bean
    3. RegistrationBean
3. 异步Servlet，非阻塞Servlet
    1. 异步非阻塞
       1. 异步servlet
          1. `javax.servlet.ServletRequests#startAsync()`
          2. `javax.servlet.AsynchContext`
       2. 非阻塞servlet
          1. `javax.servlet.ServletInputStream#setReadListener`
             1. ` javax.servlet.ReadListener`
          2. `javax.servlet.ServletOutputStream#setWriteLister`
             1. `javax.servlet.WriteListener`