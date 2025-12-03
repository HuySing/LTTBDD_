# Dự Án Lập Trình Kotlin

## Giới Thiệu

Kotlin là một ngôn ngữ lập trình hiện đại, mạnh mẽ và dễ sử dụng, được phát triển bởi JetBrains. Nó tương thích hoàn toàn với Java và có thể được sử dụng để phát triển các ứng dụng Android, ứng dụng máy tính để bàn, và các ứng dụng phía máy chủ (server-side). Kotlin nổi bật với tính ngắn gọn, an toàn và dễ bảo trì.

Dự án này được xây dựng với mục tiêu học và thực hành các khái niệm cơ bản và nâng cao trong lập trình Kotlin, đồng thời áp dụng Kotlin vào việc phát triển ứng dụng Android.

## Mục Tiêu Dự Án

Dự án này sẽ giúp bạn:
- Nắm vững các khái niệm cơ bản trong Kotlin: biến, kiểu dữ liệu, hàm, điều kiện, vòng lặp.
- Làm quen với các tính năng nâng cao của Kotlin như extension functions, lambda, higher-order functions, và data classes.
- Tìm hiểu cách sử dụng Kotlin để phát triển ứng dụng Android.
- Hiểu rõ về các công cụ và thư viện Kotlin phổ biến trong lập trình di động và server-side.

## Công Nghệ Sử Dụng

- **Kotlin**: Ngôn ngữ chính sử dụng cho phát triển ứng dụng Android và các ứng dụng máy tính để bàn.
- **Android Studio**: IDE chính để phát triển ứng dụng Android bằng Kotlin.
- **Ktor**: Thư viện Kotlin dùng để phát triển ứng dụng phía máy chủ (server-side).
- **Gradle**: Công cụ xây dựng và quản lý phụ thuộc cho các dự án Kotlin và Android.

## Các Tính Năng Của Dự Án

- **Lập trình Android với Kotlin**: Cung cấp các ứng dụng đơn giản với giao diện người dùng.
- **Sử dụng Kotlin cho lập trình phía máy chủ**: Các ví dụ sử dụng Ktor để xây dựng các API RESTful.
- **Tính năng nâng cao trong Kotlin**: Làm việc với extension functions, lambda expressions, data classes, v.v.

## Hướng Dẫn Cài Đặt

