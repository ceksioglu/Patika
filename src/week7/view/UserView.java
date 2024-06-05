package week7.view;

import week7.business.UserController;
import week7.entity.User;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.desktop.UserSessionEvent;
import java.util.ArrayList;

public class UserView extends JFrame {
    private JPanel container;
    private JTabbedPane tab_menu;
    private JPanel pnl_user;
    private JTable tbl_user;
    private JScrollPane scrl_user;
    private JButton btn_user_new;
    private JPanel tab_text;
    private UserController userController;
    private DefaultTableModel mdl_user;

    public UserView(){
        this.add(container);
        this.setTitle("Kullanıcı Yönetimi");
        this.setSize(500,500);
        int x = (Toolkit.getDefaultToolkit().getScreenSize().width - this.getWidth()) / 2;
        int y = (Toolkit.getDefaultToolkit().getScreenSize().height - this.getHeight()) / 2;
        this.setLocation(x,y);
        this.setVisible(true);

        this.userController = new UserController();
        this.mdl_user = new DefaultTableModel();

        // Table Model
        // Kolon başlıklarını oluştur:
        // Modele satırları aktar:

        Object[] columnUser = {"ID","Ad","Tip","Cinsiyet","Mail","Şifre"};
        this.mdl_user.setColumnIdentifiers(columnUser);

        ArrayList<User> users = this.userController.findAll();
        for (User user :users){
            Object[] row = {
                    user.getId(),
                    user.getName(),
                    user.getType(),
                    user.getGender(),
                    user.getMail(),
                    user.getPassword()
            };
            this.mdl_user.addRow(row);

        }
        //Modeli tabloya ata:
        this.tbl_user.setModel(this.mdl_user);
        this.tbl_user.setEnabled(false);
        this.tbl_user.getTableHeader().setReorderingAllowed(false);

    }
}
