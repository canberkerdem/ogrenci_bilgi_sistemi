package com.bilgeadam.ogrencibilgisistemi.test;

import com.bilgeadam.ogrencibilgisistemi.dto.Ogrenci;
import combilgeadam.ogrencibilgisistemi.dao.OgrenciDAO;

import java.sql.SQLException;

public class OgrenciDAOTest {

    public static void main(String[] args) {
        try {
            Ogrenci ogr = new Ogrenci();
            ogr.setAd("Hasan");
            ogr.setSoyad("Erdem");
            ogr.setKredi(1500);

            boolean sonuc = OgrenciDAO.ekle(ogr);

            if(sonuc)
                System.out.println("Başarıyla eklendi");
            else
                System.out.println("Ekleme başarısız oldu");
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
