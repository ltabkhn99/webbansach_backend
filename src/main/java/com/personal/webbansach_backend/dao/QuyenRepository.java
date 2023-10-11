package com.personal.webbansach_backend.dao;

import com.personal.webbansach_backend.entity.DonHang;
import com.personal.webbansach_backend.entity.Quyen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuyenRepository extends JpaRepository<Quyen, Integer> {
}
