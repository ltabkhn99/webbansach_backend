package com.personal.webbansach_backend.dao;

import com.personal.webbansach_backend.entity.DonHang;
import com.personal.webbansach_backend.entity.SachYeuThich;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SachYeuThichRepository extends JpaRepository<SachYeuThich, Integer> {
}
