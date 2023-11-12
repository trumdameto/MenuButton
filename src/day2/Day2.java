package day2;


import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class Day2 {

    public static void main(String[] args) {
        String filePath = "D:\\NetBeansProjects\\MeoMeo\\MeoMeo\\src\\ImageGiay\\giay15.jpg";
        
        File file = new File(filePath);
        String fileName = file.getName();
        
        System.out.println("Tên tệp: " + fileName);
        }
    }


