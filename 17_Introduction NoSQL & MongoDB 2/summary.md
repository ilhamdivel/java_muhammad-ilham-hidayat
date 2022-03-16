# 17_Introduction NoSQL & MongoDB 2

## Resume
Dalam materi ini mempelajari :
1. Projection Operator
2. Query Modifier
3. Aggregation

### 1. Projection Operator
Pada function find, terdapat parameter kedua setelah query, yaitu projection. Projection adalah memilih field mana yang ingin kita ambil atau hide. db.<collection>.find(query, projection)

### 2. Query Modifier
Query Modifier adalah memodifikasi hasil query yang telah kita lakukan. Untuk memodifikasi hasil query, kita bisa menambahkan function query modifier setelah menggunakan function find

### 3. Aggregation
MongoDB memiliki konsep aggregation yang bisa digunakan sebagai pengganti join namun terbatas untuk document, bukan collection. Aggregation adalah sebuah operasi dimana value dari berbagai document di kelompokan menjadi satu untuk selanjutnya diproses agar mendapatkan hasil yang diinginkan.

## Task

Semua Collection bisa dilihat di [collection](./praktikum/Collections)

### Task 1
Create All Collections

![output](./screenshots/createAllCollections.jpg)

Insert Document ke Collection Books

![output](./screenshots/DocumentBooks.jpg)

Insert Document ke Collection Authors

![output](./screenshots/DocumentAuthors.jpg)

Insert Document ke Collection Publishers

![output](./screenshots/DocumentPublisher.jpg)

Tampilkan data buku dari author id 1 dan author id 2

![output](./screenshots/1.jpg)

Tampilkan data buku dan harga author id 1

![output](./screenshots/2.jpg)

Tampilkan total jumlah halaman buku author id 2

![output](./screenshots/3.jpg)

Tampilkan semua field books dan authors terakit

![output](./screenshots/4_1.jpg)

![output](./screenshots/4_2.jpg)

Tampilkan semua field books, authors dan publishers terakit

![output](./screenshots/5.jpg)

Tampilkan summary data authors, books dan publishers sesuai dengan Output

![output](./screenshots/6.jpg)

Digital_outlet ingin memberikan diskon untuk setiap buku,
price < 60.000 = 1 %,
60.000 < price < 90.000 = 2 %,
90.000 < price = 3 %,

![output](./screenshots/7.jpg)

Tampilkan semua nama buku, harga, nama author dan nama publisher, urutkan dari harga termahal ke termurah.

![output](./screenshots/8.jpg)

Tampilkan data nama buku harga dan publisher kemudia tampilkan hanya data ke 3 dan ke 4

![output](./screenshots/9.jpg)





