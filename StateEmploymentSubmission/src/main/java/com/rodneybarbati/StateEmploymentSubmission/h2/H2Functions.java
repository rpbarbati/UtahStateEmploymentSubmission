package com.rodneybarbati.StateEmploymentSubmission.h2;

import java.sql.Connection;
import java.sql.SQLException;

public class H2Functions {

    public static String fullName(Connection connection, String first, String last)
            throws SQLException {
        return first + " " + last;
    }
}
