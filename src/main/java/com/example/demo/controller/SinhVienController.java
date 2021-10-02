package com.example.demo.controller;

import com.example.demo.VO.ReponseTemplateVO;
import com.example.demo.entity.SinhVien;
import com.example.demo.service.SinhVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sinhviens")
public class SinhVienController {
    @Autowired
    private SinhVienService sinhVienService;

    @PostMapping("/")
    public SinhVien saveSinhVien(@RequestBody SinhVien sinhVien) {
        return sinhVienService.saveSinhVien(sinhVien);
    }

    @GetMapping("/{id}")
    public ReponseTemplateVO getSinhVienWithKhoa(@PathVariable long id) {
        return sinhVienService.findSinhVienWithKhoa(id);
    }
}
