/*
 * Auto-generated file. Created by MyBatis Generator
 */
package com.example.kotlinmybatisdynamic.persistence.database.mysql.table

import com.example.kotlinmybatisdynamic.persistence.database.mysql.table.DbSampleDynamicSqlSupport.DbSample
import com.example.kotlinmybatisdynamic.persistence.database.mysql.table.DbSampleDynamicSqlSupport.DbSample.id
import com.example.kotlinmybatisdynamic.persistence.database.mysql.table.DbSampleDynamicSqlSupport.DbSample.name
import com.example.kotlinmybatisdynamic.persistence.database.mysql.table.DbSampleDynamicSqlSupport.DbSample.subId
import com.example.kotlinmybatisdynamic.persistence.database.mysql.table.DbSampleRecord
import org.mybatis.dynamic.sql.SqlBuilder.isEqualTo
import org.mybatis.dynamic.sql.util.kotlin.*
import org.mybatis.dynamic.sql.util.kotlin.mybatis3.*

fun DbSampleMapper.count(completer: CountCompleter) =
    countFrom(this::count, DbSample, completer)

fun DbSampleMapper.delete(completer: DeleteCompleter) =
    deleteFrom(this::delete, DbSample, completer)

fun DbSampleMapper.deleteByPrimaryKey(id_: Long) =
    delete {
        where(id, isEqualTo(id_))
    }

fun DbSampleMapper.insert(record: DbSampleRecord) =
    insert(this::insert, record, DbSample) {
        map(id).toProperty("id")
        map(subId).toProperty("subId")
        map(name).toProperty("name")
    }

fun DbSampleMapper.insertMultiple(records: Collection<DbSampleRecord>) =
    insertMultiple(this::insertMultiple, records, DbSample) {
        map(id).toProperty("id")
        map(subId).toProperty("subId")
        map(name).toProperty("name")
    }

fun DbSampleMapper.insertMultiple(vararg records: DbSampleRecord) =
    insertMultiple(records.toList())

fun DbSampleMapper.insertSelective(record: DbSampleRecord) =
    insert(this::insert, record, DbSample) {
        map(id).toPropertyWhenPresent("id", record::id)
        map(subId).toPropertyWhenPresent("subId", record::subId)
        map(name).toPropertyWhenPresent("name", record::name)
    }

private val columnList = listOf(id, subId, name)

fun DbSampleMapper.selectOne(completer: SelectCompleter) =
    selectOne(this::selectOne, columnList, DbSample, completer)

fun DbSampleMapper.select(completer: SelectCompleter) =
    selectList(this::selectMany, columnList, DbSample, completer)

fun DbSampleMapper.selectDistinct(completer: SelectCompleter) =
    selectDistinct(this::selectMany, columnList, DbSample, completer)

fun DbSampleMapper.selectByPrimaryKey(id_: Long) =
    selectOne {
        where(id, isEqualTo(id_))
    }

fun DbSampleMapper.update(completer: UpdateCompleter) =
    update(this::update, DbSample, completer)

fun KotlinUpdateBuilder.updateAllColumns(record: DbSampleRecord) =
    apply {
        set(id).equalTo(record::id)
        set(subId).equalTo(record::subId)
        set(name).equalTo(record::name)
    }

fun KotlinUpdateBuilder.updateSelectiveColumns(record: DbSampleRecord) =
    apply {
        set(id).equalToWhenPresent(record::id)
        set(subId).equalToWhenPresent(record::subId)
        set(name).equalToWhenPresent(record::name)
    }

fun DbSampleMapper.updateByPrimaryKey(record: DbSampleRecord) =
    update {
        set(subId).equalTo(record::subId)
        set(name).equalTo(record::name)
        where(id, isEqualTo(record::id))
    }

fun DbSampleMapper.updateByPrimaryKeySelective(record: DbSampleRecord) =
    update {
        set(subId).equalToWhenPresent(record::subId)
        set(name).equalToWhenPresent(record::name)
        where(id, isEqualTo(record::id))
    }