package com.example.demo.VO;

import com.example.demo.entity.SinhVien;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReponseTemplateVO {
    private SinhVien sinhVien;
    private Khoa khoa;
}
