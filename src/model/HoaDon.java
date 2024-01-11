/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;
import lombok.AllArgsConstructor ;
import lombok.Getter ;
import lombok.Setter ;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class HoaDon {
    private int idHoaDon ;
    private String maHoaDon;
    private int idKhachHang;
    private Date ngayDat;
    private String ghiChu ;
    private int idKhuyenMai;
    private int idNhanVien;
    private float tongTien;
    private boolean trangThai;
}
