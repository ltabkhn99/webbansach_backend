package com.personal.webbansach_backend.dao;

import com.personal.webbansach_backend.entity.SuDanhGia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChiTietDonHangRepository extends JpaRepository<SuDanhGia, Long> {
}
