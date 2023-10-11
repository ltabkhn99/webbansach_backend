package com.personal.webbansach_backend.dao;

import com.personal.webbansach_backend.entity.ChiTietDonHang;
import com.personal.webbansach_backend.entity.HinhAnh;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HinhAnhRepository extends JpaRepository<HinhAnh, Integer> {
}
