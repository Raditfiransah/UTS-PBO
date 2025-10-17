# 🧟‍♂️ Plants vs Zombies - Simulasi PBO (Java)

## 📘 Deskripsi
Program ini adalah simulasi sederhana berbasis **Pemrograman Berorientasi Objek (PBO)** dengan tema *Plants vs Zombies*.  
Konsep ini menerapkan beberapa pilar utama PBO seperti:
- **Inheritance (pewarisan)** antara `Zombie` → `WalkingZombie` & `JumpingZombie`
- **Encapsulation** untuk menjaga data objek
- **Polymorphism** melalui metode `doDestroy()` dan `heal()` yang diimplementasikan berbeda di tiap class turunan  

Setiap zombie memiliki kemampuan penyembuhan (*heal*) dan penghancuran (*destroy*) yang berbeda,  
sedangkan plant dapat menyerang beberapa kali per ronde sesuai konfigurasi.  
Barrier akan berkurang kekuatannya setiap kali diserang.

---

## ⚙️ Struktur Program
├── Zombie.java # Class abstrak zombie
├── WalkingZombie.java # Class zombie berjalan
├── JumpingZombie.java # Class zombie melompat
├── Barrier.java # Class penghalang/barrier
├── Plant.java # Class tanaman penyerang
└── Tester.java # Class utama (main)


---

## 🧩 Aturan Simulasi

### 🧟 WalkingZombie
- **Heal:**
  - Level 1 → +20% health  
  - Level 2 → +30% health  
  - Level 3 → +40% health  
- **Destroy:** berkurang 20% setiap kali diserang  

### 🦘 JumpingZombie
- **Heal:**
  - Level 1 → +30% health  
  - Level 2 → +40% health  
  - Level 3 → +50% health  
- **Destroy:** berkurang 10% setiap kali diserang  

### 🧱 Barrier
- Memiliki atribut `strength`  
- Setiap kali diserang, `strength` berkurang **9 poin**  
- Jika `strength ≤ 0`, maka **barrier kalah**

### 🌿 Plant
- Bisa diatur berapa kali menyerang tiap ronde  
- Setelah semua serangan selesai, zombie akan menyembuhkan diri  

---

## 🚀 Cara Menjalankan Program
1. Pastikan Java sudah terinstal di perangkatmu  
2. Simpan semua file `.java` di satu folder  
3. Kompilasi dan jalankan program:
   ```bash
   javac *.java
   java Tester

## 📸 Contoh Output
<img width="329" height="378" alt="image" src="https://github.com/user-attachments/assets/e6388d30-36c2-4e97-b7f3-24c78b396429" />



