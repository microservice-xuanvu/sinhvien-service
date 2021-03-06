package com.example.demo.service;

import com.example.demo.VO.Khoa;
import com.example.demo.VO.ReponseTemplateVO;
import com.example.demo.entity.SinhVien;
import com.example.demo.repository.SinhVienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SinhVienServiceImpl implements SinhVienService{
    @Autowired
    private SinhVienRepository sinhVienRepository;

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public SinhVien saveSinhVien(SinhVien sinhVien) {
        return sinhVienRepository.save(sinhVien);
    }

    @Override
    public ReponseTemplateVO findSinhVienWithKhoa(long id) {
        ReponseTemplateVO vo = new ReponseTemplateVO();
        SinhVien sinhVien = sinhVienRepository.findById(id).get();
        vo.setSinhVien(sinhVien);
        Khoa khoa =restTemplate.getForObject("http://localhost:9001/khoas/"+sinhVien.getKhoaId(),Khoa.class);
        vo.setKhoa(khoa);
        return vo;
    }
}
