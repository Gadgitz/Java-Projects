package project3;

import java.util.*;

public class Matrix<Object> {
    private List<List<Object>> array;

    public Matrix(int rows, int cols) {
        array = new ArrayList<>(rows);
        for (int i = 0; i < rows; i++) {
            array.add(new ArrayList<>(cols));
        }
    }

    public Matrix(List<List<Object>> lst) {
        array = new ArrayList<>(lst.size());
        for (List<Object> v : lst) {
            array.add(new ArrayList<>(v));
        }
    }

    public List<Object> get(int row) {
        return array.get(row);
    }

    public void set(int row, List<Object> values) {
        array.set(row, new ArrayList<>(values));
    }

    public int numRows() {
        return array.size();
    }

    public int numCols() {
        return numRows() > 0 ? array.get(0).size() : 0;
    }
}
