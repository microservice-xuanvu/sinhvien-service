package com.example.demo.service;

import com.example.demo.VO.ReponseTemplateVO;
import com.example.demo.entity.SinhVien;

public interface SinhVienService {
    SinhVien saveSinhVien(SinhVien sinhVien);
    ReponseTemplateVO findSinhVienWithKhoa(long id);
}
