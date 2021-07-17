package PersonalKata;

import java.util.Objects;

public class Position {
    private  int rowPosition;
    private int columnPosition;

    public Position(int rowPosition, int columnPosition) {
        this.rowPosition = rowPosition;
        this.columnPosition = columnPosition;
    }

    @Override
    public String toString() {
        return "Row Position = " + rowPosition + '\n' +
                "Column Position = " + columnPosition;
    }

    public void increaseNumberOfColumn(int noOfSteps) {
        columnPosition += noOfSteps;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Position position = (Position) o;
        return rowPosition == position.rowPosition && columnPosition == position.columnPosition;
    }

    public void increaseNumberOfRow(int noOfSteps) {
        rowPosition += noOfSteps;
    }

    public void decreaseNumberOfColumn(int noOfSteps) {
        columnPosition -= noOfSteps;
    }

    public void decreaseNumberOfRow(int noOfSteps) {
        rowPosition -= noOfSteps;
    }

    public int getRowPosition() {
        return rowPosition;
    }

    public int getColumnPosition() {
        return columnPosition;
    }
}
