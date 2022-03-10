# 13_Database Schema, DDL, DML

## Resume
Dalam materi ini mempelajari:
1. Database Schema
2. DDL
3. DML

### 1. Database Schema
Database Schema adalah suatu dokument cetak biru berupa design atau rancagan suatu database. Dalam pengembangan software yang dilakukan secara team suatu document yang dibagaikan pada rekan se-team sangata lah penting. Bertujuan untuk mengurangi miskomunikasi dan menudahkan anggota team yang lain untuk melihat racangan database tanpa harus membuka DBMS.

### 2. DDL
DDL adalah salah satu bentuk SQL yang bisa digunakan untuk menciptakan atau membuat database, tabel, struktur tabel, merubah struktur database, menghapus tabel, menghapus database serta membuat relasi antar tabel. Oleh sebab itu, DDL ini mempunyai sejumlah perintah dasar yang terdiri atas Create, Alter serta Drop.

### 3. DML
DML adalah adalah bahasa komputer yang merupakan perintah untuk membantu pengguna memanipulasi data dalam database. Manipulasi ini dilakukan dengan memasukkan data ke dalam tabel database, mengambil data yang ada, kemudian menghapus data dari tabel yang ada, dan memodifikasi data yang ada. DML sebagian besar tergabung dalam SQL database. Kemampuan fungsional DML diatur dalam perintah manipulasi seperti SELECT, UPDATE, INSERT INTO dan DELETE FROM,

## Task

### Task 1
Pada task pertama ini saya disuruh membuat schema database dari contoh kasus yang telah disesdiakan oleh alta.id

Link draw.io : [Link Draw.io](./praktikum/Link%20Schema.txt)

Gambar Schema database

![output](./screenshots/Schema.png)

### Task 2
Pada task kedua ini saya disuruh mengimplementasikan schema yang telah dibuat menjadi tabel di mySQL.

Syntax mySQL : [mySQL](./praktikum/alta_online_shop.sql)

1. Create database alta_online_shop

![1](./screenshots/create_database.jpg)

2. Create tabel user

![2](./screenshots/create_tabelUser.jpg)

3. Create tabel products

![3](./screenshots/create_tabelProducts.jpg)

4. Create tabel products_type

![4](./screenshots/create_tabelProductTypes.jpg)

5. Create tabel operators

![5](./screenshots/create_tabelOperators.jpg)

6. Create tabel product_descriptions

![6](./screenshots/create_tabelProductDescriptions.jpg)

7. Create tabel payment_method

![7](./screenshots/create_tabelPaymentMethods.jpg)

8. Create tabel transactions

![8](./screenshots/create_tabelTransaction.jpg)

9. Create tabel transactions_detail

![9](./screenshots/create_tabelTransactionDetails.jpg)

10. Create tabel kurir

![10](./screenshots/createTabel.jpg)

11. Tambahkan Column

![11](./screenshots/addColumn.jpg)

12. Rename tabel kurir to shipping

![12](./screenshots/renameTabel.jpg)

13. Drop tabel shipping

![13](./screenshots/dropTabel.jpg)






