# 16_Introduction NoSQL & MongoDB 1

## Resume
Dalam materi ini mempelajari :
1. MongoDB
2. Apa itu Document Oriented Database
3. Collection

### 1. MongoDB
MongoDB merupakan free dan opensource database management system. Dikembangkan oleh perusahaan bernama 10gen tahun 2007. MongoDB tidak menggunakan SQL, namun menggunakan JavaScript sebagai bahasa utama untuk manipulasi document

### 2. Apa itu Document Oriented Database
Document oriented database merupakan sistem database yang digunakan untuk memanipulasi data dalam bentuk document (semi structured data). Document oriented database biasanya menyimpan data dalam bentuk JSON atau XML, dan menyimpan relasinya sebagai embedded object di dalam document yang sama.

### 3. Collection
Collection adalah tempat menyimpan document. Maximum per document yang bisa disimpan adalah 16MB. Maximum level nested document yang bisa disimpan adalah 100 level 

## Task

Semua Collection bisa dilihat di [collection](./praktikum/Collections)

### Task 1
Create All Collections
![output](./screenshots/createAllCollections.jpg)

Insert 5 operator pada tabel operator

![output](./screenshots/1_a.jpg)

Insert 3 Product Type

![output](./screenshots/1_b.jpg)

Insert 2 Product dengan product type id = 1 dan operator id = 3

![output](./screenshots/1_c.jpg)

Insert 3 Product dengan product type id = 2 dan operator id = 1

![output](./screenshots/1_d.jpg)

Insert 3 Product dengan product type id = 3 dan operator id = 4

![output](./screenshots/1_e.jpg)

Insert product description pada setiap produk

![output](./screenshots/1_f.jpg)

Insert 3 payment methods

![output](./screenshots/1_g.jpg)

Insert 5 user pada tabel user

![output](./screenshots/1_h.jpg)

Insert 3 transaksi di masing masing user

![output](./screenshots/1_i.jpg)

Insert 3 product di masing masing transaksi

![output](./screenshots/1_1_j.jpg)

![output](./screenshots/1_2_j.jpg)

### Task 2

Tampilkan nama user dengan gender laki-laki

![output](./screenshots/2_a.jpg)

Tampilkan product dengan id = 3

![output](./screenshots/2_b.jpg)

Hitung jumlah user dengan gender perempuan

![output](./screenshots/2_c.jpg)

Tampilkan nama user sesuai abjad

![output](./screenshots/2_d.jpg)

Tampilkan 5 data pada tabel products

![output](./screenshots/2_e.jpg)

### Task 3

Ubah data product id 1 dengan nama 'product dummy'

![output](./screenshots/3_a.jpg)

Ubah qty = 3 pada transaction detail dengan product id = 1

![output](./screenshots/3_b.jpg)

### Task 4

Delete data pada tabel product dengan id = 1

![output](./screenshots/4_a.jpg)

Delete data pada tabel product dengan product type id 1

![output](./screenshots/4_b.jpg)




