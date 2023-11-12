package day2;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class QuantityInputTable extends JFrame {

    private JTable table;

    public QuantityInputTable() {

        Object[][] data = {
            {"Giày 1", "100"},
            {"Giày 2", "111"},};

        String[] columns = {"Giày", "Số lượng"};

        table = new JTable(data, columns);

        table.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                int row = table.getSelectedRow();
                int column = table.getSelectedColumn();

                // Hiển thị cửa sổ nhập số lượng 
                if (column == 1) {
                   
                    String inputValue = JOptionPane.showInputDialog("Nhập số lượng " + data[row][0]);
                    if (inputValue != null) {
                        int soLuongBanDau = Integer.parseInt((String) data[row][1]);

                        int soLuongNhapVao = Integer.parseInt(inputValue);

                        int result = soLuongBanDau - soLuongNhapVao;

                        if (result >= 0) {
                            data[row][1] = String.valueOf(result);
                            table.setValueAt(data[row][1], row, column);
                        } else {
                            JOptionPane.showMessageDialog(null, "Số lượng không hợp lệ");
                        }
                    }
                }
            }
        });

        // Tạo scroll pane để bảng có thể cuộn được nếu có quá nhiều dữ liệu
        JScrollPane scrollPane = new JScrollPane(table);

        // Thêm scroll pane vào JFrame
        getContentPane().add(scrollPane);

        // Cấu hình JFrame
        setTitle("Hãy chọn số lượng muốn thêm");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null); // Hiển thị JFrame ở giữa màn hình
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new QuantityInputTable());
    }
}
