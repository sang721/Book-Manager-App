
# 📚 **Book Manager App – Ứng dụng Đọc & Quản lý Sách **

![Java](https://img.shields.io/badge/Java-17-orange?style=flat-square)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen?style=flat-square)
![Status](https://img.shields.io/badge/Status-Active-blue?style=flat-square)

---

## **1. Giới thiệu**

**Book Manager App** là ứng dụng web đọc sách trực tuyến được phát triển bằng **Spring Boot**, cho phép người dùng tìm kiếm, xem thông tin và tải sách dưới dạng PDF.
Dự án được xây dựng với mục tiêu thực hành các kiến thức về lập trình Java Web, Spring Boot, tổ chức dữ liệu và thiết kế giao diện.

Ứng dụng được nhóm 4 thực hiện trong phạm vi học phần lập trình web.

---

## **2. Thông tin nhóm thực hiện**

**Nhóm 4 – Khoa Công nghệ Thông tin**

| MSSV           | Họ và tên               | Vai trò    |
| -------------- | ----------------------- | ---------- |
| **K24DTCN224** | **Nguyễn Đình Sang**    | Thành viên |
| **K24DTCN507** | **Phạm Đặng Vân Giang** | Thành viên |

---

## **3. Chức năng chính**

### 🔎 **Tìm kiếm sách**

* Tìm theo tên sách hoặc từ khóa.
* Tối ưu tốc độ phản hồi.

### 📂 **Quản lý thể loại sách**

* Trang chủ hiển thị danh sách thể loại.
* Khi chọn thể loại, hiển thị toàn bộ các đầu sách tương ứng.
* Hỗ trợ **phân trang (pagination)**.

### 📘 **Trang chi tiết sách**

Hiển thị:

* Hình ảnh bìa sách
* Thông tin tác giả 
* Tóm tắt nội dung
* File PDF để tải xuống

### 📄 **Tải file PDF**

* Sách được lưu dưới dạng PDF từ các nguồn công khai.

---

## **4. Công nghệ sử dụng**

### **Backend**

* Spring Boot 3.x

### **Frontend**

* HTML / CSS / JavaScript

### **Database**

### **Build tool**

* Maven

---

## **5. Kiến trúc hệ thống**

Ứng dụng được xây dựng theo mô hình **MVC**, bao gồm:

```
src/main/java
│
├── controller/      → Xử lý request HTTP
├── service/         → Chứa logic nghiệp vụ
├── repository/      → Tương tác cơ sở dữ liệu (JPA)
├── model/           → Định nghĩa thực thể (Book, Category)
└── BookManagerApp
```

**Thư mục resources:**

```
src/main/resources
│── templates/       → Giao diện Thymeleaf
│── static/          → CSS, JS, ảnh, PDF
└── application.properties
```

---

## **6. Cách chạy dự án**

### **Yêu cầu**

* JDK 17+
* Maven 3+

### **Chạy dự án**

```bash
git clone https://github.com/sang721/Book-Manager-App.git
cd Book-Manager-App
mvn spring-boot:run
```

Ứng dụng chạy tại:

👉 **[http://localhost:8080](http://localhost:8080)**

---

## **7. Nguồn dữ liệu**

* Các file PDF được **tổng hợp từ Google** và các nguồn public domain.
* Dự án chỉ nhằm mục đích **học tập**, **phi thương mại**.

---

## **8. Hướng phát triển**

* Chức năng đăng ký / đăng nhập
* Lưu sách yêu thích

---

## **9. Kết luận**

Dự án giúp nhóm 4 ứng dụng kiến thức lập trình web với Spring Boot vào thực tiễn, nâng cao khả năng thiết kế hệ thống, quản lý dữ liệu và tạo ra sản phẩm hoàn chỉnh phục vụ người dùng.

---

