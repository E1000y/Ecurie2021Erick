package com.ui;


import javax.swing.*;
import javax.swing.table.TableRowSorter;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Table extends JFrame  {

    JTable jTable;
    HorseTableModel horseTableModel;
    JTextField filterText;
    TableRowSorter<HorseTableModel> sorter;
    JButton button;
    JPanel panel;
    JLabel label;

    public Table() {
        setSize(400, 400);
        horseTableModel = new HorseTableModel();
        jTable = new JTable(horseTableModel);
        sorter = new TableRowSorter<>(horseTableModel);
        jTable.setRowSorter(sorter);
        filterText = new JTextField("");
        Container c = getContentPane();

        panel = new JPanel(new BorderLayout());
        label = new JLabel("Filter");
        panel.add(label, BorderLayout.WEST);
        filterText = new JTextField("");
        panel.add(filterText, BorderLayout.CENTER);
        button = new JButton("Filter");

        c.add((new JScrollPane(jTable)));
        c.add(button, BorderLayout.SOUTH);
        c.add(panel, BorderLayout.NORTH);

        button.addActionListener(this::filterClicked);

        setVisible(true);
    }

    public static void main(String[] args) {
        Table table = new Table();
    }

    public void filterClicked(ActionEvent e) {
        String text = filterText.getText();
        sorter.setRowFilter(text.isBlank() ? null : RowFilter.regexFilter(text));
    }
}
