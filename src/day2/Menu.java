package day2;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;
import java.net.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;

public class Menu extends JComponent {

    private MigLayout layout;
    private String[][] menuItems = new String[][]{
        {"Dashboard"},
        {"Email", "Inbox", "Read", "Compost"},
        {"Chat"},
        {"Calendar"},
        {"Clients"},
        {"San Pham", "Thuoc Tinh", "Chi tiet", "Button group"},
        {"UI Kit", "Accordion", "Alerts", "Badges", "Breadcrumbs", "Buttons", "Button group"},
        {"Advanced UI", "Cropper", "Owl Carousel", "Sweet Alert"},
        {"Forms", "Basic Elements", "Advanced Elements", "SEditors", "Wizard"},
        {"Charts", "Apex", "Flot", "Peity", "Sparkline"},
        {"Table", "Basic Tables", "Data Table"},

    };

    public Menu() {
        init();
    }

    private void init() {
        layout = new MigLayout("wrap1, fillx, gapy 0, inset 2", "fill");
        setLayout(layout);
        //init MenuItems

        for (int i = 0; i < menuItems.length; i++) {
            addMenu(menuItems[i][0], i);
        }
        setOpaque(true);
    }
        
    private Icon getIcon(int index){
        URL url=getClass().getResource("/day2/"+index+".png");
        if(url!=null){
            return new ImageIcon(url);
        }else {
            return null;
        }
    }

    private void addMenu(String menuName, int index) {
        int length = menuItems[index].length;
        MenuItem item = new MenuItem(menuName, index, length > 1);
        Icon icon = getIcon(index);
        if(icon!=null){
            item.setIcon(icon);
        }

        item.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (length > 1) {
                    if (!item.isSelected()) {
                        item.setSelected(true);
                        addSubMenu(item, index, length, getComponentZOrder(item));
                    } else {
                        //Hide Menu
                        hideMenu(item, index);
                        item.setSelected(false);
                    }
                }
            }
        });
        add(item);
        revalidate();
        repaint();
    }

    private void addSubMenu(MenuItem item, int index, int length, int indexZorder) {
        JPanel panel = new JPanel(new MigLayout("wrap 1, fillx, inset 0, gapy 0", "fill"));
        panel.setName(index + "");
        panel.setBackground(new Color(230,230,230));
        for (int i = 1; i < length; i++) {
            MenuItem subItem = new MenuItem(menuItems[index][i], i, false);

            subItem.initSubMenu(i, length);
            panel.add(subItem);
        }

        add(panel, "h 0!", indexZorder + 1);
        revalidate();
        repaint();
        MenuAnimation.showMenu(panel, item, layout, true);
    }
    private void hideMenu(MenuItem item,int index){
        for (Component com:getComponents()) {
            if(com instanceof JPanel &&com.getName()!=null &&com.getName().equals(index+"")){
                com.setName(null);
                MenuAnimation.showMenu(com, item, layout, false);
                break;
            }
        }
    }

    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D)grphcs.create();
        g2.setColor(new Color(0,71,21));
        g2.fill(new Rectangle2D.Double(0, 0, getWidth(), getHeight()));
        super.paintComponent(grphcs);
    }
    
}
