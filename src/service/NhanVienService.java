/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;
import model.NhanVien;
import java.sql.*;
import java.util.List;
/**
 *
 * @author User
 */
public interface NhanVienService {
    public List<NhanVien> getNhanVien(long trang);
    public boolean Add(NhanVien nv);
    public boolean Update(NhanVien nv);
    public boolean Delete(NhanVien nv);
    public List<NhanVien> gettimNhanVien(String ma);
}