1. **Cài đặt Android Studio:**
   - Truy cập [Android Studio](https://developer.android.com/studio) và tải về phiên bản mới nhất.
   - Cài đặt Android Studio theo hướng dẫn.

2. **Cài đặt Kotlin Plugin (nếu chưa có):**
   - Mở Android Studio và vào `Preferences` -> `Plugins`.
   - Tìm và cài đặt plugin Kotlin.

3. **Cài đặt Ktor (cho ứng dụng phía máy chủ):**
   - Truy cập [Ktor](https://ktor.io/) và làm theo hướng dẫn cài đặt.
   
4. **Cài đặt Gradle:**
   - Truy cập [Gradle](https://gradle.org/install/) và làm theo hướng dẫn cài đặt.

## Cách Sử Dụng

Sau khi cài đặt các công cụ cần thiết, bạn có thể bắt đầu lập trình Kotlin với các bước sau:

1. **Tạo dự án Kotlin mới trong Android Studio:**
   - Chọn `New Project` -> `Empty Activity`.
   - Đảm bảo rằng ngôn ngữ dự án là **Kotlin**.

2. **Chạy ứng dụng Kotlin trên thiết bị giả lập hoặc thiết bị thật:**
   - Chọn thiết bị từ danh sách và nhấn nút `Run` trong Android Studio.

3. **Phát triển ứng dụng phía máy chủ với Ktor:**
   - Tạo một ứng dụng Ktor đơn giản và chạy trên máy chủ của bạn.

## Tài Nguyên Học Tập

- [Kotlin Documentation](https://kotlinlang.org/docs/home.html)
- [Android Kotlin Guides](https://developer.android.com/kotlin)
- [Ktor Documentation](https://ktor.io/docs/welcome.html)

## Tham Gia Dự Án

Nếu bạn muốn đóng góp vào dự án hoặc cải thiện các ví dụ, vui lòng thực hiện các bước sau:

1. Fork dự án này.
2. Tạo một nhánh mới (`git checkout -b feature-branch`).
3. Commit các thay đổi của bạn (`git commit -am 'Add new feature'`).
4. Push lên nhánh của bạn (`git push origin feature-branch`).
5. Mở Pull Request để đóng góp vào dự án.

# Ứng dụng Cửa hàng Cà phê - Coffee Shop Android App ☕  
**Môn học**: Lập trình Di động – Nhóm 17  
**Trường**: Đại học Giao thông Vận tải TP.HCM – Viện Công nghệ Thông tin & Điện, Điện tử  
**Thời gian hoàn thành**: 30/11/2025  

### Demo (screenshots)
![Demo](screenshots/demo.gif)  
*(Các ảnh chụp màn hình chi tiết xem trong thư mục `/screenshots`)*

### Kiến trúc hệ thống (MVVM + Repository Pattern)
![MVVM Architecture](docs/architecture/mvvm_architecture.png)
<br/>
<img width="561" height="538" alt="image" src="https://github.com/user-attachments/assets/ac50b504-0a41-465b-a1b0-ea41a379ee27" />

### Sơ đồ Use Case (Luồng nghiệp vụ chính)
![Use Case Diagram](docs/usecase/usecase_diagram.png)
<br/>
<img width="945" height="849" alt="image" src="https://github.com/user-attachments/assets/fd1cd9cc-5990-4120-98d0-ebf95dbba5f2" />

### Mô tả dự án
Ứng dụng đặt đồ uống cà phê dành cho khách hàng (Customer Mobile App), được xây dựng hoàn toàn bằng **Kotlin** theo kiến trúc **MVVM**, sử dụng giao diện XML truyền thống và các thành phần Android Jetpack hiện đại.

Ứng dụng cho phép:
- Xem menu đồ uống (hình ảnh, giá, mô tả)
- Tùy chỉnh món (size, đá, đường, topping…)
- Quản lý giỏ hàng & tính tiền tự động
- Lưu trữ offline bằng Room Database
- Đăng nhập / Đăng ký
- Đặt hàng (COD) & xem lịch sử đơn hàng

### Tính năng chính
| Tính năng                | Trạng thái |
|--------------------------|------------|
| Đăng nhập / Đăng ký       | Hoàn thành |
| Hiển thị Menu (RecyclerView + Glide) | Hoàn thành |
| Chi tiết & tùy chỉnh món   | Hoàn thành |
| Giỏ hàng (Room + LiveData) | Hoàn thành |
| Đặt hàng COD              | Hoàn thành |
| Lịch sử đơn hàng          | Hoàn thành |
| Offline-first (Room DB)   | Hoàn thành |

### Công nghệ & Thư viện
- **Ngôn ngữ**: Kotlin
- **IDE**: Android Studio (2025.x)
- **Kiến trúc**: MVVM
- **UI**: XML Layouts + View Binding + ConstraintLayout
- **Android Jetpack**:
  - ViewModel + LiveData
  - Room Database
  - Navigation Component
- **Hình ảnh**: Glide
- **Bất đồng bộ**: Kotlin Coroutines
- **Database mẫu**: `CoffeeShopDB.db` (trong `/assets`)

### Yêu cầu hệ thống
- Android 7.0 (API 24) trở lên
- Android Studio Iguana/Jellyfish hoặc mới hơn
- JDK 17

### Hướng dẫn cài đặt & chạy dự án
```bash
# 1. Clone repository
git clone https://github.com/username/CoffeeShop-Android-App.git

# 2. Mở bằng Android Studio → Open project

# 3. Chờ Gradle sync xong (5-10 phút lần đầu)

