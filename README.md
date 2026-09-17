**24162111 - Doan Thanh Tam**
**Cấu hình trước khi chạy**

Trước khi chạy project, vui lòng kiểm tra file:

src/main/resources/application.properties

Phần cấu hình SQL Server:

spring.datasource.url=jdbc:sqlserver://localhost:1433;databaseName=webst2;encrypt=false;trustServerCertificate=true;sslProtocol=TLSv1.2;characterEncoding=UTF-8
spring.datasource.username=sa
spring.datasource.password=YOUR_SA_PASSWORD

Thay:

YOUR_SA_PASSWORD

bằng mật khẩu tài khoản SQL Server `sa` trên máy đang chạy project.


**Các chức năng**

Trang chủ hiển thị sản phẩm.

Đăng nhập và đăng xuất tài khoản.

Ghi nhớ đăng nhập bằng cookie.

Đăng ký tài khoản mới.

Xác thực đăng ký bằng OTP qua email.

Quên mật khẩu.

Xác thực OTP để đặt lại mật khẩu.

Cập nhật thông tin cá nhân.

Hiển thị danh sách sản phẩm.

Phân trang danh sách sản phẩm.

Xem chi tiết sản phẩm.

Phân quyền USER và ADMIN.

Tài khoản USER chỉ được sử dụng các chức năng thông thường.

Tài khoản ADMIN được truy cập các chức năng quản trị.

CRUD Category.

Tìm kiếm Category.

Phân trang Category.

Upload hình ảnh Category.

CRUD User.

Tìm kiếm User theo username, họ tên hoặc email.

Phân trang User.

Quản lý Role USER và ADMIN.

CRUD Product.

Upload hình ảnh Product.

Chỉ tài khoản có Role ADMIN mới được truy cập đường dẫn /admin/**.

**Đường dẫn chức năng**

| Chức năng | Đường dẫn |
|---|---|
| Trang chủ | http://localhost:8090/ |
| Trang chủ | http://localhost:8090/home |
| Đăng nhập | http://localhost:8090/login |
| Đăng xuất | http://localhost:8090/logout |
| Đăng ký | http://localhost:8090/register |
| Xác thực OTP đăng ký | http://localhost:8090/verify-otp |
| Quên mật khẩu | http://localhost:8090/forgot-password |
| Xác thực OTP đặt lại mật khẩu | http://localhost:8090/verify-reset-otp |
| Đặt lại mật khẩu | http://localhost:8090/reset-password |
| Thông tin cá nhân | http://localhost:8090/profile |
| Danh sách sản phẩm | http://localhost:8090/product |
| Chi tiết sản phẩm | http://localhost:8090/product/detail |
| Quản lý Category | http://localhost:8090/admin/categories |
| Thêm Category | http://localhost:8090/admin/categories/add |
| Tìm kiếm Category | http://localhost:8090/admin/categories/searchpaginated |
| Quản lý User | http://localhost:8090/admin/users |
| Thêm User | http://localhost:8090/admin/users/add |
| Tìm kiếm User | http://localhost:8090/admin/users/searchpaginated |
| Quản lý Product | http://localhost:8090/admin/product/list |
| Thêm Product | http://localhost:8090/admin/product/add |

**Phân quyền**

USER

Được truy cập Home, Product, Profile và các chức năng tài khoản.

Không được truy cập /admin/**.

ADMIN

Được sử dụng toàn bộ chức năng của USER.

Được truy cập Category CRUD.

Được truy cập User CRUD.

Được truy cập Product CRUD.

Được thay đổi Role của User.

**Database**

Database sử dụng:

webst2

Các bảng chính:

categories  
app_user  
products

Ứng dụng chạy tại:

http://localhost:8090/
