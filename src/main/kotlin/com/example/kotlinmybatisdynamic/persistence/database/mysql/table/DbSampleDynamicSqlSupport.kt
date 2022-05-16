/*
 * Auto-generated file. Created by MyBatis Generator
 */
package com.example.kotlinmybatisdynamic.persistence.database.mysql.table

import java.sql.JDBCType
import org.mybatis.dynamic.sql.SqlTable

object DbSampleDynamicSqlSupport {
    object DbSample : SqlTable("sample") {
        val id = column<Long>("id", JDBCType.BIGINT)

        val subId = column<Long>("sub_id", JDBCType.BIGINT)

        val name = column<String>("name", JDBCType.VARCHAR)
    }
}