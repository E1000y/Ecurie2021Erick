package com.ui;

import com.domain.Horse;
import com.domain.Rider;

import javax.swing.*;
import javax.swing.table.TableRowSorter;
import java.awt.*;
import java.util.Arrays;
import java.util.List;

public class Table extends JFrame {

    JTable jTable;
    HorseTableModel horseTableModel;

    public Table(){
        setSize(400,400);


        horseTableModel = new HorseTableModel();
        jTable = new JTable(horseTableModel);

        jTable.setAutoCreateRowSorter(true);
        Container c = getContentPane();

        c.add((new JScrollPane(jTable)));




        setVisible(true);
    }

    public static void main(String[] args) {
Table table = new Table();
    }



}
