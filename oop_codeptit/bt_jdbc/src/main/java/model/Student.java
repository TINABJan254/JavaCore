package model;

import java.sql.ResultSet;
import java.sql.SQLException;
/*
CREATE TABLE student (
    `id` VARCHAR(20),
    `name` VARCHAR(50),
    `className` VARCHAR(20),
    `gpa` DOUBLE,
    PRIMARY KEY (`id`)
);
*/
public class Student {
    private String name, id, className;
    private double gpa;
    
    public Student(String id, String name, String className, double gpa){
        this.id = id;
        this.name = name;
        this.className = className;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getClassName() {
        return className;
    }

    public double getGpa() {
        return gpa;
    }
    public static Student getFromResultSet(ResultSet resultSet) throws SQLException {
        String id = resultSet.getNString("id");
        String name = resultSet.getNString("name");
        String className = resultSet.getNString("className");
        double gpa = resultSet.getDouble("gpa");
        return new Student(id, name, className, gpa);
    }
    public Object[] toRowTable() {
//        return new Object[]{id, name, className, gpa};
        return new Object[] {
            id, name, className, gpa
        };
    }
}
