## Table structure Database:
    CREATE TABLE account (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(45) NOT NULL,
    amount DECIMAL
    );

## Logic
    Trong ví dụ này, chúng ta sẽ tạo ra một ứng dụng ngân hàng nhỏ cho phép chúng ta có thể chuyển tiền từ tài khoản A
    sang tài khoản B,. Quá trình chuyển khoản này sẽ gồm 2 bước: trừ tiền trong tài khoản A và cộng tiền vào tài khoản B. 
    Bất kỳ exception nào xảy ra trong quá trình chuyển tiền thì tất cả các hoạt động sẽ được rollback lại.


