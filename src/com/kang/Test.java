package com.kang;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Test extends JFrame {
    public Test() {
        init();
        //setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));

        setBounds(50,50,100,100);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    //初始化
    public void init(){
        //创建容器
        Container contentPane = this.getContentPane();


        //下拉框，文本框，按钮
        JComboBox jBox = new JComboBox();
        jBox.addItem(null);
        jBox.addItem("Action");
        jBox.addItem("Reset");
        //jBox.addItemListener(new Myjbox());

        //文本框--标签
        JTextField field = new JTextField("0");
        field.setHorizontalAlignment(JTextField.CENTER);//文本框居中


        //按钮
        JButton jButton = new JButton("+");
        jButton.addActionListener(new Mybutton(field));

        //添加
        contentPane.add(jBox, BorderLayout.NORTH);
        contentPane.add(field,BorderLayout.CENTER);
        contentPane.add(jButton,BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        new Test();
    }

}

//监听按钮
class Mybutton implements ActionListener{
    private JTextField field;
    int n =1;
    public Mybutton(JTextField field) {
        this.field = field;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

            field.setText(""+(n++));

    }
}

//class Myjbox extends Test implements ItemListener{
//
//    @Override
//    public void itemStateChanged(ItemEvent e) {
//        String value = (String) e.getItem();
//
//    }
//}

