package com.example.kotlinmybatisdynamic.persistence.database.mysql.sample

import com.example.kotlinmybatisdynamic.persistence.database.mysql.table.DbSampleMapper
import com.example.kotlinmybatisdynamic.persistence.database.mysql.table.DbSampleRecord
import com.example.kotlinmybatisdynamic.persistence.database.mysql.table.select
import org.springframework.stereotype.Repository

@Repository
class SampleRepository(
    private val dbSampleMapper: DbSampleMapper
) {

    fun exec() {
        val resA: List<DbSampleRecord> = dbSampleMapper.select {
            TODO()
        }
        val resB: List<DbSampleRecord> = dbSampleMapper.selectMany(
            TODO()
        )
    }
}