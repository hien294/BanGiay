/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;
import model.NhanVien;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author User
 */
public class NhanVienService_IMPL implements NhanVienService{

    @Override
    public List<NhanVien> getNhanVien(long trang) {
        List<NhanVien> list = new ArrayList<>();
        try {
            Connection conn = repository.DBConnect.getConnection();
            Statement stm = conn.createStatement();

            ResultSet rs = stm.executeQuery("Select top 5  * from NHANVIEN where TRANGTHAI = 1 AND IDNHANVIEN not in (Select top " + (trang * 5 - 5) + " IDNHANVIEN from NHANVIEN)");
            while (rs.next()) {
                NhanVien nv = new NhanVien();
                nv.setIdNV(rs.getInt(1));
                nv.setMaNV(rs.getString(2));
                nv.setTenNV(rs.getString(3));
                nv.setTenDN(rs.getString(4));
                nv.setMatKhau(rs.getString(5));
                nv.setgTinh(rs.getString(6));
                nv.setEmail(rs.getString(7));
                nv.setSdt(rs.getString(8));
                nv.setIdChucVu(rs.getInt(9));
                nv.setLuong(rs.getInt(10));
                nv.setTt(rs.getInt(11));

                list.add(nv);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean Add(NhanVien nv) {
        try {
            Connection conn = repository.DBConnect.getConnection();
            String sql = "INSERT INTO NHANVIEN (MANV, TENNV, TENDANGNHAP, MATKHAU, GIOITINH, EMAIL, SODIENTHOAI, IDCHUCVU, LUONG, TRANGTHAI) VALUES(?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ptm = conn.prepareStatement(sql);
            ptm.setString(1, nv.getMaNV());
            ptm.setString(2, nv.getTenNV());
            ptm.setString(3, nv.getTenDN());
            ptm.setString(4, nv.getMatKhau());
            ptm.setString(5, nv.getgTinh());
            ptm.setString(6, nv.getEmail());
            ptm.setString(7, nv.getSdt());
            ptm.setInt(8, nv.getIdChucVu());
            ptm.setInt(9, nv.getLuong());
            ptm.setInt(10, nv.getTt());

            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean Update(NhanVien nv) {
        try {
            Connection conn = repository.DBConnect.getConnection();
            String sql = "UPDATE NHANVIEN SET TENNV = ?, TENDANGNHAP = ?, MATKHAU = ?, GIOITINH = ?, EMAIL = ?, SODIENTHOAI = ?, IDCHUCVU = ?, LUONG = ?, TRANGTHAI = ? WHERE MANV = ?";
            PreparedStatement ptm = conn.prepareStatement(sql);
            ptm.setString(1, nv.getTenNV());
            ptm.setString(2, nv.getTenDN());
            ptm.setString(3, nv.getMatKhau());
            ptm.setString(4, nv.getgTinh());
            ptm.setString(5, nv.getEmail());
            ptm.setString(6, nv.getSdt());
            ptm.setInt(7, nv.getIdChucVu());
            ptm.setInt(8, nv.getLuong());
            ptm.setInt(9, nv.getTt());
            ptm.setString(10, nv.getMaNV());

            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean Delete(NhanVien nv) {
        try {
            Connection conn = repository.DBConnect.getConnection();
            String sql = "DELETE FROM NHANVIEN WHERE MANV = ?";
            PreparedStatement ptm = conn.prepareStatement(sql);
            ptm.setString(1, nv.getMaNV());
            
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public List<NhanVien> gettimNhanVien(String ma) {
        try {
            List<NhanVien> list = new ArrayList<>();
            Connection conn = repository.DBConnect.getConnection();
            String sql = "SELECT IDNHANVIEN, MANV, TENNV, TENDANGNHAP, MATKHAU, GIOITINH, EMAIL, SODIENTHOAI, IDCHUCVU, LUONG , TRANGTHAI FROM NHANVIEN WHERE MANV = ?";
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, ma);
            ResultSet r = st.executeQuery();
            while (r.next()) {                
                NhanVien nv = new NhanVien();
                
                nv.setIdNV(r.getInt(1));
                nv.setMaNV(r.getString(2));
                nv.setTenNV(r.getString(3));
                nv.setTenDN(r.getString(4));
                nv.setMatKhau(r.getString(5));
                nv.setgTinh(r.getString(6));
                nv.setEmail(r.getString(7));
                nv.setSdt(r.getString(8));
                nv.setIdChucVu(r.getInt(9));
                nv.setLuong(r.getInt(10));
                nv.setTt(r.getInt(11));
                
                list.add(nv);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
}
