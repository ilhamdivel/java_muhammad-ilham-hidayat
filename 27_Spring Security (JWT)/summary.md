# 27_Spring Security (JWT)

## Resume
Dalam materi ini mempelajari:
1. Konsep Token JWT
2. Header
3. Payload
4. Signature

### 1. Konsep Token JWT
Seperti namanya, JSON Web Token, yang berarti token ini menggunakan JSON (Javascript Object Notation), lalu token ini memungkinkan kita untuk mengirimkan data yang dapat diverifikasi oleh dua pihak atau lebih.

Contoh Token JWT : 
```
eyJhbGciOiJIUzI1NiJ9.eyJ1c2VybmFtZSI6IjA4MjExMjA5ODMzNyIsImlhdCI6MTY0ODYyMDkwMiwiZXhwIjoxNjQ4NjI0NTAyfQ.Tn5CyK_P8AXtJJCP28GkhSM317scMVFgybfrK5UG3-4
```

Jika diperhatikan terdapat 2 titik yang memisahkan token tersebut menjadi 3 bagian

### 2. Header
Bagian pertama disebut dengan header. Header berisi informasi tentang algoritma dan jenis token yang digunakan.
```
eyJhbGciOiJIUzI1NiJ9
```
Bagian ini hanyalah string yang di-encode menggunakan base64. Jadi kita bisa mendapatkan nilai asli dari teks tersebut dengan men-decodenya. Kalian bisa cari web decode base64 online untuk membuktikannya sendiri.

Nilai yang di dapat dari teks tersebut adalah
```json
{"alg" : "HS256", "type" : "JWT"}
```

### 3. Payload

Bagian kedua disebut dengan payload. Payload berisi data yang ingin dikirim melalui token.

```
eyJ1c2VybmFtZSI6IjA4MjExMjA5ODMzNyIsImlhdCI6MTY0ODYyMDkwMiwiZXhwIjoxNjQ4NjI0NTAyfQ
```

Bagian ini juga di-encode menggunakan base64, dan data yang didapat dari hasil decode-nya adalah
```json
{"phone" : "082112098337", "password" : "divel"}
```

### 4. Signature

Bagian ketiga adalah signature. Signature adalah hash gabungan dari header, payload dan sebuah secret key (berupa string random panjang biasanya)

```
Tn5CyK_P8AXtJJCP28GkhSM317scMVFgybfrK5UG3-4
```

Signature ini berguna untuk memverifikasi bahwa header maupun payload yang ada dalam token tidak berubah dari nilai aslinya (karena untuk membuat payload dan header palsu itu cukup mudah).


## Task

Source code bisa dilihat di: [source](./praktikum/src/main/java/com/praktikum)

Kita bisa menggunakan [start.spring.io](https://start.spring.io/) untuk melakukan setup dan configuration pada project spring boot kita serta menambahkan dependencies sesuai kebutuhan.

![output](./screenshots/starter.jpg)

### Task 1 - JWT Generation

Pada task pertama ini saya disuruh membuat project spring boot dengan mengimplementasikan JWT Security

Berikut hasil test API menggunakan postman

Registrasi Phone dan password 
![output](./screenshots/register.jpg)

Mendapatkan token menggunakan phone dan password yang sudah didaftarkan
![output](./screenshots/getToken.jpg)

### Task 2 - JWT Extraction

Pada task kedua ini saya disuruh untuk mendatkan phone menggunakan token yang telah didapatkan sebelumnya

![output](./screenshots/getNameByToken.jpg)
