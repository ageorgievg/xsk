package com.sap.xsk.hdb.ds.processors.hdbprocedure;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sap.xsk.hdb.ds.model.hdbprocedure.XSKDataStructureHDBProcedureModel;

public class HDBProcedureCreateProcessor {
    private static final Logger logger = LoggerFactory.getLogger(HDBProcedureCreateProcessor.class);

    private HDBProcedureCreateProcessor() {}

    public static void execute(Connection connection, List<XSKDataStructureHDBProcedureModel> hdbProcedures) throws SQLException {
        for (XSKDataStructureHDBProcedureModel proc : hdbProcedures) {
            String sql = "CREATE " + proc.getContent();
            executeCreate(connection, sql);
        }
    }

    private static void executeCreate(Connection connection, String sql) throws SQLException {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(sql);
            logger.info(sql);
            statement.executeUpdate();
        } catch (SQLException e) {
            logger.error(sql);
            logger.error(e.getMessage(), e);
        } finally {
            if (statement != null) {
                statement.close();
            }
        }
    }
}