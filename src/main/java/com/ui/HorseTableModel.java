package com.ui;

import com.domain.Horse;
import com.domain.Rider;

import javax.swing.table.AbstractTableModel;

public class HorseTableModel extends AbstractTableModel {

    String[] header ={"Horse id", "Horse Name", "Horse Age", "Horse Rider Name", "Horse Gender"};

    Horse[] horsesTable;

    public HorseTableModel() {

        Rider paul ;
        Rider pierre;
        Rider jacques;

        paul =  new Rider(1,"Paul");
        pierre = new Rider(2,"Pierre");
        jacques = new Rider(3,"Jacques");

                horsesTable = new Horse[] {
                        new Horse(1,"Jolly",30,paul,'M'),
                        new Horse(2,"Gaby",18,pierre,'F'),
                        new Horse(3,"Henry",10,jacques,'M'),
                        new Horse(4,"Elodie",2,pierre,'F'),
                        new Horse(5,"Carla",5,paul,'F'),

                                            };



    }



    @Override
    public int getRowCount() {
        return horsesTable.length;
    }

    @Override
    public String getColumnName(int column) {
        return header[column];
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

 /*   @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

        return new String[]{
                horsesTable[rowIndex].getId() + "",
                horsesTable[rowIndex].getHorseName(),
                horsesTable[rowIndex].getAge() + "",
                horsesTable[rowIndex].getRider().getfirstName(),
                horsesTable[rowIndex].getGender()+""
        };
    }*/

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {

            case 0:
                return horsesTable[rowIndex].getId() + "";

            case 1:
                return horsesTable[rowIndex].getHorseName();

            case 2:
                return horsesTable[rowIndex].getAge() + "";

            case 3:

                return horsesTable[rowIndex].getRider().getfirstName();

            case 4:

                return horsesTable[rowIndex].getGender()+"";

            default:
                throw new IllegalArgumentException();
        }
    }
}

