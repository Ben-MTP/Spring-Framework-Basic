# Spring-Framework-Basic

Spring Framework cơ bản using demo in huongdanjava.com

<img src="./spring-by-pivotal.png">


Lần đầu tiên được viết bởi Rod Johnson và đến nay nó đã phổ biến tới mức mà bất kỳ một lập trình viên Java nào cũng cần phải biết.

Trong bài viết về Spring framework cơ bản này, Hướng Dẫn Java sẽ hướng dẫn các bạn từng bước một những kiến thức cần thiết về Spring framework để bạn có thể làm việc với nó.

Đầu tiên thì các bạn nên biết về khái niệm Dependency Injection thông qua bài viết Hiểu về Dependency Injection, nó sẽ cung cấp cái nhìn mới cho các bạn về cách mà chúng ta quản lý các đối tượng trong Java. Cùng với đó là khái niệm IoC, Inversion of Control và Dependency Injection, qua đó các bạn sẽ hình dung được cái mà Spring framework nó đang làm.

Để bắt đầu làm việc với Spring, mình trình bày cho các bạn một ứng dụng đầu tiên thông qua bài viết Spring framework xin chào thế giới. Các bạn sẽ có cái nhìn tổng quan về cách làm việc với Spring framework sẽ như thế nào.

Sau khi đọc những bài viết trên, giờ các bạn có thể tìm hiểu sâu về Spring framework rồi.

Cài đặt
Cài đặt Spring Tool Suite IDE trên Ubuntu
Các bạn nên sử dụng Spring Tool Suite IDE khi làm việc với Spring để tận dụng những sự hỗ trợ của IDE này cho Spring framework.

Khởi tạo bean
Khởi tạo các đối tượng trong Spring container sử dụng tập tin XML
Các bạn sẽ biết cách làm thế nào để khai báo và khởi tạo các đối tượng Java trong Spring container sử dụng tập tin XML.

Kế thừa bean trong Spring
Các bạn sẽ biết cách sử dụng kế thừa như trong Java trong Spring như thế nào?

Nói về tập tin cấu hình XML trong Spring
Bài viết này mình sẽ trình bày với các bạn cách tập tin cấu hình XML của Spring làm việc, cách khai báo các namespace để sử dụng cái thẻ XML của Spring trong tập tin này.

Khởi tạo bean trong khung chứa của Spring sử dụng annotation @Configuration
Ngoài cách khởi tạo bean trong khung chứa của Spring sử dụng tập tin XML, chúng ta còn có thể sử dụng annotation @Configuration.

Auto component scan trong Spring
Chúng ta cũng có thể sử dụng cơ chế auto component scan của Spring để khởi tạo bean trong khung chứa của nó.

Auto component scan trong Spring sử dụng annotation @ComponentScan
Trong bài viết này, mình hướng dẫn các bạn cách auto component scan trong Spring sử dụng annotation @ComponentScan.

Inject bean
[DONE] Inject đối tượng này vào đối tượng khác trong Spring sử dụng tập tin XML
Để sử dụng đối tượng Java này trong một đối tượng Java khác với Spring, các bạn cần biết làm thế nào để khai báo nó trong tập tin cấu hình của Spring.

[DONE] Nói thêm về Constructor Injection trong Spring sử dụng tập tin XML
[Project] 
Bài viết này mình trình bày chi tiết hơn về Constructor Injection trong Spring sử dụng tập tin XML.

[DONE] Constructor Injection với overloaded constructor trong Spring
[Project: spring-overload-constructor-injection] 
Trong bài viết này, mình trình bày với các bạn cách khai báo các overloaded constructor trong Spring.

[DONE] Nói thêm về Setter Injection trong Spring sử dụng tập tin XML
[Project: spring-setter-injection]
Bài viết này mình trình bày chi tiết hơn về Setter Injection trong Spring sử dụng tập tin XML.

[DONE] Bean autowiring trong Spring là gì?
Các bạn sẽ biết cách làm thế nào để đưa đối tượng Java này vào đối tượng Java khác một cách tự động.

Bean autowiring sử dụng @Autowired annotation
Các bạn cũng có thể sử dụng @Autowired annotation để tự động đưa đối tượng phụ thuộc vào đối tượng bị phụ thuộc trong Spring.

Nói thêm về AutowiredAnnotationBeanPostProcessor
Mình dạo qua code của AutowiredAnnotationBeanPostProcessor để xem đối tượng này đã làm gì để có thể đưa đối tượng phụ thuộc vào đối tượng bị phụ thuộc. Các bạn có thể đọc qua để tham khảo.

Sử dụng annotation @Qualifier trong Spring
Trong bài viết này, mình hướng dẫn các bạn sử dụng annotation @Qualifier để chỉ định bean cần autowire khi chúng ta có nhiều bean của cùng một đối tượng phụ thuộc trong khung chứa của Spring.

Thao tác với properties files
Đọc properties files trong Spring sử dụng đối tượng PropertyPlaceholderConfigurer
PropertyPlaceholderConfigurer là một trong những đối tượng giúp Spring đọc các properties files.

Đọc properties files trong Spring sử dụng context namespace
Trong bài viết này, mình sẽ trình bày với các bạn cách đọc properties files trong Spring sử dụng context namespace.

Đọc properties files trong Spring sử dụng util namespace
Trong bài viết này, mình sẽ trình bày với các bạn cách đọc properties files trong Spring sử dụng util namespace.

Đọc properties files trong Spring sử dụng annotation @PropertySource
Trong bài viết này, mình sẽ hướng dẫn các bạn cách đọc properties files trong Spring sử dụng annotation @PropertySource.

Cách sử dụng properties trong tập tin cấu hình của Spring
Khi sử dụng properties trong tập tin cấu hình của Spring, các bạn cần biết cách khai báo nó.

Sử dụng properties trong Spring với annotation @Value
Trong bài viết này, mình sẽ hướng dẫn các bạn cách sử dụng properties trong Spring với annotation @Value.

Database
JDBC transaction management trong Spring
Trong bài viết này, mình giới thiệu với các bạn về JDBC transaction management trong Spring.

Transaction management với @EnableTransactionManagement trong ứng dụng Spring
Trong bài viết này, mình hướng dẫn các bạn cách cấu hình transaction management với @EnableTransactionManagement trong ứng dụng Spring.

JPA và Spring framework
Trong bài viết này, mình sẽ trình bày với các bạn cách sử dụng JPA trong Spring framework.

Hibernate và Spring framework
Trong bài viết này, mình sẽ trình bày với các bạn cách sử dụng Hibernate trong Spring framework.

Các kiến thức khác
BeanFactory và ApplicationContext trong Spring
Các bạn sẽ biết sự khác nhau giữa BeanFactory và ApplicationContext trong Spring mặc dù cả hai đối tượng này đều chứa thông tin về khung chứa của Spring.

Sử dụng ApplicationContextAware và BeanNameAware trong Spring
Để gọi ApplicationContext bạn sẽ cần sử dụng ApplicationContextAware, để đặt tên cho một Bean bạn sẽ sử dụng BeanNameAware

## Reference Document:
https://huongdanjava.com/vi/spring-framework-co-ban
