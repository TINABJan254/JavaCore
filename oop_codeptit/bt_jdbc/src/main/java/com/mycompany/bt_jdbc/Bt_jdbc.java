/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bt_jdbc;

import controller.StudentController;
import java.sql.SQLException;

/**
 *
 * @author TP
 */
public class Bt_jdbc {

    public static void main(String[] args) throws SQLException {
        StudentController controller = new StudentController();
        controller.show();
    }
}
