# 📤 Panduan Upload ke GitHub

## Langkah-langkah Upload Project ke GitHub

### 1️⃣ Persiapan Repository GitHub

1. Buka https://github.com
2. Login ke akun GitHub Anda
3. Klik tombol "+" di pojok kanan atas, pilih "New repository"
4. Isi detail repository:
   - **Repository name**: `PraktikumWireframe` atau `mesen-makanan-app`
   - **Description**: "Aplikasi pemesanan makanan khas Bandung - Android App"
   - **Public** atau **Private** (sesuai kebutuhan)
   - ✅ Centang "Add a README file" (jika belum ada)
   - Pilih `.gitignore` template: **Android**
   - Klik "Create repository"

### 2️⃣ Inisialisasi Git di Project Lokal

Buka Terminal/Command Prompt di folder project, lalu jalankan:

```bash
# Masuk ke folder project
cd "c:\Users\ASUS TUF GAMING\AndroidStudioProjects\PraktikumWireframe"

# Inisialisasi git (jika belum)
git init

# Tambahkan remote repository (ganti dengan URL repository Anda)
git remote add origin https://github.com/USERNAME/PraktikumWireframe.git

# Atau jika sudah ada remote, update dengan:
# git remote set-url origin https://github.com/USERNAME/PraktikumWireframe.git
```

### 3️⃣ Commit dan Push ke GitHub

```bash
# Cek status file
git status

# Tambahkan semua file ke staging
git add .

# Commit dengan pesan yang jelas
git commit -m "Initial commit: Aplikasi Mesen Makanan dengan 12 menu"

# Push ke GitHub (branch main)
git push -u origin main

# Atau jika branch master:
# git push -u origin master
```

### 4️⃣ Verifikasi Upload

1. Buka repository Anda di GitHub
2. Pastikan semua file sudah terupload:
   - ✅ Folder `app/` dengan source code
   - ✅ Folder `screenshot/` dengan 7 gambar
   - ✅ File `README.md`
   - ✅ File `build.gradle.kts`, `settings.gradle.kts`
   - ✅ Folder `gradle/`

### 5️⃣ Cek Tampilan README

1. Scroll ke bawah di halaman repository
2. README.md akan otomatis ditampilkan
3. Pastikan:
   - ✅ Semua screenshot terlihat
   - ✅ Format Markdown benar
   - ✅ Link tidak error

## 🔧 Troubleshooting

### Masalah: Screenshot tidak muncul di README

**Solusi:**
- Pastikan path screenshot benar: `screenshot/01_splash.png`
- Cek apakah folder screenshot sudah terupload
- Refresh halaman GitHub (Ctrl+F5)

### Masalah: Git push ditolak

**Solusi:**
```bash
# Pull dulu untuk merge perubahan
git pull origin main --rebase

# Lalu push lagi
git push origin main
```

### Masalah: File terlalu besar

**Solusi:**
- Screenshot di-compress terlebih dahulu
- Atau gunakan format JPEG dengan kualitas 80-90%
- Hapus folder `build/` sebelum push (sudah ada di .gitignore)

## 📋 Checklist Sebelum Submit

- [ ] Repository sudah public (jika diminta)
- [ ] README.md terlihat dengan baik
- [ ] Semua 7 screenshot muncul
- [ ] Source code lengkap terupload
- [ ] Link repository sudah dicopy untuk dikumpulkan

## 🎯 Format Pengumpulan

Jika diminta link, format seperti ini:

```
Nama  : [Nama Anda]
NIM   : [NIM Anda]
Kelas : [Kelas Anda]
Link  : https://github.com/USERNAME/PraktikumWireframe
```

## 💡 Tips Tambahan

1. **Commit Sering**: Lakukan commit setiap kali ada perubahan signifikan
2. **Pesan Commit Jelas**: Gunakan pesan yang deskriptif
3. **Branch**: Gunakan branch untuk fitur baru (opsional)
4. **Issues**: Gunakan GitHub Issues untuk tracking bug (opsional)
5. **Tags**: Buat tag untuk versi release (opsional)

## 🔐 Jika Menggunakan Private Repository

Jika repository private, Anda perlu:
1. Invite dosen sebagai collaborator:
   - Settings → Collaborators → Add people
   - Masukkan username/email dosen
2. Atau berikan akses temporary

---

**Selamat! Project Anda siap dikumpulkan! 🎉**
